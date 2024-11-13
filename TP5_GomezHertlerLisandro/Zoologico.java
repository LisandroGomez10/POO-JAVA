import java.util.*;

/**
 * Clase que representa un zoológico, el cual puede registrar y gestionar
 * visitantes, calcular recaudaciones y listar personas que han visitado.
 * 
 * @author Lisandro Gomez Hertler
 * @version 20/10/2024
 */
public class Zoologico {
    private String nombre;
    private ArrayList<Visitante> visitantes;

    /**
     * Constructor que inicializa el zoológico con un nombre y una lista
     * de visitantes.
     * 
     * @param p_nombre Nombre del zoológico.
     * @param p_visitante Lista de visitantes.
     */
    public Zoologico(String p_nombre, ArrayList<Visitante> p_visitante) {
        this.setNombre(p_nombre);
        this.setVisitantes(p_visitante);
    }

    /**
     * Constructor que inicializa el zoológico con un nombre y crea
     * una lista vacía de visitantes.
     * 
     * @param p_nombre Nombre del zoológico.
     */
    public Zoologico(String p_nombre) {
        this.setNombre(p_nombre);
        this.setVisitantes(new ArrayList<>());
    }

    /**
     * Devuelve el nombre del zoológico.
     * 
     * @return Nombre del zoológico.
     */
    public String getNombre() {
        return this.nombre;
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    /**
     * Devuelve la lista de visitantes del zoológico.
     * 
     * @return Lista de visitantes.
     */
    public ArrayList<Visitante> getVisitantes() {
        return this.visitantes;
    }

    /**
     * Establece la lista de visitantes del zoológico.
     * 
     * @param p_visitante Lista de visitantes a establecer.
     */
    public void setVisitantes(ArrayList<Visitante> p_visitante) {
        this.visitantes = p_visitante;
    }

    /**
     * Agrega un nuevo visitante al zoológico si no está ya registrado.
     * 
     * @param p_visitante Visitante a agregar.
     */
    public void nuevoVisitante(Visitante p_visitante) {
        if (!this.getVisitantes().contains(p_visitante)) {
            this.getVisitantes().add(p_visitante);
        } else {
            System.out.println(p_visitante.getNombre() + " ya está visitando el zoológico");
        }
    }

    /**
     * Elimina un visitante del zoológico.
     * 
     * @param p_visitante Visitante a eliminar.
     * @return true si el visitante fue eliminado, false en caso contrario.
     */
    public boolean quitarVisitante(Visitante p_visitante) {
        return this.getVisitantes().remove(p_visitante);
    }

    /**
     * Lista los visitantes de un tipo específico en una fecha dada.
     * 
     * @param p_fecha Fecha en la que se desea listar visitantes.
     * @param p_tipoVisitante Tipo de visitante a listar.
     */
    public void listarPorVisitante(Calendar p_fecha, String p_tipoVisitante) {
        System.out.println("Visitantes de tipo: " + p_tipoVisitante + " el día " + p_fecha.getTime() + ":");
        for (Visitante visitante : this.getVisitantes()) {
            if (visitante.getFecha().compareTo(p_fecha) == 0 && visitante.tipoVisitante().equalsIgnoreCase(p_tipoVisitante)) {
                visitante.mostrar();
            }
        }
    }

    /**
     * Lista todos los visitantes que acudieron en una fecha específica.
     * 
     * @param p_fecha Fecha en la que se desea listar visitantes.
     */
    public void listarVisitantePorFecha(Calendar p_fecha) {
        boolean hayVisitantes = false;
        System.out.println("Visitantes que acudieron el " + p_fecha.getTime() + ":");
        for (Visitante visitante : this.getVisitantes()) {
            // Comprobamos si la fecha del visitante coincide con la fecha proporcionada
            if (visitante.getFecha().get(Calendar.YEAR) == p_fecha.get(Calendar.YEAR) &&
                visitante.getFecha().get(Calendar.MONTH) == p_fecha.get(Calendar.MONTH) &&
                visitante.getFecha().get(Calendar.DAY_OF_MONTH) == p_fecha.get(Calendar.DAY_OF_MONTH)) {
                
                visitante.mostrar();
                hayVisitantes = true;
            }
        }
        if (!hayVisitantes) {
            System.out.println("No hubo visitantes en la fecha especificada.");
        }
    }

    /**
     * Calcula la recaudación total entre dos fechas dadas.
     * 
     * @param p_fechaInicio Fecha de inicio del periodo.
     * @param p_fechaFin Fecha de fin del periodo.
     * @return Recaudación total entre las dos fechas.
     */
    public double calcularRecaudacion(Calendar p_fechaInicio, Calendar p_fechaFin) {
        double recaudacion = 0.0;
        for (Visitante visitante : this.getVisitantes()) {
            if (visitante.getFecha().compareTo(p_fechaInicio) >= 0 && visitante.getFecha().compareTo(p_fechaFin) <= 0) {
                recaudacion += visitante.entrada();
            }
        }
        return recaudacion;
    }

    /**
     * Lista todas las personas que han visitado el zoológico.
     * 
     * @return Conjunto de personas que han visitado.
     */
    public HashSet<Persona> listarPersonas() {
        HashSet<Persona> personas = new HashSet<>();
        for (Visitante visitante : this.getVisitantes()) {
            personas.addAll(visitante.listarPersonas());
        }
        return personas;
    }

    /**
     * Muestra información general del zoológico, incluyendo su nombre
     * y la cantidad de visitantes registrados.
     */
    public void mostrar() {
        System.out.println("Zoológico: " + this.getNombre());
        System.out.println("Cantidad de visitantes registrados: " + this.getVisitantes().size());
    }
}
