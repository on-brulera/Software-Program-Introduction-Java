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
public class Ejercicio1 {

    int[] datos;

    public Ejercicio1(int tamaño) {
        if (tamaño <= 0) {
            tamaño = 10;
        }
        this.datos = new int[tamaño];
    }

    public int[] getDatos() {
        return this.datos;
    }        

    private boolean Esprimo(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int Contarprimos() {
        int cont = 0;
        for (int i = 0; i < datos.length; i++) {
            if (Esprimo(datos[i])) {
                cont += 1;
            }
        }
        return cont;
    }
}
