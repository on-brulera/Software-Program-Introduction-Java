/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ada.ordenamiento;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class ADAOrdenamiento {

    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
        int [] lista = new int[10000];
        Random(lista);           
        
        long inicio, fin, tiempo;              
                             
        inicio = System.currentTimeMillis();
        Burbuja(lista);
        fin = System.currentTimeMillis();
        tiempo = fin - inicio;                                     
        
        System.out.println("ml: " + tiempo);
        
        //System.out.println(Imprimir(lista));
    }
        
    
    
    public static String Imprimir (int[] lista){
        String datos = "";        
        for (int i = 0; i < lista.length; i++) {
            datos =  datos + lista[i] + " ";
        }
        return  datos;
    }
    
    public static void Burbuja(int[] lista){
        int aux;
        for (int i = 0; i < lista.length; i++) {
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[i] > lista[j]) {
                    aux = lista[j];
                    lista[j] = lista[i];
                    lista[i] = aux;
                }
            }
        }
    }
    
    public static void Random(int[] lista){
        Random random = new Random();
        for (int i = 0; i < lista.length; i++) {
            lista[i] = random.nextInt(100+1) + 1;
        }
    }
}
