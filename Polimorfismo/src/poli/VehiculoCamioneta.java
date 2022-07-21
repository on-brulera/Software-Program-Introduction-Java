/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poli;

import polimorfismo.*; // importa todo public

/**
 *
 * @author tvo
 */
public class VehiculoCamioneta extends Vehiculo {

    private int carga;

    public VehiculoCamioneta(int carga, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public  int getCarga() {
        return carga;
    }
    
    @Override
    public  String mostrarDatos(){
        return "hijadehija:\nMatricula "+matricula+"\nMarca "+ this.getMarca()+"\nModelo "+modelo+"\nCarga "+carga;
        
    }
    @Override
    public  String toString() {
        return mostrarDatos();
    }

}
