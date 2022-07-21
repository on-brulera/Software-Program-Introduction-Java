/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejo_de_estructuras_tipo_pilas_y_colas_de_objetos;

import Fecha.Fecha;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class Ventana_Fecha extends javax.swing.JFrame {

    Pila pilafecha;
    Fecha fecha1;
    Fecha fecha2;
    Fecha edad;
    Principal principal;
    

    /**
     * Creates new form Ventana_Fecha
     */
    public Ventana_Fecha() {
        initComponents();
        pilafecha = new Pila();
        principal=new Principal();
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
        txt_dia1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_mes1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_año1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_dia2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_mes2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_año2 = new javax.swing.JTextField();
        btn_ingresar2 = new javax.swing.JButton();
        btn_ingresar1 = new javax.swing.JButton();
        btn_decrementar = new javax.swing.JButton();
        btn_comparar = new javax.swing.JButton();
        btn_incrementar = new javax.swing.JButton();
        txt_decrementar = new javax.swing.JTextField();
        txt_incrementar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        lbl_comparar = new javax.swing.JLabel();
        btn_comparar1 = new javax.swing.JButton();
        lbl_edad = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Fecha 1:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Dia");

        txt_dia1.setText("1");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("/");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Mes");

        txt_mes1.setText("10");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("/");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Año");

        txt_año1.setText("2020");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Fecha 2:");

        txt_dia2.setText("1");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("/");

        txt_mes2.setText("1");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("/");

        txt_año2.setText("2021");

        btn_ingresar2.setText("Ingresar");
        btn_ingresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresar2ActionPerformed(evt);
            }
        });

        btn_ingresar1.setText("Ingresar");
        btn_ingresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresar1ActionPerformed(evt);
            }
        });

        btn_decrementar.setText("Decrementar dia");
        btn_decrementar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_decrementarActionPerformed(evt);
            }
        });

        btn_comparar.setText("Comparar");
        btn_comparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_compararActionPerformed(evt);
            }
        });

        btn_incrementar.setText("Incrementar dia");
        btn_incrementar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_incrementarActionPerformed(evt);
            }
        });

        txt_decrementar.setText("1");

        txt_incrementar.setText("1");

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        lbl_comparar.setText(".........");

        btn_comparar1.setText("Edad");
        btn_comparar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comparar1ActionPerformed(evt);
            }
        });

        lbl_edad.setText(".........");

        jButton1.setText("Menú Principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_dia1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txt_mes1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txt_año1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(btn_ingresar1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txt_decrementar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn_incrementar)
                            .addGap(39, 39, 39)
                            .addComponent(txt_incrementar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_decrementar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(37, 37, 37)
                                .addComponent(txt_dia2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_comparar)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btn_comparar1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_edad)
                            .addComponent(lbl_comparar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_mes2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_año2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(btn_ingresar2)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(76, 76, 76))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_ingresar1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txt_año1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_mes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txt_dia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_incrementar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_incrementar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_decrementar)
                            .addComponent(txt_decrementar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_ingresar2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(txt_año2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_mes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(txt_dia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_comparar)
                            .addComponent(lbl_comparar)))
                    .addComponent(jScrollPane1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_comparar1)
                            .addComponent(lbl_edad))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresar1ActionPerformed
        // TODO add your handling code here:

        try {

            int dia = Integer.parseInt(txt_dia1.getText());
            int mes = Integer.parseInt(txt_mes1.getText());
            int año = Integer.parseInt(txt_año1.getText());

            fecha1 = new Fecha(año, mes, dia);
            txtArea.append("\n Fecha: " + fecha1.toString());

            txt_dia1.setText(fecha1.getDia() + "");
            txt_mes1.setText(fecha1.getMes() + "");
            txt_año1.setText(fecha1.getAño() + "");

            pilafecha.apilar(fecha1);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese los valores correctamente");
        }
    }//GEN-LAST:event_btn_ingresar1ActionPerformed

    private void btn_incrementarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_incrementarActionPerformed
        // TODO add your handling code here:
        try {

            int incremeto = Integer.parseInt(txt_incrementar.getText());

            fecha1.IncrementaDia(incremeto);

            txt_dia1.setText(fecha1.getDia() + "");
            txt_mes1.setText(fecha1.getMes() + "");
            txt_año1.setText(fecha1.getAño() + "");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese los valores correctamente");
        }
    }//GEN-LAST:event_btn_incrementarActionPerformed

    private void btn_decrementarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_decrementarActionPerformed
        // TODO add your handling code here:

        try {

            int decremento = Integer.parseInt(txt_decrementar.getText());

            fecha1.DecrementoDia(decremento);

            txt_dia1.setText(fecha1.getDia() + "");
            txt_mes1.setText(fecha1.getMes() + "");
            txt_año1.setText(fecha1.getAño() + "");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese los valores correctamente");
        }

    }//GEN-LAST:event_btn_decrementarActionPerformed

    private void btn_ingresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresar2ActionPerformed
        // TODO add your handling code here:

        try {

            int dia = Integer.parseInt(txt_dia2.getText());
            int mes = Integer.parseInt(txt_mes2.getText());
            int año = Integer.parseInt(txt_año2.getText());

            fecha2 = new Fecha(año, mes, dia);
            txtArea.append("\n Fecha: " + fecha2.toString());

            txt_dia2.setText(fecha2.getDia() + "");
            txt_mes2.setText(fecha2.getMes() + "");
            txt_año2.setText(fecha2.getAño() + "");

            pilafecha.apilar(fecha2);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese los valores correctamente");
        }

    }//GEN-LAST:event_btn_ingresar2ActionPerformed

    private void btn_compararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_compararActionPerformed
        // TODO add your handling code here:
        try {
            int aux = fecha1.Comparar(fecha2);
            if (aux == 1) {
                lbl_comparar.setText("La fecha 1 es mayor");
            }
            if (aux == -1) {
                lbl_comparar.setText("La fecha 1 es menor");
            }
            if (aux == 0) {
                lbl_comparar.setText("Las fechas son iguales");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fechas no creadas");
        }
    }//GEN-LAST:event_btn_compararActionPerformed

    private void btn_comparar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comparar1ActionPerformed
        // TODO add your handling code here:
          try {

           

            edad = fecha1.Edad(fecha2);

            lbl_edad.setText(edad.toString());

            pilafecha.apilar(edad);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese los valores correctamente");
        }
    }//GEN-LAST:event_btn_comparar1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String ruta = "C:/Users/ALEXIS/Desktop/Manejo_de_estructuras_tipo_pilas_y_colas_de_objetos/serializacion/PilaFecha.txt";
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(ruta));
            escritor.writeObject(pilafecha);
            escritor.close();
            this.setVisible(false);
            principal.setVisible(true);

        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error"+e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_Fecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Fecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Fecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Fecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Fecha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_comparar;
    private javax.swing.JButton btn_comparar1;
    private javax.swing.JButton btn_decrementar;
    private javax.swing.JButton btn_incrementar;
    private javax.swing.JButton btn_ingresar1;
    private javax.swing.JButton btn_ingresar2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_comparar;
    private javax.swing.JLabel lbl_edad;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txt_año1;
    private javax.swing.JTextField txt_año2;
    private javax.swing.JTextField txt_decrementar;
    private javax.swing.JTextField txt_dia1;
    private javax.swing.JTextField txt_dia2;
    private javax.swing.JTextField txt_incrementar;
    private javax.swing.JTextField txt_mes1;
    private javax.swing.JTextField txt_mes2;
    // End of variables declaration//GEN-END:variables
}