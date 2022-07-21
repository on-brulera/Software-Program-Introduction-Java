/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuenta_Bancaria;

import Fecha.Fecha;
import java.io.Serializable;

/**
 *
 * @author ALEXIS
 */
 public class Persona implements Serializable{
 
  private String nombre;
  private  Fecha fecha_nacimiento;

  
  
    public Persona(String nombre, Fecha fecha_nacimiento) {
       
        this.nombre = nombre;
        this.fecha_nacimiento=fecha_nacimiento;
    }
    
    
    
    public Persona(String nombre,int dia_nacimiento,int mes_nacimiento,int año_nacimiento){
    this.nombre=nombre;
    this.fecha_nacimiento=new Fecha(dia_nacimiento, mes_nacimiento, año_nacimiento);
    }

    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setEdad(Fecha fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Fecha getEdad() {
        return this.fecha_nacimiento;
    }

    
}
