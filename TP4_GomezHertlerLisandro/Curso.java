import java.util.*;

/**
 * La clase {@code Curso} representa a un curso con información como:
 * nombre y colección de alumnos cursantes de la carrera. 
 * 
 * @author Gomez Hertler Lisandro
 * @version 22/09/2024
 */
public class Curso{
    // instance variables - replace the example below with your own
    private String nombre;
    private HashMap<Integer, Alumno> alumnos;

    /**
     * Constructor para inicializar un objeto de la clase {@code Curso} con 
     * nombre.
     *
     * @param p_nombre              El nombre de la carrera.
     */
    public Curso(String p_nombre){
        this.setNombre(p_nombre);
        this.setAlumnos(new HashMap<Integer, Alumno>());
    }
    /**
     * Constructor para inicializar un objeto de la clase {@code Curso} con 
     * nombre y alumnos.
     *
     * @param p_nombre              El nombre del alumno.
     * @param p_alumnos             Alumnos cursantes de la carrera.
     */
    public Curso(String p_nombre, HashMap<Integer, Alumno> p_alumnos){
        this.setNombre(p_nombre);
        this.setAlumnos(p_alumnos);
    }
    
    /**
     * Establece el nombre de la carrera.
     * 
     * @param p_nombre el nombre de la carrera.
       */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setAlumnos(HashMap<Integer, Alumno> p_alumnos){
        this.alumnos = p_alumnos;
    }
    
    /**
     * Obtiene el nombre de la carrera.
     * 
     * @return el nombre de la carrera.
       */
    public String getNombre(){
        return this.nombre;
    }
    public HashMap<Integer, Alumno> getAlumnos(){
        return this.alumnos;
    }
    
    /**
     * Agrega un nuevo alumno a la colección.
     * 
     * @param p_alumno alumno para inscribir.
       */
    public void inscribirAlumno(Alumno p_alumno){
        this.getAlumnos().put(new Integer(p_alumno.getLu()), p_alumno);
        System.out.println("Alumno inscripto con exito!\n");
    }
    
    /**
     * Quita un alumno a la colección mediante su LU.
     * 
     * @param p_lu LU del alumno para quitar.
     * @return el alumno quitado de la colección.
       */
    public Alumno quitarAlumno(int p_lu){
        return (Alumno) this.getAlumnos().remove(new Integer(p_lu));
    }
    
    /**
     * Informar la cantidad de alumnos inscriptos a la carrera.
     * 
     * @return el total de los alumnos inscriptos.
       */
    public int cantidadDeAlumnos(){
        int cont = 0;
        for(Map.Entry <Integer, Alumno> unAlumno : alumnos.entrySet()){
            if(unAlumno.getKey() > 0){
                cont += 1;
            }
        }
        return cont;
    }
    
    /**
     * Verifica si el alumno esta inscripto a la carrera.
     * 
     * @param p_lu LU del alumno.
     * @return valor booleano.
       */
    public boolean estaInscripto(int p_lu){
        return this.getAlumnos().containsKey(new Integer(p_lu));
    }
    
    /**
     * Verifica si el alumno esta inscripto a la carrera.
     * 
     * @param p_alumno el alumno.
     * @return valor booleano.
       */
    public boolean estaInscripto(Alumno p_alumno){
        return this.getAlumnos().containsValue(p_alumno);
    }
    
    /**
     *  Retorna el alumno que corresponde al LU pasado como parámetro.
     * 
     * @param p_lu LU del alumno.
     * @return el alumno.
       */
    public Alumno buscarAlumno(int p_lu){
        return (Alumno) this.getAlumnos().get(p_lu);
    }
    
    /**
     * Muestra por pantalla el promedio del alumno que corresponde
     * a la LU pasada como parámetro.
     * 
     * @param p_lu LU del alumno.
     * @return el promedio o negación de la existencia del LU.
       */
    public void imprimirPromedioDelAlumno(int p_lu){
        System.out.println("****__Mostrar promedio del alumno " + p_lu + "__****");
        Alumno unAlumno = this.buscarAlumno(p_lu);
        
        if(unAlumno != null){
            System.out.println("Promedio: "+ unAlumno.promedio());
        }else{
            System.out.println("Ningún alumno posee ese LU");
        }
    }
    
    /**
     * Muestra por pantalla el nombre de la carrera, cantidad de alumnos
     * inscriptos y los alumnos inscriptos.
       */
    public void mostrarInscriptos(){
        System.out.println("\n\n******__Carrera: "+this.getNombre()+ "__******");
        System.out.println("\n****__Cantidad de inscriptos: " + this.cantidadDeAlumnos() + "__****");
        for(Map.Entry <Integer, Alumno> unAlumno : alumnos.entrySet()){
            System.out.println(unAlumno.getKey() + " " + unAlumno.getValue().nomYApe());
        }
    }
}

















