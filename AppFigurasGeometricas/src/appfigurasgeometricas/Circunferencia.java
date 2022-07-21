package appfigurasgeometricas;

public class Circunferencia {

    public Punto centro;
    private double radio;

    public Circunferencia(double radio) {
        centro = new Punto(0, 0);
        setRadio(radio);
    }

    public Circunferencia(double radio, int x, int y) {
        centro = new Punto(x, y);
        setRadio(radio);
    }

    public void setRadio(double radio) {
        if (radio > 0) {
            this.radio = radio;
        } else {
            this.radio = 1;
        }
    }

    public double getRadio() {
        return this.radio;
    }

    public double CalcularArea() {
        return Math.PI * radio * radio;
    }

    public double CalcularPerimetro() {
        return Math.PI * radio;
    }

    public void Mover(int dx, int dy) {
        centro.setX(centro.getX() + dx);
        centro.setY(centro.getY() + dy);
    }

    public String Imprimir() {
        return "Area: " + CalcularArea() + ", Radio: " + radio + ", posición: " + centro.Coordenada();
    }
}
