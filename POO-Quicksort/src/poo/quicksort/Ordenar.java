/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.quicksort;

import java.util.Random;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Ordenar {

    protected int[] lista;
    protected int[] listaAux;
    private int indice;

    public Ordenar(int indice) {
        setIndice(indice);
        this.lista = new int[this.indice];
        this.listaAux = new int[this.indice];
    }

    public int getIndice() {
        return this.indice;
    }

    public void setIndice(int indice) {
        if (indice > 0) {
            this.indice = indice;
        } else {
            this.indice = 10;
        }
    }

    public int getLista(int indice) {
        return this.lista[indice];
    }
    
    public void CambiarValores(int indice, int num) {
        this.lista[indice] = num;
    }

    public void RedimensioniarLista(int indice) {
        this.setIndice(indice);
        int[] lista = new int[this.indice];
        int[] listaAux = new int[this.indice];
        this.ValidarLista(lista);
        this.ValidarLista(listaAux);
        this.lista = lista;
        this.listaAux = listaAux;
    }

    public void LlenarLista(int[] lista) {
        Random r = new Random();
        for (int i = 0; i < lista.length; i++) {
            lista[i] = r.nextInt(100) + 1;
        }

        LlenarListaAux(lista, this.listaAux);
    }
    
    public void LlenarListaAux(int[] lista, int[] listaAux) {
        for (int i = 0; i < lista.length; i++) {
            listaAux[i] = lista[i];
        }
    }

    public void ValidarLista(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            lista[i] = 0;
        }
    }

    public void Imprimir(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
    }

    public void QuickSort(int[] A, int izquierda, int derecha) {
        int pivote = A[izquierda];
        int i = izquierda;//Iteraciones
        int j = derecha;
        int auxIntercambio;
        while (i < j) {

            //Hacemos la busqueda del valor menor y mayor con el pivote
            //Izquierda
            while (A[i] <= pivote && i < j) {
                i++;
            }
            //Derecha
            while (A[j] > pivote) {
                j--;
            }
            if (i < j) {
                auxIntercambio = A[i];
                A[i] = A[j];
                A[j] = auxIntercambio;
            }
        }

        //Hacemos intercambio del pivote
        A[izquierda] = A[j];
        A[j] = pivote;

        for (int ie = 0; ie < A.length; ie++) {
            //System.out.print(A[ie] + "  ");
        }

        System.out.println("\n");
        if (izquierda < j - 1) {
            QuickSort(A, izquierda, j - 1);
        }
        if (j + 1 < derecha) {
            QuickSort(A, j + 1, derecha);
        }
    }

    public void OrdenarBurbuja(int[] datos) {
        int aux = 0;
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos.length - (i + 1); j++) {
                if (datos[j] > datos[j + 1]) {
                    aux = datos[j + 1];
                    datos[j + 1] = datos[j];
                    datos[j] = aux;
                }
            }
        }
    }

    public void Imprimir2(int[] datos) {
        System.out.println("");
        System.out.print("Datos: {");
        for (int i = 0; i < datos.length; i++) {
            if (i == datos.length - 1) {
                System.out.print(datos[i]);
            } else {
                System.out.print(datos[i] + " - ");
            }
        }
        System.out.print("}");
    }
}
