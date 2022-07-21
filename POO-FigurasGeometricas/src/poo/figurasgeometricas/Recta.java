/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.figurasgeometricas;

/**
 *
 * @author Henry
 */
public class Recta {

    private Punto puntoInicio;
    private Punto puntoFinal;

    public Recta(int x, int y) {
        puntoInicio = new Punto(0, 0);
        puntoFinal = new Punto(x, y);
    }

    public Recta(int inicioX, int inicioY, int finalX, int finalY) {
        puntoInicio = new Punto(inicioX, inicioY);
        puntoFinal = new Punto(finalX, finalY);
    }

    public void setPuntoInicio(int x, int y) {
        this.puntoInicio.setX(x);
        this.puntoInicio.setY(y);
    }

    public void setPuntoFinal(int x, int y) {
        this.puntoFinal.setX(x);
        this.puntoFinal.setY(y);
    }

    public double Longitud() {
        double valorX = Math.pow((puntoFinal.getX() - puntoInicio.getX()), 2);
        double valorY = Math.pow((puntoFinal.getY() - puntoInicio.getY()), 2);
        return Math.sqrt(valorX + valorY);
    }

    public void Mover(int dx, int dy) {
        this.puntoFinal.Mover(dx, dy);
        this.puntoInicio.Mover(dx, dy);
    }

    public String Imprimir(){
        return "Longitud: " + Longitud() + "Coordenada: " + this.puntoInicio.Coordenada();
    }
}
