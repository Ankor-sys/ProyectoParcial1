/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package prueba_ingreso;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Geovani
 */
public class INGRESO_EMPLEADOS extends javax.swing.JFrame {
DefaultTableModel model = new DefaultTableModel();
    /**
     * Creates new form INGRESO_EMPLEADOS
     */
    public INGRESO_EMPLEADOS() {
        initComponents();
          model.addColumn("CODIGO");
        model.addColumn("NOMBRE");
        model.addColumn("PUESTO");
        model.addColumn("SALARIO ORDINARIO");
        model.addColumn("SALARIO EXTRAORDINARIO");
        model.addColumn("BONIFICACIONES");
        model.addColumn("COMISIONES");
        model.addColumn("OTROS");
        model.addColumn("ANTICIPOS");
        model.addColumn("DESCUENTOS JUDICIALES");
        model.addColumn("OTROS DESCUENTOS");
        this.tblPlanilla.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtComisiones = new javax.swing.JTextField();
        lblSalario = new javax.swing.JLabel();
        txtOtros = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPlanilla = new javax.swing.JTable();
        txtNombre = new javax.swing.JTextField();
        txtAnticipos = new javax.swing.JTextField();
        txtPuesto = new javax.swing.JTextField();
        txtDescuentosJudiciales = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtSalarioOrdinario = new javax.swing.JTextField();
        txtOtrosDesscuentos = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtSalarioExtraordinario = new javax.swing.JTextField();
        tbnGuardar = new javax.swing.JButton();
        lblSueldoExtra = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblBonificacion = new javax.swing.JLabel();
        lblAnticipos = new javax.swing.JLabel();
        lblComisiones = new javax.swing.JLabel();
        lblDescuentosJudiciales = new javax.swing.JLabel();
        lblOtros = new javax.swing.JLabel();
        lblOtrosDescuentos = new javax.swing.JLabel();
        txtBonificacion = new javax.swing.JTextField();
        lblPuesto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSalario.setText("Salario Ordinario");

        lblCodigo.setText("Codigo Empleado");

        tblPlanilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "NOMBRE", "PUESTO", "SALARIO", "SUELDO EXTRA", "BONIFICACION", "COMISIONES", "OTROS", "ANTICIPOS", "DESC. JUDICIALES", "OTORS DESC."
            }
        ));
        jScrollPane1.setViewportView(tblPlanilla);

        txtPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPuestoActionPerformed(evt);
            }
        });

        jLabel1.setText("          INGRESO DATOS PERSONALES");

        lblNombre.setText("Nombre");

        tbnGuardar.setText("AGREGAR EMPLEADO");
        tbnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnGuardarActionPerformed(evt);
            }
        });

        lblSueldoExtra.setText("Sueldo Extraordinario");

        jLabel2.setText("DESCUENTOS PERCIBIDOS");

        lblBonificacion.setText("Bonificacion");

        lblAnticipos.setText("Anticipos");

        lblComisiones.setText("Comisiones ");

        lblDescuentosJudiciales.setText("Descuentos Judiciales");

        lblOtros.setText("Otros");

        lblOtrosDescuentos.setText("Otros Descuentos");

        lblPuesto.setText("Puesto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addComponent(lblPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblComisiones, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblOtros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblBonificacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSueldoExtra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addComponent(lblSalario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(txtPuesto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSalarioOrdinario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSalarioExtraordinario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBonificacion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtComisiones, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOtros, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDescuentosJudiciales, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAnticipos, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblOtrosDescuentos, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDescuentosJudiciales, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAnticipos, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOtrosDesscuentos, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tbnGuardar))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(323, 323, 323)))
                .addGap(132, 132, 132))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(tbnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSalarioOrdinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblSueldoExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSalarioExtraordinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAnticipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBonificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBonificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDescuentosJudiciales, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOtrosDesscuentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblComisiones, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtComisiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOtrosDescuentos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescuentosJudiciales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblAnticipos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblOtros, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(txtOtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPuestoActionPerformed

    private void tbnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnGuardarActionPerformed

        String []Agregar = new String [18];
        Agregar[0]=txtNombre.getText();
        Agregar[1]=txtPuesto.getText();
        Agregar[2]=txtCodigo.getText();
        Agregar[3]=txtSalarioOrdinario.getText();
        Agregar[4]=txtSalarioExtraordinario.getText();
        Agregar[5]=txtBonificacion.getText();
        Agregar[6]=txtComisiones.getText();
        Agregar[7]=txtOtros.getText();
        Agregar[8]=txtAnticipos.getText();
        Agregar[9]=txtDescuentosJudiciales.getText();
        Agregar[10]=txtOtrosDesscuentos.getText();
        model.addRow(Agregar);

        /* String nombre = txtNombre.getText().trim();
        if(nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡No se ingreso el nombre de la persona!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String puesto= txtPuesto.getText().trim();
        if (puesto.isEmpty()){
            JOptionPane.showMessageDialog(this, " NO HA INGRESADO PUESTO ", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String _SalarioOrdinario = txtSalarioOrdinario.getText().trim();
        if (_SalarioOrdinario.isEmpty()){
            JOptionPane.showMessageDialog(this, " NO HA INGRESADO SALARIO ORDINARIO ", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String _SalarioExtraordinario= txtSalarioExtraordinario.getText().trim();
        if (_SalarioExtraordinario.isEmpty()){
            JOptionPane.showMessageDialog(this, " NO HA INGRESADO SALARIO EXTRAORDINARIO ", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String _Bonificacion= txtBonificacion.getText().trim();
        if (_Bonificacion.isEmpty()){
            JOptionPane.showMessageDialog(this, " NO HA INGRESADO BONIFICACION ", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String _Comision= txtComisiones.getText().trim();
        if (_Comision.isEmpty()){
            JOptionPane.showMessageDialog(this, " NO HA INGRESADO COMISIONES ", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String _Otros= txtOtros.getText().trim();
        if (_Otros.isEmpty()){
            JOptionPane.showMessageDialog(this, " NO HA INGRESADO OTROS ", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String _Anticipos= txtAnticipos.getText().trim();
        if (_Anticipos.isEmpty()){
            JOptionPane.showMessageDialog(this, " NO HA INGRESADO ANTICIPOS ", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String _DescuentosJudiciales= txtDescuentosJudiciales.getText().trim();
        if (_DescuentosJudiciales.isEmpty()){
            JOptionPane.showMessageDialog(this, " NO HA INGRESADO DESCUENTOS JUDICIALES ", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String _OtrosDescuentos= txtOtrosDesscuentos.getText().trim();
        if (_OtrosDescuentos.isEmpty()){
            JOptionPane.showMessageDialog(this, " NO HA INGRESADO Otros Descuentos ", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String _Codigo= txtCodigo.getText().trim();
        if (_Codigo.isEmpty()){
            JOptionPane.showMessageDialog(this, " NO HA INGRESADO CODIGO EMPLEADO ", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        float SalarioOrdinario;
        try {
            SalarioOrdinario = Float.parseFloat(_SalarioOrdinario);
        } catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "DEBE INGRESAR UN SUELDO FLOTANTE.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        float SalarioExtraordinario;
        try {
            SalarioExtraordinario = Float.parseFloat(_SalarioExtraordinario);
        } catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "DEBE INGRESAR UN SUELDO FLOTANTE.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        float Bonificacion;
        try {
            Bonificacion = Float.parseFloat(_Bonificacion);
        } catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "DEBE INGRESAR UN DATO FLOTANTE ", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        float Comision;
        try {
            Comision = Float.parseFloat(_Comision);
        } catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "DEBE INGRESAR UN SUELDO FLOTANTE.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        float Otros;
        try {
            Otros = Float.parseFloat(_Otros);
        } catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "DEBE INGRESAR UN SUELDO FLOTANTE.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        float Anticipos;
        try {
            Anticipos = Float.parseFloat(_Anticipos);
        } catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "DEBE INGRESAR UN SUELDO FLOTANTE.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        float DescuentosJudiciales;
        try {
            DescuentosJudiciales = Float.parseFloat(_DescuentosJudiciales);
        } catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "DEBE INGRESAR UN SUELDO FLOTANTE.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        float OtrosDescuentos;
        try {
            OtrosDescuentos = Float.parseFloat(_OtrosDescuentos);
        } catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "DEBE INGRESAR UN SUELDO FLOTANTE.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
            */
            //}

        // TODO add your handling code here:
    }//GEN-LAST:event_tbnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(INGRESO_EMPLEADOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(INGRESO_EMPLEADOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(INGRESO_EMPLEADOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(INGRESO_EMPLEADOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new INGRESO_EMPLEADOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAnticipos;
    private javax.swing.JLabel lblBonificacion;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblComisiones;
    private javax.swing.JLabel lblDescuentosJudiciales;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblOtros;
    private javax.swing.JLabel lblOtrosDescuentos;
    private javax.swing.JLabel lblPuesto;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblSueldoExtra;
    private javax.swing.JTable tblPlanilla;
    private javax.swing.JButton tbnGuardar;
    private javax.swing.JTextField txtAnticipos;
    private javax.swing.JTextField txtBonificacion;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtComisiones;
    private javax.swing.JTextField txtDescuentosJudiciales;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtOtros;
    private javax.swing.JTextField txtOtrosDesscuentos;
    private javax.swing.JTextField txtPuesto;
    private javax.swing.JTextField txtSalarioExtraordinario;
    private javax.swing.JTextField txtSalarioOrdinario;
    // End of variables declaration//GEN-END:variables
}
