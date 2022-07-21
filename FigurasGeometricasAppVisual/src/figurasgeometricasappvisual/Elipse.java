package figurasgeometricasappvisual;

public class Elipse {

    public Punto centro;
    private double ejeMayor;
    private double ejeMenor;

    public Elipse(double ejeMayor, int ejeMenor) {
        centro = new Punto(0, 0);
        setEjeMayor(ejeMayor);
        setEjeMenor(ejeMenor);
    }

    public Elipse(int x, int y, double ejeMayor, double ejeMenor) {
        centro = new Punto(x, y);
        setEjeMayor(ejeMayor);
        setEjeMenor(ejeMenor);
    }

    public void CompararEjes() {
        double auxiliar;
        if (this.ejeMayor < this.ejeMenor) {
            auxiliar = this.ejeMayor;
            this.ejeMayor = this.ejeMenor;
            this.ejeMenor = auxiliar;
        } else {
            if (this.ejeMayor == this.ejeMenor) {
                this.ejeMayor += 10;
            }
        }
    }

    public void setEjeMayor(double ejeMayor) {
        if (ejeMayor > 0) {
            this.ejeMayor = ejeMayor;
            CompararEjes();
        } else {
            this.ejeMayor = 10;
            CompararEjes();
        }
    }

    public double getEjeMayor() {
        return this.ejeMayor;
    }

    public void setEjeMenor(double ejeMenor) {
        if (ejeMenor > 0) {
            this.ejeMenor = ejeMenor;
            CompararEjes();
        } else {
            this.ejeMenor = 5;
            CompararEjes();
        }
    }

    public double getEjeMenor() {
        return this.ejeMenor;
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
        centro.setX(centro.getX() + dx);
        centro.setY(centro.getY() + dy);
    }

    public String Imprimir() {
        return "Area: " + CalcularArea() + ", Perimetro 1: " + CalcularPerimetro1() + ", Perimetro 2: " + CalcularPerimetro2() + ", Posicion: " + centro.Coordenada();
    }
}
