
package com.dao;

import com.bean.ProductVar;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author : Devesh Patil
 */
public class AddProdDAO {

public boolean InsertProd( ProductVar data) {
    boolean ret = false;
    try {
            PreparedStatement ps = com.db.Connector.getConnect().prepareStatement("Insert into products(Product_Name,Company,description,PType,Price) Values(?,?,?,?,?);");
            ps.setString(1, data.getProdName());  
            ps.setString(2, data.getCompany());
            ps.setString(3, data.getDescrip());
            ps.setString(4, data.getType());
            ps.setInt(5, data.getPrice());

            if(ps.executeUpdate()==1) {		ret = true;		}
    }
    catch(SQLException e) {e.printStackTrace();}
    return ret;
    }


    
}
