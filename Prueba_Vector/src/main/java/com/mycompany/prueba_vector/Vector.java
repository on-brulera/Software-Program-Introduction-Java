/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prueba_vector;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Vector {

    public static void main(String[] args) {

        //LITERAL B
        System.out.println("VECTOR DE 10 POSICIONES");
        String[] vector = new String[10];
        llenarVector(vector);
    }

    public static void llenarVector(String[] vector) {
        Scanner entrada = new Scanner(System.in);
        String letra;
        String repeticiones = "";
        for (int indice = 0; indice < vector.length; indice++) {
            letra = "letra";
            while (letra.length() > 1) {
                System.out.println("Escribir solo una letra para el vector en la posicion " + indice);
                letra = entrada.next();
            }
            if (letra.contains("a")) {
                repeticiones += "Hola \n";
            }
            vector[indice] = letra;
        }
        System.out.println("\nIMPRESION VECTOR\n");
        imprimir(vector);
        System.out.println(repeticiones);
    }

    public static void imprimir(String[] vector) {
        String datos = "";
        for (int indice = 0; indice < vector.length; indice++) {
            datos += vector[indice] + "\t";
        }
        System.out.println(datos);
    }

}
