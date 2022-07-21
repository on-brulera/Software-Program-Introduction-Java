/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.figurasgeometricas;

/**
 *
 * @author Henry
 */
public class Punto {
    private int x;    
    private int y;

    /**
     * Metodo Constructor
     *
     * @param x Valor para la coordenada x
     * @param y Valor para la coordenada y
     */
    public Punto(int x, int y) {
        setX(x);
        setY(y);
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return this.y;
    }

    /**
     * 
     * @param dx es la cantidad a sumar en la coordenada x
     * @param dy es la cantidad a sumar en la coordenada y
     */
    public void Mover(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }
    
    /**
     *
     * @return Regresa la coordenada en formato (x,y)
     */
    public String Coordenada() {
        return "(" + this.x + "," + this.y + ")";
    }
}
