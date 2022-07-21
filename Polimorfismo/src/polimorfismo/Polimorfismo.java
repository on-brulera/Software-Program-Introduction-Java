/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import pol.VehiculoCamioneta;

/**
 *
 * @author tvo
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Vehiculo Vehiculos[] = new Vehiculo[4];

        Vehiculos[0] = new Vehiculo("ICE-081", "Chevrolet", "A89");
        Vehiculos[1] = new VehiculoTurismo(2, "UYT-547", "Hino", "E478");
        Vehiculos[2] = new VehiculoDeportivo(500, "IBA-4784", "Audi", "E7845");
        Vehiculos[3] = new VehiculoFurgoneta(2000, "POI-4784", "Dayota", "V78");

//        Vehiculos[0].marca="xyz";
        
        for (Vehiculo vehiculos : Vehiculos) {
            System.out.println(vehiculos);
            System.out.println("");
           

        }
        vehiculo2 ve;
        ve=new vehiculo2(3,"e","r","c","t");
        System.out.println("");
        System.out.println(ve);
        
        VehiculoCamioneta Vc;
        Vc=new VehiculoCamioneta(0, "netw", "mazda", "v78");
        System.out.println(Vc);
        System.out.println(Vc.matricula);
        System.out.println(Vc.modelo);
        System.out.println(Vc.getMarca());
        
        pol.Prueba p;
        p=new pol.Prueba();
        p.Practica();
        
//        System.out.println(ve instanceof Object);
//        System.out.println(ve instanceof Vehiculo);
//        System.out.println(ve instanceof VehiculoFurgoneta);
//        System.out.println(ve instanceof vehiculo2);
//ve.TipoObjeto(Vehiculos[3]);
        
        
        
//        for (int i = 0; i < Vehiculos.length; i++) {
//            System.out.println("Vehiculo " + i + "es vehiculo" + (Vehiculos[i] instanceof Vehiculo));
//            System.out.println("Vehiculo " + i + "es vehiculo" + (Vehiculos[i] instanceof VehiculoDeportivo));
//            System.out.println("Vehiculo " + i + "es vehiculo" + (Vehiculos[i] instanceof VehiculoFurgoneta));
//            System.out.println("Vehiculo " + i + "es vehiculo" + (Vehiculos[i] instanceof VehiculoFurgoneta));
//
//        }
//        System.out.println(((VehiculoTurismo) Vehiculos[1]).getNumPuertas());
    }

}
