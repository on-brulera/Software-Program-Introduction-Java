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
public class MatrizTabla {

    private int[][] tabla;

    public MatrizTabla(int fila, int columna) {
        if (fila <= 0 || columna <= 0) {
            fila = 10;
            columna = 10;
        }
        this.tabla = new int[fila][columna];
    }

    public MatrizTabla(int tamaño) {
        this(tamaño, tamaño);
    }

    public void LlenarTabla() {
        for (int i = 0; i < tabla.length; i++) {
            tabla[i][0] = i;
        }
        for (int i = 0; i < tabla[0].length; i++) {
            tabla[0][i] = i;
        }
        
    }

}
