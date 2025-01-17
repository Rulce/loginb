/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.loginb;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.io.FileReader;
import javax.swing.JFileChooser;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author ricardo
 */
public class ConsultarCurso extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarCurso
     */
    public ConsultarCurso() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        DefaultTableModel data = new DefaultTableModel(new Object[]{"ID","Nombre","Seccion","Fecha de Inicio", "Fecha de Fin", 
            "Hora de Inicio", "Hora de Fin", "Profesores"},Loginb.cursos.size());
        jTable1.setModel(data);
        
        int row = 0;
        
        for(Curso p : Loginb.cursos){
            jTable1.setValueAt(p.getID(), row, 0);
            jTable1.setValueAt(p.getNombre(), row, 1);
            jTable1.setValueAt(p.getSeccion(), row, 2);
            jTable1.setValueAt(p.getFechaInicio(), row, 3);
            jTable1.setValueAt(p.getFechaFin(), row, 4);
            jTable1.setValueAt(p.getHoraInicio(), row, 5);
            jTable1.setValueAt(p.getHoraFin(), row, 6);
            jTable1.setValueAt(p.getProfesores(), row, 7);
            row ++;
        }
    }
            
    public void actualizarDatos(){
    DefaultTableModel data = new DefaultTableModel(new Object[]{"ID","Nombre","Seccion","Fecha de Inicio", 
        "Fecha de Fin", "Hora de Inicio", "Hora de Fin", "Profesores"},Loginb.cursos.size());
        jTable1.setModel(data);
        
        int row = 0;
        
        for(Curso p : Loginb.cursos){
            jTable1.setValueAt(p.getID(), row, 0);
            jTable1.setValueAt(p.getNombre(), row, 1);
            jTable1.setValueAt(p.getSeccion(), row, 2);
            jTable1.setValueAt(p.getFechaInicio(), row, 3);
            jTable1.setValueAt(p.getFechaFin(), row, 4);
            jTable1.setValueAt(p.getHoraInicio(), row, 5);
            jTable1.setValueAt(p.getHoraFin(), row, 6);
            jTable1.setValueAt(p.getProfesores(), row, 7);
            row ++;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar Datos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Carga JSON");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ModificarCursos m = new ModificarCursos(jTable1.getSelectedRow());
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Loginb.cursos.remove(jTable1.getSelectedRow());
        JOptionPane.showMessageDialog(this, "Se elimino el curso correctamente");
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         JFileChooser archivo = new JFileChooser("");
        int seleccionado = archivo.showDialog(this,"Cargar");
        if(seleccionado==JFileChooser.APPROVE_OPTION){
            leerJSON(archivo.getSelectedFile().toPath().toString());
            
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    
    public void leerJSON(String rutaConNombre){
JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader(rutaConNombre)) {
            Object obj = parser.parse(reader);
            JSONArray cursosList = (JSONArray) obj;

            for (Object c : cursosList) {
                JSONObject cursoObj = (JSONObject) c;

                if (cursoObj != null) {
                    Object idObject = cursoObj.get("id");
                    int idCurso = (idObject != null) ? ((Long) idObject).intValue() : 1;
                    String nombreCurso = (String) cursoObj.get("nombre");
                    String seccionCurso = (String) cursoObj.get("seccion");

                    String FechaInicio = (String) cursoObj.get("fecha_inicio");

                    String FechaFin = (String) cursoObj.get("fecha_fin");

                    String HoraInicio = (String) cursoObj.get("hora_inicio");
                    String HoraFin = (String) cursoObj.get("hora_fin");
                    String profesor = (String) cursoObj.get("profesor");

                   Curso curs = new Curso();
                   curs.setID(idCurso);
                   curs.setNombre(nombreCurso);
                   curs.setSeccion(seccionCurso);
                   curs.setFechaInicio(FechaInicio);
                   curs.setFechaFin(FechaFin);
                   curs.setHoraInicio(HoraInicio);
                   curs.setHoraFin(HoraFin);
                   curs.setProfesores(profesor);
                           
                    Loginb.cursos.add(curs);
                }
            }

            actualizarDatos();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
