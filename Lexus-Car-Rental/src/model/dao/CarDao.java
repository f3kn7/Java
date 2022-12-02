package model.dao;

import java.util.List;
import model.entities.Car;

/**
 *
 * @author Felipe Kellermann
 */
public interface CarDao {

    void insert(Car obj);

    void update(Car obj);

    void deleteById(Integer idCar);
    
    void getCarModelValue(Car obj);
    
    void getIdByModel(Car obj);

    Car findById(Integer idCar);

    List<Car> findAll();

}
