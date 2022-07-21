package clases;

public class Octal {

    private final String[] TablaDeConversion = {"000", "001", "010", "011", "100", "101", "110", "111"};
    private final char[] NumHexadecimal = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private String nOctal;

    public Octal(String nOctal) {
        this.nOctal = nOctal;
    }

    public String OctalABinario() {
        String resultado = "";

        String[] octal = this.nOctal.split(",");

        resultado += "Comparar cada dígito octal con su equivalente en binario";

        for (int i = 0; i < octal[0].length(); i++) {
            resultado += "\n Dígito " + octal[0].charAt(i) + "= " + TablaDeConversion[Integer.parseInt(String.valueOf(octal[0].charAt(i)))];
        }

        if (octal.length > 1) {
            resultado += "\n\nParte fraccionaria";

            for (int i = 0; i < octal[1].length(); i++) {
                resultado += "\n Dígito " + octal[1].charAt(i) + "= " + TablaDeConversion[Integer.parseInt(String.valueOf(octal[1].charAt(i)))];
            }

            resultado += "\n\nAgrupamos los valores de izquierda a derecha\n\nEl valor octal " + this.nOctal + " en binario es: ";
            for (int i = 0; i < octal[0].length(); i++) {
                resultado += TablaDeConversion[Integer.parseInt(String.valueOf(octal[0].charAt(i)))];
            }

            resultado += ",";

            for (int i = 0; i < octal[1].length(); i++) {
                resultado += TablaDeConversion[Integer.parseInt(String.valueOf(octal[1].charAt(i)))];
            }

            return resultado;
        }

        resultado += "\n\nAgrupamos los valores de izquierda a derecha\nEl valor octal " + this.nOctal + " en binario es: ";
        for (int i = 0; i < octal[0].length(); i++) {
            resultado += TablaDeConversion[Integer.parseInt(String.valueOf(octal[0].charAt(i)))];
        }

        return resultado;
    }

    public String OctalADecimal() {
        String resultado = "Multiplicamos cada dígito octal mediante potencias de base 8 desde 0 de derecha a izquierda";

        String[] octal = this.nOctal.split(",");

        int n = 0;
        double suma = 0;

        for (int i = octal[0].length() - 1; i >= 0; i--) {
            resultado += "\n8^" + n + "*" + octal[0].charAt(i) + " = " + (Math.pow(8, n) * Integer.parseInt(String.valueOf(octal[0].charAt(i))));
            n++;
        }

        if (octal.length > 1) {

            resultado += "\n\nParte Fraccionaria\nMultiplicamos mediante potencias de base 8 de izquierda a derecha";
            n = 1;
            for (int i = 0; i < octal[1].length(); i++) {
                resultado += "\n8^-" + n + "*" + octal[1].charAt(i) + " = " + ((1 / Math.pow(8, n)) * Integer.parseInt(String.valueOf(octal[1].charAt(i))));
                n++;
            }

            n = 1;

            for (int i = 0; i < octal[1].length(); i++) {
                suma += (1 / Math.pow(8, n)) * Integer.parseInt(String.valueOf(octal[1].charAt(i)));
                n++;
            }
        }

        n = 0;
        for (int i = octal[0].length() - 1; i >= 0; i--) {
            suma += (Math.pow(8, n) * Integer.parseInt(String.valueOf(octal[0].charAt(i))));
            n++;
        }

        resultado += "\n\nSumamos todos los valores de las multiplicaciones\n\n" + "El valor octal " + this.nOctal + " en decimal es: " + suma;
        return resultado;
    }

    private String[] OctalADecimal(String[] octal) {
        int n = 0;
        double suma = 0;
        double sumaF = 0;
        String[] decimal = new String[2];
        decimal[0] = "";
        decimal[1] = "";

        if (octal.length > 1) {
            n = 1;

            for (int i = 0; i < octal[1].length(); i++) {
                sumaF += (1 / Math.pow(8, n)) * Integer.parseInt(String.valueOf(octal[1].charAt(i)));
                n++;
            }
            decimal[1] = String.valueOf(sumaF);
        }

        n = 0;
        for (int i = octal[0].length() - 1; i >= 0; i--) {
            suma += (Math.pow(8, n) * Integer.parseInt(String.valueOf(octal[0].charAt(i))));
            n++;
        }
        decimal[0] = String.valueOf(suma);

        return decimal;
    }

    public String OctalAHexadecimal() {

        String resultado = "";
        String[] octal = this.nOctal.split(",");
        String[] decimal = OctalADecimal(octal);
        String valor = "";

        resultado += "Transformamos el valor octal en decimal: ";
        resultado += Double.parseDouble(decimal[0]) + Double.parseDouble(decimal[1]) + "\n\nRealizamos diviciones sucesivas entre 16\n\nParte entera\n";

        int res;
        int entero = (int) Double.parseDouble(decimal[0]);
        double fraccionario = 0;

        while (entero != 0) {
            res = entero % 16;
            resultado += "Cociente: " + entero / 16 + " Residuo: " + res + " Equivalente: " + this.NumHexadecimal[res] + "\n";
            entero = entero / 16;
        }

        entero = (int) Double.parseDouble(decimal[0]);
        while (entero != 0) {
            res = entero % 16;
            valor = this.NumHexadecimal[res] + valor;
            entero = entero / 16;
        }

        if (!decimal[1].equals("")) {
            double aux = Double.parseDouble(decimal[1]);
            resultado += "\nParte Fraccionaria\n\nMultiplicamos la parte fraccionara por 16 y agrupamos\n";
            for (int i = 0; i < 4; i++) {
                fraccionario = aux;
                res = (int) (fraccionario * 16);
                resultado += fraccionario + "*16 = " + (fraccionario * 16) + "  equivalente: " + this.NumHexadecimal[res] + "\n";
                aux = fraccionario * 16 - res;
                if (aux == 0) {
                    break;
                }
            }

        }

        resultado += "\nEl valor octal " + this.nOctal + " en hexadecimal es: " + valor;

        if (!decimal[1].equals("")) {
            double aux = Double.parseDouble(decimal[1]);
            resultado += ",";
            for (int i = 0; i < 4; i++) {
                fraccionario = aux;
                res = (int) (fraccionario * 16);
                resultado += this.NumHexadecimal[res];
                aux = fraccionario * 16 - res;
                if (aux == 0) {
                    break;
                }
            }

        }

        return resultado;
    }

    public void setnOctal(String nOctal) {
        this.nOctal = nOctal;
    }
}
