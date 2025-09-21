
package electricity.billing.system;
import java.sql.*;
//register the driver class
//creating the connection so we driver manager

public class connection {
    Connection c;
    Statement s;
    connection() {
        try{
       c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebc"); // , "root","password" likhna hai
       s = c.createStatement();
        } catch(Exception e){
            e.printStackTrace();
        }
       
       
               
    }
}
