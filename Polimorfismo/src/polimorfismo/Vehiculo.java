/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author tvo
 */
public class Vehiculo {

    public String matricula;
    private String marca;
    protected String modelo;

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    protected String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    public String mostrarDatos(){
        
        return "padre:\nMatricula "+matricula+"\nMarca "+marca+"\nModelo "+modelo;
    }

    @Override
    public String toString() {
        return "padre:\nMatricula "+matricula+"\nMarca "+marca+"\nModelo "+modelo;
    }
   

}
