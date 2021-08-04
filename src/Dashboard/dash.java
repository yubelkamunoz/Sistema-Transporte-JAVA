package Dashboard;

import Modales.AggVehiculo;
import Paneles.CambiaPanel;
import Paneles.pnlCrear;
import Paneles.pnlDashboard;
import Paneles.pnlNuevo;
import Paneles.pnlRegistros;
import Paneles.pnlReportes;

/**
 *
 * @author YUBELKA
 */
public class dash extends javax.swing.JFrame {

    /**
     * Creates new form dash
     */
    public dash() {
        initComponents();
        setLocationRelativeTo(null);
        ButtonTransparency();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nav = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        iconMenu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Panel = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        Menu = new LIB.JPanelRound();
        admin = new javax.swing.JLabel();
        administrador = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        lblHome1 = new javax.swing.JLabel();
        lblDashboard = new javax.swing.JLabel();
        lblReportes = new javax.swing.JLabel();
        lblCrear = new javax.swing.JLabel();
        btnCrear = new rsbuttom.RSButtonMetro();
        btnHome = new rsbuttom.RSButtonMetro();
        btnDashboard = new rsbuttom.RSButtonMetro();
        btnReportes = new rsbuttom.RSButtonMetro();
        btnRegistros = new rsbuttom.RSButtonMetro();
        lblRegistros = new javax.swing.JLabel();
        lblHome = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pnlPrincipal = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pblModal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AdminIDE TranSoft");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nav.setBackground(new java.awt.Color(54, 127, 168));
        nav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Admin IDE TranSoft");
        nav.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 200, 40));

        iconMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-menú-32.png"))); // NOI18N
        iconMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconMenuMouseClicked(evt);
            }
        });
        nav.add(iconMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconSalir.png"))); // NOI18N
        jLabel1.setText("Salir");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nav.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 0, 90, 40));

        getContentPane().add(nav, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 40));

        Panel.setBackground(new java.awt.Color(255, 255, 255));
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setColorPrimario(new java.awt.Color(34, 45, 49));
        Menu.setColorSecundario(new java.awt.Color(54, 127, 168));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconAdmin.png"))); // NOI18N
        Menu.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 40));

        administrador.setFont(new java.awt.Font("Segoe UI Semilight", 1, 11)); // NOI18N
        administrador.setForeground(new java.awt.Color(255, 255, 255));
        administrador.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        administrador.setText("ADMINISTRADOR");
        administrador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Menu.add(administrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 120, 30));

        usuario.setFont(new java.awt.Font("Segoe UI Semilight", 1, 11)); // NOI18N
        usuario.setForeground(new java.awt.Color(0, 255, 0));
        usuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        usuario.setText("Usuario");
        usuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Menu.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 60, 30));

        jTextField2.setBackground(new java.awt.Color(54, 73, 80));
        jTextField2.setBorder(null);
        Menu.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 170, 30));

        lblHome1.setBackground(new java.awt.Color(54, 73, 80));
        lblHome1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHome1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconBusqueda.png"))); // NOI18N
        lblHome1.setOpaque(true);
        Menu.add(lblHome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 30, 30));

        lblDashboard.setBackground(new java.awt.Color(54, 73, 80));
        lblDashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconDashboard.png"))); // NOI18N
        lblDashboard.setOpaque(true);
        Menu.add(lblDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 40, 30));

        lblReportes.setBackground(new java.awt.Color(54, 73, 80));
        lblReportes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconReportes.png"))); // NOI18N
        lblReportes.setOpaque(true);
        Menu.add(lblReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 40, 30));

        lblCrear.setBackground(new java.awt.Color(54, 73, 80));
        lblCrear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconCrear.png"))); // NOI18N
        lblCrear.setOpaque(true);
        Menu.add(lblCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 40, 30));

        btnCrear.setBackground(new java.awt.Color(54, 73, 80));
        btnCrear.setText("Crear");
        btnCrear.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        btnCrear.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        Menu.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 190, 30));

        btnHome.setBackground(new java.awt.Color(54, 73, 80));
        btnHome.setText("Home");
        btnHome.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        btnHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        Menu.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 190, 30));

        btnDashboard.setBackground(new java.awt.Color(54, 73, 80));
        btnDashboard.setText("Dashboard");
        btnDashboard.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        btnDashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });
        Menu.add(btnDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 190, 30));

        btnReportes.setBackground(new java.awt.Color(54, 73, 80));
        btnReportes.setText("Reportes");
        btnReportes.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        btnReportes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        Menu.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 190, 30));

        btnRegistros.setBackground(new java.awt.Color(54, 73, 80));
        btnRegistros.setText("Registros");
        btnRegistros.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        btnRegistros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrosActionPerformed(evt);
            }
        });
        Menu.add(btnRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 190, 30));

        lblRegistros.setBackground(new java.awt.Color(54, 73, 80));
        lblRegistros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-cargar-documento-de-enlace-32.png"))); // NOI18N
        lblRegistros.setOpaque(true);
        Menu.add(lblRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 40, 30));

        lblHome.setBackground(new java.awt.Color(54, 73, 80));
        lblHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-casa-white.png"))); // NOI18N
        lblHome.setOpaque(true);
        Menu.add(lblHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 40, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-información-32.png"))); // NOI18N
        jLabel8.setText("Admin IDE TranSoft");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 210, 40));

        menu.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 230, 610));
        menu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 190, 10));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Admin IDE TranSoft - ADMINISTRADOR ");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        menu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 560, 200, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("version 1.0");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        menu.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 180, 20));

        Panel.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 580));

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new java.awt.CardLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo blanco curvas.jpg"))); // NOI18N
        pnlPrincipal.add(jLabel4, "card2");
        pnlPrincipal.add(pblModal, "card3");

        Panel.add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 940, 580));

        getContentPane().add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1170, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iconMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconMenuMouseClicked
        int position = this.Menu.getX();
        if (position > -1) {
            Animacion.Animacion.mover_izquierda(0, -230, 2, 2, Menu);
        } else {
            Animacion.Animacion.mover_derecha(-230, 0, 2, 2, Menu);
        }
    }//GEN-LAST:event_iconMenuMouseClicked

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
       pnlCrear panel = new pnlCrear();
       new CambiaPanel(pnlPrincipal, panel);
       
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
       pnlDashboard panel = new pnlDashboard();
       new CambiaPanel(pnlPrincipal, panel);
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        pnlReportes panel = new pnlReportes();
        new CambiaPanel(pnlPrincipal, panel);
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrosActionPerformed
       pnlRegistros panel = new pnlRegistros();
       new CambiaPanel(pnlPrincipal, panel);
    }//GEN-LAST:event_btnRegistrosActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        pnlNuevo panel = new pnlNuevo();
        new CambiaPanel(pnlPrincipal, panel);
    }//GEN-LAST:event_btnCrearActionPerformed

     public void ButtonTransparency(){ ///////////////TRANSPARENCIA DE BOTONES 
        btnHome.setOpaque(false);
        btnHome.setContentAreaFilled(false);
        btnHome.setBorderPainted(false);
            
        btnDashboard.setOpaque(false);
        btnDashboard.setContentAreaFilled(false);
        btnDashboard.setBorderPainted(false);
        
        btnReportes.setOpaque(false);
        btnReportes.setContentAreaFilled(false);
        btnReportes.setBorderPainted(false);
        
        btnRegistros.setOpaque(false);
        btnRegistros.setContentAreaFilled(false);
        btnRegistros.setBorderPainted(false);
        
        btnCrear.setOpaque(false);
        btnCrear.setContentAreaFilled(false);
        btnCrear.setBorderPainted(false); 
        
        lblHome.setOpaque(false);
        lblDashboard.setOpaque(false);
        lblReportes.setOpaque(false);
        lblRegistros.setOpaque(false);
        lblCrear.setOpaque(false);
        
        }    
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private LIB.JPanelRound Menu;
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel admin;
    private javax.swing.JLabel administrador;
    private rsbuttom.RSButtonMetro btnCrear;
    private rsbuttom.RSButtonMetro btnDashboard;
    private rsbuttom.RSButtonMetro btnHome;
    private rsbuttom.RSButtonMetro btnRegistros;
    private rsbuttom.RSButtonMetro btnReportes;
    private javax.swing.JLabel iconMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblCrear;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblHome1;
    private javax.swing.JLabel lblRegistros;
    private javax.swing.JLabel lblReportes;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel nav;
    private javax.swing.JPanel pblModal;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}