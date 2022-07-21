package appfracciones;

public class FraccionMixtas {

    private int entero;
    private int numerador;
    private int denominador;

    public FraccionMixtas(int entero) {
        this.entero = entero;
        this.numerador = 0;
        this.denominador = 1;
    }

    public FraccionMixtas(int numerador, int denominador) {
        this.entero = 0;
        this.numerador = numerador;
        this.denominador = denominador;
        this.ControlarEstadoFraccionMixta();
        this.ControlarSignos();
    }

    public FraccionMixtas(int entero, int numerador, int denominador) {
        this.entero = entero;
        this.numerador = numerador;
        this.denominador = denominador;
        this.ControlarEstadoFraccionMixta();
        this.ControlarSignos();
    }

    public FraccionMixtas() {
        this.entero = 1;
        this.numerador = 1;
        this.denominador = 1;
    }

    public void setEntero(int entero) {
        this.entero = entero;
        this.ControlarEstadoFraccionMixta();
        this.ControlarSignos();
    }

    public int getEntero() {
        return this.entero;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
        this.ControlarEstadoFraccionMixta();
        this.ControlarSignos();
    }

    public int getNumerador() {
        return this.numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
        this.ControlarEstadoFraccionMixta();
        this.ControlarSignos();
    }

    public int getDenominador() {
        return this.denominador;
    }

    public void ControlarEstadoFraccionMixta() {
        if (this.denominador == 0) {
            this.numerador = 0;
            this.denominador = 0;
            this.entero = 0;
        }
    }

    public void ControlarSignos() {
        this.ConvertirMixtoPropio();
        if (this.numerador < 0 && this.denominador < 0) {
            this.numerador *= -1;
            this.denominador *= -1;
        }
        this.ConvertirPropioMixto();
    }

    public void ConvertirMixtoPropio() {
        this.numerador = this.entero * this.denominador + this.numerador;
        this.entero = 0;
    }

    public void ConvertirPropioMixto() {

        if (this.entero == 0) {
            if (this.numerador > this.denominador) {
                this.entero = this.numerador / this.denominador;
                this.numerador = this.numerador % this.denominador;
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

    public void Sumar(int entero, int numerador, int denominador) {
        if (denominador == 0) {
            this.DenominadorError();
        } else {
            this.entero += entero;
            this.numerador = this.numerador * denominador + this.denominador * numerador;
            this.denominador *= denominador;
            this.ConvertirMixtoPropio();
            this.Simplificar();
            this.ConvertirPropioMixto();
        }
    }

    public void Sumar(int entero) {
        this.entero += entero;
        this.ConvertirMixtoPropio();
        this.Simplificar();
        this.ConvertirPropioMixto();
    }

    public void Sumar(int numerador, int denominador) {
        this.Sumar(0, numerador, denominador);
    }

    public void Sumar(FraccionMixtas fm) {
        this.Sumar(fm.getEntero(), fm.getNumerador(), fm.getDenominador());
    }

    public void Restar(int entero, int numerador, int denominador) {
        if (denominador == 0) {
            this.DenominadorError();
        } else {
            this.entero -= entero;
            this.numerador = this.numerador * denominador - this.denominador * numerador;
            this.denominador *= denominador;
            this.ConvertirMixtoPropio();
            this.Simplificar();
            this.ConvertirPropioMixto();
        }
    }

    public void Restar(int entero) {
        this.entero -= entero;
        this.ConvertirMixtoPropio();
        this.Simplificar();
        this.ConvertirPropioMixto();
    }

    public void Restar(int numerador, int denominador) {
        this.Restar(0, numerador, denominador);
    }

    public void Restar(FraccionMixtas fm) {
        this.Restar(fm.getEntero(), fm.getNumerador(), fm.getDenominador());
    }

    public void Multiplicar(int entero, int numerador, int denominador) {
        if (denominador == 0) {
            this.DenominadorError();
        } else {
            if (entero < 0 || entero > 0) {
                numerador = entero * denominador + numerador;
            }
            this.ConvertirMixtoPropio();
            this.numerador = this.numerador * numerador;
            this.denominador = this.denominador * denominador;
            this.Simplificar();
            this.ConvertirPropioMixto();
        }
    }

    public void Multiplicar(int entero) {
        this.ConvertirMixtoPropio();
        this.numerador *= entero;
        this.Simplificar();
        this.ConvertirPropioMixto();
    }

    public void Multiplicar(int numerador, int denominador) {
        this.Multiplicar(0, numerador, denominador);
    }

    public void Multiplicar(FraccionMixtas fm) {
        this.Multiplicar(fm.getEntero(), fm.getNumerador(), fm.getDenominador());
    }

    public void Dividir(int entero, int numerador, int denominador) {
        if (denominador == 0) {
            this.DenominadorError();
        } else {
            if (entero < 0 || entero > 0) {
                numerador = entero * denominador + numerador;
            }
            this.ConvertirMixtoPropio();
            this.numerador *= denominador;
            this.denominador *= numerador;
            this.Simplificar();
            this.ConvertirPropioMixto();
        }
    }

    public void Dividir(int entero) {
        if (entero == 0) {
            this.DenominadorError();
        } else {
            this.ConvertirMixtoPropio();
            this.denominador *= entero;
            this.Simplificar();
            this.ConvertirPropioMixto();
        }
    }

    public void Dividir(int numerador, int denominador) {
        if (denominador == 0) {
            this.DenominadorError();
        } else {
            this.Dividir(0, numerador, denominador);
        }
    }

    public void Dividir(FraccionMixtas fm) {
        this.Dividir(fm.getEntero(), fm.getNumerador(), fm.getDenominador());
    }

    public void DenominadorError() {
        this.denominador = 0;
        this.entero = 0;
        this.numerador = 0;
    }

    public String Imprimir() {
        return this.entero + "(" + this.numerador + "/" + this.denominador + ")";
    }
}
