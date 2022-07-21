
package appfecha;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {
    public static int contador;
    private int año;
    private int mes;
    private int dia;
    private int bandera;
    Calendar fecha = new GregorianCalendar();
    
    
    public static void pruebaObjetos() {
        contador++;
        System.out.println(contador);
    }

    public Fecha() {
        this.año = fecha.get(Calendar.YEAR);
        this.mes = fecha.get(Calendar.MONTH) + 1;
        this.dia = fecha.get(Calendar.DAY_OF_MONTH);
        pruebaObjetos();
    }

    public Fecha(int año, int mes, int dia) {
        setAño(año);
        setMes(mes);
        setDia(dia);
        bandera = 2;
        pruebaObjetos();
    }

    public void Validar() {
        this.año = 0;
        this.mes = 0;
        this.dia = 0;
    }

    public void setAño(int año) {
        if (año >= 0) {
            this.año = año;
        } else {
            Validar();
        }
    }

    public int getAño() {
        return this.año;
    }

    public void setMes(int mes) {
        if (bandera != 2) {
            if (mes > 0 && mes < 13) {
                this.mes = mes;
            } else {
                Validar();
            }
        }
    }

    public int getMes() {
        return this.mes;
    }

    public void setDia(int dia) {
        if (bandera != 2) {
            if (dia > 0 && dia <= DiaMes(this.mes)) {
                this.dia = dia;
            } else {
                Validar();
            }
        }
    }

    public int getDia() {
        return this.dia;
    }

    public boolean Bisiesto(int año) {
        if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int DiaMes(int mes) {
        int numDiaMes = 0;
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            numDiaMes = 31;
        } else {
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                numDiaMes = 30;
            } else {
                if (Bisiesto(this.año) == true) {
                    numDiaMes = 29;
                } else {
                    numDiaMes = 28;
                }
            }
        }
        return numDiaMes;
    }

    public void IncrementaDia() {
        this.dia++;
        if (this.dia == DiaMes(this.mes) + 1) {
            if (this.mes == 12) {
                this.dia = 1;
                this.mes = 1;
                this.año += 1;
            } else {
                this.dia = 1;
                this.mes += 1;
            }
        }
    }

    public void IncrementaDia(int numDiaIncrementar) {
        while (numDiaIncrementar != 0) {
            this.dia++;
            numDiaIncrementar--;
            if (this.dia == DiaMes(this.mes) + 1) {
                if (this.mes == 12) {
                    this.dia = 1;
                    this.mes = 1;
                    this.año += 1;
                } else {
                    this.dia = 1;
                    this.mes += 1;
                }
            }
        }
    }

    public void DecrementaDia() {
        this.dia--;
        if (this.dia == 0) {
            if (this.mes == 1) {
                this.dia = 31;
                this.mes = 12;
                this.año -= 1;
            } else {
                this.mes -= 1;
                this.dia = DiaMes(this.mes);
            }
        }
    }

    public void DecrementaDia(int numDiaDecrementar) {
        while (numDiaDecrementar != 0) {
            numDiaDecrementar--;
            this.dia--;
            if (this.dia == 0) {
                if (this.mes == 1) {
                    this.mes = 12;
                    this.dia = 31;
                    this.año -= 1;
                } else {
                    this.mes -= 1;
                    this.dia = DiaMes(this.mes);
                }
            }
        }
    }

    public int Comparar() {
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH) + 1;
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        return Comparar(año, mes, dia);
    }

    public int Comparar(int año, int mes, int dia) {
        if (año > this.año) {
            return 1;
        } else {
            if (año < this.año) {
                return -1;
            } else {
                if (mes > this.mes) {
                    return 1;
                } else {
                    if (mes < this.mes) {
                        return -1;
                    } else {
                        if (dia > this.dia) {
                            return 1;
                        } else {
                            if (dia < this.dia) {
                                return -1;
                            } else {
                                return 0;
                            }
                        }
                    }
                }
            }
        }
    }

    public int Comparar(Fecha fechaComparar) {
        int año = fechaComparar.getAño();
        int mes = fechaComparar.getMes();
        int dia = fechaComparar.getDia();
        return Comparar(año, mes, dia);
    }

    public String Imprimir() {
        return this.dia + "/" + this.mes + "/" + this.año;
    }

    public String Imprimir(boolean dato) {
        String[] NombreMes = {"Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic"};
        if (dato == true) {
            return this.dia + "-" + this.mes + "-" + this.año;
        } else {
            return this.dia + "/" + NombreMes[this.mes - 1] + "/" + this.año;
        }
    }
}
