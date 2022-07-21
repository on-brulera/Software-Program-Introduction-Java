/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.quicksort;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class POOQuicksort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("");
        Ordenar o1 = new Ordenar(5);
        o1.Imprimir2(o1.lista);
        o1.LlenarLista(o1.lista);
        o1.Imprimir2(o1.lista);
        o1.QuickSort(o1.lista, 0, o1.lista.length - 1);
        o1.Imprimir2(o1.lista);
        o1.Imprimir2( o1.listaAux);
        
        System.out.println("");
        Ordenar o2 = new Ordenar(5);
        o2.Imprimir2(o2.lista);
        o2.LlenarLista(o2.lista);
        o2.Imprimir2(o2.lista);
        o2.OrdenarBurbuja(o2.lista);
        o2.Imprimir2(o2.lista);
        o2.RedimensioniarLista(3);
        o2.Imprimir2(o2.lista);
        
    }
    
}
