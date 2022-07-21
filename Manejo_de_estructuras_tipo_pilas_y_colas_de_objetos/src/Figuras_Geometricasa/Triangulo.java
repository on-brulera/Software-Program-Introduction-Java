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
public class Triangulo extends Figura_geometrica  {
   Punto punto1;
   Punto punto2; 
   Punto punto3;    
    
     public Triangulo(double x1,double y1,double x2,double y2,double x3,double y3){      
    punto1=new Punto();
    punto2=new Punto(); 
    punto3=new Punto();
       
       punto1.setX(x1);
       punto1.setY(y1);
       punto2.setX(x2);
       punto2.setY(y2);
       punto3.setX(x3);
       punto3.setY(y3);
   } 
   
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
     public double getX3(){
        return punto3.getX(); 
    }
    public double getY3(){
        return punto3.getY(); 
    }
     
   
        
  
   
     
   
   /**
    * Permite calcular el perimetro
    * @return Perimetro
    */
     
    private double lado1(){
        return Math.sqrt((punto2.getX()-punto1.getX())*(punto2.getX()-punto1.getX())+(punto2.getY()-punto1.getY())*(punto2.getY()-punto1.getY()));
    }
    private double lado2(){
        return Math.sqrt((punto2.getX()-punto3.getX())*(punto2.getX()-punto3.getX())+(punto2.getY()-punto3.getY())*(punto2.getY()-punto3.getY()));
    } 
    private double lado3(){
        return Math.sqrt((punto1.getX()-punto3.getX())*(punto1.getX()-punto3.getX())+(punto1.getY()-punto3.getY())*(punto1.getY()-punto3.getY()));
    } 
   
   @Override 
   public double Perimetro(){

       return lado1()+lado2()+lado3();
   }
   @Override
   /**
    * Permite calcular el area
    * @return Area
    */
   public double Area(){
       return Math.sqrt(Perimetro()*(Perimetro()-lado1())*(Perimetro()-lado2())*(Perimetro()-lado3()));
   }
   /**
    * 
    * @param dx Cuanto se va a mover en el eje x
    * @param dy Cuanto se va a mover en el eje y
    */
   public void Mover(double dx,double dy){
         punto1.setX(punto1.getX()+dx);
        punto1.setY(punto1.getY()+dy);
        punto2.setX(punto2.getX()+dx);
        punto2.setY(punto2.getY()+dy);
         punto3.setX(punto3.getX()+dx);
        punto3.setY(punto3.getY()+dy);
   }
   
   public String toString(){
    return "Triangulo.- "+"("+getX1()+","+getY1()+")"+"("+getX2()+","+getY2()+")"+"("+getX3()+","+getY3()+")";
    }
}
