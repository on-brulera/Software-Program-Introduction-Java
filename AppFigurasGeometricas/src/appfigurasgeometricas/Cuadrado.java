package appfigurasgeometricas;

import java.io.Serializable;

public class Cuadrado implements Serializable{

    public Punto puntoOrigen;
    private double lado;

    public Cuadrado(double lado) {
        puntoOrigen = new Punto(0, 0);
        setLado(lado);
    }

    public Cuadrado(double lado, int x, int y) {
        puntoOrigen = new Punto(x, y);
        setLado(lado);
    }

    public void setLado(double lado) {
        if (lado > 0) {
            this.lado = lado;
        } else {
            this.lado = 1;
        }
    }

    public double getLado() {
        return this.lado;
    }

    public double CalcularArea() {
        return lado * lado;
    }

    public double CalcularPerimetro() {
        return lado * 4;
    }

    public void Mover(int dx, int dy) {
        puntoOrigen.setX(puntoOrigen.getX() + dx);
        puntoOrigen.setY(puntoOrigen.getY() + dy);
    }

    public String Imprimir() {
        return "Area: " + CalcularArea() + ", Perimetro: " + CalcularPerimetro() + ", Posición: " + puntoOrigen.Coordenada();
    }
}
