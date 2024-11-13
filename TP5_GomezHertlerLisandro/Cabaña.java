/**
 * Clase Cabaña que extiende de Alojamiento y representa el alquiler de una cabaña.
 * Proporciona métodos para calcular el costo del alojamiento, contar el tipo de alojamiento y liquidar el pago.
 * 
 * @author Lisandro Gomez Hertler
 * @version 20/10/2024
 */
public class Cabaña extends Alojamiento {
    
    private int nroHabitaciones;
    
    /**
     * Constructor de la clase Cabaña.
     * 
     * @param p_nroHabitaciones Número de habitaciones en la cabaña.
     * @param p_nombre Nombre de la cabaña.
     * @param p_precioBase Precio base por día de alojamiento.
     * @param p_diasAlquiler Número de días de alquiler.
     */
    public Cabaña(int p_nroHabitaciones, String p_nombre, double p_precioBase, int p_diasAlquiler) {
        super(p_nombre, p_precioBase, p_diasAlquiler);
        this.setNroHabitaciones(p_nroHabitaciones);
    }

    /**
     * Obtiene el número de habitaciones de la cabaña.
     * 
     * @return Número de habitaciones.
     */
    public int getNroHabitaciones() {
        return this.nroHabitaciones;
    }
    
    /**
     * Establece el número de habitaciones de la cabaña.
     * 
     * @param p_nroHabitaciones Número de habitaciones.
     */
    private void setNroHabitaciones(int p_nroHabitaciones) {
        this.nroHabitaciones = p_nroHabitaciones;
    }
    
    /**
     * Calcula el costo total del alojamiento en la cabaña basado en el número de habitaciones y la cantidad de días de alquiler.
     * 
     * @return El costo total del alojamiento.
     */
    public double costo() { 
        return super.costo() + (this.getNroHabitaciones() * 30 * this.getDiasAlquiler());
    }
    
    /**
     * Cuenta el número de alojamientos del tipo especificado.
     * 
     * @param p_alojamiento Tipo de alojamiento a contar.
     * @return El número de alojamientos que coinciden con el tipo especificado.
     */
    public int contar(String p_alojamiento) {
        int contador = 0;
        if (p_alojamiento.equalsIgnoreCase("Cabaña")) {
            contador++;
        }
        return contador;
    }
    
    /**
     * Realiza la liquidación del alojamiento, mostrando la información de la cabaña y el costo total.
     */
    public void liquidar() {
        super.liquidar();
        System.out.println("Cabaña con " + this.getNroHabitaciones() + " habitaciones");
        System.out.println("Total: ---> $" + (this.costo() + this.costoServicios()));
    }
    
}
