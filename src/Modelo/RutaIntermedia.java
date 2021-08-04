package Modelo;

import Modelo.Conexion;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class RutaIntermedia {

    int id;
    String parada;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescrip() {
        return parada;
    }

    public void setDescrip(String descrip) {
        this.parada = descrip;
    }

    public String toString() {

        return this.parada;
    }

    public Vector<RutaIntermedia> cargarParadas() {
        Vector<RutaIntermedia> objVector = new Vector<RutaIntermedia>();
        RutaIntermedia datos = null;

        datos = new RutaIntermedia();
        datos.setId(0);
        datos.setDescrip("Seleccione ciudad Intermedia :");
        System.out.println(datos);
        objVector.add(datos);

         try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion obj_con = new Conexion();
            Connection con = obj_con.getConexion();

            String SQL = "SELECT `id_direccion`, `city` FROM direcciones";
            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                datos = new RutaIntermedia();
                datos.setId(rs.getInt("id_direccion"));
                datos.setDescrip(rs.getString("city"));
                objVector.add(datos);
            }
            rs.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en conexion");
            System.err.println(e.toString());
        }
        return objVector;
    }

}
