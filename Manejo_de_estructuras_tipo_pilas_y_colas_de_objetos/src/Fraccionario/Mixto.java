/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fraccionario;

/**
 *
 * @author Kevin
 */
public class Mixto extends Fraccionario {

    private double entero;

    public Mixto(double entero, double numerador, double denominador) {
        super(numerador, denominador);
        this.entero = entero;

    }

    public Mixto(Fraccionario fraccion) {
        super(fraccion.getNumerador(), fraccion.getDenominador());
        this.entero = 0;
    }

    public Mixto(Fraccionario fraccion, double entero) {
        super(fraccion.getNumerador(), fraccion.getDenominador());
        this.entero = entero;
    }

    public void setEntero(double entero) {

        this.entero = entero;
    }

    public double getEntero() {
        return this.entero;
    }

    public Fraccionario Fraccion_Impropia() {
        double numerador;
        numerador = super.getDenominador() * this.entero + super.getNumerador();
        return new Fraccionario(numerador, super.getDenominador());
    }

    public String toString() {
        return this.entero + " " + super.getNumerador() + "/" + super.getDenominador();
    }
}
