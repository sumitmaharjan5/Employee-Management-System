
package employee.record.system;
import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    
    public Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem","root","codewithsumit");
            s=c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
