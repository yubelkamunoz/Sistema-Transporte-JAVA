package Paneles;

import Modales.DetallesConductor;
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
public class ConductorDeshabilitados extends javax.swing.JPanel {

    public ConductorDeshabilitados() {
        initComponents();
       // txtId.setVisible(false);
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
        btnDeshabilitados = new principal.MaterialButtomRectangle();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnDeshabilitar = new principal.MaterialButtomRectangle();
        jLabel15 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnDetalles = new principal.MaterialButtomRectangle();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableConductores = new rojerusan.RSTableMetro();
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
        pnlTabla.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 60, 20));

        btnDeshabilitados.setBackground(new java.awt.Color(153, 204, 0));
        btnDeshabilitados.setForeground(new java.awt.Color(255, 255, 255));
        btnDeshabilitados.setText("Habilitados");
        btnDeshabilitados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeshabilitadosActionPerformed(evt);
            }
        });
        pnlTabla.add(btnDeshabilitados, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 150, 40));

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("DASHBOARD");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        pnlTabla.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-eliminar-marcador-32.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlTabla.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, 30, 30));

        btnDeshabilitar.setBackground(new java.awt.Color(32, 136, 203));
        btnDeshabilitar.setForeground(new java.awt.Color(255, 255, 255));
        btnDeshabilitar.setText("  Habilitar");
        btnDeshabilitar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        btnDeshabilitar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeshabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeshabilitarActionPerformed(evt);
            }
        });
        pnlTabla.add(btnDeshabilitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, 200, 50));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-documento-32.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlTabla.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 190, 40, 30));
        pnlTabla.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 880, 10));

        btnDetalles.setBackground(new java.awt.Color(32, 136, 203));
        btnDetalles.setForeground(new java.awt.Color(255, 255, 255));
        btnDetalles.setText("Detalles");
        btnDetalles.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        btnDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetallesActionPerformed(evt);
            }
        });
        pnlTabla.add(btnDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 180, 200, 50));

        jTableConductores.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jTableConductores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Cedula", "Nombre", "Apellido", "Fecha Nac", "Telefono", "Sexo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableConductores.setColorBackgoundHead(new java.awt.Color(221, 76, 52));
        jTableConductores.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        jTableConductores.setColorBordeHead(new java.awt.Color(255, 255, 255));
        jTableConductores.setColorFilasBackgound2(new java.awt.Color(244, 244, 244));
        jTableConductores.setColorFilasForeground1(new java.awt.Color(102, 102, 102));
        jTableConductores.setColorFilasForeground2(new java.awt.Color(51, 51, 51));
        jTableConductores.setColorSelBackgound(new java.awt.Color(255, 76, 76));
        jTableConductores.setFocusable(false);
        jTableConductores.setFuenteFilas(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jTableConductores.setFuenteFilasSelect(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTableConductores.setFuenteHead(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        jTableConductores.setGridColor(new java.awt.Color(255, 255, 255));
        jTableConductores.setGrosorBordeHead(0);
        jTableConductores.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTableConductores.setRowHeight(25);
        jTableConductores.setShowVerticalLines(false);
        jTableConductores.getTableHeader().setReorderingAllowed(false);
        jTableConductores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableConductoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableConductores);

        pnlTabla.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 700, 390));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Conductores Deshabilitados");
        pnlTabla.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 40));

        pnlPrincipal.add(pnlTabla);

        jFondo.add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 580));

        add(jFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 580));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeshabilitadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeshabilitadosActionPerformed
        ConductorHabilitados panel = new ConductorHabilitados();
        new CambiaPanel(pnlPrincipal, panel);
    }//GEN-LAST:event_btnDeshabilitadosActionPerformed

    private void btnDeshabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeshabilitarActionPerformed
        habilitar();
    }//GEN-LAST:event_btnDeshabilitarActionPerformed

    private void btnDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetallesActionPerformed
        tomaDatos();
    }//GEN-LAST:event_btnDetallesActionPerformed

    private void jTableConductoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableConductoresMouseClicked

    }//GEN-LAST:event_jTableConductoresMouseClicked

////////////////CARGAR DATOS////////////////////////////////////////////////////////////////////////////
    public void cargarDatos() {

        /////////////////////MODELO POR DEFAULT DE LA TABLA
        DefaultTableModel modelTable = new DefaultTableModel();
        jTableConductores.setModel(modelTable);
        jTableConductores.getTableHeader().setFont(new Font("Segoe UI Semilight", Font.BOLD, 12));
        jTableConductores.getTableHeader().setOpaque(false);
        jTableConductores.getTableHeader().setBackground(new Color(32, 136, 203));
        jTableConductores.getTableHeader().setForeground(new Color(255, 255, 255));
        jTableConductores.setRowHeight(25);
        //Titulos del header
        modelTable.addColumn("id");
        modelTable.addColumn("Cedula");
        modelTable.addColumn("Nombre");
        modelTable.addColumn("Apellido");
        modelTable.addColumn("Telefono");
        modelTable.addColumn("Fecha de Nac");
        modelTable.addColumn("Sexo");
        // Anchos del hearder
        int[] ANCHOS = {8, 30, 30, 30, 40, 30, 25};
        for (int cont = 0; cont < jTableConductores.getColumnCount(); cont++) {
            jTableConductores.getColumnModel().getColumn(cont).setPreferredWidth(ANCHOS[cont]);
        }

        /////////////////////CARGAR DATOS
        try {
            modelTable.setRowCount(0); //ASIGNO 0 A NRO DE COLUMNAS ANTES DE CARGAR DATOS PARA NO REPETIR
            PreparedStatement ps = null;
            ResultSet rs = null;
            ResultSetMetaData rsMd = null; //Obtiene los datos del rs en formato matriz
            Conexion obj_con = new Conexion();
            Connection con = obj_con.getConexion();
            int columnas;
            String SQL = "SELECT id_conductor, cedula, nombre, apellido, telefono, fecha_nacim, sexo FROM conductores "
                    + "WHERE estatus_conductor = 0"; //Consulta para cargar datos en la tabla   
            ps = con.prepareStatement(SQL);
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

////////////////LIMPIAR DATOS////////////////////////////////////////////////////////////////////////////
////////////////MODIFICAR REGITROS////////////////////////////////////////////////////////////////////////
////////////////DESHABILITAR REGITRO////////////////////////////////////////////////////////////////////////
        public void habilitar() {
        int Fila = jTableConductores.getSelectedRow();
        /*obtener el nro de fila sellecioando*/
        System.out.println(Fila);
        int id = Integer.parseInt(jTableConductores.getValueAt(Fila, 0).toString());
        /*el valor de la fila y columna*/
        System.out.println(id);
        int status = 1;
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion obj_con = new Conexion();
            Connection con = obj_con.getConexion();
            String SQL = "UPDATE `conductores` SET `estatus_conductor`=? WHERE `id_conductor`=?";
            ps = con.prepareStatement(SQL);

            ps.setInt(1, status);
            ps.setInt(2, id);
            System.out.println(ps);
            ps.execute();
            JOptionPane.showConfirmDialog(null, "¿Seguro que desea deshabilitar el conductor?");
            JOptionPane.showMessageDialog(null, "Registro Habilitado Exitosamente");
            cargarDatos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al deshabilitar el registro");
            System.err.println(e.toString());
        }
    }////////////////FIN////////////////////////    

////////////////LLENAR MODAL CON DATOS DE LA TABLA/////////////////////////////////////////////////////////////
    public void tomaDatos() {
        DetallesConductor modal = new DetallesConductor();
        modal.setVisible(true);
        int Fila = jTableConductores.getSelectedRow();
        /*obtener el nro de fila sellecioando*/
        System.out.println(Fila);
        int id = Integer.parseInt(jTableConductores.getValueAt(Fila, 0).toString());
        /*el valor de la fila y columna*/
        System.out.println(id);
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion obj_con = new Conexion();
            Connection con = obj_con.getConexion();

            String SQL = "SELECT id_conductor, cedula, nombre, apellido, telefono, fecha_nacim, sexo FROM conductores "
                    + "WHERE id_conductor =?"; //Consulta para cargar datos en la tabla
            ps = con.prepareStatement(SQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            System.out.println(rs);

            while (rs.next()) {
                modal.txtId.setText(String.valueOf(id));
                modal.txtCedula.setText(rs.getString("cedula"));
                modal.txtNombre.setText(rs.getString("nombre"));
                modal.txtApellido.setText(rs.getString("apellido"));
                modal.txtTlf.setText(rs.getString("telefono"));
                modal.txtFecha.setText(rs.getString("fecha_nacim"));
                modal.txtSexo.setText(rs.getString("sexo"));
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

////////////////FIN////////////////////////////////////////////////////////////////////////////////////   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private principal.MaterialButtomRectangle btnDeshabilitados;
    private principal.MaterialButtomRectangle btnDeshabilitar;
    private principal.MaterialButtomRectangle btnDetalles;
    private javax.swing.JPanel jFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public rojerusan.RSTableMetro jTableConductores;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlTabla;
    // End of variables declaration//GEN-END:variables
}