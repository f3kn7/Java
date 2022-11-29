package model.dao;

import db.DB;
import model.dao.impl.CarCategoryJDBC;
import model.dao.impl.CarDaoJDBC;
import model.dao.impl.ClientNaturalJDBC;

/**
 * Classe de operações estaticas para instanciar o objeto de acesso a dados (
 * DAO )
 */
public class DaoFactory {

    public static ClientNaturalDao createClientNaturalDao() { //PARA NÃO EXPOR A IMPLEMENTAÇÃO, DEIXAR APENAS A INTERFACE (INJEÇÃO DE DEPENDENCIA)

        return new ClientNaturalJDBC(DB.getConnection());
    }

    public static CarDao createCarDao() { //PARA NÃO EXPOR A IMPLEMENTAÇÃO, DEIXAR APENAS A INTERFACE (INJEÇÃO DE DEPENDENCIA)

        return new CarDaoJDBC(DB.getConnection());
    }

    public static CarCategoryDao createCarCategoryDao() { //PARA NÃO EXPOR A IMPLEMENTAÇÃO, DEIXAR APENAS A INTERFACE (INJEÇÃO DE DEPENDENCIA)

        return new CarCategoryJDBC(DB.getConnection());
    }

}
