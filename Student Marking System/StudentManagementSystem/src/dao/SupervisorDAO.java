
package dao;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

        /***************************
           * @author : Devesh Patil *
             **************************/

public class SupervisorDAO {
    private String Query = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
    public boolean InsertSuper(String Fname,String Department,String Hireyear) throws SQLException{
        this.Query = "INSERT INTO `supervisor` (`FullName`, `HireYear`, `DepartmentID`) Values( ?,?,1 );";
        this.ps = db.Connect.ConnectMe().prepareCall(this.Query);
        
        ps.setString(1,Fname );
        ps.setString(2,Hireyear );
        
        if(ps.executeUpdate()==1){
            return true;
        }
        
        return false;
    }
    public boolean UpdateSuper(String Fname,String Hireyear,int varify) throws SQLException{
        this.Query = "UPDATE `supervisor` SET `FullName` = ? , `HireYear` = ? WHERE `supervisor`.`SupervisorID` = ?;";

        this.ps = db.Connect.ConnectMe().prepareStatement(this.Query);

        ps.setString(1,Fname );
        ps.setString(2,Hireyear );
        ps.setInt(3,varify );
        
        if(ps.executeUpdate()==1){
            return true;
        }
        
        return false;
    }
    
    public boolean DeleteSuper(String Fname,int SuperID) throws SQLException{
        this.Query = "DELETE FROM `supervisor` WHERE FullName = ? && SupervisorID` = ?;";
        this.ps = db.Connect.ConnectMe().prepareStatement(this.Query);

        ps.setString(1,Fname );
        ps.setInt(2,SuperID );

        if(ps.executeUpdate()==1){
            return true;
        }

        return false;  
    }    
    
}
