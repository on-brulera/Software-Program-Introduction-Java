/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poli;

import polimorfismo.Vehiculo;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class testintg {

    Vehiculo v1;

    public testintg(){

        v1 = new Vehiculo("XYZ", "Chino", "");
        System.out.println(v1.matricula);
        
    }
}
