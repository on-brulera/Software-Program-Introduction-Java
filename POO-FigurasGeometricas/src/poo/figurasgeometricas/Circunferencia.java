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
public class Circunferencia {

    private Punto centro;
    private double radio;

    public Circunferencia(double radio) {
        if (radio > 0) {
            this.radio = radio;
        } else {
            this.radio = 1;
        }
        this.centro = new Punto(0, 0);
    }

    public Circunferencia(double radio, int x, int y) {
        if (radio > 0) {
            this.radio = radio;
        } else {
            this.radio = 1;
        }
        this.centro = new Punto(x, y);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if (radio > 0) {
            this.radio = radio;
        } else {
            this.radio = 5;
        }
    }

    public void setX(int x) {
        this.centro.setX(x);
    }

    public int getX() {
        return this.centro.getX();
    }

    public void setY(int y) {
        this.centro.setY(y);
    }

    public int getY() {
        return this.centro.getY();
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public void Mover(int x, int y) {
        centro.Mover(x, y);
    }

    public String Imprimir() {
        return "Centro: " + centro.Coordenada() + "Radio: " + this.radio;
    }

}
