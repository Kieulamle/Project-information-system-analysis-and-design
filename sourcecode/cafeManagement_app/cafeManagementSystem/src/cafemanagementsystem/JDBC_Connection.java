package cafemanagementsystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class JDBC_Connection {
    
   public static Connection getConnection(){
       final String url = "jdbc:mysql://localhost:3306/management_cafe";
       final String user = "root";
       final String password = "1234567890";
       
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           
           return DriverManager.getConnection(url, user, password);
       } catch (ClassNotFoundException | SQLException ex) {
           Logger.getLogger(JDBC_Connection.class.getName()).log(Level.SEVERE, null, ex);
       }
       return null;
   }
            
    public static void main(String[] args) {
        Connection connection = getConnection();
        
        if(connection != null){
            System.out.println("Thanh cong");
        }  
        else {
            System.out.println("That bai");
        }  
    }
}