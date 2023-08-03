
package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

        /***************************
           * @author : Devesh Patil *
             **************************/

public class StoreData {
    
    public static void sendData(Object[][] data,int count) throws SQLException{
        String sql = "INSERT INTO `Marks` (`Std_ID`, `SupervisorID`, `CourseID`, `Q1`, `Q2`, `Q3`, `Q4`, `Q5`, `Q6`, `Total`) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement ps = db.Connect.ConnectMe().prepareStatement(sql);
        ArrayList<Integer> check = new ArrayList<>();

        for (int j = 0; j < count; j++) {
                ps.setString(1, (String) data[j][1]);
                ps.setInt(2, (int) data[j][2]);
                ps.setInt(3,(int) data[j][3]);
                ps.setInt(4,(int) data[j][4]);
                ps.setInt(5,(int) data[j][5]);
                ps.setInt(6,(int) data[j][6]);
                ps.setInt(7,(int) data[j][7]);
                ps.setInt(8,(int) data[j][8]);
                ps.setInt(9,(int) data[j][9]);
                ps.setInt(10,(int) data[j][10]);
                if(ps.executeUpdate()==0){
                    check.add(1+j);
                }
        }
        if(!check.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(null, "This Number of Row not inserted :"+check.toArray().length, "Database Operation", 0);
        } else{
            javax.swing.JOptionPane.showMessageDialog(null, "Successfully Inserted All the Rows !", "Database Operation", 1);
        }

    }
}
