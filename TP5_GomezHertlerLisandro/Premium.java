/**
 * Clase que representa una etiqueta de tipo Premium, que extiende 
 * la clase abstracta Etiqueta. Esta etiqueta incluye un costo
 * base y un cargo adicional basado en la cantidad de colores
 * utilizados en su diseño.
 * 
 * @author Lisandro Gomez Hertler
 * @version 20/10/2024
 */
public class Premium extends Etiqueta {
    private int colores;

    /**
     * Constructor que inicializa la etiqueta Premium con la cantidad
     * de colores y un costo base.
     * 
     * @param p_colores Cantidad de colores utilizados en la etiqueta.
     * @param p_costo Costo base de la etiqueta.
     */
    public Premium(int p_colores, double p_costo) {
        super(p_costo);
        this.setColores(p_colores);
    }

    /**
     * Devuelve la cantidad de colores de la etiqueta.
     * 
     * @return Cantidad de colores de la etiqueta.
     */
    public int getColores() {
        return this.colores;
    }

    private void setColores(int p_colores) {
        this.colores = p_colores;
    }

    /**
     * Calcula el precio total de la etiqueta en función de la
     * cantidad solicitada y los colores utilizados, incluyendo
     * el cargo adicional.
     * 
     * @param p_cantidad Cantidad de etiquetas solicitadas.
     * @return Precio total de las etiquetas.
     */
    public double precio(int p_cantidad) {
        double costoTotal = super.getCosto() * p_cantidad;
        return costoTotal + adicional();
    }

    /**
     * Calcula el cargo adicional basado en la cantidad de colores
     * utilizados en la etiqueta.
     * 
     * @return Monto del cargo adicional.
     */
    public double adicional() {
        double adicional = 0.0;
        if (this.getColores() == 1) {
            adicional = 0.0;
        } else if (this.getColores() == 2) {
            adicional = super.getCosto() * 0.05;
        } else if (this.getColores() == 3) {
            adicional = super.getCosto() * 0.07;
        } else if (this.getColores() > 3) {
            adicional = super.getCosto() * 0.07 + (super.getCosto() * 0.03 * (this.getColores() - 3));
        }
        return adicional;
    }

    /**
     * Devuelve el tipo de etiqueta.
     * 
     * @return Tipo de la etiqueta como cadena.
     */
    protected String tipo() {
        return "Premium";
    }

    /**
     * Representa la información de la etiqueta Premium como una cadena.
     * 
     * @return Representación en cadena de la etiqueta Premium.
     */
    public String toString() {
        return "Tipo: Premium - Costo: $" + super.getCosto() + " - Colores: " + this.getColores();
    }
}
