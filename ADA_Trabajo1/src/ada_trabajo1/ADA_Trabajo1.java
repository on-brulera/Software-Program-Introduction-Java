/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ada_trabajo1;

import Clases.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ADA_Trabajo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Variables
        String entrada = "";
        Ejercicio1 e1;
        Ejercicio2 e2;
        Ejercicio3 e3;
        Ejercicio4 e4;
        Ejercicio5 e5;
        Ejercicio7 e7;
        Ejercicio8 e8;
        Ejercicio9 e9;
        Ejercicio10 e10;

        Metodos met = new Metodos();
        long tiempoInicial, tiempoFin, tiempo;
        int numEntero1, numEntero2, numEntero3, numEntero4, opcion;
        Scanner entradaEscaner = new Scanner(System.in);

        while (entrada != "0") {
            System.out.println("MENU");
            System.out.println("------------------------");
//            for (int i = 1; i < 10; i++) {
//                System.out.println("Escriba el numero " + i + " para acceder al ejercicio " + i);
//            }
            System.out.println("Escriba un número de 1-9 segun el ejercicio");
            System.out.println("------------------------");
            System.out.println("Para salir presione 0");

            System.out.println("SELECCIONE UNA OPCION");
            entrada = entradaEscaner.next();
            opcion = Integer.parseInt(entrada);

            if (opcion == 1) {
                System.out.println("Escribe la cantidad de números aleatorios para el arreglo: ");
                entrada = entradaEscaner.next();
                numEntero1 = Integer.parseInt(entrada);
                tiempoInicial = System.nanoTime();
                e1 = new Ejercicio1(numEntero1);
                met.LlenarArreglo(e1.getDatos());
                System.out.println(met.Imprimir(e1.getDatos()));
                System.out.println("Numero n de primos: " + e1.Contarprimos());
                tiempoFin = System.nanoTime();
                tiempo = tiempoFin - tiempoInicial;
                System.out.println("El tiempo en nanosegundos es: " + tiempo);
            } else if (opcion == 2) {
                System.out.println("Escribe la cantidad de números aleatorios para el arreglo A: ");
                entrada = entradaEscaner.next();
                numEntero1 = Integer.parseInt(entrada);
                System.out.println("Escribe la cantidad de números aleatorios para el arreglo B: ");
                entrada = entradaEscaner.next();
                numEntero2 = Integer.parseInt(entrada);
                tiempoInicial = System.nanoTime();
                e2 = new Ejercicio2(numEntero1, numEntero2);
                e2.Ingresar();
                System.out.println("Vector A\n" + met.Imprimir(e2.getVec1()));
                System.out.println("Vector B\n" + met.Imprimir(e2.getVec2()));
                System.out.println("------------");
                System.out.println(e2.Comparar());
                tiempoFin = System.nanoTime();
                tiempo = tiempoFin - tiempoInicial;
                System.out.println("El tiempo en nanosegundos es: " + tiempo);
            } else if (opcion == 3) {
                System.out.println("Escribe la cantidad de números aleatorios para el arreglo: ");
                entrada = entradaEscaner.next();
                numEntero1 = Integer.parseInt(entrada);
                entrada = entradaEscaner.next();
                System.out.println("Escribe la número que deseas encontrar en el arreglo: ");
                numEntero2 = Integer.parseInt(entrada);

                tiempoInicial = System.nanoTime();
                e3 = new Ejercicio3(numEntero1);
                met.LlenarArreglo(e3.getArreglo());
                e3.burbuja();
                System.out.println(met.Imprimir(e3.getArreglo()));
                System.out.println("Indice Busqueda: " + e3.busquedaBinaria(numEntero2));
                tiempoFin = System.nanoTime();
                tiempo = tiempoFin - tiempoInicial;
                System.out.println("El tiempo en nanosegundos es: " + tiempo);

            } else if (opcion == 4) {
                System.out.println("Escribe el tamaño de la matriz: ");
                entrada = entradaEscaner.next();
                numEntero1 = Integer.parseInt(entrada);
                tiempoInicial = System.nanoTime();
                e4 = new Ejercicio4(numEntero1);
                e4.LlenarMatriz();
                System.out.println(met.Imprimir(e4.getMatriz()));
                tiempoFin = System.nanoTime();
                tiempo = tiempoFin - tiempoInicial;
                System.out.println("El tiempo en nanosegundos es: " + tiempo);

            } else if (opcion == 5) {
                System.out.println("Escribe el tamaño de la matriz: ");
                entrada = entradaEscaner.next();
                numEntero1 = Integer.parseInt(entrada);
                tiempoInicial = System.nanoTime();
                e5 = new Ejercicio5(numEntero1);
                e5.LlenarMatriz();
                System.out.println(met.Imprimir(e5.getMatriz()));
                tiempoFin = System.nanoTime();
                tiempo = tiempoFin - tiempoInicial;
                System.out.println("El tiempo en nanosegundos es: " + tiempo);

            } else if (opcion == 6) {
                System.out.println("EL ejercicio 6 es el mismo que el 3, por fa selecciona el 3");
            } else if (opcion == 7) {
                System.out.println("Escribe el tamaño de la matriz, el mismo tamaño para A, B y C: ");
                entrada = entradaEscaner.next();
                numEntero1 = Integer.parseInt(entrada);
                tiempoInicial = System.nanoTime();
                e7 = new Ejercicio7(numEntero1);
                met.LlenarMatriz(e7.getMatrizA());
                met.LlenarMatriz(e7.getMatrizB());
                e7.multiplicacion();
                System.out.println("MATRIZ A\n" + met.Imprimir(e7.getMatrizA()));
                System.out.println("MATRIZ B\n" + met.Imprimir(e7.getMatrizB()));
                System.out.println("MATRIZ C\n" + met.Imprimir(e7.getMatrizC()));
                tiempoFin = System.nanoTime();
                tiempo = tiempoFin - tiempoInicial;
                System.out.println("El tiempo en nanosegundos es: " + tiempo);
            } else if (opcion == 8) {
                System.out.println("Escribe el cantidad de números aleatorios para el arreglo: ");
                entrada = entradaEscaner.next();
                numEntero1 = Integer.parseInt(entrada);
                System.out.println("Escribe el número que deseas encontrar en el arreglo: ");
                entrada = entradaEscaner.next();
                numEntero2 = Integer.parseInt(entrada);
                tiempoInicial = System.nanoTime();
                e8 = new Ejercicio8(numEntero1);
                met.LlenarMatriz(e8.getMatriz());
                System.out.println(met.Imprimir(e8.getMatriz()));
                System.out.println("Coordenadas con indice desde 0: " + e8.buscar(numEntero2));
                tiempoFin = System.nanoTime();
                tiempo = tiempoFin - tiempoInicial;
                System.out.println("El tiempo en nanosegundos es: " + tiempo);

            } else if (opcion == 9) {
                System.out.println("Escribe el cantidad de filas de la matriz: ");
                entrada = entradaEscaner.next();
                numEntero1 = Integer.parseInt(entrada);
                System.out.println("Escribe el cantidad de columnas de la matriz: ");
                entrada = entradaEscaner.next();
                numEntero2 = Integer.parseInt(entrada);
                System.out.println("Escribe cuantos numeros positivos deben haber en la matriz: ");
                entrada = entradaEscaner.next();
                numEntero3 = Integer.parseInt(entrada);
                System.out.println("Escribe el número de fila que deseas ordenar: ");
                entrada = entradaEscaner.next();
                numEntero4 = Integer.parseInt(entrada);
                tiempoInicial = System.nanoTime();
                e9 = new Ejercicio9(numEntero1, numEntero2);
                e9.IngresarNumerosAleatorios(numEntero3);
                System.out.println(met.Imprimir(e9.getMatriz()));
                e9.OrdenarInsercionFila(numEntero4);
                System.out.println(met.Imprimir(e9.getMatriz()));
                tiempoFin = System.nanoTime();
                tiempo = tiempoFin - tiempoInicial;
                System.out.println("El tiempo en nanosegundos es: " + tiempo);

            } else if (opcion == 10) {
                System.out.println("Escribe Cuantos Estudiantes deben constar en la matriz: ");
                entrada = entradaEscaner.next();
                numEntero1 = Integer.parseInt(entrada);
                tiempoInicial = System.nanoTime();
                e10 = new Ejercicio10(numEntero1);
                e10.LlenarEstudiantes();
                e10.LlenarNotas();
                e10.LlenarAprobaciones();
                System.out.println(e10.Imprimir());
                tiempoFin = System.nanoTime();
                tiempo = tiempoFin - tiempoInicial;
                System.out.println("El tiempo en nanosegundos es: " + tiempo);

            } else if (opcion == 0) {
                System.out.println("Gracias por usar el sistema");
                break;
            } else {
                System.out.println("ESCRIBA UNA OPCION VALIDA");
            }
        }
    }
}
