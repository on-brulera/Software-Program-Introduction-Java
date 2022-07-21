/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JTextArea;

/**
 *
 * @author Ricky
 */
public class binario {

    private String numero;
    private String resul;
    
    private String proceso = "";

    public binario(String numero) {
        this.numero = numero;
    }

    private int convertBInarioToDecimal(String numero) {
        double aux = 0;
        double base = 2;
        double calculo = 0;

        for (int i = (numero.length() - 1); i >= 0; i--) {
            if (numero.charAt(i) == '1') {
                calculo = calculo + Math.pow(base, aux);
            }
            aux++;
        }
        return (int) calculo;
    }

    public void toOctal() {
        String datoBinario = getNumero();//Numero a trabajar
        String datoEntero = "";
        String datoDecimal = "";
        String re = "";
        int aux = 0;

        //Primera parte: Comprobar si hay la "," para sacar la parte entreray cual es la parte decimal         System.out.println("dato binario: " + datoBinario);
        int co = datoBinario.indexOf(",");//Comprovar si hay coma,se obtiene la posicion
       
        if (co > -1) {
            //Sacar solo el entero
            while (datoBinario.charAt(aux) != ',' && aux <= datoBinario.length()) {
                datoEntero = datoEntero+ datoBinario.charAt(aux) ;
                aux++;
            }

            //Sacar solo el decimal
            for (int i = co + 1; i < datoBinario.length(); i++) {
                datoDecimal = datoDecimal + datoBinario.charAt(i);
            }
        } else {
            datoEntero = datoBinario;
        }

        System.out.println("Dato entero: " + datoEntero);

        //Completar los ceros
        if (datoEntero.length() % 3 != 0) {
            int c = ((((datoEntero.length() / 3) + 1) * 3) - datoEntero.length()) + datoEntero.length();
            aux = (((datoEntero.length() / 3) + 1) * 3) - datoEntero.length();

            for (int i = 0; i < aux; i++) {
                datoEntero = "0" + datoEntero;
            }
        }
        if (datoDecimal.length() % 3 != 0) {
            int c = ((((datoDecimal.length() / 3) + 1) * 3) - datoDecimal.length()) + datoDecimal.length();
            aux = (((datoDecimal.length() / 3) + 1) * 3) - datoDecimal.length();

            for (int i = 0; i < aux; i++) {
                datoDecimal = datoDecimal + "0";
            }
        }
        System.out.println("Dato decimal: " + datoDecimal);

        //Convierte a octal cgiendo en 3 en 3
        aux = 0;
        String a = "";
        if (co > -1) {
            //Para el entero
            for (int i = (datoEntero.length() - 1); i >= 0; i--) {
                a = datoEntero.charAt(i) + a;
                aux++;
                if (aux == 3) {
                    aux = 0;
                    re = convertBInarioToDecimal(a) + re;
                    a = "";
                }
            }
            
            re=re+",";
            //Para el decimal
            a="";
            for (int i = 0; i <datoDecimal.length(); i++) {
                a = a +datoDecimal.charAt(i);
                aux++;
                if (aux == 3) {
                    aux = 0;
                    re = re + convertBInarioToDecimal(a);
                    a = "";
                }
            }
            
        }else{
            for (int i = (datoEntero.length() - 1); i >= 0; i--) {
                a = datoEntero.charAt(i) + a;
                aux++;
                if (aux == 3) {
                    aux = 0;
                    re = convertBInarioToDecimal(a) + re;
                    a = "";
                }
            }
        }

        setResul(re);
    }
    

    private String toDecimal() {
        return "";
    }

    private String toHexadecimal() {
        return "";
    }

    
    //Metodos GET y SET
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

   
    public String getResul() {
        return resul;
    }

    public void setResul(String resul) {
        this.resul = resul;
    }

    public String getProceso() {
        return proceso;
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }

}
