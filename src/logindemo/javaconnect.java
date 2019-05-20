/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logindemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 16101197
 */
public class javaconnect {
    public static Connection connectdb(){
        Connection con = null;
        try {
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/logindb", "login", "login");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(javaconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
