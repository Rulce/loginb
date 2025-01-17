/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.loginb;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ricardo
 */
public class ConsultarAlumnosCurso extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarAlumnosCurso
     */
    public ConsultarAlumnosCurso() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        DefaultTableModel datos = new DefaultTableModel(new String[]{"Carnet","Nombre","Apellidos", "Nota"},0);
        jTable1.setModel(datos);
        
        for (Curso curs : Loginb.cursos) {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Consultar Alumnos ");

        jLabel2.setText("Cursos");

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

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Carga Binario");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addGap(60, 60, 60)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(119, 119, 119)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel1)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String nombCurso = jComboBox1.getSelectedItem().toString();
        Curso cursoSeleccionado = null;
        
        for (Curso curs: Loginb.cursos) {
            if (curs.toString().equals(nombCurso)) {
                cursoSeleccionado = curs;
                break;
            }
        }
        if (cursoSeleccionado !=null) {
            DefaultTableModel data = new DefaultTableModel(new String[]{"Carnet","Nombre","Apellido"},
            cursoSeleccionado.getAlumnos().size());
            jTable1.setModel(data);
            
            int row = 0;
            
            for (Alumno alu : cursoSeleccionado.getAlumnos()){
                jTable1.setValueAt(alu.getCarne(), row, 0);
                jTable1.setValueAt(alu.getNombre(), row, 1);
                jTable1.setValueAt(alu.getApellido(), row, 2);
                row ++;
            }
        
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JFileChooser archivo = new JFileChooser();
        int result = archivo.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            cargarbin(archivo.getSelectedFile().getPath());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cargarbin(String rutaConNombre) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(rutaConNombre));
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split("#");
                if (partes.length == 2) {
                    String cursoID = partes[0];
                    String carnet = partes[1];

                    Alumno alumno = null;
                    for (Alumno a : Loginb.alumnos) {
                        if (a.getCarne().equals(carnet)) {
                            alumno = a;
                            break;
                        }
                    }

                    Curso cursoAsignado = null;
                    for (Curso c : Loginb.cursos) {
                        if (String.valueOf(c.getID()).equals(cursoID)) {
                            cursoAsignado = c;
                            break;
                        }
                    }
                    if (cursoAsignado != null && alumno != null) {
                        Alumno nuevoAlumno = new Alumno();
                        nuevoAlumno.setNombre(alumno.getNombre());
                        nuevoAlumno.setApellido(alumno.getApellido());
                        nuevoAlumno.setCarne(alumno.getCarne());
                        nuevoAlumno.setPassword(alumno.getPassword());
                        nuevoAlumno.setNota(alumno.getNota());
                        nuevoAlumno.setGenero(alumno.getGenero());
                        cursoAsignado.getAlumnos().add(nuevoAlumno);
                    }
                }
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
} 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
