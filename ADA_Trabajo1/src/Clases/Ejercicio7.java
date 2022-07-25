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
public class Ejercicio7 {

    private int[][] matrizA;
    private int[][] matrizB;
    private int[][] matrizC;

    public Ejercicio7(int tam) {
        if (tam <= 0) {
            tam = 10;
        }
        this.matrizA = new int[tam][tam];
        this.matrizB = new int[tam][tam];
        this.matrizC = new int[tam][tam];
    }

    public int[][] getMatrizA() {
        return this.matrizA;
    }

    public int[][] getMatrizB() {
        return this.matrizB;
    }

    public int[][] getMatrizC() {
        return this.matrizC;
    }

    public void multiplicacion() {
        int[][] A = this.matrizA;
        int[][] B = this.matrizB;                
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    // aquí se multiplica la matriz
                    this.matrizC[i][j] += A[i][k] * B[k][j];
                }
            }
        }        

    }
}
