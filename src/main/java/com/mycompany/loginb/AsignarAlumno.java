/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.loginb;

import javax.swing.JOptionPane;

/**
 *
 * @author ricardo
 */
public class AsignarAlumno extends javax.swing.JFrame {

    /**
     * Creates new form AsignarAlumno
     */
    public AsignarAlumno() {
        initComponents();

        this.setLocationRelativeTo(null);

        for (Alumno alu : Loginb.alumnos) {
            jComboBox1.addItem(alu.toString());
        }

        for (Curso curs : Loginb.cursos) {
            jComboBox2.addItem(curs.toString());
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Alumno");

        jLabel2.setText("Curso");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Asignar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(71, 71, 71))
                            .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String Lcurso = jComboBox2.getSelectedItem().toString();
        String Lalumno = jComboBox1.getSelectedItem().toString();

        Alumno alumnoSeleccionado = null;
        Curso cursoSeleccionado = null;

        for (Alumno al : Loginb.alumnos) {
            if (al.toString().equals(Lalumno)) {
                alumnoSeleccionado = al;
                break;
            }
        }
        for (Curso cl : Loginb.cursos) {
            if (cl.toString().equals(Lcurso)) {
                cursoSeleccionado = cl;
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

            // Verificar si el curso ya tiene 10 alumnos
            if (cursoSeleccionado.getAlumnos().size() >= 10) {
                JOptionPane.showMessageDialog(this, "El curso ya tiene 10 alumnos.");
                return;
            }

            Alumno all = new Alumno();
            all.setNombre(alumnoSeleccionado.getNombre());
            all.setApellido(alumnoSeleccionado.getApellido());
            all.setCarne(alumnoSeleccionado.getCarne());
            all.setPassword(alumnoSeleccionado.getPassword());
            all.setNota(alumnoSeleccionado.getNota());
            
            cursoSeleccionado.getAlumnos().add(all);
            JOptionPane.showMessageDialog(this, "Fue asignado exitosamente el alumno");

        }


    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}