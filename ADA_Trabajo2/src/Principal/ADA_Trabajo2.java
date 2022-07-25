/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Clases.*;

/**
 *
 * @author Usuario
 */
public class ADA_Trabajo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Matriz m = new Matriz(4,4);                        
        int[][] matrizMultiplicacion = m.multiplicarMatrices();  
        
        System.out.println(m.imprimir(matrizMultiplicacion));
        
        
    }
    
}
