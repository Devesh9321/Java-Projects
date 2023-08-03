package com.db;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Connector {
	
    private static Connection conn = null;

    public static Connection getConnect() {
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kisan_web_app","root","");
                System.out.println("Connection Successful !");

        }
        catch(ClassNotFoundException e) { e.printStackTrace();	}
        catch(SQLException e) { e.printStackTrace();	}

        return conn;
    }
	
}
