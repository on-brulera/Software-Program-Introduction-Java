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
public class Elipse extends Figura_geometrica  {
    Punto punto=new Punto();

    private double ejemayor;
    private double ejemenor; 
    
    
    public Elipse(double ejemayor,double ejemenor){
        if(ejemayor>0)
            this.ejemayor=ejemayor;
        else
            this.ejemayor=5;
        if(ejemenor>0)
            this.ejemenor=ejemenor;
        else
            this.ejemenor=1;
       punto.setX(0);
       punto.setY(0);
    }
    public Elipse(double ejemayor,double ejemenor,double x,double y){
        if(ejemayor>0)
            this.ejemayor=ejemayor;
        if(ejemenor>0)
            this.ejemenor=ejemenor;
       punto.setX(x);
       punto.setY(y);
    }
    
    
        
    public double getX(){
        return punto.getX(); 
    }
    public double getY(){
        return punto.getY(); 
    }
    
    
    /**
     * Modifica el eje mayor
     * @param ejemayor 
     */
    public void setEjemayor(double ejemayor){
         if(ejemayor>0)
            this.ejemayor=ejemayor;
        else
            this.ejemayor=5;
    }
    /**
     * Mostrar el eje mayor 
     * @return eje mayor
     */
    public double getEjemayor(){
        return this.ejemayor;
    }
    /**
     * Modifica el eje menor
     * @param ejemenor 
     */
    public void setEjemenor(double ejemenor){
          if(ejemenor>0)
            this.ejemenor=ejemenor;
        else
            this.ejemenor=1;
    }
    /**
     * Mostrar el eje menor 
     * @return eje menor
     */
    public double getEjemenor(){
        return this.ejemenor;
    }
     
    
    @Override
    /**
     * Permite calcular el area de la elipse
     * @return Area de la elipse
     */
    public double Area(){
       return Math.PI*(ejemayor/2)*(ejemenor/2);
    }
    @Override
    /**
     * Permite calcular el perimetro de la elipse
     * @return Perimetro de la elipse
     */
    public double Perimetro(){
        double semiejemayor=ejemayor/2 ;
        double semiejemenor=ejemenor/2 ;
        return Math.PI*(3*(semiejemayor+semiejemenor)-Math.sqrt((3*semiejemayor+semiejemenor)*(semiejemayor+3*semiejemenor)));      
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
    return "Elipse.- Eje mayor:"+this.ejemayor+" Eje menor:"+this.ejemenor+" ,("+getX()+","+getY()+")";
    }
}
