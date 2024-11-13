/**
 * La clase {@code Punto} representa un punto en el plano cartesiano con coordenadas X e Y.
 * Proporciona métodos para modificar su posición y obtener sus coordenadas.
 *
 * @author Gomez Hertler Lisandro
 * @version 21/8/24
 * 
 */
public class Punto {
    private double x;
    private double y;

    /**
     * Constructor sin parámetros que inicializa el punto en el origen (0.0, 0.0).
     */
    public Punto() {
        this.setX(0.0);
        this.setY(0.0);
    }

    /**
     * Constructor que inicializa el punto con las coordenadas X e Y proporcionadas.
     *
     * @param p_x La coordenada X del punto.
     * @param p_y La coordenada Y del punto.
     */
    public Punto(double p_x, double p_y) {
        setX(p_x);
        setY(p_y);
    }
    
    /**
     * Establece la coordenada X del punto.
     *
     * @param p_x La nueva coordenada X del punto.
     */
    private void setX(double p_x) {
        this.x = p_x;
    }
    
    /**
     * Establece la coordenada Y del punto.
     *
     * @param p_y La nueva coordenada Y del punto.
     */
    private void setY(double p_y) {
        this.y = p_y;
    }
    
    /**
     * Obtiene la coordenada X del punto.
     *
     * @return La coordenada X del punto.
     */
    public double getX() {
        return this.x;
    }
    
    /**
     * Obtiene la coordenada Y del punto.
     *
     * @return La coordenada Y del punto.
     */
    public double getY() {
        return this.y;
    }
    
    /**
     * Desplaza el punto por un desplazamiento dado en las direcciones X e Y.
     *
     * @param p_dx El desplazamiento en la coordenada X.
     * @param p_dy El desplazamiento en la coordenada Y.
     */
    public void desplazar(double p_dx, double p_dy) {
        this.setX(this.getX() + p_dx);
        this.setY(this.getY() + p_dy);
    }

    /**
     * Obtiene las coordenadas del punto en formato de cadena.
     *
     * @return Una cadena que representa las coordenadas del punto en el formato "(X, Y)".
     */
    public String coordenadas() {
        return "(" + this.getX() + ", " + this.getY() + ")";
    }
    
    public double calcularDistancia(Punto otro) {
        double dx = this.x - otro.x;
         double dy = this.y - otro.y;
         return Math.sqrt(dx * dx + dy * dy);
    }
    
    
    
    /**
     * Muestra en la consola la información del punto, incluyendo sus coordenadas X e Y.
     */
    public void mostrar() {
        System.out.println("Punto. X: " + this.getX() + 
        ", Y: " + this.getY());
    }
}
