package model.dao;

import java.util.List;
import model.entities.Rental;

/**
 *
 * @author Felipe Kellermann
 */
public interface RentalDao {

    void insert(Rental obj);

    void update(Rental obj);

    void deleteById(Integer idAluguel);

    Rental findById(Integer idAluguel);

    List<Rental> findAll();

}
