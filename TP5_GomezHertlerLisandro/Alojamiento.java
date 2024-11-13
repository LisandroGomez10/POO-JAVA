import java.util.ArrayList;

/**
 * Clase abstracta Alojamiento que representa un tipo de alojamiento en el sistema.
 * Proporciona métodos para gestionar servicios, calcular costos y liquidar el pago.
 * 
 * @author Lisandro Gomez Hertler
 * @version 20/10/2024
 */
public abstract class Alojamiento {
    
    private String nombre;
    private double precioBase;
    private int diasAlquiler;
    private ArrayList<Servicio> servicios;
    
    /**
     * Constructor de la clase Alojamiento con una lista de servicios.
     * 
     * @param p_nombre Nombre del alojamiento.
     * @param p_precioBase Precio base por día de alojamiento.
     * @param p_diasAlquiler Número de días de alquiler.
     * @param p_servicios Lista de servicios asociados al alojamiento.
     */
    public Alojamiento(String p_nombre, double p_precioBase, int p_diasAlquiler, ArrayList<Servicio> p_servicios) {
        this.setNombre(p_nombre);
        this.setPrecioBase(p_precioBase);
        this.setDiasAlquiler(p_diasAlquiler);
        this.setServicios(p_servicios);
    }
     
    /**
     * Constructor de la clase Alojamiento sin servicios iniciales.
     * 
     * @param p_nombre Nombre del alojamiento.
     * @param p_precioBase Precio base por día de alojamiento.
     * @param p_diasAlquiler Número de días de alquiler.
     */
    public Alojamiento(String p_nombre, double p_precioBase, int p_diasAlquiler) {
        this.setNombre(p_nombre);
        this.setPrecioBase(p_precioBase);
        this.setDiasAlquiler(p_diasAlquiler);
        this.setServicios(new ArrayList<>());
    }
    
    /**
     * Obtiene el nombre del alojamiento.
     * 
     * @return Nombre del alojamiento.
     */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
     * Obtiene el precio base por día de alojamiento.
     * 
     * @return Precio base.
     */
    public double getPrecioBase() {
        return this.precioBase;
    }
    
    /**
     * Obtiene el número de días de alquiler.
     * 
     * @return Número de días de alquiler.
     */
    public int getDiasAlquiler() {
        return this.diasAlquiler;
    }
    
    /**
     * Obtiene la lista de servicios asociados al alojamiento.
     * 
     * @return Lista de servicios.
     */
    public ArrayList<Servicio> getServicios() {
        return this.servicios;
    }
    
    /**
     * Establece el nombre del alojamiento.
     * 
     * @param p_nombre Nombre del alojamiento.
     */
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }
    
    /**
     * Establece el precio base por día de alojamiento.
     * 
     * @param p_precio Precio base.
     */
    private void setPrecioBase(double p_precio) {
        this.precioBase = p_precio;
    }

    /**
     * Establece el número de días de alquiler.
     * 
     * @param p_dias Número de días.
     */
    private void setDiasAlquiler(int p_dias) {
        this.diasAlquiler = p_dias;
    }
    
    /**
     * Establece la lista de servicios asociados al alojamiento.
     * 
     * @param p_servicios Lista de servicios.
     */
    private void setServicios(ArrayList<Servicio> p_servicios) {
        this.servicios = p_servicios;
    }
    
    /**
     * Agrega un servicio a la lista de servicios del alojamiento.
     * 
     * @param p_servicio Servicio a agregar.
     * @return Verdadero si se agregó exitosamente, falso en caso contrario.
     */
    public boolean agregarServicio(Servicio p_servicio) {
        return this.getServicios().add(p_servicio);
    }
    
    /**
     * Quita un servicio de la lista de servicios del alojamiento.
     * 
     * @param p_servicio Servicio a quitar.
     * @return Verdadero si se quitó exitosamente, falso en caso contrario.
     */
    public boolean quitarServicio(Servicio p_servicio) {
        return this.getServicios().remove(p_servicio);
    }
        
    /**
     * Método abstracto que debe implementarse para contar alojamientos del tipo especificado.
     * 
     * @param p_alojamiento Tipo de alojamiento a contar.
     * @return Número de alojamientos que coinciden con el tipo especificado.
     */
    public abstract int contar(String p_alojamiento);

    /**
     * Calcula el costo total del alojamiento basado en el precio base y la cantidad de días de alquiler.
     * 
     * @return Costo total del alojamiento.
     */
    public double costo() {
        return this.getPrecioBase() * this.getDiasAlquiler();
    }
  
    /**
     * Lista los servicios asociados al alojamiento.
     */
    public void listarServicios() {
        for (Servicio servicio : servicios) { 
            System.out.println("Alquiler: " + servicio.getDescripcion() + " " + servicio.getPrecio());  
        }
    }
   
    /**
     * Calcula el costo total de los servicios asociados al alojamiento.
     * 
     * @return Costo total de los servicios.
     */
    public double costoServicios() {
        double total = 0.0; 
        for (Servicio servicio : servicios) {
            total += servicio.getPrecio();
        }
        return total;
    }
    
    /**
     * Realiza la liquidación del alojamiento, mostrando el costo y la lista de servicios.
     */
    public void liquidar() {
        System.out.println("Alojamiento: " + this.getNombre());
        System.out.println("Costo por " + this.getDiasAlquiler() + " días: " + this.costo());
        listarServicios();
    }
    
}
