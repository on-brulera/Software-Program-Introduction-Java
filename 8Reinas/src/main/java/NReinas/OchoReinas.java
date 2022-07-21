package NReinas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class OchoReinas extends javax.swing.JFrame {

    JButton[][] cuadro;
    private int[] solucion;
    private int j = -1, i = -1;
    private JButton Terminar, Solucionar, Reiniciar;
    NReinas reinas = new NReinas(8);

    public OchoReinas() {
        initComponents();
        this.setMinimumSize(new Dimension(700, 700));
        solucion = new int[8];
        reinas.buscarSoluciones();

        Terminar = new JButton();
        Solucionar = new JButton();
        Reiniciar = new JButton();
        Terminar.setBounds(110, 50, 90, 25);
        Solucionar.setBounds(210, 50, 90, 25);
        Reiniciar.setBounds(310, 50, 90, 25);
        Terminar.setText("Terminar");
        Solucionar.setText("Solucionar");
        Reiniciar.setText("Reiniciar");
        jPTablero.add(Terminar);
        jPTablero.add(Solucionar);
        jPTablero.add(Reiniciar);

        int x = 90;
        int y = 90;
        cuadro = new JButton[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                cuadro[i][j] = new JButton();
                cuadro[i][j].setBounds(x, y, 50, 50);
                cuadro[i][j].setVisible(true);
                

                x += 50;
                jPTablero.add(cuadro[i][j]);
            }
            x = 90;
            y += 50;
        }

        IniciarEventos();
    }

    private void IniciarEventos() {
        //Eventos del cuadro
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                ClickCuadros(i, j);
                //System.out.println("solu");
            }
        }

        ClickTerminar();
        ClickSolucionar();
        ClickReiniciar();
    }

    private void ClickCuadros(int x, int y) {

        MouseListener oyenteRaton;
        oyenteRaton = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {//Presionar y soltar dentro del boton si sueltas a fuera no ocurre el evento
                marcarReina(x, y);
            }

            @Override
            public void mousePressed(MouseEvent arg0) {//Solo presionas el boton y se ejecuta el metodo
                //saludo.setText("Hola " + cajaTexto.getText() + ", estas haciendo presionar");
            }

            @Override
            public void mouseReleased(MouseEvent arg0) {//Es presionar y soltar fuera o dentro
                //saludo.setText("Hola " + cajaTexto.getText() + ", estas haciendo presionar y soltar fuera o dentro");
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {//Se ejecuta con simplemente con entrar al boton
                //saludo.setText("Hola " + cajaTexto.getText() + ", estas haciendo solo entrando con el cursor");
            }

            @Override
            public void mouseExited(MouseEvent arg0) {//Se ejecuta con entar y salir del boton
                //saludo.setText("Hola " + cajaTexto.getText() + ", estas haciendo solo entrando y salir con el cursor");
            }

            private void marcarReina(int x, int y) {
                cuadro[x][y].setBackground(Color.BLACK);

                solucion[x] = y;
                System.out.println("x: " + x + " y: " + y);
                i = x;
                j = y;
            }

        };
        //agregamos el evento
        cuadro[x][y].addMouseListener(oyenteRaton);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPTablero = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPTableroLayout = new javax.swing.GroupLayout(jPTablero);
        jPTablero.setLayout(jPTableroLayout);
        jPTableroLayout.setHorizontalGroup(
            jPTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPTableroLayout.setVerticalGroup(
            jPTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPTablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPTablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(OchoReinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OchoReinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OchoReinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OchoReinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OchoReinas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPTablero;
    // End of variables declaration//GEN-END:variables

    private void ClickTerminar() {
        MouseListener oyenteRaton;
        oyenteRaton = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {//Presionar y soltar dentro del boton si sueltas a fuera no ocurre el evento
                CompararResultado();
            }

            @Override
            public void mousePressed(MouseEvent arg0) {//Solo presionas el boton y se ejecuta el metodo
                //saludo.setText("Hola " + cajaTexto.getText() + ", estas haciendo presionar");
            }

            @Override
            public void mouseReleased(MouseEvent arg0) {//Es presionar y soltar fuera o dentro
                //saludo.setText("Hola " + cajaTexto.getText() + ", estas haciendo presionar y soltar fuera o dentro");
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {//Se ejecuta con simplemente con entrar al boton
                //saludo.setText("Hola " + cajaTexto.getText() + ", estas haciendo solo entrando con el cursor");
            }

            @Override
            public void mouseExited(MouseEvent arg0) {//Se ejecuta con entar y salir del boton
                //saludo.setText("Hola " + cajaTexto.getText() + ", estas haciendo solo entrando y salir con el cursor");
            }

            private void CompararResultado() {

                for (int m = 0; m < 8; m++) {

                    if (solucion[m] == 0) {
                        if (m == 7) {
                            JOptionPane.showMessageDialog(null, "No has colocado ninguna Reina");
                        }
                    } else {

                        reinas.CompararSolucionUsuario(solucion);
                        break;
                    }
                }
            }
        };

        Terminar.addMouseListener(oyenteRaton);
    }

    private void ClickSolucionar() {
        MouseListener oyenteRaton;
        oyenteRaton = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {//Presionar y soltar dentro del boton si sueltas a fuera no ocurre el evento
                Solucionar();
            }

            @Override
            public void mousePressed(MouseEvent arg0) {//Solo presionas el boton y se ejecuta el metodo
                //saludo.setText("Hola " + cajaTexto.getText() + ", estas haciendo presionar");
            }

            @Override
            public void mouseReleased(MouseEvent arg0) {//Es presionar y soltar fuera o dentro
                //saludo.setText("Hola " + cajaTexto.getText() + ", estas haciendo presionar y soltar fuera o dentro");
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {//Se ejecuta con simplemente con entrar al boton
            }

            @Override
            public void mouseExited(MouseEvent arg0) {
            }

            private void Solucionar() {

                int posicion = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un solucion a mostrar entre 1-92"));
                BorrarReinas();

                if (posicion > 0 && posicion < 93) {
                    ArrayList sol = reinas.getSoluciones();

                    int[] aux = (int[]) sol.get(posicion - 1);

                    for (int y = 0; y < aux.length; y++) {

                        cuadro[y][aux[y]].setBackground(Color.BLACK);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Digite una opcion correcta");
                }
            }
        };

        Solucionar.addMouseListener(oyenteRaton);
    }

    private void BorrarReinas() {
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                cuadro[x][y].setBackground(Color.lightGray);
            }

            solucion[x] = 0;
        }
    }

    private void ClickReiniciar() {
        MouseListener oyenteRaton;
        oyenteRaton = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {//Presionar y soltar dentro del boton si sueltas a fuera no ocurre el evento
                ReiniciarCuadro();
            }

            @Override
            public void mousePressed(MouseEvent arg0) {//Solo presionas el boton y se ejecuta el metodo
                //saludo.setText("Hola " + cajaTexto.getText() + ", estas haciendo presionar");
            }

            @Override
            public void mouseReleased(MouseEvent arg0) {//Es presionar y soltar fuera o dentro
                //saludo.setText("Hola " + cajaTexto.getText() + ", estas haciendo presionar y soltar fuera o dentro");
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {//Se ejecuta con simplemente con entrar al boton
                //saludo.setText("Hola " + cajaTexto.getText() + ", estas haciendo solo entrando con el cursor");
            }

            @Override
            public void mouseExited(MouseEvent arg0) {//Se ejecuta con entar y salir del boton
                //saludo.setText("Hola " + cajaTexto.getText() + ", estas haciendo solo entrando y salir con el cursor");
            }

            private void ReiniciarCuadro() {

                for (int x = 0; x < 8; x++) {
                    for (int y = 0; y < 8; y++) {
                        cuadro[x][y].setBackground(Color.lightGray);
                    }

                    solucion[x] = 0;
                }
            }
        };

        Reiniciar.addMouseListener(oyenteRaton);

    }
}
