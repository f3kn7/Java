package model.dao;

import java.util.List;
import model.entities.CarCategory;

/**
 *
 * @author Felipe Kellermann
 */
public interface CarCategoryDao {

    void insert(CarCategory obj);

    void update(CarCategory obj);

    void deleteById(Integer idCategoria);

    CarCategory findById(Integer idCategoria);

    List<CarCategory> findAll();

}
