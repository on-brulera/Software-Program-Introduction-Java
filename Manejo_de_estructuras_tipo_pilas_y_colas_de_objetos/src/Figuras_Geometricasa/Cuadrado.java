/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras_Geometricasa;


/**
 *
 * @author Kevin
 */
public class Cuadrado extends Figura_geometrica  {
    
  
    Punto punto=new Punto();   
    private double lado;
       
    public double getX(){
        return punto.getX(); 
    }
    public double getY(){
        return punto.getY(); 
    }
    
    
    public Cuadrado(double lado){
    if(lado>0)
        this.lado=lado;
    else
        this.lado=1;
    
    punto.setX(0);
    punto.setY(0);
    }
    public Cuadrado(double lado,double x,double y){
    if(lado>0)
        this.lado=lado;
    else
        this.lado=1;
    punto.setX(x);
    punto.setY(y);
    
    }
    
    
    /**
     * Escribe el valor del lado del cuadrado
     * @param lado El valor del lado que se va a asignar al cuadrado 
     */
    public void setLado(double lado){
    if(lado>0)
        this.lado=lado;
    else
        this.lado=1;
    }
       
    /**
     * 
     * @return El lado del cuadrado
     */ 
    public double getLado(){
    return this.lado;
    }
    
    @Override
    /**
     * 
     * @return EL valor del area del cuadrado
     */
    public double Area(){
        return lado*lado;      
    }
    
    @Override
    /**
     * 
     * @return El valor del perimetro del cuadrado
     */
    public double Perimetro(){
        return 4*lado;      
    } 
     /**
     * Permite mover la circunferencia, sumando a sus valor iniciales
     * @param dx Cuanto se va a mover en el eje x
     * @param dy Cuanto se va a mover en el eje y
     */
    public void  Mover(double dx,double dy){
          
        punto.setX(punto.getX()+dx);
        punto.setY(punto.getY()+dy);
    }
    
    public String toString(){
    return "Cuadrado.- lado:"+this.lado+" ,("+getX()+","+getY()+")";
    }
    
   
   
      
}
