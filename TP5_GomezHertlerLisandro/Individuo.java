import java.util.*;

/**
 * Clase que representa un individuo que visita el zoológico.
 * Hereda de la clase abstracta Visitante y permite gestionar la
 * información personal del visitante.
 * 
 * @author Lisandro Gomez Hertler
 * @version 20/10/2024
 */
public class Individuo extends Visitante {
     
    private Persona persona;

    /**
     * Constructor que inicializa un individuo con un nombre, fecha de visita
     * y una persona asociada.
     * 
     * @param p_nombre Nombre del individuo.
     * @param p_fecha Fecha de visita del individuo.
     * @param p_persona Objeto Persona asociado al individuo.
     */
    public Individuo(String p_nombre, Calendar p_fecha, Persona p_persona) {
        super(p_nombre, p_fecha);
        this.setPersona(p_persona);
    }

    /**
     * Devuelve el objeto Persona asociado al individuo.
     * 
     * @return Persona del individuo.
     */
    public Persona getPersona() {
        return this.persona;
    }
    
    private void setPersona(Persona p_persona) {
        this.persona = p_persona;
    }
    
    /**
     * Devuelve el tipo de visitante, que en este caso es "Individuo".
     * 
     * @return Tipo de visitante.
     */
    public String tipoVisitante() {
        return "Individuo";
    }
    
    /**
     * Lista la información del individuo si coincide la fecha y el tipo de visitante.
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
     * Muestra la información del individuo.
     */
    public void mostrar() {
        System.out.println("Nombre y Apellido: " + this.getPersona().nomYApe());
        System.out.println("DNI: " + this.getPersona().getDni() + " Edad: " + this.getPersona().edad() + " años");
    }
    
    /**
     * Devuelve el costo de entrada para el individuo.
     * 
     * @return Costo de entrada.
     */
    public double entrada() {
        return 10.0; // Costo de entrada para un individuo
    }
    
    /**
     * Devuelve un conjunto que contiene la persona asociada al individuo.
     * 
     * @return Conjunto de personas asociadas.
     */
    public HashSet<Persona> listarPersonas() {
        HashSet<Persona> personas = new HashSet<>();
        personas.add(this.getPersona());
        return personas;
    }
}
