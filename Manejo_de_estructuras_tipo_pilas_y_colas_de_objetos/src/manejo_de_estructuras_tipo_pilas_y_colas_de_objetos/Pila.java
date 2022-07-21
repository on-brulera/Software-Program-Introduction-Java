/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejo_de_estructuras_tipo_pilas_y_colas_de_objetos;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Kevin
 */
public class Pila implements Serializable{

    public ArrayList pila;
    int cima;

    public Pila() {
    pila=new ArrayList<>();
        cima=-1;
    }

   

    public void apilar(Object objeto) {
        pila.add(objeto);
        cima++;

    }

    public Object Desapilar() {
        Object object;
        if (Vacia()) {
            
            return -1;
        } else {
            object = pila.get(cima);           
            pila.remove(cima);
            cima--;
            return object;
        }

    }

    public boolean Vacia() {
        return pila.isEmpty();
    }

    public int Size() {
        return pila.size();

    }

    public Object Peek() {
                 
        return pila.get(cima);
        

    }

    public void vaciar() {
        pila.clear();
    }
    
    public String toString(){
    String aux="";
        for (int i = pila.size()-1; i >=0; i--) {
            aux+="\n"+pila.get(i).toString()+"\n";
        }
        return aux;
    }
    
    
}
