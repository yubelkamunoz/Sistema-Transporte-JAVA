/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Paneles.VehiculoHabilitados;
import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class ModeloVehiculo implements ActionListener {
  private VehiculoHabilitados obj_vista;
    
    public ModeloVehiculo(VehiculoHabilitados obj_vistaM){
        this.obj_vista = obj_vistaM;
       //  obj_vista.btnGuardar.addActionListener(this);
       }
    
        PreparedStatement ps = null;
        ResultSet rs = null;
        ResultSetMetaData rsMd = null;
        Conexion obj_con = new Conexion();
        Connection con = obj_con.getConexion(); 
        //DefaultTableModel modelTable = new DefaultTableModel();
     
//FIN////////////////////////////////////////////////////////////////////////////////////////
       
  public void cargarDatos(JTable jTablevehiculos) {
        /////////////////////MODELO POR DEFAULT DE LA TABLA
        DefaultTableModel modelTable = new DefaultTableModel();
        obj_vista.jTableVehiculos.setModel(modelTable);
        obj_vista.jTableVehiculos.getTableHeader().setFont(new Font("Segoe UI Semilight", Font.BOLD, 12));
        obj_vista.jTableVehiculos.getTableHeader().setOpaque(false);
        obj_vista.jTableVehiculos.getTableHeader().setBackground(new Color(32, 136, 203));
        obj_vista.jTableVehiculos.getTableHeader().setForeground(new Color(255, 255, 255));
        obj_vista.jTableVehiculos.setRowHeight(25);
        //Titulos del header
        modelTable.addColumn("id");
        modelTable.addColumn("Nro");
        modelTable.addColumn("Placa");
        modelTable.addColumn("Color");
        modelTable.addColumn("Marca");
        modelTable.addColumn("Modelo");
        modelTable.addColumn("Puestos");
        modelTable.addColumn("Año");
        // Anchos del hearder
        int[] ANCHOS = {15, 20, 40, 40, 40, 40, 30, 30};
        for (int cont = 0; cont <  obj_vista.jTableVehiculos.getColumnCount(); cont++) {
             obj_vista.jTableVehiculos.getColumnModel().getColumn(cont).setPreferredWidth(ANCHOS[cont]);
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
            String SQL = "SELECT id_unidad, nro_unidad, placa, color, descrip_marca, descrip_modelo, cant_puestos, ano_unidad FROM carros a "
                    + "INNER JOIN marca_unidad b ON "
                    + "a. id_marca = b. id_marca "
                    + "INNER JOIN modelo_unidad c ON "
                    + "a. id_modelo = c. id_modelo "
                    + "WHERE a. estatus_table = 1"; //Consulta para cargar datos en la tabla   
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
     }

    @Override
    public void actionPerformed(ActionEvent e) {
       //////////////////////////*SI PRESIONA BOTON GUARDAR*/////////////////////////////////////        
       /*  if(e.getSource() == obj_vista.btnGuardar){
               int unidad = Integer.parseInt(obj_vista.txtUnidad.getText());
                String placa = obj_vista.txtPlaca.getText();
                int puestos = Integer.parseInt(obj_vista.txtAsientos.getText());
                int marca = obj_vista.cbxMarca.getSelectedIndex();
                int modelo = obj_vista.cbxModelo.getSelectedIndex();
                String color = (String) obj_vista.cbxColor.getSelectedItem();
                String anio = (String) obj_vista.cbxAnio.getSelectedItem();
                int status = 1;
                int estadoActual = 0;
                String idNew = "NUEVO";

            try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion obj_con = new Conexion();
            Connection con = obj_con.getConexion();
            String SQL = "INSERT INTO carros(nro_unidad, placa, color, id_marca, id_modelo, cant_puestos, ano_unidad, estatus_table, id_estado_actual) VALUES (?,?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(SQL);

            ps.setInt(1, unidad);
            ps.setString(2, placa);
            ps.setString(3, color);
            ps.setInt(4, marca);
            ps.setInt(5, modelo);
            ps.setInt(6, puestos);
            ps.setString(7, anio);
            ps.setInt(8, status);
            ps.setInt(9, estadoActual);
            System.out.println(ps);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Registro Guardado Exitosamente");
           // limpiar();
           cargarDatos(obj_vista.jTableVehiculos);

            } catch (Exception er) {
                JOptionPane.showMessageDialog(null, "Error al guardar registro");
                System.err.println(er.toString());
            }
        }   ////////////////FIN///////////////////////// */
    }
}
  

