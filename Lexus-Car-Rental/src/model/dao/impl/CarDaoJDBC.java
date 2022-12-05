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
import model.dao.CarDao;
import model.entities.Car;
import model.entities.CarCategory;

/**
 *
 * @author Felipe Kellermann
 */
public class CarDaoJDBC implements CarDao {

    private final Connection conn;

    public CarDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Car obj) {

        PreparedStatement st = null;

        try {
            st = conn.prepareStatement(
                    "INSERT INTO carro "
                    + "( marca, modelo, ano, cor, qnt_passageiros, qnt_portas, cap_mala, tracao, motor, potencia, transmissao, tipo_combustivel, chassi, "
                    + " renavam, placa, km, valor_aluguel, observacao, id_carro_categoria ) "
                    + "VALUES "
                    + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);

            st.setString(1, obj.getMarca());
            st.setString(2, obj.getModelo());
            st.setString(3, obj.getAno());
            st.setString(4, obj.getCor());
            st.setString(5, obj.getQntPassageiros());
            st.setString(6, obj.getQntPortas());
            st.setString(7, obj.getCapPortaMalas());
            st.setString(8, obj.getTracao());
            st.setString(9, obj.getMotor());
            st.setString(10, obj.getPotencia());
            st.setString(11, obj.getTransmissao());
            st.setString(12, obj.getTipoCombustivel());
            st.setString(13, obj.getCodChassi());
            st.setString(14, obj.getRenavam());
            st.setString(15, obj.getPlaca());
            st.setDouble(16, obj.getKm());
            st.setDouble(17, obj.getValorAluguel());
            st.setString(18, obj.getObservacoes());
            st.setInt(19, obj.getCarCategory().getIdCategoria());

            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0) {

                JOptionPane.showMessageDialog(null, "Salvo com sucesso!");

                ResultSet rs = st.getGeneratedKeys();

                if (rs.next()) {
                    int id = rs.getInt(1);
                    obj.setIdCar(id);
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
    public void update(Car obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteById(Integer idCar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Car findById(Integer idCar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Car> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void getCarModelValue(Car obj) {

        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement(
                    "SELECT DISTINCT valor_aluguel FROM carro WHERE modelo = ?");

            st.setString(1, obj.getModelo());

            rs = st.executeQuery();

            if (rs.next()) {

                obj.setValorAluguel(rs.getDouble("valor_aluguel"));

            }

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }

    }

    @Override
    public void getIdByModel(Car obj) {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement(
                    "SELECT id_carro FROM carro WHERE modelo = ? LIMIT 1");

            st.setString(1, obj.getModelo());

            rs = st.executeQuery();

            if (rs.next()) {

                obj.setIdCar(rs.getInt("id_carro"));

            }

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }

    }

    private CarCategory instantiateCategory(ResultSet rs) throws SQLException {
        CarCategory cc = new CarCategory();

        cc.setIdCategoria(rs.getInt("id_categoria"));
        cc.setNome(rs.getString("nome_categoria"));

        return cc;
    }

    private Car instantiateCar(ResultSet rs, CarCategory cc) throws SQLException {
        Car car = new Car();
        car.setIdCar(rs.getInt("id_carro"));
        car.setModelo(rs.getString("modelo"));
        car.setCarCategory(cc);
        return car;
    }

    @Override
    public List<Car> getModelsByCategory(CarCategory carCategory) {

        PreparedStatement st = null;

        ResultSet rs = null;

        try {
            st = conn.prepareStatement(
                    "SELECT * "
                    + "FROM carro a "
                    + "left JOIN categoria b "
                    + "ON a.id_carro_categoria = b.id_categoria "
                    + "WHERE b.nome_categoria = ?"
                    + "GROUP BY modelo");

            st.setString(1, carCategory.getNome());

            rs = st.executeQuery();

            List<Car> list = new ArrayList<>();
            Map<String, CarCategory> map = new HashMap<>();

            while (rs.next()) {

                CarCategory cc = map.get(rs.getString("nome_categoria"));

                if (cc == null) {

                    cc = instantiateCategory(rs);
                    map.put(rs.getString("nome_categoria"), cc);

                }
                Car car = instantiateCar(rs, cc);
                list.add(car);
            }
            return list;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);

        }

    }

}
