package model.dao.impl;

import db.DB;
import db.DbException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import model.dao.CarCategoryDao;
import model.entities.CarCategory;

/**
 *
 * @author Felipe Kellermann
 */
public class CarCategoryDaoJDBC implements CarCategoryDao {
    
     private final Connection conn;

    public CarCategoryDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(CarCategory obj) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                    "INSERT INTO categoria "
                    + "(nome) "
                    + "VALUES "
                    + "(?)",
                    Statement.RETURN_GENERATED_KEYS);

            st.setString(1, obj.getNome());

            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    obj.setIdCategoria(id);
                }
            } else {
                throw new DbException("Unexpected error! No rows affected!");
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }

    }

    @Override
    public void update(CarCategory obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteById(Integer idCategoria) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public CarCategory findById(Integer idCategoria) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<CarCategory> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
