package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*
* @author patil
*/
public class Connect {
    private static Connection con = null;
    public static Connection ConnectMe(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college_db","root","");
        }
        catch(ClassNotFoundException e){e.printStackTrace();}
        catch(SQLException e){e.printStackTrace();}
        
        return con;
    }
    
}
