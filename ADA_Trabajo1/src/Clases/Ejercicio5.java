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
public class Ejercicio5 {

    private int[][] matriz;

    public Ejercicio5(int tam) {
        if (tam <= 0) {
            tam = 5;
        }
        this.matriz = new int[tam][tam];
    }

    public Ejercicio5() {
        this(5);
    }

    public int[][] getMatriz(){
        return this.matriz;
    }
    
    public void LlenarMatriz() {
        int a = 0;
        int b = matriz.length - 1;
        int valor = 1;

        for (int j = 0; j < matriz.length; j++) {

            //abajo
            for (int i = b; i >= a; i--) {
                matriz[b][i] = valor++;
            }
            //izquierda
            for (int i = b - 1; i >= a + 1; i--) {
                matriz[i][a] = valor++;
            }

            //arriba
            for (int i = a; i <= b; i++) {
                matriz[a][i] = valor++;
            }
            //derecha
            for (int i = a + 1; i < b; i++) {
                matriz[i][b] = valor++;
            }
            a++;
            b--;
        }        
    }    
}
