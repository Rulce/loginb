/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.loginb;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ricardo
 */
public class ConsultarProfes extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarProfes
     */
    public ConsultarProfes() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
            DefaultTableModel data = new DefaultTableModel(new String[]{"Usuario", "Nombre", "Apellido", "Password"},Loginb.profesores.size());
        jTable1.setModel(data);
        
        int row = 0;
        
        for(Profesor p : Loginb.profesores){
            jTable1.setValueAt(p.usuario, row, 0);
            jTable1.setValueAt(p.apellido, row, 1);
            jTable1.setValueAt(p.usuario, row, 2);
            jTable1.setValueAt(p.password, row, 3);
            row ++;
        }
    }
    
        public void actualizarDatos(){
    DefaultTableModel data = new DefaultTableModel(new String[]{"Usuario", "Nombre", "Apellido", "Password"},Loginb.profesores.size());
        jTable1.setModel(data);
        
        int row = 0;
        
        for(Profesor p : Loginb.profesores){
            jTable1.setValueAt(p.usuario, row, 0);
            jTable1.setValueAt(p.apellido, row, 1);
            jTable1.setValueAt(p.usuario, row, 2);
            jTable1.setValueAt(p.password, row, 3);
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
        jButton5 = new javax.swing.JButton();

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

        jButton4.setText("Carga Masiva CSV");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Guardar CSV");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(31, 31, 31)
                        .addComponent(jButton2)
                        .addGap(26, 26, 26)
                        .addComponent(jButton1)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ModificarProfes m = new ModificarProfes(jTable1.getSelectedRow());
        m.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Loginb.profesores.remove(jTable1.getSelectedRow());
        JOptionPane.showMessageDialog(this, "Se elimino el profesor correctamente");
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        JFileChooser archivo = new JFileChooser("");
        int seleccionado = archivo.showDialog(this,"Cargar");
        if(seleccionado==JFileChooser.APPROVE_OPTION){
            archivosProfes(archivo.getSelectedFile().toPath().toString());
            
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        StringBuilder contenido = new StringBuilder();
        for (Profesor p :  Loginb.profesores) {
            contenido.append(p.usuario).append(",");
            contenido.append(p.nombre).append(",");
            contenido.append(p.apellido).append(",");
            contenido.append(p.password).append("\n");
        }
        
        JFileChooser archivo = new JFileChooser("");
        int seleccionado = archivo.showDialog(this,"Guardar");
        if(seleccionado==JFileChooser.APPROVE_OPTION){
            guardarCSV(archivo.getSelectedFile().toPath().toString(), contenido.toString());
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    
    public void archivosProfes(String rutaConNombre){
        
        try{
            File f = new File(rutaConNombre);
            FileReader fr = new FileReader(f);
            
            BufferedReader br = new BufferedReader(fr);
            
            String linea;
            while((linea=br.readLine())!=null){
                String[] contenidoLinea = linea.split(",");
                Profesor p = new Profesor();
                p.usuario = contenidoLinea[0];
                p.nombre = contenidoLinea[1];
                p.apellido = contenidoLinea[2];
                p.password = contenidoLinea[3];
                Loginb.profesores.add(p);
            }
        actualizarDatos();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    public static void guardarCSV (String rutaConNombre, String contenido){
        try(
                FileWriter fw = new FileWriter(rutaConNombre);
                PrintWriter pw = new PrintWriter(fw)){
                pw.write(contenido);
            
}catch (Exception e){
    e.printStackTrace();
}
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
