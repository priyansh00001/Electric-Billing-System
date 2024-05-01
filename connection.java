
package electricity.billing.system;

import java.sql.*;
public class conn {
    
    Connection c;
    Statement s;
    conn(){
        
        try {
         c=DriverManager.getConnection("jdbc:mysql://localhost:3306/electricbills", "root", "SRMIST@26@123");
         s = c.createStatement();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
