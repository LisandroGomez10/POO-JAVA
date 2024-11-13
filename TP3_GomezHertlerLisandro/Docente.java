/**
 * La clase Docente representa a un docente con información
 * como: nombre, grado, sueldo básico y asignación familiar.
 * 
 * @author Gomez Hertler Lisandro
 * @version 30/8/2024
 */
public class Docente{
    // instance variables - replace the example below with your own
    private String nombre;
    private String grado;
    private double sueldoBasico;
    private double asignacionFamiliar;
    
    /**
     * Constructor para inicializar un objeto de la clase {@code Docente} con nombre,
     * grado, sueldo básico y asignación familiar.
     * 
     * @param p_nombre          El nombre del docente.
     * @param p_grado           El grado del docente.
     * @param p_sueldoB         El sueldo básico del docente.
     * @param p_asignacion      La asignación familiar del docente.
       */
    public Docente(String p_nombre, String p_grado, double p_sueldoB, double p_asignacion){
        this.setNombre(p_nombre);
        this.setGrado(p_grado);
        this.setSueldoB(p_sueldoB);
        this.setAsignacion(p_asignacion);
    }
    
    /**
     * Establece el nombre del docente.
     * 
     * @param p_nombre el nombre del docente.
       */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    /**
     * Obtiene el nombre del docente.
     * 
     * @return el nombre del docente.
       */
    public String getNombre(){
        return this.nombre;
    }
    
    private void setGrado(String p_grado){
        this.grado = p_grado;
    }
    public String getGrado(){
        return this.grado;
    }
    
    private void setSueldoB(double p_sueldoB){
        this.sueldoBasico = p_sueldoB;
    }
    public double getSueldoB(){
        return this.sueldoBasico;
    }
    
    private void setAsignacion(double p_asignacion){
        this.asignacionFamiliar = p_asignacion;
    }
    public double getAsignacion(){
        return this.asignacionFamiliar;
    }
    
    /**
     * Calcula el sueldo del docente sumando el sueldo básico y
     * la asignación familiar propios del docente.
     * 
     * @return el sueldo del docente.
       */
    public double calcularSueldo(){
        return this.getAsignacion() + this.getSueldoB();
    }
}













