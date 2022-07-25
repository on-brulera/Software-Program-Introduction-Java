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
public class Ejercicio3 {

    private int[] arreglo;

    public Ejercicio3(int tamaño) {
        if (tamaño <= 0) {
            tamaño = 10;
        }
        this.arreglo = new int[tamaño];
    }

    public Ejercicio3() {
        this(10);
    }

    public int[] getArreglo() {
        return this.arreglo;
    }

    public int busquedaBinaria(int numBinario) {
        int inicio = 0, ultimo = arreglo.length - 1;

        while (inicio <= ultimo) {
            int mitad = inicio + (ultimo - inicio) / 2;

            if (arreglo[mitad] == numBinario) {
                return mitad;
            }

            if (arreglo[mitad] < numBinario) {
                inicio = mitad + 1;
            } else {
                ultimo = mitad - 1;
            }
        }
        return -1;
    }

    public int[] burbuja() {
        int auxiliar;
        int[] arregloOrdenado;
        for (int i = 2; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                }
            }
        }
        arregloOrdenado = arreglo;
        return arregloOrdenado;
    }

}
