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
public class accesoUsuario {

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

    public Vector<accesoUsuario> cargarAccesos() {
        Vector<accesoUsuario> objVector = new Vector<accesoUsuario>();
        accesoUsuario datos = null;

        datos = new accesoUsuario();
        datos.setId(0);
        datos.setDescrip("Seleccione Nivel de Acceso");
        System.out.println(datos);
        objVector.add(datos);

         try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion obj_con = new Conexion();
            Connection con = obj_con.getConexion();

            String SQL = "SELECT `id_acceso`, `descrip_acceso` FROM `acceso_usuario";
            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                datos = new accesoUsuario();
                datos.setId(rs.getInt("id_acceso"));
                datos.setDescrip(rs.getString("descrip_acceso"));
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
