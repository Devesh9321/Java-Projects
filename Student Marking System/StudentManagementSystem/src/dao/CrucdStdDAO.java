
package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

        /***************************
           * @author : Devesh Patil *
             **************************/

public class CrucdStdDAO {
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String Query=null;
    public bean.StdVar data ;

    public ResultSet getData(String column,int data) throws SQLException{
            if(column.equals("1"))  this.Query = "select * from Marks ;";
            else this.Query = "select * from Marks where `"+column+"` = "+data+";";

            ps = db.Connect.ConnectMe().prepareStatement(this.Query);
            
            rs = ps.executeQuery();
            
            if(rs==null){
                javax.swing.JOptionPane.showMessageDialog(null, "No Data Found !","Initialization Operation",0);
            }
        return rs;
    }
    
    public void UpdateStd() throws SQLException{
        this.Query = "update Marks set Q1=?,Q2=?,Q3=?,Q4=?,Q5=?,Q6=? where Sr_No = ? && Std_ID=? && CourseID = ?; ";
        ps = db.Connect.ConnectMe().prepareStatement(this.Query);
        
        ps.setInt(1, data.getQ1());
        ps.setInt(2, data.getQ2());
        ps.setInt(3, data.getQ3());
        ps.setInt(4, data.getQ4());
        ps.setInt(5, data.getQ5());
        ps.setInt(6, data.getQ6());
        ps.setInt(7, data.getSr_no());
        ps.setString(8, data.getIdCode());
        ps.setInt(9, data.getCourseId());
        
        if(ps.executeUpdate()==1){
            javax.swing.JOptionPane.showMessageDialog(null, "Successfully Update the Value of Student.", "Student Operation", 3);
        }
        else{
            javax.swing.JOptionPane.showMessageDialog(null, "Failed To Update the Value of Student.", "Student Operation", 2);
        }
        this.data = null;
    }
    
    public void DeleteStd() throws SQLException{
        this.Query = "Delete from Marks where Sr_No = ? && Std_ID=? && CourseID = ?; ";
        ps = db.Connect.ConnectMe().prepareStatement(this.Query);
        ps.setInt(1, data.getSr_no());
        ps.setString(2, data.getIdCode());
        ps.setInt(3, data.getCourseId());
        
        if(ps.executeUpdate()==1){
            javax.swing.JOptionPane.showMessageDialog(null, "Successfully Deleted the Value of Student.", "Student Operation", 3);
        }
        else{
            javax.swing.JOptionPane.showMessageDialog(null, "Failed To Delete the Value of Student.", "Student Operation", 2);
        }
        
        this.data = null;
    }
    
    public void SearchStd(String icode,int course) throws SQLException{
        this.Query = "Select * from Marks where Std_ID=? && CourseID = ?; ";
        ps = db.Connect.ConnectMe().prepareStatement(this.Query);
        ps.setString(1, icode);
        ps.setInt(2, course);
        rs = ps.executeQuery();
        data = new bean.StdVar();
        
        while(rs.next()){
            data.setSr_no(rs.getInt(1));
            data.setIdCode(rs.getString(2));
            data.setSubervisorId(rs.getInt(3));
            data.setCourseId(rs.getInt(4));
            data.setQ1(rs.getInt(5));
            data.setQ2(rs.getInt(6));
            data.setQ3(rs.getInt(7));
            data.setQ4(rs.getInt(8));
            data.setQ5(rs.getInt(9));
            data.setQ6(rs.getInt(10));
            data.setTotal(rs.getInt(11));
            
        }
        
    }
}
