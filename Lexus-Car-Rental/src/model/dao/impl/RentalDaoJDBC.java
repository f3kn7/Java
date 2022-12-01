package model.dao.impl;

import db.DB;
import db.DbException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;
import model.dao.RentalDao;
import model.entities.Rental;

/**
 *
 * @author Felipe Kellermann
 */
public class RentalDaoJDBC implements RentalDao {

    private final Connection conn;

    public RentalDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Rental obj) {
        
        PreparedStatement st = null;
       

        try {
            st = conn.prepareStatement(
                    "INSERT INTO locacao "
                    + "( data_retirada, data_devolucao, valor_total, id_loca_cliente, id_loca_carro) "
                    + "VALUES "
                    + "(?, ?, ?, ?, ?); ",
                    Statement.RETURN_GENERATED_KEYS); //valores auto-gerados pelo SGBD devem ser retornados depois da execução do statement           

            st.setDate(1, new java.sql.Date(obj.getDataRetirada().getTime()));
            st.setDate(2, new java.sql.Date(obj.getDataDevolucao().getTime()));       
            st.setDouble(3, (obj.getValorTotal()));
            st.setInt(4, (obj.getPessoaFisica().getIdPessoa()));
            st.setInt(5, (obj.getCarro().getIdCar()));       

            int rowsAffected = st.executeUpdate(); //executa a intrução SQL do prepareStatement e retorna o numero de linhas afetadas no banco

            if (rowsAffected > 0) {

                JOptionPane.showMessageDialog(null, "Salvo com sucesso!");

                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int idAlug = rs.getInt(1); //especificando qual valores do ResultSet iremos pegar, neste caso vamos pegar o valor da primeira linha ( o ID )
                    obj.setIdAluguel(idAlug);
                }
            } else {
                throw new DbException("Unexpected error! No rows affected!");
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e.getMessage());
            throw new DbException(e.getMessage());

        } finally {

            DB.closeStatement(st);
        }

    }

    @Override
    public void update(Rental obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteById(Integer idAluguel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Rental findById(Integer idAluguel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Rental> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
