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
public class MatrizPrimo {
    public void LlenarPrimos(int[][] matriz) {
        int col = 0;
        int fil = matriz.length - 1;
        int iter = matriz.length * matriz[0].length;
        int cont = 1;
        while (cont <= iter) {
            //izquierda derecha
            while (col <= matriz[0].length - 1 && matriz[fil][col] == 0) {
                matriz[fil][col++] = cont++;
            }
            fil--;
            col--;
            //abajo arriba
            while (fil >= 0 && matriz[fil][col] == 0) {                                
                matriz[fil--][col] = cont++;                
            }
            fil++;
            col--;
            //derecha izquierda
            while (col >= 0 && matriz[fil][col] == 0) {                                
                matriz[fil][col--] = cont++;
            }
            fil++;
            col++;
            //arriba abajo
            while (fil <= matriz.length - 1 && matriz[fil][col] == 0) {                
                matriz[fil++][col] = cont++;
            }
            fil--;
            col++;            
        }
        System.out.println("cont: " + cont);
        System.out.println(fil + "-" + col);
    }    
}
