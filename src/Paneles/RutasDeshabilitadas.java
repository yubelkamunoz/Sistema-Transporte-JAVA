package Paneles;

import Modales.DetallesRuta;
import Modelo.Conexion;
import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author YUBELKA
 */
public class RutasDeshabilitadas extends javax.swing.JPanel {

    public RutasDeshabilitadas() {
        initComponents();
        cargarDatos();
    } 
/////////////////////FIN ////////////////////////////////////////////////////////////////////////////////////

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFondo = new javax.swing.JPanel();
        pnlPrincipal = new javax.swing.JPanel();
        pnlTabla = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableUsuarios = new rojerusan.RSTableMetro();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnEliminar = new principal.MaterialButtomRectangle();
        jLabel17 = new javax.swing.JLabel();
        btnDetalles = new principal.MaterialButtomRectangle();
        lblHome1 = new javax.swing.JLabel();
        materialTextField1 = new principal.MaterialTextField();
        jSeparator3 = new javax.swing.JSeparator();
        btnBuscar = new principal.MaterialButton();
        btnDeshabilitados3 = new principal.MaterialButtomRectangle();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jFondo.setBackground(new java.awt.Color(255, 255, 204));
        jFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlPrincipal.setLayout(new javax.swing.BoxLayout(pnlPrincipal, javax.swing.BoxLayout.LINE_AXIS));

        pnlTabla.setBackground(new java.awt.Color(255, 255, 255));
        pnlTabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlTabla.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 890, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("© 2020 ESTUDIANTE DE 2DO AÑO EN INFORMATICA MUÑOZ M. YUBELKA M. - Admin IDE TranSoft  ");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        pnlTabla.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, 450, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Versión 1.0");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        pnlTabla.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 60, 20));

        jTableUsuarios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "km", "Tiempo", "Ciudad Origen", "Ciudad Intermedia", "Ciudad Destino"
            }
        ));
        jTableUsuarios.setColorBackgoundHead(new java.awt.Color(255, 76, 76));
        jTableUsuarios.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        jTableUsuarios.setColorBordeHead(new java.awt.Color(255, 255, 255));
        jTableUsuarios.setColorFilasBackgound2(new java.awt.Color(244, 244, 244));
        jTableUsuarios.setColorFilasForeground1(new java.awt.Color(102, 102, 102));
        jTableUsuarios.setColorFilasForeground2(new java.awt.Color(51, 51, 51));
        jTableUsuarios.setColorSelBackgound(new java.awt.Color(255, 76, 76));
        jTableUsuarios.setFocusable(false);
        jTableUsuarios.setFuenteFilas(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jTableUsuarios.setFuenteFilasSelect(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTableUsuarios.setFuenteHead(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        jTableUsuarios.setGridColor(new java.awt.Color(255, 255, 255));
        jTableUsuarios.setGrosorBordeHead(0);
        jTableUsuarios.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTableUsuarios.setRowHeight(25);
        jTableUsuarios.setShowVerticalLines(false);
        jTableUsuarios.getTableHeader().setReorderingAllowed(false);
        jTableUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuariosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableUsuarios);

        pnlTabla.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 620, 350));

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Departamento de Transporte");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        pnlTabla.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 250, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-eliminar-marcador-32.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlTabla.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 40, 30));

        btnEliminar.setBackground(new java.awt.Color(32, 136, 203));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("     Habilitar Ruta");
        btnEliminar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        pnlTabla.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 260, 50));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-documento-32.png"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlTabla.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 70, 30));

        btnDetalles.setBackground(new java.awt.Color(32, 136, 203));
        btnDetalles.setForeground(new java.awt.Color(255, 255, 255));
        btnDetalles.setText("   Detalles");
        btnDetalles.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        btnDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetallesActionPerformed(evt);
            }
        });
        pnlTabla.add(btnDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, 260, 50));

        lblHome1.setBackground(new java.awt.Color(255, 255, 255));
        lblHome1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHome1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconBusqueda.png"))); // NOI18N
        lblHome1.setOpaque(true);
        pnlTabla.add(lblHome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 30, 30));

        materialTextField1.setForeground(new java.awt.Color(153, 153, 153));
        materialTextField1.setText("Search....");
        materialTextField1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        pnlTabla.add(materialTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 320, 30));

        jSeparator3.setForeground(new java.awt.Color(0, 104, 178));
        pnlTabla.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 880, 10));

        btnBuscar.setBackground(new java.awt.Color(69, 87, 252));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        pnlTabla.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 80, 40));

        btnDeshabilitados3.setBackground(new java.awt.Color(153, 204, 0));
        btnDeshabilitados3.setForeground(new java.awt.Color(255, 255, 255));
        btnDeshabilitados3.setText("Habilitados");
        btnDeshabilitados3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeshabilitados3ActionPerformed(evt);
            }
        });
        pnlTabla.add(btnDeshabilitados3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 150, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("RUTAS DESHABILITADAS");
        pnlTabla.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 40));

        pnlPrincipal.add(pnlTabla);

        jFondo.add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 580));

        add(jFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 580));
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Habilitar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jTableUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuariosMouseClicked

    }//GEN-LAST:event_jTableUsuariosMouseClicked

    private void btnDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetallesActionPerformed
        tomaDatos();
    }//GEN-LAST:event_btnDetallesActionPerformed

    private void btnDeshabilitados3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeshabilitados3ActionPerformed
        RutasHabilitadas panel = new RutasHabilitadas();
        new CambiaPanel(pnlPrincipal, panel);
    }//GEN-LAST:event_btnDeshabilitados3ActionPerformed

////////////////CARGAR DATOS////////////////////////////////////////////////////////////////////////////
    public void cargarDatos() {

        /////////////////////MODELO POR DEFAULT DE LA TABLA
        DefaultTableModel modelTable = new DefaultTableModel();
        jTableUsuarios.setModel(modelTable);
        jTableUsuarios.getTableHeader().setFont(new Font("Segoe UI Semilight", Font.BOLD, 12));
        jTableUsuarios.getTableHeader().setOpaque(false);
        jTableUsuarios.getTableHeader().setBackground(new Color(32, 136, 203));
        jTableUsuarios.getTableHeader().setForeground(new Color(255, 255, 255));
        jTableUsuarios.setRowHeight(25);
        //Titulos del header
        modelTable.addColumn("id");
        modelTable.addColumn("Km");
        modelTable.addColumn("Tiempo");
        modelTable.addColumn("Ciudad Origen");
        modelTable.addColumn("Ciudad Intermedia");
        modelTable.addColumn("Ciudad Llegada");
        // Anchos del hearder
        int[] ANCHOS = {5, 10, 20, 70, 70, 70};
        for (int cont = 0; cont < jTableUsuarios.getColumnCount(); cont++) {
            jTableUsuarios.getColumnModel().getColumn(cont).setPreferredWidth(ANCHOS[cont]);
        }

        /////////////////////CARGAR DATOS
        try {
            modelTable.setRowCount(0); //ASIGNO 0 A NRO DE COLUMNAS ANTES DE CARGAR DATOS PARA NO REPETIR
            PreparedStatement ps = null;
            ResultSet rs = null;
            ResultSetMetaData rsMd = null; //Obtiene los datos del rs en formato matriz
            Conexion obj_con = new Conexion();
            Connection con = obj_con.getConexion();
            int estatus = 0;
            int columnas;
            String SQL = "SELECT TR. id_rutas, TR. km, TR. tiempo_ruta, TD1.city as city_origen , TD2.city as city_interme, TD3.city as city_destin "
                    + "FROM rutas TR "
                    + "INNER JOIN direcciones TD1 ON TR. id_direccion_origen    = TD1. id_direccion "
                    + "INNER JOIN direcciones TD2 ON TR. id_direccion_intermedia = TD2. id_direccion "
                    + "INNER JOIN direcciones TD3 ON TR. id_direccion_destino    = TD3. id_direccion "
                    + "WHERE TR. estatus_ruta=?";
            //Consulta para cargar datos en la tabla   
            ps = con.prepareStatement(SQL);
            ps.setInt(1, estatus);
            rs = ps.executeQuery();
            rsMd = rs.getMetaData();
            //System.out.println("El resultset MetaData del query es: " + rsMd);
            columnas = rsMd.getColumnCount();
            System.out.println(columnas + "columnas");

            while (rs.next()) {
                Object[] filas = new Object[columnas];  //Mientras rs sea true se comple la condicion
                for (int cont = 0; cont < columnas; cont++) {  //Array tipo obj le paso el nroColum 4
                    filas[cont] = rs.getObject(cont + 1);
                }
                modelTable.addRow(filas);
            }
            rs.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.err.println(e.toString());
        }
    }////////////////FIN////////////////////////  

////////////////DESHABILITAR REGITRO////////////////////////////////////////////////////////////////////////
    public void Habilitar() {
        int Fila = jTableUsuarios.getSelectedRow();
        System.out.println(Fila);
        int id = Integer.parseInt(jTableUsuarios.getValueAt(Fila, 0).toString());
        System.out.println(id);
        int estatus = 0;

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion obj_con = new Conexion();
            Connection con = obj_con.getConexion();
            String SQL = "UPDATE `rutas` SET `estatus_ruta`=? WHERE id_rutas=?";
            ps = con.prepareStatement(SQL);

            ps.setInt(1, estatus);
            ps.setInt(2, id);
            System.out.println(ps);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Ruta Destino Habilitada Exitosamente");
            cargarDatos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Habilitar Ruta Destino");
            System.err.println(e.toString());
        }
    }////////////////FIN////////////////////////    

////////////////LLENAR MODAL CON DATOS DE LA TABLA/////////////////////////////////////////////////////////////
    public void tomaDatos() {
        DetallesRuta modal = new DetallesRuta();
        modal.setVisible(true);
        int Fila = jTableUsuarios.getSelectedRow();
        /*obtener el nro de fila sellecioando*/
        System.out.println(Fila);
        int id = Integer.parseInt(jTableUsuarios.getValueAt(Fila, 0).toString());
        /*el valor de la fila y columna*/
        System.out.println(id);
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion obj_con = new Conexion();
            Connection con = obj_con.getConexion();

            String SQL = "SELECT usuario, correo, clave FROM usuarios a "
                       + "WHERE id_usuario =?"; //Consulta para cargar datos en la tabla
            ps = con.prepareStatement(SQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            //System.out.println(rs);

            while (rs.next()) {
                modal.txtId.setText(String.valueOf(id));
                modal.txtSalida.setText(rs.getString("id_direccion_origen"));
                modal.txtInterm.setText(rs.getString("id_direccion_intermedia"));
                modal.txtLlegada.setText(rs.getString("id_direccion_destino"));
                modal.txtKm.setText(rs.getString("km"));
                modal.txtTiempo.setText(rs.getString("tiempo_ruta"));
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }////////////////FIN////////////////////////     
//////////////////FIN//////////////////////////////////////////////////////////////////////////////////////////

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private principal.MaterialButton btnBuscar;
    private principal.MaterialButtomRectangle btnDeshabilitados3;
    private principal.MaterialButtomRectangle btnDetalles;
    private principal.MaterialButtomRectangle btnEliminar;
    private javax.swing.JPanel jFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    public rojerusan.RSTableMetro jTableUsuarios;
    private javax.swing.JLabel lblHome1;
    private principal.MaterialTextField materialTextField1;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlTabla;
    // End of variables declaration//GEN-END:variables
}
