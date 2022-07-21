package appcuentabancaria;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CuentaBancaria {

    private static double saldoMinimo = 19.99;

    public static void setSaldoMinimo(double dineroMinimo) {
        if (dineroMinimo > 0) {
            saldoMinimo = dineroMinimo;
        }
    }

    public static double getSaldoMinimo() {
        return saldoMinimo;
    }

    Calendar fecha = new GregorianCalendar();
    private int diaCuenta;
    private int mesCuenta;
    private int añoCuenta;
    private double saldo;

    public CuentaBancaria(double saldo) {

        this.diaCuenta = fecha.get(Calendar.DAY_OF_MONTH);
        this.mesCuenta = fecha.get(Calendar.MONTH) + 1;
        this.añoCuenta = fecha.get(Calendar.YEAR);
        this.saldo = saldo;
    }

    public void ActualizarFechaCuenta(int año, int mes, int dia) {
        if (mes <= 12 && mes >= 1 && dia <= 31 && dia >= 1) {
            if (dia >= 1 && dia <= DiaMes(mes, año)) {
                this.diaCuenta = año;
                this.mesCuenta = mes;
                this.diaCuenta = dia;
            }
        } else {
            this.diaCuenta = fecha.get(Calendar.DAY_OF_MONTH);
            this.mesCuenta = fecha.get(Calendar.MONTH) + 1;
            this.añoCuenta = fecha.get(Calendar.YEAR);
        }
    }

    public int getAñoCuenta() {
        return this.añoCuenta;
    }

    public int getMesCuenta() {
        return this.mesCuenta;
    }

    public int getDiaCuenta() {
        return this.diaCuenta;
    }

    public void setAñoCuenta(int año) {
        if (año >= this.añoCuenta && año <= fecha.get(Calendar.YEAR)) {
            this.añoCuenta = año;
        } else {
            this.añoCuenta = fecha.get(Calendar.YEAR);
        }
    }

    public void setMesCuenta(int mes) {
        if (mes > 0 && mes < 13) {
            this.mesCuenta = mes;
        } else {
            this.mesCuenta = fecha.get(Calendar.MONTH);
        }
    }

    public void setDiaCuenta(int dia) {
        if (dia > 0 && dia <= DiaMes(this.mesCuenta, this.añoCuenta)) {
            this.diaCuenta = dia;
        } else {
            this.añoCuenta = fecha.get(Calendar.DAY_OF_MONTH);
        }
    }

    private static int DiaMes(int mes, int año) {
        int numDiaMes = 0;
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            numDiaMes = 31;
        } else {
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                numDiaMes = 30;
            } else {
                if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
                    numDiaMes = 29;
                } else {
                    numDiaMes = 28;
                }
            }
        }
        return numDiaMes;
    }

    public Boolean Depositar(double cantidadDepositar) {
        if (cantidadDepositar > 0) {
            this.saldo += cantidadDepositar;
            return true;
        } else {
            return false;
        }
    }

    public Boolean Retirar(double cantidadRetitar) {
        if ((this.saldo + CuentaBancaria.saldoMinimo - cantidadRetitar) > CuentaBancaria.saldoMinimo) {
            saldo -= cantidadRetitar;
            return true;
        } else {
            return false;
        }
    }
    
    public String FechaCuenta() {
        return this.diaCuenta + "-" + this.mesCuenta + "-" + this.añoCuenta;
    }
    
    public String SaldoTotal() {
        double saldoTotal = this.saldo + getSaldoMinimo();
        return saldoTotal + "";
    }
}
