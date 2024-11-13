/**
 * Clase Servicio que representa un servicio asociado a un alojamiento.
 * Contiene información sobre la descripción del servicio y su precio.
 * 
 * @author Lisandro Gomez Hertler
 * @version 20/10/2024
 */
public class Servicio {
    
    private String descripcion;
    private double precio;
    
    /**
     * Constructor de la clase Servicio.
     * 
     * @param p_descripcion Descripción del servicio.
     * @param p_precio Precio del servicio.
     */
    public Servicio(String p_descripcion, double p_precio) {
        this.setDescripcion(p_descripcion);
        this.setPrecio(p_precio);
    }

    /**
     * Obtiene la descripción del servicio.
     * 
     * @return Descripción del servicio.
     */
    public String getDescripcion() {
        return this.descripcion;
    }
    
    /**
     * Obtiene el precio del servicio.
     * 
     * @return Precio del servicio.
     */
    public double getPrecio() {
        return this.precio;
    }
    
    /**
     * Establece la descripción del servicio.
     * 
     * @param p_descripcion Descripción del servicio.
     */
    private void setDescripcion(String p_descripcion) {
        this.descripcion = p_descripcion;
    }
    
    /**
     * Establece el precio del servicio.
     * 
     * @param p_precio Precio del servicio.
     */
    private void setPrecio(double p_precio) {
        this.precio = p_precio;
    }  
}
