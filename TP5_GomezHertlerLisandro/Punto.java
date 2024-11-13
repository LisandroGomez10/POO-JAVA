/**
 * La clase Punto representa a un punto geométrico con información
 * como: X (coordenadas en el eje X) y Y (coordenadas en el eje Y).
 * 
 * @author Gomez Hertler Lisandro
 * @version 29/8/2024
 */
public class Punto{
    // instance variables - replace the example below with your own
    private double x;
    private double y;
    private Punto punto;

    /**
     * Constructor para inicializar un objeto de la clase {@code Punto} con coordenadas en X
     * y con coordenadas en Y.
     *
     * @param p_x   Coordenadas en x del punto.
     * @param p_y   Coordenadas en y del punto.
       */
    public Punto(double p_x, double p_y){
        this.setX(p_x);
        this.setY(p_y);
    }
    /**
     * Constructor para inicializar un objeto de la clase {@code Punto} con coordenadas en X 
     * inicializado en cero (0.0) y con coordenadas en Y inicializado en cero (0.0).
       */
    public Punto(){
        this.setX(0.0);
        this.setY(0.0);
    }
    
    /**
     * Establece las coordenadas en X.
     * 
     * @param p_x valor Coordenadas en X.
       */
    private void setX(double p_x){
        this.x = p_x;
    }
    /**
     * Obtiene las coordenadas en X del punto.
     * 
     * @return las coordenadas en X del punto.
       */
    public double getX(){
        return this.x;
    }
    
    /**
     * Establece las coordenadas en Y.
     * 
     * @param p_x valor Coordenadas en Y.
       */
    private void setY(double p_y){
        this.y = p_y;
    }
    /**
     * Obtiene las coordenadas en Y del punto.
     * 
     * @return las coordenadas en Y del punto.
       */
    public double getY(){
        return this.y;
    }
    
    /**
     * Cambia la posición del punto desde (x, y) a (x+dx, y+dy).
     * 
     * @param p_dx desplazamiento en X.
     * @param p_dy desplazamiento en Y.
       */
    public void desplazar(double p_dx, double p_dy){
        this.setX(this.getX()+p_dx);
        this.setY(this.getY()+p_dy);
    }
    
    /**
     * Retorna una cadena con el formato: (X.x, Y.y).
     * 
     * @return una linea de texto.
       */
    public String coordenadas(){
        return "("+this.getX()+", "+this.getY()+")";
    }
    
    /**
     * Calcula la distancia desde él mismo (el objeto que recibe el mensaje) hasta 
     * otro objeto Punto que es recibido como parámetro, utilizando la ecuación de 
     * Pitágoras: C^2 = A^2 + B^2.
     * 
     * @param p_ptoDistante otro objeto Punto.
     * @return la distancia desde el objeto actual hasta el punto pasado como parámetro. 
       */
    public double distanciaA(Punto p_ptoDistante){
        return Math.sqrt((Math.pow((p_ptoDistante.getX()-this.getX()), 2)) + (Math.pow((p_ptoDistante.getY()-this.getY()), 2)));
    }

    /**
     * Muestra por pantalla la información del punto: coordenadas en X y coordenadas en Y.
       */
    public void mostrar(){
        System.out.println("Punto. X: "+this.getX()+", Y: "+this.getY());
        System.out.println(this.coordenadas());
        System.out.println();
    }
}








