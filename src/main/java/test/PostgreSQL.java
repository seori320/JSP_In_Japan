package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class PostgreSQL {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.postgresql.Driver");  
        
        String     connurl  = "jdbc:postgresql://localhost:5432/postgres";
        String     user     = "postgres";
        String     password = "tiger";
 
        try (Connection connection = DriverManager.getConnection(connurl, user, password);) {
              Statement stmt = connection.createStatement();
              ResultSet rs = stmt.executeQuery("SELECT * FROM login");
 
              while (rs.next()) {
                  String id = rs.getString("id");
                  
                  System.out.println("ddddddd"+id);                  
              }           
            rs.close();
            stmt.close();
            connection.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
