/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumerosComplejos;


import java.io.Serializable;

/**
 *
 * @author Kevin
 */
public class NumerosComplejos implements Serializable{
    
    
    
    private double real;
    private double imaginaria;

    public NumerosComplejos(double real, double imaginaria) {
        this.real = real;
        this.imaginaria = imaginaria;
    }
    public NumerosComplejos(double imaginaria) {
        this.real=1;
        this.imaginaria = imaginaria;
    }
    
     public void setReal(int real) {
        this.real = real;
    }

    public double getReal() {
        return this.real;
    }

    public void setImaginario(int imaginaria) {
        this.imaginaria = imaginaria;
    }

    public double getImaginario() {
        return this.imaginaria;
    }
    

    public NumerosComplejos Sumar(double real, double imaginaria) {
        return new NumerosComplejos((this.real + real), (this.imaginaria + imaginaria));
    }

    public NumerosComplejos Sumar(NumerosComplejos numerosComplejos) {
        return Sumar(numerosComplejos.getReal(), numerosComplejos.getImaginario());
    }
    
    
//------------------------------------------------------------------
    
    
    public NumerosComplejos Restar(double real, double imaginaria) {
        return new NumerosComplejos((this.real - real), (this.imaginaria - imaginaria));
    }

    public NumerosComplejos Restar(NumerosComplejos numerosComplejos) {
        return Restar(numerosComplejos.getReal(), numerosComplejos.getImaginario());
    }
    
    
//------------------------------------------------------------------
    
    
    public NumerosComplejos Multiplicar(double real, double imaginaria) {
        return new NumerosComplejos(((this.real * real) - (this.imaginaria * imaginaria)), (this.real * imaginaria) + (this.imaginaria * real));
    }

    public NumerosComplejos Multiplicar(NumerosComplejos numerosComplejos) {
        return Multiplicar(numerosComplejos.getReal(), numerosComplejos.getImaginario());
    }
    
    
//------------------------------------------------------------------
    
    
    public NumerosComplejos Dividir(double real, double imaginaria) {
        double entero, imaginario;
        entero = ((this.real * real) + (this.imaginaria * imaginaria)) / (real * real + imaginaria * imaginaria);
        imaginario = ( -(this.real * imaginaria) +(this.imaginaria * real)) / (real * real + imaginaria * imaginaria);

        return new NumerosComplejos(entero, imaginario);
    }

    public NumerosComplejos Dividir(NumerosComplejos numerosComplejos) {
        return Dividir(numerosComplejos.getReal(), numerosComplejos.getImaginario());
    }
    
    
//------------------------------------------------------------------
    
    
    public String toString() {
        return "(" + this.real + ", " + this.imaginaria + "i)";
    }
}
