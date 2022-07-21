/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras_Geometricasa;

import java.io.Serializable;

/**
 *
 * @author Kevin
 */
public class Punto implements Serializable{
    private double x;
    private double y;

    
    /**
     * Coordenada en x
     * @param x La ubicación el x 
     */
    public void setX(double x){
        this.x=x;
    }
       
    /**
     * 
     * @return Retorna el valor en x 
     */
     public double getX(){
        return this.x;
    }
         
    /**
     * Coordenada en y1
     * @param y La ubicación el y 
     */ 
    public void setY(double y){
        this.y=y;
    }
        
    /**
     * 
     * @return Retorna el valor en y 
     */
     public double getY(){
        return this.y;
    } 
     
       
}
