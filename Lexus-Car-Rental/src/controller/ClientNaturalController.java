package controller;

import model.dao.ClientNaturalDao;
import model.dao.DaoFactory;
import model.entities.ClientNatural;

/**
 *
 * @author Felipe Kellermann
 */
public class ClientNaturalController {

    ClientNaturalDao clientNaturalDao = DaoFactory.createClientNaturalDao();

    public void salvarClienteFisico(ClientNatural cf) {

        clientNaturalDao.insert(cf);
    }
}
