/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arreglos;

/**
 *
 * @author MacArthur
 */
public class Inicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Matriz m1,mt;
//            
//        m1 = new Matriz(4,5);
//        
//        m1.setValor(0, 0, 8);
//        m1.Unos();
//        if (!m1.Identidad()) System.out.println("Error de matriz");
//        m1.LlenarRandom();
//        mt = m1.Transpuesta();
//        System.out.println("Matriz 1");
//        m1.Imprimir();
//        System.out.println("Matriz Transuesta");
//        mt.Imprimir();

        Fecha[] fecha;
        fecha = new Fecha[4];

        fecha[0] = new Fecha(23, 1, 2002);
        fecha[1] = new Fecha(24, 2, 2002);
        fecha[2] = new Fecha(25, 3, 2002);

        Object[] arregloObjetos;
        arregloObjetos = new Object[9];

        arregloObjetos[0] = new Recta();
        arregloObjetos[1] = new Circunferencia(2, 3, 3);
        arregloObjetos[2] = new Cuadrado();
        arregloObjetos[3] = new Punto(0, 0);
        arregloObjetos[4] = new Matriz(3, 4);
        arregloObjetos[5] = new Elipse();
        arregloObjetos[6] = new Fecha();
        arregloObjetos[7] = new Rectangulo();
        arregloObjetos[8] = new Triangulo();

        for (int i = 0; i < arregloObjetos.length; i++) {
            if (arregloObjetos[i] instanceof Recta) {
                System.out.println("--------------------------------------------");
                System.out.println(((Recta) arregloObjetos[i]).Imprimir());
            } else {
                if (arregloObjetos[i] instanceof Circunferencia) {
                    System.out.println("--------------------------------------------");
                    System.out.println(((Circunferencia) arregloObjetos[i]).Imprimir());
                } else {
                    if (arregloObjetos[i] instanceof Cuadrado) {
                        System.out.println("--------------------------------------------");
                        System.out.println(((Cuadrado) arregloObjetos[i]).Imprimir());
                    } else {
                        if (arregloObjetos[i] instanceof Punto) {
                            System.out.println("--------------------------------------------");
                            System.out.println(((Punto) arregloObjetos[i]).Imprimir());
                        } else {
                            if (arregloObjetos[i] instanceof Matriz) {
                                System.out.println("--------------------------------------------");
                                ((Matriz) arregloObjetos[4]).LlenarRandom();
                                ((Matriz) arregloObjetos[i]).Imprimir();
                            } else {
                                if (arregloObjetos[i] instanceof Triangulo) {
                                    System.out.println("--------------------------------------------");
                                    System.out.println(((Triangulo) arregloObjetos[i]).Imprimir());
                                } else {
                                    if (arregloObjetos[i] instanceof Rectangulo) {
                                        System.out.println("--------------------------------------------");
                                        System.out.println(((Rectangulo) arregloObjetos[i]).Imprimir());
                                    } else {
                                        if (arregloObjetos[i] instanceof Elipse) {
                                            System.out.println("--------------------------------------------");
                                            System.out.println(((Elipse) arregloObjetos[i]).Imprimir());
                                        } else {
                                            if (arregloObjetos[i] instanceof Fecha) {
                                                System.out.println("--------------------------------------------");
                                                System.out.println(((Fecha) arregloObjetos[i]).Imprimir());
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        Pila numeros;
        numeros = new Pila(6);       
        numeros.Push(3);
        numeros.Push(-3);
        numeros.Push(0);
        numeros.Push(-0);
        numeros.Push(1);
        System.out.println("PILA");
        System.out.println("--------");
        numeros.Imprimir();
        numeros.Pop();
        System.out.println("--------");
        numeros.Imprimir();
        numeros.Pop();
        numeros.Pop();
        System.out.println("--------");
        numeros.Imprimir();
        numeros.Push(3);
        numeros.Push(4);
        numeros.Push(5);
        System.out.println("--------");
        numeros.Imprimir();
        
        Cola numerosCola;
        numerosCola = new Cola(5);
        numerosCola.Push(1);
        numerosCola.Push(-1);
        numerosCola.Push(2);
        numerosCola.Push(-2);
        System.out.println("COLA");
        System.out.println("--------");
        numerosCola.Imprimir();
        numerosCola.Pop();        
        System.out.println("--------");
        numerosCola.Imprimir();
        numerosCola.Push(3);
        numerosCola.Push(4);
        System.out.println("--------");
        numerosCola.Imprimir();
        numerosCola.Pop();     
        numerosCola.Pop();     
        System.out.println("--------");
        numerosCola.Imprimir();
    }
}
