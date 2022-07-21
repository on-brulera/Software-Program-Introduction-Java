/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras_Geometricasa ;

import java.io.Serializable;

/**
 *
 * @author Kevin
 */
public class Recta   implements Serializable{
    Punto punto1=new Punto();
    Punto punto2=new Punto();
    
    public double getX1(){
        return punto1.getX(); 
    }
    public double getY1(){
        return punto1.getY(); 
    }
    public double getX2(){
        return punto2.getX(); 
    }
    public double getY2(){
        return punto2.getY(); 
    }
    
    public Recta(double x1,double y1,double x2,double y2){
        punto1.setX(x1);
       punto1.setY(y1);
       punto2.setX(x2);
       punto2.setY(y2);
    }
    
    

  
    /**
     * Permite calcular la longitud de la recta
     * @return Longitud de la recta
     */
    public double Perimetro(){
    return Math.sqrt((punto2.getX()-punto1.getX())*(punto2.getX()-punto1.getX())
            +(punto2.getY()-punto1.getY())*(punto2.getY()-punto1.getY()));}
    
    /**
    * 
    * @param dx Cuanto se va a mover en el eje x
    * @param dy Cuanto se va a mover en el eje y
    */
    public void Mover(double dx,double dy ){
        punto1.setX(punto1.getX()+dx);
        punto1.setY(punto1.getY()+dy);
        punto2.setX(punto2.getX()+dx);
        punto2.setY(punto2.getY()+dy);
    }
    
    public String toString(){
    return "Recta.- "+"("+getX1()+","+getY1()+")"+"("+getX2()+","+getY2()+")";
    }
}
