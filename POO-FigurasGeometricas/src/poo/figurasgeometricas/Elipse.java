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
public class Elipse {

    public Punto centro;
    private double ejeMayor;
    private double ejeMenor;

    public Elipse(double ejeMayor, int ejeMenor) {
        centro = new Punto(0, 0);
        if (CompararEjes(ejeMayor, ejeMenor)) {
            setEjeMayor(ejeMayor);
            setEjeMenor(ejeMenor);
        } else {
            this.ejeMayor = 10;
            this.ejeMenor = 5;
        }
    }

    public Elipse(int x, int y, double ejeMayor, double ejeMenor) {
        centro = new Punto(x, y);
        if (CompararEjes(ejeMayor, ejeMenor)) {
            setEjeMayor(ejeMayor);
            setEjeMenor(ejeMenor);
        } else {
            this.ejeMayor = 10;
            this.ejeMenor = 5;
        }
    }

    public boolean CompararEjes(double ejeMayor, double ejeMenor) {
        if (this.ejeMayor != this.ejeMenor) {
            return true;
        } else {
            return false;
        }
    }

    public void setEjeMayor(double ejeMayor) {
        if (CompararEjes(ejeMayor, this.ejeMenor)){
            this.ejeMayor = ejeMayor;
        }
    }

    public double getEjeMayor() {
        return this.ejeMayor;
    }

    public void setEjeMenor(double ejeMenor) {
        if (CompararEjes(ejeMayor, ejeMenor)){
            this.ejeMenor = ejeMenor;
        }
    }

    public double getEjeMenor() {
        return this.ejeMenor;
    }
     public void setX(int x) {
        this.centro.setX(x);
    }
    
    public int getX(){
        return this.centro.getX();
    }
    
    public void setY(int y) {
        this.centro.setY(y);
    }

    public int getY(){
        return this.centro.getY();
    }

    public double CalcularArea() {
        return Math.PI * ejeMayor / 2 * ejeMenor / 2;
    }

    public double CalcularPerimetro1() {
        double semiEjeMayor = ejeMayor / 2;
        double semiEjeMenor = ejeMenor / 2;
        semiEjeMayor = Math.pow(semiEjeMayor, 2);
        semiEjeMenor = Math.pow(semiEjeMenor, 2);
        return Math.PI * 2 * Math.sqrt((semiEjeMayor + semiEjeMenor) / 2);
    }

    public double CalcularPerimetro2() {
        double semiEjeMayor = ejeMayor / 2;
        double semiEjeMenor = ejeMenor / 2;
        return Math.PI * (3 * (semiEjeMayor + semiEjeMenor) - Math.sqrt((3 * semiEjeMayor + semiEjeMenor) * (semiEjeMayor + 3 * semiEjeMenor)));
    }

    public void Mover(int dx, int dy) {
        centro.Mover(dx, dy);
    }

    public String Imprimir() {
        return "Area: " + CalcularArea() + ", Perimetro 1: " + CalcularPerimetro1() + ", Perimetro 2: " + CalcularPerimetro2() + ", Posicion: " + centro.Coordenada();
    }

}
