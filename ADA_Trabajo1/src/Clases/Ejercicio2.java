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
public class Ejercicio2 {

    private int vec1[];
    private int vec2[];

    public Ejercicio2(int tamVec1, int tamVec2) {
        if (tamVec1 <= 0) {
            tamVec1 = 10;
        }
        if (tamVec2 <= 0) {
            tamVec2 = 10;
        }
        this.vec1 = new int[tamVec1];
        this.vec2 = new int[tamVec2];
    }
      
    public Ejercicio2(int tam) {
        this(tam, tam);
    }

    public Ejercicio2() {
        this(10);
    }

    public int[] getVec1(){
        return this.vec1;
    }
    
    public int[] getVec2(){
        return this.vec2;
    }
    
    public void Ingresar(int num1, int num2) {
        for (int i = 0; i < vec1.length; i++) {
            vec1[i] = (int) (Math.random() * num1);
        }
        for (int i = 0; i < vec2.length; i++) {
            vec2[i] = (int) (Math.random() * num2);
        }
    }

    public void Ingresar() {
        Ingresar(100, 100);
    }

    public String Comparar() {
        String datos = "vector A\n";

        for (int i = 0; i < vec1.length; i++) {
            for (int j = 0; j < vec2.length; j++) {
                if (vec1[i] == vec2[j]) {
                    datos += " " + vec1[i];
                }
            }
        }
        datos += "\nvector B\n";
        for (int i = 0; i < vec1.length; i++) {
            for (int j = 0; j < vec2.length; j++) {
                if (vec1[i] == vec2[j]) {
                    datos += " " + vec2[j];
                }
            }
        }
        return datos;
    }

}
