/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.loginb;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ricardo
 */

public class AsigCursAlum extends javax.swing.JFrame {

    /**
     * Creates new form AsigCursAlum
     */
    public AsigCursAlum() {
        initComponents();
        this.setLocationRelativeTo(null);
                    
        for(Curso curs : Loginb.cursos){
            jComboBox1.addItem(curs.toString());
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Asignarse");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Asignacion y Desasignacion de Cursos");

        jLabel2.setText("Seleccione en el Combo Box el curso que quiera asignarse y luego de al boton \"Asignarse\"");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String Lcurso = jComboBox1.getSelectedItem().toString();
        Alumno Lalumno = Loginb.alumnoLogeado;

        Alumno alumnoSeleccionado = null;
        Curso cursoSeleccionado = null;

        
        for (Curso cl : Loginb.cursos) {
            if (cl.toString().equals(Lcurso)) {
                cursoSeleccionado = cl;
                break;
            }

        }
        
        for (Alumno al : Loginb.alumnos) {
            if (al.equals(Lalumno)) {
                alumnoSeleccionado = al;
                break;
            }
        }
        
        

        if (cursoSeleccionado != null && alumnoSeleccionado != null) {
            boolean tet = false;
            // Verificar si el alumno ya está asignado a este curso
            for(Alumno am : cursoSeleccionado.getAlumnos()){
                if(am.getCarne().equals(alumnoSeleccionado.getCarne())){
                 tet = true;
                 break;
                }
            }
            
            if (tet) {
            JOptionPane.showMessageDialog(this, "El alumno ya está asignado a este curso.");
            return;
        }
        
            // Verificar si el alumno ya está asignado a 5 cursos
            int countarCursos = 0;
            for (Curso curso : Loginb.cursos) {
                for(Alumno am : curso.getAlumnos()){
                if (am.getCarne().equals(alumnoSeleccionado.getCarne())) {
                    countarCursos++;
                    }
                }
            }

            if (countarCursos >= 5) {
                JOptionPane.showMessageDialog(this, "El alumno ya está asignado a 5 cursos.");
                return;
            }

            Alumno all = new Alumno();
            all.setNombre(alumnoSeleccionado.getNombre());
            all.setApellido(alumnoSeleccionado.getApellido());
            all.setCarne(alumnoSeleccionado.getCarne());
            all.setPassword(alumnoSeleccionado.getPassword());
            all.setNota(alumnoSeleccionado.getNota());
            cursoSeleccionado.getAlumnos().add(all);
            JOptionPane.showMessageDialog(this, "Te asignaste correctamente al curso");
    }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}