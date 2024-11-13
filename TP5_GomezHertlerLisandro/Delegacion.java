import java.util.*;

/**
 * Clase que representa una delegación de visitantes en un zoológico.
 * Hereda de la clase abstracta Visitante y permite gestionar un grupo
 * de individuos que visitan el zoológico.
 * 
 * @author Lisandro Gomez Hertler
 * @version 20/10/2024
 */
public class Delegacion extends Visitante {
    private ArrayList<Individuo> integrantes;

    /**
     * Constructor que inicializa una delegación con un nombre, fecha de visita
     * y una lista de integrantes.
     * 
     * @param p_nombre Nombre de la delegación.
     * @param p_fecha Fecha de visita de la delegación.
     * @param p_integrantes Lista de individuos que componen la delegación.
     */
    public Delegacion(String p_nombre, Calendar p_fecha, ArrayList<Individuo> p_integrantes) {
        super(p_nombre, p_fecha);   
        this.setIntegrantes(p_integrantes); 
    }

    /**
     * Constructor que inicializa una delegación con un nombre, fecha de visita
     * y un solo integrante.
     * 
     * @param p_nombre Nombre de la delegación.
     * @param p_fecha Fecha de visita de la delegación.
     * @param p_individuo Individuo a inscribir en la delegación.
     */
    public Delegacion(String p_nombre, Calendar p_fecha, Individuo p_individuo) {
        super(p_nombre, p_fecha);   
        this.setIntegrantes(new ArrayList<>());
        inscribirIndividuo(p_individuo);
    }
    
    /**
     * Devuelve la lista de integrantes de la delegación.
     * 
     * @return Lista de integrantes.
     */
    public ArrayList<Individuo> getIntegrantes() {
        return this.integrantes;
    }
    
    private void setIntegrantes(ArrayList<Individuo> p_integrantes) {
        this.integrantes = p_integrantes;
    }
    
    /**
     * Inscribe un individuo a la delegación si no está ya inscrito.
     * 
     * @param p_individuo Individuo a inscribir.
     */
    public void inscribirIndividuo(Individuo p_individuo) {
        if (!this.getIntegrantes().contains(p_individuo)) {
            this.getIntegrantes().add(p_individuo);
        } else {
            System.out.println(p_individuo.getPersona().getNombre() + " ya está inscripto.");
        }
    }
    
    /**
     * Elimina un individuo de la delegación.
     * 
     * @param p_individuo Individuo a quitar.
     * @return Verdadero si se eliminó correctamente, falso de lo contrario.
     */
    public boolean quitarIntegrante(Individuo p_individuo) {
        return this.getIntegrantes().remove(p_individuo);
    }
    
    /**
     * Devuelve la cantidad de integrantes en la delegación.
     * 
     * @return Cantidad de integrantes.
     */
    public int cantidadIntegrantes() {
        return this.getIntegrantes().size();
    }
    
    /**
     * Muestra la información de la delegación y sus integrantes.
     */
    public void mostrar() {
        System.out.println("----------------------------------------");
        System.out.println("Delegación: " + this.getNombre());
        System.out.println("Integrantes: ");
        for (Individuo integrante : this.getIntegrantes()) {
            System.out.println("Nombre y Apellido: " + integrante.getPersona().getNombre());
            System.out.println("DNI: " + integrante.getPersona().getDni());
            System.out.println("Edad: " + integrante.getPersona().edad() + " años");    
        }
        System.out.println("Cantidad de Integrantes: " + this.cantidadIntegrantes());
        System.out.println("--------------------------------------------");
    }
    
    /**
     * Calcula el costo total de la entrada para la delegación, aplicando un
     * descuento del 10%.
     * 
     * @return Costo total de la entrada.
     */
    public double entrada() {
        double total = 0.0;
        for (Individuo integrante : this.getIntegrantes()) {
            total += integrante.entrada();
        }
        return total * 0.9; // Aplica un 10% de descuento
    }
    
    /**
     * Lista la delegación si coincide la fecha y el tipo de visitante.
     * 
     * @param p_fecha Fecha de visita a verificar.
     * @param p_visitante Tipo de visitante.
     */
    public void listarPorFecha(Calendar p_fecha, String p_visitante) {
        if (this.getFecha().equals(p_fecha) && this.tipoVisitante().equals(p_visitante)) {
            this.mostrar();
        }
    }
    
    /**
     * Devuelve el tipo de visitante de la delegación.
     * 
     * @return Tipo de visitante.
     */
    public String tipoVisitante() {
        return "Delegacion";
    }
    
    /**
     * Lista las personas asociadas a los integrantes de la delegación.
     * 
     * @return Conjunto de personas asociadas.
     */
    public HashSet<Persona> listarPersonas() {
        HashSet<Persona> personas = new HashSet<>();
        for (Individuo integrante : this.getIntegrantes()) {
            personas.add(integrante.getPersona());
        }
        return personas;
    }
}
