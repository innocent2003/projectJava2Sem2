/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author lemin
 */
public class Database {
      public static Connection getConnectDB(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/sem2";
            Connection conn = DriverManager.getConnection(URL, "root", "");
            return conn;
        } catch (ClassNotFoundException ex) {
            return null;
        } catch (SQLException ex) {
            return null;
        }
        
    }
    
    public static void checkConnectDB(){
        if (getConnectDB() != null)
        System.out.println("Kết nối database thành công");
        else
        System.out.println("Kết nối database không thành công");

    }
}
