package pruebaappvisual;


public class CoordenadadasRectangulares {
    
    private double x;
    private double y;
    
    public CoordenadadasRectangulares (double x, double y) {
        
        this.x = Math.sin(x);
        this.y = Math.cos(y);
    }
    
    public CoordenadadasRectangulares () {
        this.x = 1;
        this.y = 1;
    }
    
    public void setX(double x) {
        this.x = x;
    }
    
    public void setY(double y) {
        this.y = y;
    }
    
    public double getX() {
        return this.x;
    }
    
    public double getY() {
        return this.y;
    }
    
    public String Coordenada() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
