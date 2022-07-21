/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torres_de_hanoi;

/**
 *
 * @author ALEXIS
 */
public class Pila {
    
    private int ContNodo = 0;
    
    private Nodo Cabeza;

    public int getContNodo() {
        return ContNodo;
    }

    public void setContNodo(int ContNodo) {
        this.ContNodo = ContNodo;
    }

    public Nodo getCabeza() {
        return Cabeza;
    }

    public void setCabeza(Nodo Cabeza) {
        this.Cabeza = Cabeza;
    }
    
    public void Push(Nodo N){
        ContNodo++;
        
        if (Cabeza == null) {
            Cabeza = N;
        }else{
            N.setAbajo(Cabeza);
            Cabeza.setArriba(N);
            
            Cabeza = N;
        
        }
    }
    
    public void POP(){
        if (ContNodo>0) {
            ContNodo--;
            
            Cabeza = Cabeza.getAbajo();
           
            
        }
    }
    
    public String Peek(){
        return Cabeza.getDato();
    }
    
}
