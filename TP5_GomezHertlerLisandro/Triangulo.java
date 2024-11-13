/**
 * Clase Triangulo que representa un triángulo geométrico.
 * Extiende la clase FiguraGeometrica y proporciona métodos
 * para calcular su superficie y obtener su nombre.
 * 
 * @author Lisandro Gomez Hertler
 * @version 20/10/2024
 */
public class Triangulo extends FiguraGeometrica {

    private double base;
    private double altura;
    
    /**
     * Constructor de la clase Triangulo que inicializa el triángulo
     * con un punto de origen, base y altura especificados.
     * 
     * @param p_punto Punto que representa el origen del triángulo.
     * @param p_base Base del triángulo.
     * @param p_altura Altura del triángulo.
     */
    public Triangulo(Punto p_punto, double p_base, double p_altura) {
        super(p_punto);   
        this.setBase(p_base);
        this.setAltura(p_altura);
    }
    
    /**
     * Constructor de la clase Triangulo que inicializa el triángulo
     * con un punto de origen por defecto.
     */
    public Triangulo() {
        super(new Punto());
    }
    
    /**
     * Obtiene la base del triángulo.
     * 
     * @return Base del triángulo.
     */
    public double getBase() {
        return this.base;
    }
    
    /**
     * Establece la base del triángulo.
     * 
     * @param p_base Base del triángulo.
     */
    private void setBase(double p_base) {
         this.base = p_base;
    }
    
    /**
     * Obtiene la altura del triángulo.
     * 
     * @return Altura del triángulo.
     */
    public double getAltura() {
        return this.altura;
    }
    
    /**
     * Establece la altura del triángulo.
     * 
     * @param p_altura Altura del triángulo.
     */
    private void setAltura(double p_altura) {
        this.altura = p_altura;
    }
    
    /**
     * Devuelve el nombre de la figura geométrica.
     * 
     * @return Nombre de la figura, en este caso "Triangulo".
     */
    public String nombreFigura() {
        return "Triangulo";
    }
    
    /**
     * Calcula la superficie del triángulo.
     * 
     * @return Superficie del triángulo.
     */
    public double superficie() {
        return (this.getBase() * this.getAltura()) / 2; 
    }
}
