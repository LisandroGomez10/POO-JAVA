import java.util.*;
/**
 * La clase Persona representa a una persona con su
 * información como: número de DNI, nombre, apellido y 
 * fecha de nacimiento.
 * 
 * @author Gomez Hertler Lisandro
 * @version 30/8/2024
   */
public class Persona{
    private int nroDni;
    private String nombre;
    private String apellido;
    private Calendar fechaNacimiento;
    
    /**
     * Constructor para inicializar un objeto de la clase {@code Persona} con número de DNI, 
     * nombre, apellido y año de nacimiento.
     *
     * @param p_dni            El número de DNI de la persona.
     * @param p_nombre         El nombre de la persona.
     * @param p_apellido       El apellido de la persona.
     * @param p_anio           El año de nacimiento de la persona.
     */
    public Persona(int p_dni, String p_nombre, String p_apellido, int p_anio){ 
        this.setDni(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setAnioNacimiento(p_anio);
    }
    /**
     * Constructor para inicializar un objeto de la clase {@code Persona} con número de DNI, 
     * nombre, apellido y fecha de nacimiento.
     *
     * @param p_dni            El número de DNI de la persona.
     * @param p_nombre         El nombre de la persona.
     * @param p_apellido       El apellido de la persona.
     * @param p_fecha          La fecha de nacimiento de la persona.
     */
    public Persona(int p_dni, String p_nombre, String p_apellido, Calendar p_fecha){ 
        this.setDni(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setFechaNacimiento(p_fecha);
    }
    
    /**
     * Establece el número de DNI.
     * 
     * @param p_dni el número de DNI.
       */
    private void setDni (int p_dni){
        this.nroDni = p_dni;
    }
    private void setNombre (String p_nombre){
        this.nombre = p_nombre;
    }
    private void setApellido (String p_apellido){
        this.apellido = p_apellido;
    }    
    private void setAnioNacimiento (int p_anio){
        Calendar fecha = Calendar.getInstance();
        fecha.set(p_anio,1,1);
        this.setFechaNacimiento(fecha);
    }
    private void setFechaNacimiento(Calendar p_fecha){
        this.fechaNacimiento = p_fecha;
    }
    
    /**
     * Obtiene el número de DNI.
     * 
     * @return el número de DNI.
       */
    public int getDni (){
        return this.nroDni;
    }
    
    public String getNombre (){
        return this.nombre;
    }
    
    public String getApellido (){
        return this.apellido;
    }
    
    public int getAnioNacimiento (){
        return this.getFechaNacimiento().get(Calendar.YEAR);
    }
    
    public Calendar getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    
    /**
     * Calcula la edad de la persona restando al año actual el año
     * de nacimiento de la persona.
     * 
     * @return la edad actual de la persona.
       */
    public int edad (){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return anioHoy - this.getAnioNacimiento();
    }
    
    /**
     * Concatena el nombre y el apellido de la persona y 
     * forma una sola línea de texto.
     * 
     * @return una línea concatenada de texto.
       */
    public String nomYApe(){
        return this.getNombre()+ " "+getApellido();
    }
    
    /**
     * Comprueba y retorna true o false según sea o no el cumpleaños 
     * de la persona en el día que se ejecuta el programa.
     * 
     * @return un valor booleano.
       */
    public boolean esCumpleanios(){       
        Calendar fechaHoy = Calendar.getInstance();
        int mesNacimiento = this.getFechaNacimiento().get(Calendar.MONTH);
        int diaNacimiento = this.getFechaNacimiento().get(Calendar.DATE);
        
        if ((fechaHoy.get(Calendar.MONTH) == mesNacimiento) && (fechaHoy.get(Calendar.DATE) == diaNacimiento)){
                return true;
            }else{
                return false;
        }
    }
}