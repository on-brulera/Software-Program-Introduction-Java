package appfigurasgeometricas;

import java.io.Serializable;

public class Recta implements Serializable{

    public Punto puntoInicio;
    public Punto puntoFinal;

    public Recta(int x, int y) {
        puntoInicio = new Punto(0, 0);
        puntoFinal = new Punto(x, y);
    }

    public Recta(int inicioX, int inicioY, int finalX, int finalY) {
        puntoInicio = new Punto(inicioX, inicioY);
        puntoFinal = new Punto(finalX, finalY);
    }

    public double Longitud() {
        double valorX = Math.pow((puntoFinal.getX() - puntoInicio.getX()), 2);
        double valorY = Math.pow((puntoFinal.getY() - puntoInicio.getY()), 2);
        return Math.sqrt(valorX + valorY);
    }

    public void Mover(int dx, int dy) {        
        puntoInicio.setX(puntoInicio.getX() + dx);
        puntoInicio.setY(puntoInicio.getY() + dy);
        puntoFinal.setX(puntoFinal.getX() + dx);
        puntoFinal.setY(puntoFinal.getY() + dy);
    }
}
