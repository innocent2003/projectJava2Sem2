/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjavasem2;

import form.Login;
import utils.Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static utils.Database.checkConnectDB;

/**
 *
 * @author lemin
 */
public class ProjectJavaSem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        checkConnectDB();
        Login login = new Login();
        login.setTitle("library management system");
        login.setVisible(true);
    }
    
}
