/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuenta_Bancaria;

import Fecha.Fecha;

/**
 *
 * @author ALEXIS
 */
public class Cuenta extends Persona  {

    private int saldo;
    public static int saldominimo;
    private Fecha fechacreacion;
 //   private Persona persona;

    public Cuenta(String nombre,int saldo, int dia_creacion,
            int mes_creacion, int año_creacion, int dia_nacimiento, int mes_nacimiento, int año_nacimiento) {
        super(nombre, dia_nacimiento, mes_nacimiento, año_nacimiento);
        if (saldo > saldominimo) {
            this.saldo = saldo;
        } else {
            this.saldo = saldominimo + 1;
        }
        this.fechacreacion = new Fecha(dia_creacion, mes_creacion, año_creacion);
    }
    
    public Cuenta(String nombre,Fecha fecha_creacion,Fecha fecha_nacimiento){
    super(nombre, fecha_nacimiento);
    this.fechacreacion=fecha_creacion;
    }
//------------------------------------------------------------------
    public void setFecha(Fecha fecha) {
        this.fechacreacion = fecha;
    }

    public Fecha getFecha() {
        return this.fechacreacion;
    }
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
    public int getSaldo(){
        return this.saldo;    
    }
    public void setPersona(String nombre){
        super.setNombre(nombre);
    }
    public String getPersona(){
        return super.getNombre();
    }
    

    public int Retiro(int retiro) {

        if (retiro <= this.saldo) {
            this.saldo = this.saldo - retiro;
            if (this.saldo < saldominimo) {
                return 0;
            } else {
                return this.saldo;
            }
        } else {
            return 0;
        }
    }

    public int Deposito(int deposito) {

        if (deposito > 0) {
            this.saldo = this.saldo + deposito;
            return this.saldo;
        } else {
            return 0;
        }

    }

   
   
    public String toString() {
        return "La cuenta de :" + super.getNombre() + "\ncon una fecha de creacion : \n" + this.fechacreacion.toString()+ " \ntiene un saldo de : " + this.saldo + " dolares";
    
    }

}
