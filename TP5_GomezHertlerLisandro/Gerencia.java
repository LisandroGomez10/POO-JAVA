import java.util.ArrayList;

/**
 * Clase Gerencia que gestiona los alojamientos alquilados.
 * Proporciona métodos para agregar y quitar alojamientos, contar alojamientos por tipo y realizar la liquidación.
 * 
 * @author Lisandro Gomez Hertler
 * @version 20/10/2024
 */
public class Gerencia {
   
    private String nombre;
    private ArrayList<Alojamiento> alojamientosAlquilados;
    
    /**
     * Constructor de la clase Gerencia con una lista de alojamientos alquilados.
     * 
     * @param p_nombre Nombre de la gerencia.
     * @param p_alojamientosAlquilados Lista de alojamientos alquilados.
     */
    public Gerencia(String p_nombre, ArrayList<Alojamiento> p_alojamientosAlquilados) {
        this.setAlojamientos(p_alojamientosAlquilados);   
        this.setNombre(p_nombre);   
    }
    
    /**
     * Constructor de la clase Gerencia sin alojamientos iniciales.
     * 
     * @param p_nombre Nombre de la gerencia.
     */
    public Gerencia(String p_nombre) {
        this.setAlojamientos(new ArrayList<>());   
        this.setNombre(p_nombre);   
    }    
    
    /**
     * Obtiene el nombre de la gerencia.
     * 
     * @return Nombre de la gerencia.
     */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
     * Establece el nombre de la gerencia.
     * 
     * @param p_nombre Nombre de la gerencia.
     */
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }
    
    /**
     * Obtiene la lista de alojamientos alquilados.
     * 
     * @return Lista de alojamientos alquilados.
     */
    public ArrayList<Alojamiento> getAlojamientos() {
        return this.alojamientosAlquilados;
    }
    
    /**
     * Establece la lista de alojamientos alquilados.
     * 
     * @param p_alojamientosAlquilados Lista de alojamientos alquilados.
     */
    private void setAlojamientos(ArrayList<Alojamiento> p_alojamientosAlquilados) {
        this.alojamientosAlquilados = p_alojamientosAlquilados;
    }
    
    /**
     * Agrega un alojamiento a la lista de alojamientos alquilados.
     * 
     * @param p_alojamiento Alojamiento a agregar.
     * @return Verdadero si se agregó exitosamente, falso en caso contrario.
     */
    public boolean agregarAlojamiento(Alojamiento p_alojamiento) {
        return this.getAlojamientos().add(p_alojamiento);
    }
    
    /**
     * Quita un alojamiento de la lista de alojamientos alquilados.
     * 
     * @param p_alojamiento Alojamiento a quitar.
     * @return Verdadero si se quitó exitosamente, falso en caso contrario.
     */
    public boolean quitarAlojamiento(Alojamiento p_alojamiento) {
        return this.getAlojamientos().remove(p_alojamiento);
    }

    /**
     * Cuenta el número de alojamientos del tipo especificado.
     * 
     * @param p_tipoAlojamiento Tipo de alojamiento a contar.
     * @return El número de alojamientos que coinciden con el tipo especificado.
     */
    public int contarAlojamientos(String p_tipoAlojamiento) {
        int contador = 0;
        for (Alojamiento alojamiento : alojamientosAlquilados) {
            contador += alojamiento.contar(p_tipoAlojamiento);
        }
        return contador;     
    }
    
    /**
     * Realiza la liquidación de todos los alojamientos alquilados, mostrando la información de cada uno.
     */
    public void liquidar() {
        System.out.println("Gerencia: " + this.getNombre());
        System.out.println("Liquidación: ----------------");
        
        for (Alojamiento alojamiento : alojamientosAlquilados) {
            alojamiento.liquidar();
            System.out.println("------------------------------");
        }
    }
     
}
