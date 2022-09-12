/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bengkel;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Eighteenags
 */
public class Koneksi {
    private Connection conn;
    private Statement state;
    public Connection getConnection(){
        return conn;
    }
    public void Connect(){
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost/4fmotor","root","");
            state = (Statement)conn.createStatement();
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Koneksi Database Terputus !");
        }
    }
}
