package model.dao;

import db.DB;
import model.dao.impl.CarCategoryDaoJDBC;
import model.dao.impl.CarDaoJDBC;
import model.dao.impl.ClientNaturalDaoJDBC;
import model.dao.impl.RentalDaoJDBC;


/**
 * Classe de operações estaticas para instanciar o objeto de acesso a dados (
 * DAO )
 */
public class DaoFactory {

    public static ClientNaturalDao createClientNaturalDao() { //PARA NÃO EXPOR A IMPLEMENTAÇÃO, DEIXAR APENAS A INTERFACE (INJEÇÃO DE DEPENDENCIA)

        return new ClientNaturalDaoJDBC(DB.getConnection());
    }

    public static CarDao createCarDao() { //PARA NÃO EXPOR A IMPLEMENTAÇÃO, DEIXAR APENAS A INTERFACE (INJEÇÃO DE DEPENDENCIA)

        return new CarDaoJDBC(DB.getConnection());
    }

    public static CarCategoryDao createCarCategoryDao() { //PARA NÃO EXPOR A IMPLEMENTAÇÃO, DEIXAR APENAS A INTERFACE (INJEÇÃO DE DEPENDENCIA)

        return new CarCategoryDaoJDBC(DB.getConnection());
    }
    
    public static RentalDao createRentalDao() { //PARA NÃO EXPOR A IMPLEMENTAÇÃO, DEIXAR APENAS A INTERFACE (INJEÇÃO DE DEPENDENCIA)

        return new RentalDaoJDBC(DB.getConnection());
    }
}
