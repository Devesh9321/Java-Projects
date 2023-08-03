
package dao;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

        /***************************
           * @author : Devesh Patil *
             **************************/

public class LogDAO {
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
    public boolean Varify(String user, String pass) throws SQLException{
        
        ps = db.Connect.ConnectMe().prepareStatement("Select * from admin where USERNAME = ? && PASSWORD = ? ;");
        
        this.ps.setString(1, user);
        this.ps.setString(2, pass);
        
        rs = ps.executeQuery();
        
        return rs.next();
    }
    public boolean UpdateSuper(String user,String pass) throws SQLException{
        this.ps = db.Connect.ConnectMe().prepareStatement( "UPDATE `admin` set `USERNAME` = ? , `PASSWORD`=? WHERE `USERNAME`=? && `PASSWORD`=?;");

        ps.setString(1,user );
        ps.setString(2,pass );
        ps.setString(3,app.AdminPanel.pass );
        ps.setString(4,app.AdminPanel.user );
        
        if(ps.executeUpdate()==1){
            return true;
        }
        
        return false;
    }
}
