/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coordenadas_polares_y_rectangulares;

import java.io.Serializable;



/**
 *
 * @author Kevin
 */
public class Coordenadas_polares implements Serializable  {
    private double distancia;
    private double angulo;
    
    
    
    
    public Coordenadas_polares(){
    this.angulo=45;
    this.distancia=5;
    }
    
    public Coordenadas_polares(double distancia,double angulo){
    this.angulo=angulo;
    this.distancia=distancia;
    }
    
    
    public double getDistancia(){
    return distancia;
    }
    
    public double getAngulo(){
    return angulo;
    }
    
    public void setDistancia(double distancia){
    this.distancia=distancia;
    }
    public void setAngulo(double angulo){
    this.angulo=angulo;
    }
    
    
    public double Seno_angulo(){
    return Math.sin(angulo);
    }
    
    public double Coseno_angulo(){
    return Math.cos(angulo);
    }
    
    public double Radianes(){
    return (this.angulo*Math.PI)/180;
    }
    
   
    
    public Coordenadas_rectangulares Pasar_Coordenadas_rectangulares(){
    return new Coordenadas_rectangulares(distancia*Math.cos(Radianes())
            ,distancia*Math.sin(Radianes()));
    }
    
    public String toString(){
     return "r: "+distancia+" θ: "+angulo;
    }
    
}
