
package model.dao;

import java.util.List;
import model.entities.ClientNatural;

/**
 *
 * @author Felipe Kellermann 
 */
public interface ClientNaturalDao {
    
     void insert(ClientNatural obj);

    void update(ClientNatural obj);

    void deleteById(Integer idPessoa);

    ClientNatural findById(Integer idPessoa);

    List<ClientNatural> findAll();
}
