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
public class Rectangulo {

    private Punto puntoOrigen;
    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2) {
        puntoOrigen = new Punto(0, 0);
        setLado1(lado1);
        setLado2(lado2);
    }

    public Rectangulo(int x, int y, double lado1, double lado2) {
        puntoOrigen = new Punto(x, y);
        setLado1(lado1);
        setLado2(lado2);
    }

    public void setLado1(double lado) {
        if (lado > 0) {
            this.lado1 = lado;
        } else {
            this.lado1 = 2;
        }
        if (this.lado1 == this.lado2) {
            this.lado2 += 2;
        }
    }

    public double getLado1() {
        return this.lado1;
    }

    public void setLado2(double lado) {
        if (lado > 0) {
            this.lado2 = lado;
        } else {
            this.lado2 = 4;
        }
        if (this.lado1 == this.lado2) {
            this.lado2 += 2;
        }
    }

    public double getLado2() {
        return this.lado2;
    }
    
    public void setX(int x) {
        this.puntoOrigen.setX(x);
    }

    public int getX() {
        return this.puntoOrigen.getX();
    }

    public void setY(int y) {
        this.puntoOrigen.setY(y);
    }

    public int getY() {
        return this.puntoOrigen.getY();
    }

    public double CalcularArea() {
        return lado1 * lado2;
    }

    public double CalcularPerimetro() {
        return 2 * lado1 + 2 * lado2;
    }

    public void Mover(int dx, int dy) {
        puntoOrigen.setX(puntoOrigen.getX() + dx);
        puntoOrigen.setY(puntoOrigen.getY() + dy);
    }

    public String Imprimir() {
        return "Area: " + CalcularArea() + ", Perimetro: " + CalcularPerimetro() + ", Posición: " + puntoOrigen.Coordenada();
    }

}
