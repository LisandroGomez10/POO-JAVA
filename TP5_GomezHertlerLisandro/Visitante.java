import java.util.Calendar;
import java.util.HashSet;

/**
 * Clase abstracta que representa un visitante de un zoológico.
 * Esta clase define los atributos y métodos comunes para todos los tipos
 * de visitantes.
 * 
 * @author Lisandro Gomez Hertler
 * @version 20/10/2024
 */
public abstract class Visitante {
    
    private String nombre;   
    private Calendar fechaVisita;

    /**
     * Constructor que inicializa un visitante con un nombre y una fecha de visita.
     * 
     * @param p_nombre Nombre del visitante.
     * @param p_fecha Fecha de visita del visitante.
     */
    public Visitante(String p_nombre, Calendar p_fecha) {
        this.setNombre(p_nombre);
        this.setFecha(p_fecha);   
    }

    /**
     * Devuelve el nombre del visitante.
     * 
     * @return Nombre del visitante.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Devuelve la fecha de visita del visitante.
     * 
     * @return Fecha de visita.
     */
    public Calendar getFecha() {
        return this.fechaVisita;
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    private void setFecha(Calendar p_fecha) {
        this.fechaVisita = p_fecha;
    }

    /**
     * Muestra la información del visitante. Este método debe ser implementado
     * por las subclases para definir cómo se presenta la información.
     */
    public abstract void mostrar();

    /**
     * Calcula el costo de la entrada del visitante. Este método debe ser
     * implementado por las subclases para definir cómo se calcula el costo.
     * 
     * @return Costo de la entrada.
     */
    public abstract double entrada();

    /**
     * Lista los visitantes por fecha. Este método debe ser implementado
     * por las subclases para definir cómo se lista la información.
     * 
     * @param p_fecha Fecha de la lista.
     * @param p_visitante Tipo de visitante a listar.
     */
    public abstract void listarPorFecha(Calendar p_fecha, String p_visitante);

    /**
     * Devuelve el tipo de visitante. Este método debe ser implementado
     * por las subclases para definir el tipo específico de visitante.
     * 
     * @return Tipo de visitante.
     */
    public abstract String tipoVisitante();

    /**
     * Lista las personas asociadas al visitante. Este método debe ser
     * implementado por las subclases para definir cómo se lista la información.
     * 
     * @return Conjunto de personas asociadas.
     */
    public abstract HashSet<Persona> listarPersonas();
}
