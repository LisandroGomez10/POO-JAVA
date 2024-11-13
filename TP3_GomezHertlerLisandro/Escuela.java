/**
 * La clase Escuela representa a una escuela con información
 * como: nombre, domicilio y director (nombres y apellidos respectivos).
 * 
 * @author Gomez Hertler Lisandro
 * @version 30/8/2024
 */
public class Escuela{
    // instance variables - replace the example below with your own
    private String nombre;
    private String domicilio;
    private String director;

    /**
     * Constructor para inicializar un objeto de la clase {@code Escuela} con nombre,
     * domicilio y director (nombres y apellidos respectivos).
     * 
     * @param p_nombre          El nombre de la escuela.
     * @param p_domicilio       El domicilio de la escuela.
     * @param p_director        El nombre y apellido del director de la escuela.
       */
    public Escuela(String p_nombre, String p_domicilio, String p_director){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setDirector(p_director);
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Establece el domicilio de la escuela.
     * 
     * @param p_domicilio domicilio de la escuela.
       */
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    /**
     * Obtiene el domicilio de la escuela.
     * 
     * @return el domicilio de la escuela.
       */
    public String getDomicilio(){
        return this.domicilio;
    }
    
    private void setDirector(String p_director){
        this.director = p_director;
    }
    public String getDirector(){
        return this.director;
    }
    
    /**
     * Imprime por pantalla el recibo de un docente. Muestra los datos:
     * nombre y domicilio de la escuela, además del nombre de su director. 
     * También se muestran el nombre, sueldo, sueldo básico y asignación familiar
     * del docente.
       */
    public void imprimirRecibo(Docente p_docente){
        System.out.println();
        System.out.println("Escuela: "+this.getNombre()+"\tDomicilio: "+this.getDomicilio()+"\tDirector: "+this.getDirector());
        System.out.println("----------------------------------------------------------------------------------------------r");
        System.out.println("Docente: "+p_docente.getNombre());
        System.out.println("Sueldo:...................... $"+p_docente.calcularSueldo());
        System.out.println("Sueldo Básico:............... $"+p_docente.getSueldoB());
        System.out.println("Asignación Familiar:......... $"+p_docente.getAsignacion());
        System.out.println();
    }
}













