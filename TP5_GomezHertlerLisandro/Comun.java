 /**
 * Clase que representa una etiqueta de tipo Común, que extiende 
 * la clase abstracta Etiqueta. Esta etiqueta incluye un costo
 * base y un costo adicional (plus) que se suma al precio final
 * calculado en función de la cantidad solicitada.
 * 
 * @author Lisandro Gomez Hertler
 * @version 20/10/2024
 */
public class Comun extends Etiqueta {
    private double plus;

    /**
     * Constructor que inicializa la etiqueta Común con un costo
     * base y un costo adicional.
     * 
     * @param p_costo Costo base de la etiqueta.
     * @param p_plus Costo adicional de diseño de la etiqueta.
     */
    public Comun(double p_costo, double p_plus) {
        super(p_costo);
        this.setPlus(p_plus);
    }

    /**
     * Devuelve el costo adicional (plus) de la etiqueta.
     * 
     * @return Costo adicional de la etiqueta.
     */
    public double getPlus() {
        return this.plus;
    }

    private void setPlus(double p_plus) {
        this.plus = p_plus;
    }

    /**
     * Calcula el precio total de la etiqueta en función de la
     * cantidad solicitada, aplicando descuentos si corresponde.
     * 
     * @param p_cantidad Cantidad de etiquetas solicitadas.
     * @return Precio total de las etiquetas.
     */
    public double precio(int p_cantidad) {
        double costoTotal = p_cantidad * 100;
        double totalConDescuento = costoTotal - descuento(p_cantidad);
        return totalConDescuento + this.getPlus();
    }

    /**
     * Calcula el descuento en función de la cantidad de etiquetas
     * solicitadas.
     * 
     * @param p_cantidad Cantidad de etiquetas solicitadas.
     * @return Monto del descuento aplicado.
     */
    
    private double descuento(int p_cantidad) {
        double descuento = 0.0;
        if (p_cantidad >= 1 && p_cantidad <= 10) {
            descuento = 0.0;
        } else if (p_cantidad >= 11 && p_cantidad <= 50) {
            descuento = 100 * p_cantidad * 0.02; // aplica 2%
        } else if (p_cantidad >= 51 && p_cantidad <= 100) {
            descuento = 100 * p_cantidad * 0.05; // aplica 5%
        } else if (p_cantidad > 100) {
            int unidadesExtra = p_cantidad - 100;
            descuento = 100 * p_cantidad * 0.05 + (100 * unidadesExtra * 0.01); // descuento acumulativo
        }
        return descuento;
    }

    /**
     * Devuelve el tipo de etiqueta.
     * 
     * @return Tipo de la etiqueta como cadena.
     */
    protected String tipo() {
        return "Comun";
    }

    /**
     * Representa la información de la etiqueta Común como una cadena.
     * 
     * @return Representación en cadena de la etiqueta Común.
     */
    public String toString() {
        return "Tipo: Común - Costo: $" + super.getCosto() + " - Diseño: $" + this.getPlus();
    }
}
