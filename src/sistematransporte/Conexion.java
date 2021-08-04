/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematransporte;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YUBELKA
 */
public class Conexion {
   private final String DB = "trasnporteiut"; 
   private final String URL = "jdbc:mysql://localhost:3306/" + DB;
   private final String USERNAME = "root";
   private final String PASSWARD = "";
   private Connection con = null;
   
    public Connection getConexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.URL, this.USERNAME, this.PASSWARD);
            //JOptionPane.showMessageDialog(null, "Conectó");
            
        }catch(SQLException e){
            System.err.println(e);
            
        } catch (ClassNotFoundException ex) {
           Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
       }
       return con;
    }
}
