
package com.dao;

import com.bean.ProductVar;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.bean.NewsVar;
/*
 * @author : Devesh Patil
 */
public class AddNewsDAO {
    public boolean InsertNews( NewsVar data) {
    boolean ret = false;
    try {
            PreparedStatement ps = com.db.Connector.getConnect().prepareStatement("Insert into news_update(Heading,description,News_Date,Ntype) Values(?,?,?,?);");
            ps.setString(1, data.getHeading());  
            ps.setString(2, data.getDescrip());
            ps.setString(3, data.getDateNews());
            ps.setString(4, data.getNType());

            if(ps.executeUpdate()==1) {		ret = true;		}
    }
    catch(SQLException e) {e.printStackTrace();}
    return ret;
    }
}
