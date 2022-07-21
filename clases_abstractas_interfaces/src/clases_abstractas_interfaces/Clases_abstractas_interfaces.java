/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_abstractas_interfaces;

/**
 *
 * @author Kevin
 */
public class Clases_abstractas_interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuadrado cuadrado=new Cuadrado(2);
        Rectangulo rectangulo=new Rectangulo(3, 4,1,2);
        
        cuadrado.Imprimir();
        rectangulo.Imprimir();
    }
    
}
