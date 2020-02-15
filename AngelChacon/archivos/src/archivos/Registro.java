/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import archivos.Archivos;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.util.Properties;
import javax.swing.table.DefaultTableModel;


public class Registro extends javax.swing.JFrame {

    
    public Registro() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblnombre = new javax.swing.JLabel();
        lblpuesto = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        txtpuesto = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnmostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblnombre.setText("Nombre");

        lblpuesto.setText("Puesto");

        jLabel3.setText("Registro deEmpleados");

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnmostrar.setText("Mostrar Empledos");
        btnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblpuesto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(btnguardar)
                                .addGap(101, 101, 101)
                                .addComponent(btnmostrar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 104, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar)
                    .addComponent(btnmostrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

        
String nombre = txtnombre.getText().trim();
if(nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡No se ingreso el nombre de la persona!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }


String puesto = txtpuesto.getText().trim();
if(puesto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡No se ingreso la edad de la persona!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        } 
        
        
        try{
            
            File archivo = new File("texto.txt");
            FileWriter escribir = new FileWriter(archivo, true);
            escribir.write("\n "+nombre+"\t");
            escribir.write("\t"+puesto+"\n");
            escribir.close();
            
            JOptionPane.showMessageDialog(this, "\tDatos guardados exitosamente", "Informacion", JOptionPane.DEFAULT_OPTION);
            return;
        
            
            
            
            
        }
        
        catch(Exception e){
            
            JOptionPane.showMessageDialog(this, "¡Error al escribir!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
            
        }

        
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed
       
         String [] Titulos = {"Nombre","Puesto"};
    DefaultTableModel dtm = new DefaultTableModel(null, Titulos);
   
        
        String texto ="";
        
try{
    
    
       FileReader lector = new FileReader("texto.txt");
       Properties mostrar = new Properties();
        BufferedReader contenido = new BufferedReader(lector);
        
        while((texto=contenido.readLine())!=null){
            
          
           mostrar.load(lector);
            String filas[]={texto,mostrar.getProperty("nombre:",mostrar.getProperty("puesto:"))};
            dtm.addRow(filas);
        }
        
        
    
}catch(Exception e){
    
    System.out.println("Error al leer");
    
}
        
        
        
        
    jTable1.setModel(dtm);
        
    }//GEN-LAST:event_btnmostrarActionPerformed

    
   
    
    
     private void txtnombreFocusGained(java.awt.event.FocusEvent evt) {                                      
        txtnombre.selectAll();
    }                                     

    private void txtedadFocusGained(java.awt.event.FocusEvent evt) {                                    
        txtpuesto.selectAll();
    }              
 
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmostrar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblpuesto;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpuesto;
    // End of variables declaration//GEN-END:variables
}
