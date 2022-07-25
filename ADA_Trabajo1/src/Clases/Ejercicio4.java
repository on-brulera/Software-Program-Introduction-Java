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
public class Ejercicio4 {

    private int[][] matriz;

    public Ejercicio4(int tamaño) {        
        if (tamaño <= 0) {
            tamaño = 4;
        }        
        this.matriz = new int[tamaño][tamaño];        
    }

    public Ejercicio4(){
        this(4);
    }
    
    public int[][] getMatriz(){
        return this.matriz;
    }
    
    public void LlenarMatriz() {
        int num = 1;
        int iter1 = ((matriz.length * matriz.length - matriz.length) / 2) + matriz.length;
        int iter2 = matriz.length * matriz.length;
        int i = matriz.length - 1;
        int j = 0;
        int pivote = 0;
        while (num <= iter1) {
            matriz[i][j] = num;
            i--;
            j++;
            if (j == matriz.length) {
                pivote += 1;
                i = matriz.length - 1;
                j = pivote;
            }
            num++;
        }
        i = matriz.length - 2;
        j = 0;
        pivote = matriz.length - 2;
        while (num <= iter2) {
            matriz[i][j] = num;
            i--;
            j++;
            if (i == -1) {
                pivote -= 1;
                i = pivote;
                j = 0;
            }
            num++;
        }
    }

    
}
