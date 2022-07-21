/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.matrices;

import Clases.MatrizPrimo;

/**
 *
 * @author Usuario
 */
public class PracticaMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        LlenarMatrizRandom(matriz);
        System.out.println("\n" + Imprimir(matriz));

        int suma;
        
        for (int i = 0; i < matriz.length; i++) {
            suma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%d ", matriz[i][j]);
                suma+= matriz[i][j];
            }
            System.out.printf("= %d\n", suma);
        }
        
        System.out.println("---------------------------");
        
        System.out.print(Imprimir(matriz));
        
        for (int i = 0; i < matriz[0].length; i++) {
            System.out.print("________");
        }
        System.out.println();
                
        for (int columna = 0; columna < matriz.length; columna++) {
            suma = 0;
            for (int fila = 0; fila < matriz.length; fila++) {
                suma += matriz[fila][columna];
            }
            System.out.print(suma + "\t");
        }
    }

    public static void LlenarMatriz(int[][] matriz) {
        int fila = matriz.length - 1;
        int columna = 0;
        int contador = 1;
        boolean orden = true;
        while (contador <= matriz.length * matriz.length) {
            if (orden) {
                while (columna <= matriz.length - 1) {
                    matriz[fila][columna] = contador++;
                    columna++;
                }
                fila--;
                columna = matriz.length - 1;
                orden = false;
            } else {
                while (columna >= 0) {
                    matriz[fila][columna--] = contador++;
                }
                fila--;
                columna = 0;
                orden = true;
            }
        }
    }

    public static void LlenarMatrizRecursivo(int[][] matriz) {
        int fila = matriz.length - 1;
        int columna = 0;
        int contador = 1;
        boolean orden = true;
        LlenarMatrizRecursivoOperacion(matriz, fila, columna, contador, orden);
    }

    public static void LlenarMatrizRecursivoOperacion(int[][] matriz, int fila, int columna, int contador, boolean orden) {
        if (contador == matriz.length * matriz.length) {
            matriz[fila][columna] = contador;
        } else if (orden) {
            matriz[fila][columna] = contador;
            columna++;
            contador++;
            if (columna == matriz.length) {
                orden = false;
                columna = matriz.length - 1;
                fila--;
            }
            LlenarMatrizRecursivoOperacion(matriz, fila, columna, contador, orden);
        } else {
            matriz[fila][columna] = contador;
            contador++;
            columna--;
            if (columna == -1) {
                orden = true;
                columna = 0;
                fila--;
            }
            LlenarMatrizRecursivoOperacion(matriz, fila, columna, contador, orden);
        }
    }

    public static void LlenarMatrizRandom(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100 + 1);
            }
        }
    }

    public static String Imprimir(int[][] matriz) {
        String datos = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                datos += matriz[i][j] + "\t";
            }
            datos += "\n";
        }
        return datos;
    }
}
