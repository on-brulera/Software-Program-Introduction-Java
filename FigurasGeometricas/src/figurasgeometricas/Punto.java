package figurasgeometricas;

/**
 * Representa una coordenada (x,y)
 * @author Ramírez Henry
 */
public class Punto {

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
