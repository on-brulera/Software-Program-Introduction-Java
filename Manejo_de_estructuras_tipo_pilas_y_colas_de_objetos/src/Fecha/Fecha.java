/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fecha;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author ALEXIS
 */
public class Fecha implements Serializable {

    Calendar calen = Calendar.getInstance();
    private int dia;
    private int mes;
    private int año;

    public Fecha() {
        dia = calen.get(Calendar.DATE);
        mes = calen.get(Calendar.MONTH) + 1;
        año = calen.get(Calendar.YEAR);
    }

    public Fecha(int año) {
        this.dia = 1;
        this.mes = 1;
        this.año = año;
    }

    public Fecha(int año, int mes) {
        this.dia = 1;
        this.mes = mes;
        this.año = año;
    }

    public Fecha(int año, int mes, int dia) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAño() {
        return this.año;
    }

    public boolean AñoB() {

        if (año % 4 == 0) {
            if (año % 100 == 0) {
                if (año % 400 == 0) {
                    return true;
                } else {
                    return false;

                }
            } else {
                return true;
            }
        } else {
            return false;

        }
    }

    public int DiasMes() {
        if (mes == 2) {
            if (AñoB() == true) {
                return 29;
            } else {
                return 28;
            }
        }
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            return 31;
        } else {
            return 30;
        }
    }

    public void IncrementaDia(int cant) {
        dia += cant;
        while (dia > DiasMes()) {
            dia -= DiasMes();
            mes++;
            if (mes == 13) {
                mes = 1;
                año++;
            }
        }
    }

    public void DecrementoDia(int cant) {
        dia -= cant;
        while (dia < 1) {
            mes--;
            if (mes == 0) {
                mes = 12;
                año--;
            }

            dia = DiasMes() + dia;
        }
    }

    private String Mes_letras() {
        if (this.mes == 1) {
            return "Ene";
        }
        if (this.mes == 2) {
            return "Feb";
        }
        if (this.mes == 3) {
            return "Mar";
        }
        if (this.mes == 4) {
            return "Abr";
        }
        if (this.mes == 5) {
            return "May";
        }
        if (this.mes == 6) {
            return "Jun";
        }
        if (this.mes == 7) {
            return "Jul";
        }
        if (this.mes == 8) {
            return "Ago";
        }
        if (this.mes == 9) {
            return "Sep";
        }
        if (this.mes == 10) {
            return "Oct";
        }
        if (this.mes == 11) {
            return "Nov";
        } else {
            return "Dic";
        }

    }

    public Fecha Edad(int año, int mes, int dia) {
        if (Comparar(año, mes, dia) <= 0) {
            if (this.dia > dia) {
                dia += 30;
                mes--;
            }
            if (this.mes > mes) {
                mes += 12;
                año--;
            }
            return new Fecha(año - this.año, mes - this.mes, dia - this.dia);
        }
        return null;
    }

    public Fecha Edad(Fecha f) {
        return Edad(f.año, f.mes, f.dia);
    }

    public Fecha Edad() {
        return Edad(calen.get(Calendar.YEAR), calen.get(Calendar.MONTH) + 1, calen.get(Calendar.DATE));
    }

    public String toString() {

        return "Dias: " + dia + " Mes: " + Mes_letras() + " Año: " + año;

    }

    public int Comparar() {

        return Comparar(calen.get(Calendar.YEAR), calen.get(Calendar.MONTH) + 1, calen.get(Calendar.DATE));
    }

    public int Comparar(int año, int mes, int dia) {
        if (this.año == año && this.mes == mes && this.dia == dia) {
            return 0;
        }
        if (this.año > año) {
            return 1;
        }
        if (this.año == año && this.mes > mes) {
            return 1;
        }
        if (this.año == año && this.mes == mes && this.dia > dia) {
            return 1;
        }
        return -1;

    }

    public int Comparar(Fecha fecha) {
        return Comparar(fecha.año, fecha.mes, fecha.dia);
    }

}
