package banco;

public class Banco {

    public static void main(String[] args) {
        
        CuentaBancaria c1, c2;
                
        c1 = new CuentaBancaria("Henry Ramírez", 23, 1, 2002, 50);

        System.out.println(c1.DatosCuenta());

        c2 = new CuentaBancaria("Ändres Burbano", 10, 10, 2010, 100);
                
        System.out.println(c2.DatosCuenta());
        
        CuentaBancaria.setSaldoMinimo(9.99);
        
        c1.Depositar(12.50);
        
        System.out.println(c1.DatosCuenta());
        
        c2.Retirar(1.99);
        
        System.out.println(c2.DatosCuenta());
    }
}
