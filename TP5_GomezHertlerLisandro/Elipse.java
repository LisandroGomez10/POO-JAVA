/**
 * Clase Elipse que representa una elipse geométrica.
 * Extiende la clase FiguraGeometrica e implementa métodos
 * para calcular su superficie y características geométricas.
 * 
 * @author Lisandro Gomez Hertler
 * @version 20/10/2024
 */
public class Elipse extends FiguraGeometrica {
    // Variables de instancia
    private double sEjeMayor;
    private double sEjeMenor;
    private Punto centro;

    /**
     * Constructor de la clase Elipse que inicializa la elipse
     * con un centro y semiejes especificados.
     * 
     * @param p_centro Punto que representa el centro de la elipse.
     * @param p_ejeMayor Longitud del semieje mayor de la elipse.
     * @param p_ejeMenor Longitud del semieje menor de la elipse.
     */
    public Elipse(Punto p_centro, double p_ejeMayor, double p_ejeMenor) {
        this.setCentro(p_centro);
        this.setEjeMayor(p_ejeMayor);
        this.setEjeMenor(p_ejeMenor);
    }
    
    /**
     * Devuelve el centro de la elipse.
     * 
     * @return Punto que representa el centro de la elipse.
     */
    public Punto getCentro() {
        return this.centro;
    }
    
    private void setCentro(Punto p_centro) {
        this.centro = p_centro;
    }
    
    /**
     * Devuelve el semieje mayor de la elipse.
     * 
     * @return Longitud del semieje mayor.
     */
    public double getEjeMayor() {
        return this.sEjeMayor;
    }
    
    private void setEjeMayor(double p_ejeMayor) {
        this.sEjeMayor = p_ejeMayor;
    }
    
    /**
     * Devuelve el semieje menor de la elipse.
     * 
     * @return Longitud del semieje menor.
     */
    public double getEjeMenor() {
        return this.sEjeMenor;
    }
    
    private void setEjeMenor(double p_ejeMenor) {
        this.sEjeMenor = p_ejeMenor;
    }
    
    /**
     * Devuelve el nombre de la figura geométrica.
     * 
     * @return Nombre de la figura, en este caso "******Elipse******".
     */
    public String nombreFigura() {
        return "******Elipse******";    
    }
    
    /**
     * Calcula la superficie de la elipse.
     * 
     * @return Superficie de la elipse.
     */
    public double superficie() {
        return Math.PI * this.getEjeMayor() * this.getEjeMenor();
    }
    
    /**
     * Desplaza la elipse en el plano según los valores dados.
     * 
     * @param p_dx Desplazamiento en el eje x.
     * @param p_dy Desplazamiento en el eje y.
     */
    public void desplazar(double p_dx, double p_dy) {
        this.getCentro().desplazar(p_dx, p_dy);
    }
    
    /**
     * Calcula la distancia entre el centro de esta elipse y otra elipse.
     * 
     * @param otraElipse La otra elipse a comparar.
     * @return Distancia entre los centros de las dos elipses.
     */
    public double distancia(Elipse otraElipse) {
        return Math.sqrt((Math.pow((otraElipse.getCentro().getX() - this.getCentro().getX()), 2)) 
                        + (Math.pow((otraElipse.getCentro().getY() - this.getCentro().getY()), 2)));
    }
    
    /**
     * Compara la superficie de esta elipse con otra elipse
     * y devuelve la elipse de mayor superficie.
     * 
     * @param otraElipse La otra elipse a comparar.
     * @return La elipse de mayor superficie.
     */
    public Elipse elMayor(Elipse otraElipse) {
        if (otraElipse.superficie() < this.superficie()) {
            return this;
        } else {
            return otraElipse;
        } 
    }
    
    /**
     * Muestra las características de la elipse en la consola.
     */
    public void caracteristicas() {
        System.out.println(nombreFigura());
        System.out.println("Centro: " + this.getCentro().coordenadas() + 
                           "\tSemieje Mayor: " + this.getEjeMayor() + 
                           "\tSemieje Menor: " + this.getEjeMenor());
        System.out.println("Superficie: " + String.format("%.2f", this.superficie()));
    }
}
