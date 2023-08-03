
package com.dao;

import com.bean.ASignVar;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author : Devesh Patil
 */
public class AdSignDAO {

    public boolean InsertAdm( ASignVar data) {
    boolean ret = false;
    try {
            PreparedStatement ps = com.db.Connector.getConnect().prepareStatement("Insert into admin_info(username,password,full_name,email,phone) Values(?,?,?,?,?);");
            ps.setString(1, data.getUsename());  
            ps.setString(2, data.getPassword());
            ps.setString(3, data.getFullName());
            ps.setString(4, data.getEmail());
            ps.setLong(5, data.getPhone());

            if(ps.executeUpdate()==1) {		ret = true;		}
    }
    catch(SQLException e) {}
    return ret;
    }
}
