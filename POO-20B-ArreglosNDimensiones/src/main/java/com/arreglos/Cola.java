/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arreglos;

/**
 *
 * @author Ramírez Henry
 */
public class Cola {

    private Object[] Datos;
    int posicion;
    int tamañoArreglo;

    public Cola(int tamañoArreglo) {
        Datos = new Object[tamañoArreglo];
        this.tamañoArreglo = tamañoArreglo;
        this.posicion = -1;
    }

    public void Push(int numero) {
        if (this.posicion < this.tamañoArreglo) {
            this.posicion++;
            this.Datos[this.posicion] = numero;

        }
    }

    public void Pop() {
        if (IsEmpty() == false) {
            for (int i = 0; i < this.posicion; i++) {
                this.Datos[i] = this.Datos[i + 1];
            }
        }
    }

    public Boolean IsEmpty() {
        if (this.posicion == -1) {
            return true;
        } else {
            return false;
        }
    }

    public Object Top() {
        if (IsEmpty() == true) {
            return 0;
        } else {
            return this.Datos[this.posicion];
        }
    }

    public int Size() {
        if (IsEmpty() == true) {
            return 0;
        } else {
            return this.posicion + 1;
        }
    }

    public void Imprimir() {
        if (IsEmpty() == false) {
            for (int x = 0; x <= this.posicion; x++) {
                System.out.println((x + 1) + ": " + this.Datos[x]);
            }
        } else {
            System.out.println("La pila esta vacía");
        }
    }

    public void RecorrerCola(int posicionInicial) {
        int siguiente;
        int anterior;

        if (posicionInicial >= 0 && posicionInicial <= this.Size()) {
            if (posicionInicial == this.Size()) {
                siguiente = this.Size() - 1;
                anterior = this.posicion - 1;
            } else {
                if (this.Size() == 0) {
                    anterior = 0;
                    siguiente = this.posicion + 1;
                } else {
                    anterior = this.posicion--;
                    siguiente = this.posicion++;
                }
            }
        }
    }
}
