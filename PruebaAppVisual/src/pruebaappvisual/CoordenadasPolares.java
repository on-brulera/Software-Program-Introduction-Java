/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaappvisual;
/**
 *
 * @author Ramírez Henry
 */
public class CoordenadasPolares {

    private static CoordenadadasRectangulares  Cr = new CoordenadadasRectangulares(1,1);
    
    private double radio;
    private double angulo;
    
    public CoordenadasPolares(double radio, double angulo) {
        this.setAngulo(angulo);
        this.setRadio(radio);
    }
    
    public CoordenadasPolares(double radio) {
        this.setAngulo(0);
        this.setRadio(radio);
    }
    
    public void setRadio(double radio) {
        if (radio > 0) {
            this.radio = radio;
        } else {
            this.radio = 5;
        }
    }
    
    public double getRadio() {
        return this.radio;
    }
    
    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }
    
    public double getAngulo() {
        return this.angulo;
    }
    
    public double Factorial(double numero) {
        double factorial = 1;
        for (int x = 1; x <= numero; x++) {
            factorial *= 1;
        }
        return factorial;
    }
    
    public double Exponente(double base, double exponente) {
        double resultado = base;
        for (int x = 2; x <= exponente; x++) {
            resultado = resultado * base;
        }
        return resultado;
    }
    
    public double CalcularSeno(double angulo) {
        
        double resultadoSeno = (angulo / 1) - (this.Exponente(angulo, 3) / this.Factorial(3)) + (this.Exponente(angulo, 5) / this.Factorial(5)) - (this.Exponente(angulo, 7) / this.Factorial(7));        
        return resultadoSeno;
    }
    
    public double CalcularCoseno(double angulo) {
        
        double resultadoSeno = (1 / 1) - (this.Exponente(angulo, 2) / this.Factorial(2)) + (this.Exponente(angulo, 4) / this.Factorial(4)) - (this.Exponente(angulo, 6) / this.Factorial(6));        
        return resultadoSeno;
    }
    
    public CoordenadadasRectangulares CalcularCoordenadasPolares(double radio, double angulo) {
        double x = this.CalcularCoseno(angulo) * radio;
        double y = this.CalcularSeno(angulo) * radio;
        Cr.setX(x);
        Cr.setY(y);
        return  Cr;      
    }
    
    
    
    public String Imprimir () {
        return "radio: " + this.radio + 
                "n angulo: " + this.angulo;
    }
}
