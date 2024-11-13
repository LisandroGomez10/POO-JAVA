/**
 * Clase abstracta Etiqueta que representa una etiqueta con un costo
 * asociado. Debe ser extendida por clases concretas que definan 
 * su tipo y precio.
 * 
 * @author Lisandro Gomez Hertler
 * @version 20/10/2024
 */
public abstract class Etiqueta {
   
    private double costo;

    /**
     * Constructor que inicializa la etiqueta con un costo especificado.
     * 
     * @param p_costo Costo de la etiqueta.
     */
    public Etiqueta(double p_costo) {
        this.setCosto(p_costo);
    }

    /**
     * Devuelve el costo de la etiqueta.
     * 
     * @return Costo de la etiqueta.
     */
    public double getCosto() {
        return this.costo;
    }

    private void setCosto(double p_costo) {
        this.costo = p_costo;
    }

    /**
     * Método abstracto que debe ser implementado por las subclases
     * para calcular el precio de la etiqueta en función de un
     * parámetro específico.
     * 
     * @param p_precio Parámetro que se utiliza para calcular el precio.
     * @return Precio calculado de la etiqueta.
     */
    public abstract double precio(int p_precio);

    /**
     * Representa la información de la etiqueta como una cadena.
     * 
     * @return Representación en cadena de la etiqueta.
     */
    public String toString() {
        return "Tipo: " + tipo() + " - Costo: " + this.getCosto();     
    }

    /**
     * Método abstracto que debe ser implementado por las subclases
     * para devolver el tipo de etiqueta.
     * 
     * @return Tipo de etiqueta como una cadena.
     */
    protected abstract String tipo(); 
}
