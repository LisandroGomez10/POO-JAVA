/**
 * La clase Paciente representa a un paciente de hospital con
 * información respectiva como: historia clínica, nombre, domicilio y 
 * localidad. Posee también métodos como: mostrarDatosPantalla() y 
 * cadenaDeDatos().
 * 
 * 
 * @author Gomez Hertler Lisandro
 * @version 31/8/2024
   */
public class Paciente{
    // instance variables - replace the example below with your own
    private int historiaClinica;
    private String nombre;
    private String domicilio;
    private Localidad localidadNacido;
    private Localidad localidadVive;

    /**
     * Constructor para inicializar un objeto de la clase {@code Paciente} con
     * historia clínica, nombre, domicilio y localidad.
     *
     * @param p_historia            La historia clínica del paciente.
     * @param p_nombre              El nombre del paciente.
     * @param p_domicilio           El domicilio del paciente.
     * @param p_localidadNacido     La localidad de nacimiento del paciente.
     * @param p_localidadVive       La localidad de residencia actual del paciente.
     */
    public Paciente(int p_historia, String p_nombre, String p_domicilio, Localidad p_localidadNacido, Localidad p_localidadVive){
        this.setHistoria(p_historia);
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setLocalNac(p_localidadNacido);
        this.setLocalVive(p_localidadVive);
    }

    private void setHistoria(int p_historia){
        this.historiaClinica = p_historia;
    }
    public int getHistoria(){
        return this.historiaClinica;
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    public String getDomicilio(){
        return this.domicilio;
    }
    
    /**
     * Establece la localidad de nacimiento del paciente.
     * 
     * @param p_localidadNacido la localidad de nacimiento del paciente.
       */
    private void setLocalNac(Localidad p_localidadNacido){
        this.localidadNacido = p_localidadNacido;
    }
    /**
     * Obtiene la localidad de nacimiento del paciente.
     * 
     * @return la localidad de nacimiento del paciente.
       */
    public Localidad getLocalNac(){
        return this.localidadNacido;
    }
    
    private void setLocalVive(Localidad p_localidadVive){
        this.localidadVive = p_localidadVive;
    }
    public Localidad getLocalVive(){
        return this.localidadVive;
    }
    
    /**
     * Muestra por pantalla la información del paciente: nombre, historia clínica,
     * domicilio, localidad y provincia de residencia actuales.
       */
    public void mostrarDatosPantalla(){
        System.out.println("Paciente: "+this.getNombre()+"\tHistoria Clínica: "+this.getHistoria()+"\tDomicilio: "+this.getDomicilio());
        System.out.println(this.getLocalVive().mostrar());
        System.out.println();
    }
    
    /**
     * Devuelve una cadena de texto que contiene información del paciente: nombre, 
     * historia clínica, domicilio, localidad y provincia de residencia actuales.
     * 
     * @return una línea de texto concatenada.
       */
    public String cadenaDeDatos(){
        return this.getNombre()+"....."+this.getHistoria()+"....."+this.getDomicilio()+" - "+this.getLocalVive().getNombre()+" - "+getLocalVive().getProvincia();
    }
}












