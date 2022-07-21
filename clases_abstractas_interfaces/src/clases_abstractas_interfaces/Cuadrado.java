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
public class Cuadrado implements Figura_Geometrica{
   
    private double lado;
    
    public Cuadrado(double lado){
    this.lado=lado;
    }

    public void Imprimir(){
        System.out.println("El area del cuadrado es: "+Area()+" El perimetro es "+Perimetro());
    }
    
    
    @Override
    public double Area() {
    return lado*lado;
    }

    @Override
    public double Perimetro() {
    return 4*lado;
    }
    
    
}
