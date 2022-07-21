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
public class Cuadrado {

    private Punto puntoOrigen;
    private double lado;

    public Cuadrado(double lado) {
        puntoOrigen = new Punto(0, 0);
        setLado(lado);
    }

    public Cuadrado(double lado, int x, int y) {
        puntoOrigen = new Punto(x, y);
        setLado(lado);
    }

    public void setLado(double lado) {
        if (lado > 0) {
            this.lado = lado;
        } else {
            this.lado = 1;
        }
    }

    public double getLado() {
        return this.lado;
    }

    public void setX(int x) {
        this.puntoOrigen.setX(x);
    }
    
    public int getX(){
        return this.puntoOrigen.getX();
    }
    
    public void setY(int y) {
        this.puntoOrigen.setY(y);
    }

    public int getY(){
        return this.puntoOrigen.getY();
    }
    
    public double CalcularArea() {
        return lado * lado;
    }

    public double CalcularPerimetro() {
        return lado * 4;
    }

    public void Mover(int dx, int dy) {
        this.puntoOrigen.Mover(dx, dy);
    }

    /**
     *
     * @return un String con el área, perimetro y la posición
     */
    public String Imprimir() {
        return "Area: " + CalcularArea() + ", Perimetro: " + CalcularPerimetro() + ", Posición: " + puntoOrigen.Coordenada();
    }
}
