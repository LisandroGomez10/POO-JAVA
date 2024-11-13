/**
 * La clase Localidad representa a la localidad de un paciente,
 * contiene información como: nombre y provincia. Además cuenta con un
 * método mostrar que devuelve una línea de texto.
 * 
 * @author Gomez Hertler Lisandro
 * @version 31/08/2024
 */
public class Localidad{
    // instance variables - replace the example below with your own
    private String nombre;
    private String provincia;

    /**
     * Constructor para inicializar un objeto de la clase {@code Localidad} con 
     * nombre y provincia.
     *
     * @param p_nombre              El nombre de la localidad.
     * @param p_provincia           El nombre de la provincia.
     */
    public Localidad(String p_nombre, String p_provincia){
        this.setNombre(p_nombre);
        this.setProvincia(p_provincia);
    }
    
    /**
     * Establece el nombre de la localidad.
     * 
     * @param p_nombre el nombre de la localidad.
       */
    private void setNombre(String p_nombre){
       this.nombre = p_nombre;
    }
    /**
     * Obtiene el nombre de la localidad.
     * 
     * @return el nombre de la localidad.
       */
    public String getNombre(){
        return this.nombre;
    }
    
    private void setProvincia(String p_provincia){
        this.provincia = p_provincia;
    }
    public String getProvincia(){
        return this.provincia;
    }
    
    /**
     * Muestra por pantalla una línea de texto que contiene el
     * nombre de la localidad y la provincia.
     * 
     * @return una línea de texto concatenada.
       */
    public String mostrar(){
        return "Localidad: "+ this.getNombre() + "\tProvincia: " + this.getProvincia();
    }
}
















