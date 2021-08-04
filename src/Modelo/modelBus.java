package Modelo;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class modelBus {
    int id;
    String descrip;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
    
    public String toString() {
        return this.descrip;
    }
    
    public Vector<modelBus> cargarModelos(Integer idMarca) {
        Vector objVector = new Vector();
        modelBus datos = null;

        datos = new modelBus();
        datos.setId(0);
        datos.setDescrip("Seleccione modelo del vehiculo");
        System.out.println(datos);
        objVector.add(datos);

         try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion obj_con = new Conexion();
            Connection con = obj_con.getConexion();
            
            System.out.println(idMarca);
            String SQL = "SELECT `id_modelo`, `descrip_modelo` FROM `modelo_unidad` WHERE `id_marca`=" + idMarca;
            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                datos = new modelBus();
                datos.setId(rs.getInt("id_modelo"));
                datos.setDescrip(rs.getString("descrip_modelo"));
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
