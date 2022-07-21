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
public class Rectangulo extends Figura_geometrica{
    Punto punto=new Punto();          
    public double getX(){
        return punto.getX(); 
    }
    public double getY(){
        return punto.getY(); 
    }
    private double base;
    private double altura;
    
    public Rectangulo(double base,double altura){
        if(base>0)
            this.base=base;
        else
            this.base=1;
        if(altura>0)
            this.altura=altura;
        else
            this.altura=1;
    }
    public Rectangulo(double base,double altura,double x,double y){
        if(base>0)
            this.base=base;
        else
            this.base=1;
        if(altura>0)
            this.altura=altura;
        else
            this.altura=1;
   punto.setX(x);
    punto.setY(y);
    }
   
    
    /**
     * Modifica la base del rectangulo
     * @param base base del rectangulo
     */
    public void setBase(double base){
        
        if (base>0)  this.base=base;
        else         this.base=1;
    }    
    
    /**
     * Muestra la base del rectangulo
     * @return 
     */
    public double getBase(){
        return this.base;
    }
    
    /**
     * Modifica la altura del rectangulo
     * @param altura altura del rectangulo
     */
    public void setAltura(double altura){
        
        if (altura>0)  this.altura=altura;
        else         this.altura=1;
    }    
    
    /**
     * Muestra la altura del rectangulo
     * @return 
     */
    public double getAltura(){
        return this.altura;
    }
   
    
    @Override
    /**
     * Permite calcular el area del rectangulo
     * @return Area del rectangulo
     */
    public double Area(){
        return this.base*this.altura;
    }
    @Override
    /**
     * Permite calcular el perimetro del rectangulo
     * @return Perimetro del rectangulo
     */
    public double Perimetro(){
        return 2*(this.base+this.altura);       
    }
    
    
     public String toString(){
    return "Rectangulo.- Base:"+this.base+" Altura:"+this.altura+" ,("+getX()+","+getY()+")";
    }
    
    public void  Mover(double dx,double dy){
        punto.setX(punto.getX()+dx);
        punto.setY(punto.getY()+dy);
    } 
}
