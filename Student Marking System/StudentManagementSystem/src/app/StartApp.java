
package app;

import java.sql.SQLException;


/** ****************************************
    *       @author : Devesh Patil         *
    ****************************************    **/
public class StartApp {

    public static void main(String[] args) {
        try {
            new MainWindow().setVisible(true);
        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error Occure While Dealing with DataBase.", "DataBase Operation", 0);
//            Logger.getLogger(StartApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
