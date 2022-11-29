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

    Car findById(Integer idCar);

    List<Car> findAll();

}
