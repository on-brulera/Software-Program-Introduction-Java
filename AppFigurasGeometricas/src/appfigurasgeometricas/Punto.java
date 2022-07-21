
package appfigurasgeometricas;

public class Punto implements  java.io.Serializable // el objeto Punto va heredar
                                                    //de la clase Serializable
        

//        try {
//    
//        // Serealizar un objeto como como un archivo
//        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Punto.ser"));
//        out.writeObject(object);
//        out.close();
//        
//        //Serealizar un objeto como un array de byte
//        ByteArrayOutputStream bos = new ByteArrayOutputStream();
//        out = new ObjectOutputStream(bos);
//        out.writeObject(object);
//        out.close();
//        
//        // obtener los bytes de serealizacion de objetos 
//        byte[] buf = bos.toByteArray();        
//    } catch () {
//        
//        }
{

    /**
     * Coordenada x
     */
    private int x;
    /**
     * Coordenada y
     */
    private int y;

    /**
     * Metodo Constructor
     *
     * @param x Valor para la coordenada x
     * @param y Valor para la coordenada y
     */
    public Punto(int x, int y) {
        setX(x);
        setY(y);
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return this.y;
    }

    /**
     *
     * @return Regresa la coordenada en formato (x,y)
     */
    public String Coordenada() {
        return "(" + this.x + "," + this.y + ")";
    }
}
