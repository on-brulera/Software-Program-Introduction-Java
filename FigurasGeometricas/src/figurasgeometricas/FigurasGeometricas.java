package figurasgeometricas;

public class FigurasGeometricas {

    public static void main(String[] args) {

        System.out.println("CIRCUNFERENCIA");
        Circunferencia c1;
        c1 = new Circunferencia(5);
        System.out.println(c1.Imprimir());
        c1.Mover(-4, -4);
        System.out.println(c1.Imprimir());
        System.out.println("------------------------------------------------------------");

        System.out.println("CUADRADO");
        Cuadrado cd1;
        cd1 = new Cuadrado(10, 5, 5);
        System.out.println(cd1.Imprimir());
        cd1.Mover(-5, -5);
        System.out.println(cd1.Imprimir());
        System.out.println("------------------------------------------------------------");

        System.out.println("RECTÁNGULO");
        Rectangulo r1;
        r1 = new Rectangulo(4, 4);
        System.out.println(r1.Imprimir());
        r1.Mover(3, 3);
        System.out.println(r1.Imprimir());
        System.out.println("------------------------------------------------------------");

        System.out.println("TRIÁNGULO");
        Triangulo t1;
        t1 = new Triangulo(5, -3, 6, 7, 11, 6);
        System.out.println(t1.Imprimir());
        t1.Mover(-2, -2);
        System.out.println(t1.Imprimir());
        System.out.println("------------------------------------------------------------");

        System.out.println("RECTA");
        Recta rt1;
        rt1 = new Recta(-2, -2, 6, 6);
        System.out.println(rt1.Imprimir());
        rt1.Mover(2, 2);
        System.out.println(rt1.Imprimir());
        System.out.println("------------------------------------------------------------");

        System.out.println("ELIPSE");
        Elipse e1;
        e1 = new Elipse(10,10);
        System.out.println(e1.Imprimir());
        e1.Mover(5, 5);
        System.out.println(e1.Imprimir());        
        System.out.println("------------------------------------------------------------");
    }
}
