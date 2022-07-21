/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pol;

/**
 *
 * @author Jairo Perez
 */
public class Prueba {
    public void Practica(){
        VehiculoCamioneta Cv;
        Cv=new VehiculoCamioneta(10, "nueva m", "chevrolet", "2020");
        System.out.println(Cv);
        System.out.println(Cv.matricula);
//        System.out.println(Cv.modelo);  // nivel de acceso protegido
        System.out.println(Cv.getMarca());
    }
    
    
}
