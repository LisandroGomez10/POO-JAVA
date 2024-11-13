/**
 * Clase Renglon que representa un item dentro de un pedido,
 * incluyendo la cantidad, el importe y la etiqueta asociada.
 * 
 * @author Lisandro Gomez Hertler
 * @version 20/10/2024
 */
public class Renglon {
    
    private int cantidad;
    private double importe;
    private Etiqueta item;

    /**
     * Constructor que inicializa un renglon con la cantidad,
     * importe y etiqueta especificados.
     * 
     * @param p_cantidad Cantidad de items.
     * @param p_importe Importe total del renglon.
     * @param p_item Etiqueta asociada al renglon.
     */
    public Renglon(int p_cantidad, double p_importe, Etiqueta p_item) {
        this.setCantidad(p_cantidad);    
        this.setImporte(p_importe);
        this.setEtiqueta(p_item);
    }

    /**
     * Devuelve la cantidad de items en el renglon.
     * 
     * @return Cantidad de items.
     */
    public int getCantidad() {
        return this.cantidad;
    }

    private void setCantidad(int p_cantidad) {
        this.cantidad = p_cantidad;
    }

    /**
     * Devuelve el importe total del renglon.
     * 
     * @return Importe total.
     */
    public double getImporte() {
        return this.importe;
    }

    private void setImporte(double p_importe) {
        this.importe = p_importe;
    }

    /**
     * Devuelve la etiqueta asociada al renglon.
     * 
     * @return Etiqueta del renglon.
     */
    public Etiqueta getEtiqueta() {
        return this.item;
    }

    private void setEtiqueta(Etiqueta p_item) {
        this.item = p_item;
    }

    /**
     * Muestra los detalles del renglon en la consola.
     */
    public void mostrar() {
        System.out.println(this.getCantidad() + " " + this.getEtiqueta().toString());
    }
}
