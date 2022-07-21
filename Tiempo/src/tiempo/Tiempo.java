package tiempo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Tiempo {

    public static void main(String[] args) {

        Calendar fecha = new GregorianCalendar();

        int respuesta;

        Fecha f1, f2;
        f1 = new Fecha(2002, 1, 23);
        f2 = new Fecha();

        System.out.println("COMPARACIÓN CON LA FECHA DE SISTEMA");
        respuesta = f1.Comparar();
        if (respuesta == 1) {
            System.out.println("la fecha del sistema es mayor");
        } else {
            if (respuesta == -1) {
                System.out.println("la fecha del sistema es menor");
            } else {
                System.out.println("la fecha del sistema y la fecha del objeto son iguales");
            }
        }
        System.out.println("-----------------------------------------------------------------");

        System.out.println("COMPARACIÓN CON UNA FECHA INGRESADA");
        respuesta = f1.Comparar(2002, 2, 25);
        if (respuesta == 1) {
            System.out.println("la fecha ingresada es mayor");
        } else {
            if (respuesta == -1) {
                System.out.println("la fecha ingresada es menor");
            } else {
                System.out.println("la fecha del sistema y la fecha del objeto son iguales");
            }
        }
        System.out.println("-----------------------------------------------------------------");
        System.out.println("COMPARACIÓN CON UN OBJETO TIPO FECHA");
        respuesta = f1.Comparar(f2);
        if (respuesta == 1) {
            System.out.println("La fecha del objeto tipo Fecha f2 es mayor");
        } else {
            if (respuesta == -1) {
                System.out.println("la fecha del objeto tipo Fecha f2 es menor");
            } else {
                System.out.println("la fecha del objeto tipo Fecha f2 y la fecha del objeto Fecha f1 son iguales");
            }
        }
        System.out.println(f2.Imprimir(false));

    }
}
