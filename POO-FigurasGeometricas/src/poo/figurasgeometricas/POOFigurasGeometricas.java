/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.figurasgeometricas;

/**
 *
 * @author Usuario
 */
public class POOFigurasGeometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("-----------------RECTÁNGULO-------------------");
        
        Rectangulo rectangulo1 = new Rectangulo(4,3,5,6);
        System.out.println(rectangulo1.Imprimir());
        rectangulo1.Mover(0, 1);
        System.out.println(rectangulo1.Imprimir());
        
        System.out.println("-----------------CUADRADO-------------------");
        
        Cuadrado cuadrado1 = new Cuadrado(2,2,4);
        System.out.println(cuadrado1.Imprimir());
        cuadrado1.Mover(3, 3);
        System.out.println(cuadrado1.Imprimir());
        
        System.out.println("------------------CIRCUNFERENCIA------------------");
        
        Circunferencia circunferencia1 = new Circunferencia(1,0,3);
        System.out.println(circunferencia1.Imprimir());
        circunferencia1.Mover(10,10);
        System.out.println(circunferencia1.Imprimir());
        
        System.out.println("-----------------ELIPSE-------------------");
        
        Elipse elipse1 = new Elipse(4,4,8,4);
        System.out.println(elipse1.Imprimir());
        elipse1.Mover(10, 10);
        System.out.println(elipse1.Imprimir());
        
        System.out.println("-----------------RECTA-------------------");
        
        Recta recta1 = new Recta(1,1,2,2);
        System.out.println(recta1.Imprimir());
        recta1.Mover(10, 10);
        System.out.println(recta1.Imprimir());
        
        System.out.println("------------------TRIÁNGULO------------------");
        
        Triangulo triangulo1 = new Triangulo(1,-4,3,2,-2,0);
        System.out.println(triangulo1.Imprimir());
        triangulo1.Mover(10, 10);
        System.out.println(triangulo1.Imprimir());
    }
    
}
