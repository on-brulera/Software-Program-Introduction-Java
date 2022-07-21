/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.figurasgeometricas;

/**
 *
 * @author Usuario
 */
public class Triangulo {

    private Punto verticeA;
    private Punto verticeB;
    private Punto verticeC;

    public Triangulo(int Bx, int By, int Cx, int Cy) {
        verticeA = new Punto(0, 0);
        verticeB = new Punto(Bx, By);
        verticeC = new Punto(Cx, Cy);
    }

    public Triangulo(int Ax, int Ay, int Bx, int By, int Cx, int Cy) {
        verticeA = new Punto(Ax, Ay);
        verticeB = new Punto(Bx, By);
        verticeC = new Punto(Cx, Cy);
    }
    
    public void setVerticeA(int x, int y){
        this.verticeA.setX(x);
        this.verticeA.setY(y);
    }
    
    public void setVerticeB(int x, int y){
        this.verticeB.setX(x);
        this.verticeB.setY(y);
    }
    public void setVerticeC(int x, int y){
        this.verticeC.setX(x);
        this.verticeC.setY(y);
    }
    
    public double CalcularArea() {
        double matriz[][] = new double[4][2];
        double resultado = 0;
        matriz[0][0] = verticeA.getX();
        matriz[0][1] = verticeA.getY();
        matriz[1][0] = verticeB.getX();
        matriz[1][1] = verticeB.getY();
        matriz[2][0] = verticeC.getX();
        matriz[2][1] = verticeC.getY();
        matriz[3][0] = verticeA.getX();
        matriz[3][1] = verticeA.getY();

        for (int x = 0; x < 6; x++) {
            if (x < 3) {
                resultado += (matriz[x][0] * matriz[x + 1][1]);
            } else {
                resultado -= matriz[x - 2][0] * matriz[x - 3][1];
            }
        }

        if (resultado < 0) {
            resultado *= -1;
        }
        return resultado;
    }

    public double CalcularPerimetro() {
        double ladoAB = Math.pow(((verticeB.getX() - verticeA.getX()) * (verticeB.getX() - verticeA.getX()) + (verticeB.getY() - verticeA.getY()) * (verticeB.getY() - verticeA.getY())), 0.5);
        double ladoBC = Math.pow(((verticeC.getX() - verticeB.getX()) * (verticeC.getX() - verticeB.getX()) + (verticeC.getY() - verticeB.getY()) * (verticeC.getY() - verticeB.getY())), 0.5);
        double ladoCA = Math.pow(((verticeA.getX() - verticeC.getX()) * (verticeA.getX() - verticeC.getX()) + (verticeA.getY() - verticeC.getY()) * (verticeA.getY() - verticeC.getY())), 0.5);
        return ladoAB + ladoBC + ladoCA;
    }

    public void Mover(int dx, int dy) {
        this.verticeA.Mover(dx, dy);
        this.verticeB.Mover(dx, dy);
        this.verticeC.Mover(dx, dy);
    }

    public String Imprimir() {
        return "Area: " + CalcularArea() + ", Perimetro: " + CalcularPerimetro() + ", Posición: " + verticeA.Coordenada();
    }
}
