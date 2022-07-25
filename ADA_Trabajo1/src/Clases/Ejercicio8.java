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
public class Ejercicio8 {

    private int[][] matriz;

    public Ejercicio8(int tamaño) {        
        if (tamaño <= 0) {
            tamaño = 4;
        }        
        this.matriz = new int[tamaño][tamaño];        
    }

    public Ejercicio8(){
        this(4);
    }
    
    public int[][] getMatriz(){
        return this.matriz;
    }
            
    public String buscar(int n) {
        String resp = "Dato no encontrado";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (n == matriz[i][j]) {
                    resp = "(" + i + "," + j + ")";
                    break;
                }
            }

        }
        return resp;
    }
}
