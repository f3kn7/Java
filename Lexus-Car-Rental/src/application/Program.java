package application;

import java.util.List;
import model.dao.CarDao;
import model.dao.DaoFactory;
import model.entities.Car;
import model.entities.CarCategory;

public class Program {

    public static void main(String[] args) {

        /* Connection conn = null; // Criando uma variavel do tipo connection nula (é uma sessão entre um aplicativo Java e um banco de dados. Ajuda a estabelecer uma conexão com o banco de dados
        Statement st = null; // Criando variavel statement (Statement é uma interface utilizada para executar instruções SQL.)
        ResultSet rs = null; // O Resultset é uma classe da API JAVA que permite percorrermos um DataTable de alguma consulta em um banco de dados.

        
        try {
            conn = DB.getConnection(); // Variavel conn recebe getconection

            st = conn.createStatement();

            rs = st.executeQuery("SELECT * FROM departamento"); // Executa uma instrução SQL que retorna um único objeto ResultSet

            while (rs.next()) {
                System.out.println(rs.getInt("id_departamento") + ", " + rs.getString("nome"));
            }
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        } finally {            
            DB.closeResultSet(rs);
            DB.closeStatement(st);
            DB.closeConnection();
        }             
        
                
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        
        Department d = new Department(4, "Lixos");

        departmentDao.insert(d);

        System.out.println(d);*/
        //ClientNaturalDao clientNaturalDao = DaoFactory.createClientNaturalDao();
        

        /* RentalDao rentalDao = DaoFactory.createRentalDao();
        
        ClientNatural cli = new ClientNatural(38);
        
        Car car = new Car();
        
        Rental rent = new Rental(car, cli, 1, "12/11/2020 10:12", "20/11/2020 10:12", 400);
        
        rentalDao.insert(rent);*/
        //ClientNatural cn = new ClientNatural("Masculino", "20/10/2011", "123123", "123123", "123123312", 1, "20/10/2022", "Leonardo", "123213", "1232131321", "123123231", "fern@gmail.com", "1231213", "lima", "na", "1234", "liminha", "rosas", "rs", "br", "bli");
        // CarCategoryDao carCategoryDao = DaoFactory.createCarCategoryDao();
        //CarCategory cat = new CarCategory(3, "null");
        //Car car = new Car(1, "12/1/2012", "gm", "Tracker", "2010", "branco", "5", "4", "Medio", "Dianteira", "1.0", "100", "Automatico", "Gas/Alcool", "12322313", "123231313", "1232123dffg", 0, 120, "blablabla", cat);
        //clientNaturalDao.insert(cn);
        //clientNaturalDao.deleteById(34);
        /*List<ClientNatural> list = clientNaturalDao.findAll();
        for(ClientNatural cli: list){
            System.out.println(cli);
        }*/
        //clientNaturalDao.findById(38);
        // Car car = new Car();
        //carDao.getValueFromModelCar(car);
        // ClientNatural cli = new ClientNatural();
        // cli.setNome("Luis");
        // clientNaturalDao.getIdByName(cli);
        // System.out.println(cli.getIdPessoa());
        //carDao.insert(car);
        //System.out.println(car.getValorAluguel());
        CarDao carDao = DaoFactory.createCarDao();
        
        CarCategory cc = new CarCategory();
        cc.setNome("HATCH");
        
        List<Car> list = carDao.getModelsByCategory(cc);
        
        for (Car car : list) {
            System.out.println(car.getModelo());

        }

    }
}
