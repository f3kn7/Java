package application;

import db.DB;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Program {

    public static void main(String[] args) {

        Connection conn = null; // Criando uma variavel do tipo connection nula (é uma sessão entre um aplicativo Java e um banco de dados. Ajuda a estabelecer uma conexão com o banco de dados
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
        }
    }
}
