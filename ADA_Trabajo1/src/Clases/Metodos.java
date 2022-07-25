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
public class Metodos {
    public String Imprimir(int[] Datos) {
        String resp = "";
        for (int i = 0; i < Datos.length; i++) {
            resp = resp + (Datos[i] + " - ");
        }
        return resp;
    }
    
    public String Imprimir(int[][] matriz) {
        String datos = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                datos += matriz[i][j] + "\t";
            }
            datos += "\n";
        }
        return datos;
    }
    
    public void LlenarArreglo(int[] datos) {
        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int) (Math.random() * 100 + 1);
        }        
    }
    
    public void LlenarMatriz(int[][] matriz) {                
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {                
                matriz[i][j] = (int) (Math.random() * 100 + 1);
            }
        }        
    }
}
