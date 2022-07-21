package banco;

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
    private String nombrePropietario;
    private int diaNacimientoP;
    private int mesNacimientoP;
    private int añoNacimientoP;
    private int diaCuenta;
    private int mesCuenta;
    private int añoCuenta;    
    private double saldo;

    public CuentaBancaria(String nombrePropietario, int diaNacimientoP, int mesNacimientoP, int añoNacimientoP, double saldo) {

        this.nombrePropietario = nombrePropietario;
        this.diaCuenta = fecha.get(Calendar.DAY_OF_MONTH);
        this.mesCuenta = fecha.get(Calendar.MONTH) + 1;
        this.añoCuenta = fecha.get(Calendar.YEAR);
        setAñoNacimientoP(añoNacimientoP);
        setMesNacimientoP(mesNacimientoP);
        setDiaNacimientoP(diaNacimientoP);
        this.saldo = saldo;
    }
    
    public void setNombrePropietario(String nombre) {
        this.nombrePropietario = nombre;
    }

    public String getNombrePropietario() {
        return this.nombrePropietario;
    }

    public int getAñoCuenta() {
        return this.añoCuenta;
    }
    
    // para cuando se renueva la cuenta: año
    public void setAñoCuenta(int año) {
        if (año >= this.añoCuenta && año <= fecha.get(Calendar.YEAR) ) {
            this.añoCuenta = año;
        } else {
            this.añoCuenta = fecha.get(Calendar.YEAR);
        }
    }
    
    public int getMesCuenta() {
        return this.mesCuenta;
    }        

    // para cuando se renueva la cuenta: mes
    public void setMesCuenta(int mes) {
        if (mes > 0 && mes < 13) {
            this.mesCuenta = mes;
        } else {
            this.mesCuenta = fecha.get(Calendar.MONTH);
        }
    }
            
    public int getDiaCuenta() {
        return this.diaCuenta;
    }
    
    // para cuando se renueve la cuenta: dia
    public void setDiaCuenta(int dia) {
        if (dia > 0 && dia <= diaMes(this.mesCuenta, this.añoCuenta)) {
            this.diaCuenta = dia;
        } else {
            this.añoCuenta = fecha.get(Calendar.DAY_OF_MONTH);
        }
    }

    public int getAñoNacimientoP() {
        return this.añoNacimientoP;
    }

    public void setAñoNacimientoP(int año) {
        if (año > 1900 && año < fecha.get(Calendar.YEAR)) {
            this.añoNacimientoP = año;
        } else {
            this.añoNacimientoP = 2000;
        }
    }
    
    public int getMesNacimientoP() {
        return this.mesNacimientoP;
    }
    
    public void setMesNacimientoP(int mes) {
        if (mes > 0 && mes < 13) {
            this.mesNacimientoP = mes;
        } else {
            this.añoNacimientoP = 1;
        }
    }        

    public int getDiaNacimientoP() {
        return this.diaNacimientoP;
    }
    
    public void setDiaNacimientoP(int dia) {
        if (dia > 0 && dia <= diaMes(this.mesNacimientoP, this.añoNacimientoP)) {
            this.diaNacimientoP = dia;
        } else {
            this.diaNacimientoP = 1;
        }
    }
    
    private int diaMes(int mes, int año) {
        int numDiaMes = 0;
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            numDiaMes = 31;
        } else {
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                numDiaMes = 30;
            } else {
                if (año % 2 == 0 && año % 100 == 0 && año % 400 == 0) {
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

    public String DatosCuenta() {
        return "Propietario: " + nombrePropietario
                + "\nFecha Nacimiento Propietario: " + diaNacimientoP + "-" + mesNacimientoP + "-" + añoNacimientoP
                + "\nFecha Creación Cuenta: " + diaCuenta + "-" + mesCuenta + "-" + añoCuenta
                + "\nSaldo Mínimo: " + saldoMinimo
                + "\nSaldo: " + saldo;
    }
}
