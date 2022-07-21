package appfigurasgeometricas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class AppFigurasGeometricas {

    public static void main(String[] args) throws ClassNotFoundException {

        File dato1;

        Cuadrado c1;
        Cuadrado c2;
        Cuadrado c3;
        
        Cuadrado auxiliar;
        
        Vector vector = new Vector();
       
        ObjectOutputStream oss;
        ObjectInputStream ois;
        
        dato1 = new File("E:\\Cuadrados");
        
        c1 = new Cuadrado(3);
        c2 = new Cuadrado(4, 0, 0);
        c3 = new Cuadrado(5, 1, 1);
       
        
         vector.add(c1);
         vector.add(c2);
         vector.add(c3);
        
        try {
            oss = new ObjectOutputStream(new FileOutputStream(dato1));
            oss.writeObject(vector);
            oss.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        
        try {
            ois = new ObjectInputStream(new FileInputStream(dato1));
            vector = (Vector) ois.readObject();
            ois.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        
        int a = vector.size();
        System.out.println("elementos guardados: " + a );
        for (int i = 0; i < a; i++) {
            auxiliar = (Cuadrado) vector.get(i);
            System.out.println(auxiliar.Imprimir());
        }
    }
}
