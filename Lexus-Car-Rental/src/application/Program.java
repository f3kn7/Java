package application;

import db.DB;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.entities.Car;
import model.entities.Person;

public class Program {

    public static void main(String[] args) {

       /* Connection conn = null; // Criando uma variavel do tipo connection nula (é uma sessão entre um aplicativo Java e um banco de dados. Ajuda a estabelecer uma conexão com o banco de dados
        Statement st = null; // Criando variavel statement (Statement é uma interface utilizada para executar instruções SQL.)
        ResultSet rs = null; // O Resultset é uma classe da API JAVA que permite percorrermos um DataTable de alguma consulta em um banco de dados.

        
        try {
            conn = DB.getConnection(); // Variavel conn recebe getconection

            st = conn.createStatement();

            rs = st.executeQuery("select * from pessoa"); // Executa uma instrução SQL que retorna um único objeto ResultSet

            while (rs.next()) {
                System.out.println(rs.getInt("id_pessoa") + ", " + rs.getString("nome") + ", " + rs.getString("telefone_comercial"));
            }
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        } finally {            
            DB.closeResultSet(rs);
            DB.closeStatement(st);
            DB.closeConnection();
        }*/

       //test person
       Person p = new Person(1, "10/11/2022", "adm", "m", "Felipe", "07/09/1988", "12321344234", "12321344", "N/A", "1231234213", "AB", "51-123123", "N/A", "51-123213123", "51-132123123", "fk@gmail.com", "300300", "Linda", "N/A", "900", "Vila", "Porto Alegre", "RS", "Brasil");
       
       System.out.println(p);
     
       
       //test car
       Car c = new Car(1, "17/11/2022", "GM", "Onix", "Hatch", "2022", "4", "4", "medio", "1.0 turbo", "120cv", "automatica", "gas/alcool", "12312323424", "ufcg12323", 123234123, 100, "blablabla");
       
       System.out.println(c);
     
    }
       
}
