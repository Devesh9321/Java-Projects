
package dao;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import db.Connect;


/*
 * @author Devesh Patil
 */
public class ValueDAO {
    PreparedStatement ps =  null;
    ResultSet rs = null;
    public ResultSet getData(){
        try{
            ps = Connect.ConnectMe().prepareStatement("select * from std_marks;");
            rs = ps.executeQuery();
            if(rs==null){
                javax.swing.JOptionPane.showMessageDialog(null, "No Data Found !","Warning ",1);
            }
//        ps.close();
        }
        catch(SQLException e){ e.printStackTrace();}
        return rs;
        
    }
        
    
}
