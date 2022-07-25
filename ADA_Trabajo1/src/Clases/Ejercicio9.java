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
public class Ejercicio9 {

    private int[][] matriz;

    public Ejercicio9(int fila, int col) {
        if (fila <= 0 || col <= 0) {
            fila = 4;
            col = 4;
        }
        this.matriz = new int[fila][col];
    }

    public Ejercicio9() {
        this(4, 5);
    }
    
    public int[][] getMatriz(){
        return this.matriz;
    }

    public void IngresarNumerosAleatorios(int numPositivos) {
        int numTotales = this.matriz.length * this.matriz[0].length;
        int numNegativos = numTotales - numPositivos;
        int fila = 0, col = 0;
        if (numPositivos >= numTotales) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    this.matriz[i][j] = (int) (Math.random() * 100 + 1);
                }
            }
        } else {
            for (int i = 0; i < numPositivos; i++) {
                this.matriz[fila][col] = (int) (Math.random() * 100 + 1);
                fila++;
                if (fila == this.matriz.length) {
                    fila = 0;
                    col++;
                }
                if (col == this.matriz[0].length) {
                    col = 0;
                }
            }
            for (int i = 0; i < numNegativos; i++) {
                this.matriz[fila][col] = (int) (Math.random() * (-100) + 1);
                fila++;
                if (fila == this.matriz.length) {
                    fila = 0;
                    col++;
                }
                if (col == this.matriz[0].length) {
                    col = 0;
                }
            }
        }
    }

    public void OrdenarInsercionFila(int numFila) {
        numFila -= 1;
        int aux, cont;
        for (int i = 1; i < this.matriz[0].length; i++) {
            aux = this.matriz[numFila][i];
            cont = i - 1;
            while ((cont >= 0) && (aux < this.matriz[numFila][cont])) {
                this.matriz[numFila][cont + 1] = this.matriz[numFila][cont];
                cont -= 1;
            }
            this.matriz[numFila][cont + 1] = aux;
        }
    }
    
}
