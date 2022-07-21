package fraccionesappvisual;

public class FraccionesAppVisual {

    public static void main(String[] args) {        
        Fracciones f = new Fracciones();
        System.out.println(f.Imprimir());
        f.Multiplicar(63,88);
        System.out.println(f.Imprimir());
        f.setDenominador(-2);
        System.out.println(f.Imprimir());
        
        System.out.println();
        FraccionMixtas fm = new FraccionMixtas(27,-5);
        System.out.println(fm.Imprimir());
        fm.Dividir(0);
        System.out.println(fm.Imprimir());
    }
}
