/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prueba_matriz;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Matriz {

    public static void main(String[] args) {

        //LITERAL A
        System.out.println("MATRIZ 3 X 3");
        int[][] matriz = new int[3][3];
        llenarMatriz(matriz);
        imprimir(matriz);
    }

    public static void llenarMatriz(int[][] matriz) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[0].length; columna++) {
                System.out.println("Escriba el número para la matriz en la posición (" + fila + "," + columna + ")");
                numero = 0;
                while (numero <= 0 || numero > 5) {
                    System.out.println("El número debe estar entre en el rango 1-5");
                    numero = entrada.nextInt();
                }
                matriz[fila][columna] = numero;
            }
        }
    }

    public static void imprimir(int[][] matriz) {
        String datos = "";
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[0].length; columna++) {
                datos += matriz[fila][columna] + "\t";
            }
            datos += "\n";
        }
        System.out.println(datos);
    }
}
