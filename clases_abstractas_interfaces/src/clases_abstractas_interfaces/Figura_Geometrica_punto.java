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
public abstract class Figura_Geometrica_punto {
    protected double x;
    protected double y;
    
    public Figura_Geometrica_punto(double x,double y){
    this.x=x;
    this.y=y;
    }
    
    public abstract double Area();
    public abstract double Perimetro();
    
    public void Mover_Figura(double x,double y){
    this.x+=x;
    this.y+=y;
    }
    public String Posicion(){
    return "x: "+this.x+" y: "+this.y;
    } 
}
