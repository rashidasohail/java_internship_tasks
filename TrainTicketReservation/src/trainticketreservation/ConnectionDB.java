/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainticketreservation;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Rashda Khanzada
 */
public class ConnectionDB {
    public static Connection ConnectDb(){
    try{
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection conn=(Connection) DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","scott");
    System.out.println("Connected");
    return conn;
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null,e);
    return null;
    }
    }
    
}

