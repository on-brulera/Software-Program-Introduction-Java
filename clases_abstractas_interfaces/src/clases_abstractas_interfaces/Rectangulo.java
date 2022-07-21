/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_abstractas_interfaces;

/**
 *
 * @author Kevin
 */
public class Rectangulo extends Figura_Geometrica_punto {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura, double x, double y) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    public void Imprimir() {
        System.out.println("El area del rectangulo es: " + Area() + " El perimetro es " + Perimetro());
        System.out.println("El rectangulo esta en la posicion.- "+Posicion());
    }

    @Override
    public double Area() {
        return base * altura;
    }

    @Override
    public double Perimetro() {
        return (2 * base) + (2 * altura);
    }
}
