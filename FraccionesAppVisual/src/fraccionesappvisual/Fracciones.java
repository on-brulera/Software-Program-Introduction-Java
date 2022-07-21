package fraccionesappvisual;

public class Fracciones {

    private int numerador;
    private int denominador;

    public Fracciones(int numerador) {
        this.numerador = numerador;
        this.denominador = 1;
        this.ControlarEstadoFraccion(this.numerador, this.denominador);
        this.Simplificar();
    }

    public Fracciones(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
        this.ControlarEstadoFraccion(this.numerador, this.denominador);
        this.Simplificar();
    }

    public Fracciones() {
        this.numerador = 1;
        this.denominador = 1;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
        this.ControlarEstadoFraccion(this.numerador, this.denominador);
        this.Simplificar();
    }

    public int getNumerador() {
        return this.numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
        this.ControlarEstadoFraccion(this.numerador, this.denominador);
        this.Simplificar();
    }

    public int getDenominador() {
        return this.denominador;
    }

    public void ControlarEstadoFraccion(int numerador, int denominador) {
        if (denominador == 0) {
            this.numerador = 0;
            this.denominador = 0;
        } else {
            if (numerador == 0) {
                this.numerador = 0;
                this.denominador = 0;
            } else {
                if (numerador < 0 && denominador < 0) {
                    this.numerador *= -1;
                    this.denominador *= -1;
                }
            }
        }
    }

    public void Simplificar() {
        boolean negNumerador = false, negDenominador = false;
        int menor;
        if (numerador < 0) {
            negNumerador = true;
            this.numerador *= -1;
        }
        if (denominador < 0) {
            negDenominador = true;
            this.denominador *= -1;
        }
        if (numerador < denominador) {
            menor = numerador;
        } else {
            menor = denominador;
        }
        for (int x = 2; x <= menor; x++) {
            if (NumerosPrimos(x) == 1) {
                if (this.numerador % x == 0 && this.denominador % x == 0) {
                    this.numerador /= x;
                    this.denominador /= x;
                }
            }
        }

        if (this.denominador == this.numerador) {
            this.numerador = 1;
            this.denominador = 1;
        }

        if (negNumerador == true) {
            this.numerador *= -1;
        }
        if (negDenominador == true) {
            this.denominador *= -1;
        }
    }

    public int NumerosPrimos(int numFinal) {
        int cont = 0;
        for (int x = 2; x <= numFinal; x++) {
            if (numFinal % x == 0) {
                cont++;
            }
        }
        return cont;
    }

    public void Sumar(int numerador, int denominador) {
        this.numerador = this.numerador * denominador + this.denominador * numerador;
        this.denominador *= denominador;
        this.ControlarEstadoFraccion(this.numerador, this.denominador);
        this.Simplificar();
    }

    public void Sumar(int numerador) {
        int denominadorDefecto = 1;
        this.Sumar(numerador, denominadorDefecto);
    }

    public void Sumar(Fracciones fr) {
        this.Sumar(fr.getNumerador(), fr.getDenominador());
    }

    public void Restar(int numerador, int denominador) {
        this.numerador = this.numerador * denominador - this.denominador * numerador;
        this.denominador *= denominador;
        this.ControlarEstadoFraccion(this.numerador, this.denominador);
        this.Simplificar();
    }

    public void Restar(int numerador) {
        int denominadorDefecto = 1;
        this.Restar(numerador, denominadorDefecto);
    }

    public void Restar(Fracciones fr) {
        this.Restar(fr.getNumerador(), fr.getDenominador());
    }

    public void Multiplicar(int numerador, int denominador) {
        this.numerador *= numerador;
        this.denominador *= denominador;
        this.ControlarEstadoFraccion(this.numerador, this.denominador);
        this.Simplificar();
    }

    public void Multiplicar(int numerador) {
        this.numerador *= numerador;
        this.ControlarEstadoFraccion(this.numerador, this.denominador);
        this.Simplificar();
    }

    public void Multiplicar(Fracciones fr) {
        this.Multiplicar(fr.getNumerador(), fr.getDenominador());
    }

    public void Dividir(int numerador, int denominador) {
        this.numerador *= denominador;
        this.denominador *= numerador;
        this.ControlarEstadoFraccion(this.numerador, this.denominador);
        this.Simplificar();
    }

    public void Dividir(int numerador) {
        this.denominador *= numerador;
        this.ControlarEstadoFraccion(this.numerador, this.denominador);
        this.Simplificar();
    }

    public void Dividir(Fracciones fr) {
        this.Dividir(fr.getNumerador(), fr.getDenominador());
    }

    public String Imprimir() {
        return this.numerador + "/" + this.denominador;
    }
}
