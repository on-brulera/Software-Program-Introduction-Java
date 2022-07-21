/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Jairo Perez
 */
public class vehiculo2 extends VehiculoFurgoneta{
    String color;
    public vehiculo2(int carga, String matricula, String marca, String modelo,String color){
        super( carga,  matricula, marca,  modelo);
        this.color=color;
    }
     @Override
    public  String mostrarDatos(){
        return "hijaF:\nMatricula "+matricula+"\nMarca "+getMarca()+"\nModelo "+modelo+"\nCarga ";
        
    }
    public void TipoObjeto(Object objeto){
        System.out.println("Es objeto " +(objeto instanceof Object));
        System.out.println("Es vehivulo " +(objeto instanceof Vehiculo));
        System.out.println("Es vehiculoDeportivo " +(objeto instanceof VehiculoDeportivo));
        System.out.println("Es vehiculofurgoneta " +(objeto instanceof VehiculoFurgoneta));
        System.out.println("Es vehiculoturismo " +(objeto instanceof VehiculoTurismo));
        System.out.println("Es vehiculo2 " +(objeto instanceof vehiculo2));
        
    }
    @Override
    public String toString(){
          
        return super.toString()+"\n color "+ color;
    }
}
