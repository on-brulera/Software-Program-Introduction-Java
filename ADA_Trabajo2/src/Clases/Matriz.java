/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Usuario
 */
public class Matriz {

    private int[][] matrizA;
    private int[][] matrizB;

    public Matriz(int fila, int columna) {
        if (fila <= 0 || columna <= 0) {
            fila = 6;
            columna = 4;
        }
        this.matrizA = new int[fila][columna];
        this.matrizB = new int[fila][columna];
    }

    public Matriz(int tamano) {
        this(tamano, tamano);
    }

    private boolean esPosibleMultiplicar() {
        return this.matrizA[0].length == matrizB.length;
    }

    public int[][] multiplicarMatrices() {
       int[][] matrizC = new int[matrizA.length][matrizB[0].length];              
       int resultado;
              
       //iteración para la matriz respuesta
        for (int i = 0; i < matrizB[0].length; i++) {
            for (int j = 0; j <matrizA.length; j++) {
                resultado = 0;
                //iteracion para calcular respuesta                
                for (int k = 0; k < matrizA[0].length; k++) {
                    resultado += matrizA[j][k] * matrizB[k][i];
                }                
                matrizC[j][i] = resultado;
            }            
        }                
        
        return matrizC;
    }
    
    

    public String imprimir(int[][] matriz){
        String datos = "";
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                datos += matriz[i][j] + " ";
            }
            datos +=  "\n";
        }
        return datos;
    }
    
}
