package com.dao;

import com.bean.ALogVar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AdminDAO {

    public boolean Varify( ALogVar data) {
            boolean ret = false;
            try {
                    PreparedStatement ps = com.db.Connector.getConnect().prepareStatement("Select username,password from admin_info where username = ? AND password = ? ;");
                    ps.setString(1, data.getUsername());  
                    ps.setString(2, data.getPassword());;

                    ResultSet rs = ps.executeQuery();

                    if(rs!=null&&rs.next()) {		ret = true;		}
            }
            catch(SQLException e) {e.printStackTrace();}


            return ret;
    }

	
}
