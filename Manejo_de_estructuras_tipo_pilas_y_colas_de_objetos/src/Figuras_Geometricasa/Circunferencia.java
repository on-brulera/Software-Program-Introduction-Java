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
public class Circunferencia extends Figura_geometrica    {
    
    Punto punto=new Punto(); 

    private double radio;
    
    
    public double getX(){
        return punto.getX(); 
    }
    public double getY(){
        return punto.getY(); 
    }
    
    
    

    public Circunferencia(double radio){
       if(radio>0)            
            this.radio= radio;
        else
            this.radio=1;
       punto.setX(0);
       punto.setY(0);
    }
    
  
    
    public Circunferencia(double radio,double x,double y){
        if(radio>0)            
            this.radio= radio;
        else
            this.radio=1;
        
       punto.setX(x);
       punto.setY(y);     
    }
    
   
    /**
     * Cambiar el radio de la circunferencia
     * @param radio El radio de la circunferencia 
     */
    public void setRadio(double radio){
        if(radio>0) this.radio=radio;
    }
    
    
    /**
     * 
     * @return Retorna el valor del radio de la circunferencia
     */
    public double getRadio(){
        return this.radio;
    }
    
    

    @Override
    /**
     * Permite calcular el area de la circunferencia
     * @return Area de la circunferencia
     */ 
    public double Area(){
    return Math.PI*this.radio*this.radio;
    }
    
    @Override
    /**
     * Permite calcular el perimetro de la circunferencia
     * @return Perimetro de la circunferencia
     */
    public double Perimetro(){
    return 2*Math.PI*this.radio;
    }
   
    
    /**
     * Permite mover la circunferencia, sumando a sus valor iniciales
     * @param dx Cuanto se va a mover en el eje x
     * @param dy Cuanto se va a mover en el eje y
     */      
    public void Mover(double dx,double dy ){
        punto.setX(punto.getX()+dx);
        punto.setY(punto.getY()+dy);
    } 
    
    public String toString(){
    return "Circunferencia.- Radio:"+this.radio+" ,("+getX()+","+getY()+")";
    }
    
}
