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
public class Coordenadas_rectangulares implements Serializable{
    private double x;
    private double y;
    
    
        
    public double getX(){
    return this.x;
    }
    
    public double getY(){
    return this.y;
    }
    
    public void setX(double x){
    this.x=x;
    }
    public void setY(double y){
    this.y=y;
    }
    
    public Coordenadas_rectangulares(double x,double y){
    this.x=x;
    this.y=y;
    }
    
   
    public String toString(){
    return "x: "+(String.format("%.1f", this.x))+" y: "+(String.format("%.1f", this.y));
    }
}
