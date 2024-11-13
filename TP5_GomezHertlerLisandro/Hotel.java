import java.util.ArrayList;

/**
 * Clase Hotel que extiende de Alojamiento y representa el alquiler de una habitación en un hotel.
 * Proporciona métodos para calcular el costo del alojamiento, contar el tipo de alojamiento y liquidar el pago.
 * 
 * @author Lisandro Gomez Hertler
 */
public class Hotel extends Alojamiento {
    
    private String tipoHabitacion;

    /**
     * Constructor de la clase Hotel.
     * 
     * @param p_tipoHabitacion Tipo de habitación (Single o Doble).
     * @param p_nombre Nombre del hotel.
     * @param p_precioBase Precio base por día de alojamiento.
     * @param p_diasAlquiler Número de días de alquiler.
     */
    public Hotel(String p_tipoHabitacion, String p_nombre, double p_precioBase, int p_diasAlquiler) {
        super(p_nombre, p_precioBase, p_diasAlquiler);   
        this.setHabitacion(p_tipoHabitacion);
    }
    
    /**
     * Obtiene el tipo de habitación.
     * 
     * @return Tipo de habitación.
     */
    public String getHabitacion() {
        return this.tipoHabitacion;
    }
    
    /**
     * Establece el tipo de habitación.
     * 
     * @param p_habitacion Tipo de habitación.
     */
    private void setHabitacion(String p_habitacion) {
        this.tipoHabitacion = p_habitacion;
    }
    
    /**
     * Calcula el costo total del alojamiento en el hotel basado en el tipo de habitación y la cantidad de días de alquiler.
     * Si la habitación es "Single", se agrega un costo adicional de 20, de lo contrario, se agrega un costo de 35.
     * 
     * @return El costo total del alojamiento.
     */
    public double costo() {
        if (this.getHabitacion().equalsIgnoreCase("Single")) {
            return (super.getPrecioBase() + 20) * this.getDiasAlquiler();
        } else {
            return (super.getPrecioBase() + 35) * this.getDiasAlquiler();
        } 
    }
    
    /**
     * Cuenta el número de alojamientos del tipo especificado.
     * 
     * @param p_alojamiento Tipo de alojamiento a contar.
     * @return El número de alojamientos que coinciden con el tipo especificado.
     */
    public int contar(String p_alojamiento) {
        int contador = 0;
        if (p_alojamiento.equalsIgnoreCase("Hotel")) {
            contador++;   
        }
        return contador;
    }
    
    /**
     * Realiza la liquidación del alojamiento, mostrando la información del hotel y el costo total.
     */
    public void liquidar() {
        super.liquidar();
        System.out.println("Habitación: " + this.getHabitacion());
        System.out.println("Total: ---> $" + (this.costo() + this.costoServicios()));
    }
    
}
