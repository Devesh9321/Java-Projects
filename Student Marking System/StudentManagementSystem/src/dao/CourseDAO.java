
package dao;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

    /***************************
       * @author : Devesh Patil *
         **************************/

public class CourseDAO {
    private ResultSet rs = null;
    private PreparedStatement ps = null;
    private String Query = null;
    public bean.CourseVar data;
    
    
    public boolean InsertCourse() throws SQLException{
        this.Query = "INSERT INTO `course_details` (`CourseId`, `CourseCode`, `CourseName`, `Maximum_Mark`, `Q1`, `Q2`, `Q3`, `Q4`, `Q5`, `Q6`) VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        this.ps = db.Connect.ConnectMe().prepareStatement(this.Query);
        
        ps.setString(1, this.data.getCourseCode());
        ps.setString(2, this.data.getCourseName());
        ps.setInt(3, this.data.getMaximum_Mark());
        ps.setInt(4, this.data.getQ1());
        ps.setInt(5, this.data.getQ2());
        ps.setInt(6, this.data.getQ3());
        ps.setInt(7, this.data.getQ4());
        ps.setInt(8, this.data.getQ5());
        ps.setInt(9, this.data.getQ6());

        if(ps.executeUpdate()==1){
            this.data = null;
            return true;
        }
        this.data = null;
        return false;
    }
    
    public boolean SearchCourse(String CCode) throws SQLException{
        this.Query = "Select * from course_details where CourseCode = ? ";
        this.ps = db.Connect.ConnectMe().prepareCall(this.Query);
        ps.setString(1, CCode);
        
        rs = ps.executeQuery();
        
        this.data = new bean.CourseVar();
        
        if(rs!=null){
            rs.next();
            this.data.setCourseId(rs.getInt(1));
            this.data.setCourseCode(rs.getString(2));
            this.data.setCourseName(rs.getString(3));
            this.data.setMaximum_Mark(rs.getInt(4));
            this.data.setQ1(rs.getInt(5));
            this.data.setQ2(rs.getInt(6));
            this.data.setQ3(rs.getInt(7));
            this.data.setQ4(rs.getInt(8));
            this.data.setQ5(rs.getInt(9));
            this.data.setQ6(rs.getInt(10));
            
            return true;
        }
        
        return false;
    }
    public boolean UpdateCourse() throws SQLException{
        if(this.data != null){
            this.Query = "UPDATE `course_details` set `CourseName` = ? , `Maximum_Mark`=?, `Q1`=?, `Q2`=?, `Q3`=?, `Q4`=?, `Q5`=?, `Q6`=? where CourseCode = ? && CourseId= ?;";

            this.ps = db.Connect.ConnectMe().prepareStatement(this.Query);

            ps.setString(1, this.data.getCourseName());
            ps.setInt(2, this.data.getMaximum_Mark());
            ps.setInt(3, this.data.getQ1());
            ps.setInt(4, this.data.getQ2());
            ps.setInt(5, this.data.getQ3());
            ps.setInt(6, this.data.getQ4());
            ps.setInt(7, this.data.getQ5());
            ps.setInt(8, this.data.getQ6());
            ps.setString(9, this.data.getCourseCode());
            ps.setInt(10, this.data.getCourseId());

            if(ps.executeUpdate()==1){
                this.data = null;
                return true;
            }
        }
        return false;
    }
    
    public boolean DeleteCourse() throws SQLException{
        if(this.data != null)
        {
            this.Query = "Delete from `course_details` where CourseCode = ? && CourseId= ?;";
            this.ps = db.Connect.ConnectMe().prepareStatement(this.Query);
            ps.setString(1, this.data.getCourseCode());
            ps.setInt(2, this.data.getCourseId());

            if(ps.executeUpdate()==1){
                return true;
            }
        }
        return false;  
    }
}
