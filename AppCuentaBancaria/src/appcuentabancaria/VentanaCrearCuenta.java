/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcuentabancaria;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class VentanaCrearCuenta extends javax.swing.JFrame {

    /**
     * Creates new form VentanaCrearCuenta
     */
    public VentanaCrearCuenta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LbVCCTitulo = new javax.swing.JLabel();
        LbVCCPedido = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LbVCCNombre = new javax.swing.JLabel();
        LbVCCApellido = new javax.swing.JLabel();
        LbVCCDiaNacimiento = new javax.swing.JLabel();
        LbVCCMesNacimiento = new javax.swing.JLabel();
        LbVCCApellido3 = new javax.swing.JLabel();
        LbVCCAñoNacimiento = new javax.swing.JLabel();
        LbVCCApellido5 = new javax.swing.JLabel();
        BtnVCCCrearCuenta = new javax.swing.JButton();
        TxtVCCFechaCuenta = new javax.swing.JTextField();
        TxtVCCNombre = new javax.swing.JTextField();
        TxtVCCApellido = new javax.swing.JTextField();
        TxtVCCDiaNacimiento = new javax.swing.JTextField();
        TxtVCCMesNacimiento = new javax.swing.JTextField();
        TxtVCCAñoNacimiento = new javax.swing.JTextField();
        TxtVCCPrimerDeposito = new javax.swing.JTextField();
        BtnVCCVerDatosCuenta = new javax.swing.JButton();
        BtnVCCRealizarTransaccion = new javax.swing.JButton();
        TxtVCCAviso = new javax.swing.JTextField();
        BtnVCCVentanaPrincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        LbVCCTitulo.setText("CREAR CUENTA");

        LbVCCPedido.setText("Por favor ingrese los siguientes datos:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbVCCTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbVCCPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LbVCCTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LbVCCPedido)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        LbVCCNombre.setText("Nombre:");

        LbVCCApellido.setText("Apellido:");

        LbVCCDiaNacimiento.setText("Día Nacimiento:");

        LbVCCMesNacimiento.setText("Mes Nacimiento:");

        LbVCCApellido3.setText("Año Nacimiento:");

        LbVCCAñoNacimiento.setText("Primer Deposito:");

        LbVCCApellido5.setText("Fecha de creación de la cuenta:");

        BtnVCCCrearCuenta.setText("Crear Cuenta");

        TxtVCCFechaCuenta.setText("0-0-0");

        TxtVCCApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtVCCApellidoActionPerformed(evt);
            }
        });

        TxtVCCDiaNacimiento.setText("0");

        TxtVCCMesNacimiento.setText("0");

        TxtVCCAñoNacimiento.setText("0");

        TxtVCCPrimerDeposito.setText("0");

        BtnVCCVerDatosCuenta.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        BtnVCCVerDatosCuenta.setText("Ver Datos de la Cuenta");
        BtnVCCVerDatosCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVCCVerDatosCuentaActionPerformed(evt);
            }
        });

        BtnVCCRealizarTransaccion.setText("Realizar Transacción");
        BtnVCCRealizarTransaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVCCRealizarTransaccionActionPerformed(evt);
            }
        });

        TxtVCCAviso.setEditable(false);
        TxtVCCAviso.setText("El deposito debe ser mayor o igual al saldo mínimo");

        BtnVCCVentanaPrincipal.setText("Ventana Principal");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LbVCCNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbVCCApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbVCCDiaNacimiento)
                            .addComponent(LbVCCMesNacimiento)
                            .addComponent(LbVCCApellido3)
                            .addComponent(LbVCCAñoNacimiento))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtVCCPrimerDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtVCCAñoNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtVCCMesNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtVCCDiaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnVCCRealizarTransaccion)
                                    .addComponent(BtnVCCVerDatosCuenta))
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TxtVCCNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtVCCApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(LbVCCApellido5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtVCCFechaCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(BtnVCCCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtVCCAviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnVCCVentanaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(19, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LbVCCApellido5)
                    .addComponent(TxtVCCFechaCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbVCCNombre)
                    .addComponent(TxtVCCNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtVCCApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbVCCApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbVCCDiaNacimiento)
                    .addComponent(TxtVCCDiaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbVCCMesNacimiento)
                            .addComponent(TxtVCCMesNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbVCCApellido3)
                            .addComponent(TxtVCCAñoNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbVCCAñoNacimiento)
                            .addComponent(TxtVCCPrimerDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 18, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnVCCCrearCuenta)
                            .addComponent(TxtVCCAviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnVCCVerDatosCuenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnVCCRealizarTransaccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnVCCVentanaPrincipal)
                        .addGap(18, 18, 18))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TxtVCCApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtVCCApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtVCCApellidoActionPerformed

    private void BtnVCCVerDatosCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVCCVerDatosCuentaActionPerformed
        
        this.setVisible(false);
    }//GEN-LAST:event_BtnVCCVerDatosCuentaActionPerformed

    private void BtnVCCRealizarTransaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVCCRealizarTransaccionActionPerformed
 
    }//GEN-LAST:event_BtnVCCRealizarTransaccionActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaCrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCrearCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnVCCCrearCuenta;
    private javax.swing.JButton BtnVCCRealizarTransaccion;
    private javax.swing.JButton BtnVCCVentanaPrincipal;
    private javax.swing.JButton BtnVCCVerDatosCuenta;
    private javax.swing.JLabel LbVCCApellido;
    private javax.swing.JLabel LbVCCApellido3;
    private javax.swing.JLabel LbVCCApellido5;
    private javax.swing.JLabel LbVCCAñoNacimiento;
    private javax.swing.JLabel LbVCCDiaNacimiento;
    private javax.swing.JLabel LbVCCMesNacimiento;
    private javax.swing.JLabel LbVCCNombre;
    private javax.swing.JLabel LbVCCPedido;
    private javax.swing.JLabel LbVCCTitulo;
    private javax.swing.JTextField TxtVCCApellido;
    private javax.swing.JTextField TxtVCCAviso;
    private javax.swing.JTextField TxtVCCAñoNacimiento;
    private javax.swing.JTextField TxtVCCDiaNacimiento;
    private javax.swing.JTextField TxtVCCFechaCuenta;
    private javax.swing.JTextField TxtVCCMesNacimiento;
    private javax.swing.JTextField TxtVCCNombre;
    private javax.swing.JTextField TxtVCCPrimerDeposito;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
