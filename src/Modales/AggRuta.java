/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modales;

import LIB.FadeEffect;
import Modelo.Conexion;
import Modelo.RutaIntermedia;
import Modelo.RutaLlegada;
import Modelo.RutaSalida;
import Modelo.TextHolder;
import Paneles.VehiculoHabilitados;
import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author YUBELKA
 */
public class AggRuta extends javax.swing.JFrame {

    /**
     * Creates
     */
    DefaultTableModel modelTable;
    VehiculoHabilitados tabla = new VehiculoHabilitados();
    int filas;

    public AggRuta() {
        initComponents();
        FadeEffect.transp(AggRuta.this);
        FadeEffect.fadeInFrame(this, 15, 0.5f);
        txtId.setVisible(false);
        PlaceHolders();

/////////////////////MODELO SALIDA POR DEFAULT DEL COMBOBOX////////////////////////////////////////////////////////////  
        RutaSalida obj_Parada1 = new RutaSalida();
        DefaultComboBoxModel modelSalida = new DefaultComboBoxModel(obj_Parada1.cargarParadas());
        cbxSalida.setModel(modelSalida);

/////////////////////MODELO INTERMEDIO POR DEFAULT DEL COMBOBOX////////////////////////////////////////////////////////////  
        RutaIntermedia obj_Parada2 = new RutaIntermedia();
        DefaultComboBoxModel modelIntermedio = new DefaultComboBoxModel(obj_Parada2.cargarParadas());
        cbxIntermedio.setModel(modelIntermedio);

/////////////////////MODELO LLEGADA POR DEFAULT DEL COMBOBOX////////////////////////////////////////////////////////////  
        RutaLlegada obj_Parada3 = new RutaLlegada();
        DefaultComboBoxModel modelLlegada = new DefaultComboBoxModel(obj_Parada3.cargarParadas());
        cbxLlegada.setModel(modelLlegada);

    }

///////////////////PLACE HOLDERS DEFAULT TEXTFIELD//////////////////////////////////////////////////////////////
    public void PlaceHolders() {
        TextHolder holderUsuario = new TextHolder("Ingrese tiempo en hh:mm:ss", txtTiempo);
        TextHolder holderCorreo = new TextHolder("Ingrese distancia en km", txtKm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jEImagePanel1 = new LIB.JEImagePanel();
        pnlModal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        rSLabelIcon5 = new RSMaterialComponent.RSLabelIcon();
        btnCiudad3 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        txtTiempo = new principal.MaterialTextField();
        jLabel8 = new javax.swing.JLabel();
        txtId = new principal.MaterialTextField();
        jLabel9 = new javax.swing.JLabel();
        cbxSalida = new RSMaterialComponent.RSComboBoxMaterial();
        rSLabelIcon1 = new RSMaterialComponent.RSLabelIcon();
        rSLabelIcon2 = new RSMaterialComponent.RSLabelIcon();
        rSLabelIcon3 = new RSMaterialComponent.RSLabelIcon();
        rSLabelIcon4 = new RSMaterialComponent.RSLabelIcon();
        cbxLlegada = new RSMaterialComponent.RSComboBoxMaterial();
        txtKm = new principal.MaterialTextField();
        lblCiudad3 = new RSMaterialComponent.RSLabelIcon();
        cbxIntermedio = new RSMaterialComponent.RSComboBoxMaterial();
        btnCancel = new javax.swing.JLabel();
        lblCerrar2 = new RSMaterialComponent.RSLabelIcon();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jEImagePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/fondotransparente.png"))); // NOI18N
        jEImagePanel1.setLayout(new java.awt.GridBagLayout());

        pnlModal.setBackground(new java.awt.Color(255, 255, 255));
        pnlModal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin IDE TranSoft - ADMINISTRADOR ");
        pnlModal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 510, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 104, 178));
        pnlModal.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 520, 10));

        rSLabelIcon5.setBackground(new java.awt.Color(69, 87, 252));
        rSLabelIcon5.setForeground(new java.awt.Color(255, 255, 255));
        rSLabelIcon5.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ADD_CIRCLE_OUTLINE);
        pnlModal.add(rSLabelIcon5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 30, 30));

        btnCiudad3.setBackground(new java.awt.Color(69, 87, 252));
        btnCiudad3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCiudad3.setForeground(new java.awt.Color(255, 255, 255));
        btnCiudad3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCiudad3.setText("    Añadir ciudad");
        btnCiudad3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCiudad3.setOpaque(true);
        btnCiudad3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCiudad3MouseClicked(evt);
            }
        });
        pnlModal.add(btnCiudad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 190, 50));

        btnGuardar.setBackground(new java.awt.Color(0, 192, 239));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGuardar.setText("Crear");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setOpaque(true);
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });
        pnlModal.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 110, 40));

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 0, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Agregar nueva ciudad a Ruta Destino ");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        pnlModal.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 390, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Versión 1.0");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        pnlModal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 60, 20));

        jSeparator6.setForeground(new java.awt.Color(0, 104, 178));
        pnlModal.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 520, 10));

        txtTiempo.setForeground(new java.awt.Color(153, 153, 153));
        txtTiempo.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        pnlModal.add(txtTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 330, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Tiempo estimado de recorrido :");
        pnlModal.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 230, 40));

        txtId.setForeground(new java.awt.Color(51, 51, 51));
        txtId.setFont(new java.awt.Font("Roboto Regular", 0, 12)); // NOI18N
        pnlModal.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 40, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("km : ");
        pnlModal.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 90, 40));

        cbxSalida.setForeground(new java.awt.Color(153, 153, 153));
        cbxSalida.setColorMaterial(new java.awt.Color(51, 153, 255));
        cbxSalida.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        pnlModal.add(cbxSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 330, 50));

        rSLabelIcon1.setForeground(new java.awt.Color(32, 136, 203));
        rSLabelIcon1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PLACE);
        pnlModal.add(rSLabelIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 30, 30));

        rSLabelIcon2.setForeground(new java.awt.Color(32, 136, 203));
        rSLabelIcon2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PLACE);
        pnlModal.add(rSLabelIcon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 30, 30));

        rSLabelIcon3.setForeground(new java.awt.Color(32, 136, 203));
        rSLabelIcon3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.TIMELINE);
        pnlModal.add(rSLabelIcon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 30, 30));

        rSLabelIcon4.setForeground(new java.awt.Color(32, 136, 203));
        rSLabelIcon4.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.TIMER);
        pnlModal.add(rSLabelIcon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 30, 30));

        cbxLlegada.setForeground(new java.awt.Color(153, 153, 153));
        cbxLlegada.setColorMaterial(new java.awt.Color(51, 153, 255));
        cbxLlegada.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        pnlModal.add(cbxLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 330, 50));

        txtKm.setForeground(new java.awt.Color(153, 153, 153));
        txtKm.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        pnlModal.add(txtKm, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 330, 40));

        lblCiudad3.setForeground(new java.awt.Color(204, 204, 204));
        lblCiudad3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PLUS_ONE);
        pnlModal.add(lblCiudad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 30, 30));

        cbxIntermedio.setForeground(new java.awt.Color(204, 204, 204));
        cbxIntermedio.setColorMaterial(new java.awt.Color(99, 70, 250));
        cbxIntermedio.setEnabled(false);
        cbxIntermedio.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        pnlModal.add(cbxIntermedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 330, -1));

        btnCancel.setBackground(new java.awt.Color(255, 76, 76));
        btnCancel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCancel.setText("Cancelar");
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.setOpaque(true);
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });
        pnlModal.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 110, 40));

        lblCerrar2.setForeground(new java.awt.Color(153, 153, 153));
        lblCerrar2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLOSE);
        lblCerrar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrar2MouseClicked(evt);
            }
        });
        pnlModal.add(lblCerrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 40, 40));

        jEImagePanel1.add(pnlModal, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 979, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCiudad3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCiudad3MouseClicked
        lblCiudad3.setForeground(new Color(32, 136, 203));
        cbxIntermedio.setForeground(new Color(32, 136, 203));
        cbxIntermedio.enable(true);
    }//GEN-LAST:event_btnCiudad3MouseClicked

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        GuardarDatos();
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        dispose();
    }//GEN-LAST:event_btnCancelMouseClicked

    private void lblCerrar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrar2MouseClicked
        dispose();
    }//GEN-LAST:event_lblCerrar2MouseClicked
//GUARDAR REGITROS
    public void GuardarDatos() {
        int salida = cbxSalida.getSelectedIndex();
        int llegada = cbxLlegada.getSelectedIndex();
        String km = txtKm.getText();
        int tiempo = Integer.parseInt(txtKm.getText());
        int estatus = 1;
        int intermedio;
        if (cbxIntermedio.isEnabled() == true) {
            intermedio = cbxIntermedio.getSelectedIndex();
        } else {
            intermedio = 1;
        }

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion obj_con = new Conexion();
            Connection con = obj_con.getConexion();
            String SQL = "INSERT INTO `rutas`(`km`,`tiempo_ruta`,`id_direccion_origen`,`id_direccion_intermedia`,`id_direccion_destino`,`estatus_ruta`) VALUES (?,?,?,?,?,?)";
            ps = con.prepareStatement(SQL);

            ps.setString(1, km);
            ps.setInt(2, tiempo);
            ps.setInt(3, salida);
            ps.setInt(4, intermedio);
            ps.setInt(5, llegada);
            ps.setInt(6, estatus);
            System.out.println(ps);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Ruta creada Exitosamente");
            //cargarDatos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al crear Ruta");
            System.err.println(e.toString());
        }
        this.dispose();
    }

    ////////////////FIN////////////////////////////////////////////////////////////////////////////////////  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AggRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AggRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AggRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AggRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AggRuta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCancel;
    private javax.swing.JLabel btnCiudad3;
    private javax.swing.JLabel btnGuardar;
    private RSMaterialComponent.RSComboBoxMaterial cbxIntermedio;
    private RSMaterialComponent.RSComboBoxMaterial cbxLlegada;
    private RSMaterialComponent.RSComboBoxMaterial cbxSalida;
    private LIB.JEImagePanel jEImagePanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator6;
    private RSMaterialComponent.RSLabelIcon lblCerrar2;
    private RSMaterialComponent.RSLabelIcon lblCiudad3;
    private javax.swing.JPanel pnlModal;
    private RSMaterialComponent.RSLabelIcon rSLabelIcon1;
    private RSMaterialComponent.RSLabelIcon rSLabelIcon2;
    private RSMaterialComponent.RSLabelIcon rSLabelIcon3;
    private RSMaterialComponent.RSLabelIcon rSLabelIcon4;
    private RSMaterialComponent.RSLabelIcon rSLabelIcon5;
    public principal.MaterialTextField txtId;
    public principal.MaterialTextField txtKm;
    public principal.MaterialTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
}
