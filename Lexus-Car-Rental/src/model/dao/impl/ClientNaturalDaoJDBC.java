package model.dao.impl;

import db.DB;
import db.DbException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import model.dao.ClientNaturalDao;
import model.entities.ClientNatural;

/**
 *
 * @author Felipe Kellermann
 */
public class ClientNaturalDaoJDBC implements ClientNaturalDao {

    private final Connection conn;

    public ClientNaturalDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(ClientNatural obj) {

        PreparedStatement st = null;

        try {
            st = conn.prepareStatement(
                    "INSERT INTO pessoa "
                    + "( nome, telefone_fixo, celular, whatsapp, email, cep, rua, nr_predio_condominio, nr_residencia, bairro, cidade, estado, pais, observacao) "
                    + "VALUES "
                    + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?); ",
                    Statement.RETURN_GENERATED_KEYS); //valores auto-gerados pelo SGBD devem ser retornados depois da execução do statement           

            st.setString(1, obj.getNome());
            st.setString(2, obj.getTelefoneFixo());
            st.setString(3, obj.getCelular());
            st.setString(4, obj.getWhatsapp());
            st.setString(5, obj.getEmail());
            st.setString(6, obj.getCep());
            st.setString(7, obj.getRua());
            st.setString(8, obj.getNumeroPredioCond());
            st.setString(9, obj.getNumeroResidencia());
            st.setString(10, obj.getBairro());
            st.setString(11, obj.getCidade());
            st.setString(12, obj.getEstado());
            st.setString(13, obj.getPais());
            st.setString(14, obj.getObservacao());

            int rowsAffected = st.executeUpdate(); //executa a intrução SQL do prepareStatement e retorna o numero de linhas afetadas no banco

            if (rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int idPes = rs.getInt(1); //especificando qual valores do ResultSet iremos pegar, neste caso vamos pegar o valor da primeira linha ( o ID )
                    obj.setIdPessoa(idPes);
                }
            } else {
                throw new DbException("Unexpected error! No rows affected!");
            }

            st = conn.prepareStatement(
                    "INSERT INTO c_fisico (id_fisico, sexo, data_nascimento, rg, cpf, cnh) VALUES (?, ?, ?, ?, ?, ?);",
                    Statement.RETURN_GENERATED_KEYS); //valores auto-gerados pelo SGBD devem ser retornados depois da execução do statement   

            st.setInt(1, obj.getIdPessoa());
            st.setString(2, obj.getSexo());
            st.setString(3, obj.getDataNascimento());
            st.setString(4, obj.getRg());
            st.setString(5, obj.getCpf());
            st.setString(6, obj.getCnh());

            st.executeUpdate(); //executa a intrução SQL do prepareStatement e retorna o numero de linhas afetadas no banco

            if (rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys(); //passando valores gerados no SGBD para o ResultSet

                JOptionPane.showMessageDialog(null, "Salvo com sucesso!");

                if (rs.next()) {
                    int idPes = rs.getInt(1); //especificando qual valores do ResultSet iremos pegar, neste caso vamos pegar o valor da primeira linha ( o ID )
                    obj.setIdPessoa(idPes);
                }
            } else {
                throw new DbException("Unexpected error! No rows affected!");
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e.getMessage());
            //throw new DbException(e.getMessage());

        } finally {

            DB.closeStatement(st);
        }

    }

    @Override
    public void update(ClientNatural obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteById(Integer idPessoa) {

        PreparedStatement st = null;

        try {
            st = conn.prepareStatement("DELETE FROM pessoa WHERE id_pessoa = ?");

            st.setInt(1, idPessoa);

            st.executeUpdate();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {

            JOptionPane.showMessageDialog(null, "Deletado com sucesso!");

            DB.closeStatement(st);
        }
    }

    @Override
    public ClientNatural findById(Integer idPessoa) {

        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement(
                    ""); //toDo
            st.setInt(1, idPessoa);
            rs = st.executeQuery();
            if (rs.next()) {
                ClientNatural obj = instanteatePessoaClient(rs);

            }
            return null;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

    @Override
    public List<ClientNatural> findAll() {

        PreparedStatement st = null;

        ResultSet rs = null;

        try {
            st = conn.prepareStatement(
                    "SELECT * "
                    + "FROM pessoa a "
                    + "INNER JOIN c_fisico b "
                    + "ON a.id_pessoa = b.id_fisico ");

            rs = st.executeQuery();

            List<ClientNatural> list = new ArrayList<>();
            Map<Integer, ClientNatural> map = new HashMap<>();

            while (rs.next()) {

                ClientNatural cli = map.get(rs.getInt("id_pessoa"));

                if (cli == null) {

                    cli = instanteatePessoaClient(rs);
                    map.put(rs.getInt("id_pessoa"), cli);
                    map.put(rs.getInt("id_fisico"), cli);
                }
                cli = instanteatePessoaClient(rs);
                list.add(cli);
            }
            return list;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

    private ClientNatural instanteatePessoaClient(ResultSet rs) throws SQLException { // ------> toDo

        ClientNatural obj = new ClientNatural();

        obj.setIdPessoa(rs.getInt("id_pessoa"));
        obj.setDataCadastro(rs.getDate("data_cadastro"));
        obj.setNome(rs.getString("nome"));
        obj.setTelefoneFixo(rs.getString("telefone_fixo"));
        obj.setCelular(rs.getString("celular"));
        obj.setWhatsapp(rs.getString("whatsapp"));
        obj.setEmail(rs.getString("email"));
        obj.setCep(rs.getString("cep"));
        obj.setRua(rs.getString("rua"));
        obj.setNumeroPredioCond(rs.getString("nr_predio_condominio"));
        obj.setNumeroResidencia(rs.getString("nr_residencia"));
        obj.setBairro(rs.getString("bairro"));
        obj.setCidade(rs.getString("cidade"));
        obj.setEstado(rs.getString("estado"));
        obj.setPais(rs.getString("pais"));
        obj.setObservacao(rs.getString("observacao"));

        obj.setIdPessoa(rs.getInt("id_fisico"));
        obj.setSexo(rs.getString("sexo"));
        obj.setDataNascimento(rs.getString("data_nascimento"));
        obj.setRg(rs.getString("rg"));
        obj.setCpf(rs.getString("cpf"));
        obj.setCnh(rs.getString("cnh"));

        return obj;

    }

    @Override
    public void getIdByName(ClientNatural obj) {

        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement(
                    "SELECT id_pessoa "
                    + "FROM pessoa a "
                    + "INNER JOIN c_fisico b "
                    + "ON a.id_pessoa = b.id_fisico "
                    + "WHERE a.nome = ?");

            st.setString(1, obj.getNome());

            rs = st.executeQuery();

            if (rs.next()) {

                obj.setIdPessoa(rs.getInt("id_pessoa"));

            }

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }

    }

}
