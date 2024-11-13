/**
 * Clase abstracta FiguraGeometrica que representa una figura geométrica.
 * Define métodos para obtener el nombre de la figura, calcular su superficie
 * y mostrar su información.
 * 
 * @author Lisandro Gomez Hertler
 * @version 20/10/2024
 */
public abstract class FiguraGeometrica {
    
    private Punto origen;
    
    /**
     * Constructor de la clase FiguraGeometrica con un origen especificado.
     * 
     * @param p_origen Punto que representa el origen de la figura.
     */
    public FiguraGeometrica(Punto p_origen) {
        this.setOrigen(p_origen);
    }

    /**
     * Constructor de la clase FiguraGeometrica que inicializa el origen
     * en un nuevo Punto por defecto.
     */
    public FiguraGeometrica() {
        this.setOrigen(new Punto());   
    }
    
    /**
     * Obtiene el punto de origen de la figura.
     * 
     * @return Punto que representa el origen de la figura.
     */
    public Punto getOrigen() {
        return this.origen;
    }
    
    /**
     * Establece el punto de origen de la figura.
     * 
     * @param p_origen Punto que representa el nuevo origen de la figura.
     */
    private void setOrigen(Punto p_origen) {
        this.origen = p_origen;
    }
    
    /**
     * Método abstracto que devuelve el nombre de la figura geométrica.
     * 
     * @return Nombre de la figura.
     */
    public abstract String nombreFigura();
    
    /**
     * Método abstracto que calcula la superficie de la figura geométrica.
     * 
     * @return Superficie de la figura.
     */
    public abstract double superficie();
    
    /**
     * Muestra la información sobre la figura, incluyendo su nombre y superficie.
     */
    public void mostrarSuperficie() {
        System.out.println("*****" + this.nombreFigura() + "*****");
        System.out.println("Superficie : " + String.format("%.2f", superficie()));
    }
}
