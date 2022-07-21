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
public class VehiculoTurismo extends Vehiculo {

    private int numPuertas;

    public VehiculoTurismo(int numPuertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.numPuertas = numPuertas;

    }

    public int getNumPuertas() {
        return numPuertas;
    }

//    @Override
    public String mostrarDatos() {
        return "hijaT:\nMatricula " + matricula + "\nMarca "
                + getMarca() + "\nModelo " + modelo
                + "\nNumero de Puertas " + numPuertas;

    }
    @Override
    public String toString() {
        return mostrarDatos();
    }
}
