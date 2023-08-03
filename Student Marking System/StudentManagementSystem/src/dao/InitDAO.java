
package dao;

import db.Connect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

        /***************************
           * @author : Devesh Patil *
             **************************/

public class InitDAO {
    private PreparedStatement ps =  null;
    private ResultSet rs = null;
    
    public ResultSet course() throws SQLException{
            
        this.ps = Connect.ConnectMe().prepareStatement("select CourseId,CourseCode,CourseName,Maximum_Mark,Q1,Q2,Q3,Q4,Q5,Q6 from course_details;");
        this.rs = this.ps.executeQuery();

        if(this.rs==null){
            javax.swing.JOptionPane.showMessageDialog(null, "No Data Found about Course!","Initialization Operation",0);
        }
    //        ps.close();
        return this.rs;
    }
    
    public ResultSet supervisor() throws SQLException{
            
        this.ps = Connect.ConnectMe().prepareStatement("SELECT `SupervisorID`,`FullName`,`HireYear` FROM `supervisor`;");
        this.rs = this.ps.executeQuery();

        if(this.rs==null){
            javax.swing.JOptionPane.showMessageDialog(null, "No Data Found of Supervisor!","Initialization Operation",0);
        }
    //        ps.close();
        
        return this.rs;
    }
        
}
