/**
 * La clase Hospital representa a un hospital con información 
 * como: nombre del hospital y nombre del director del hospital. Además,
 * posee el método consultaDatosFiliatorios(), que recibe como parámetro
 * un objeto Paciente.
 * 
 * @author Gomez Hertler Lisandro
 * @version 31/8/2024
   */
public class Hospital{
    // instance variables - replace the example below with your own
    private String nombreHospital;
    private String nombreDirector;

    /**
     * Constructor para inicializar un objeto de la clase {@code Hospital} con
     * nombre del hospital y nombre del director del hospital.
     *
     * @param p_nombreHospital            El nombre del hospital.
     * @param p_nombreDirector            El nombre del director del hospital.
     */
    public Hospital(String p_nombreHospital, String p_nombreDirector){
        this.setNombreHospital(p_nombreHospital);
        this.setNombreDirector(p_nombreDirector);
    }

    /**
     * Establece el nombre del hospital.
     * 
     * @param p_nombreHospital nombre del hospital.
     */
    private void setNombreHospital(String p_nombreHospital){
        this.nombreHospital = p_nombreHospital;
    }
    /**
     * Obtiene el nombre del hospital.
     * 
     * @return el nombre del hospital.
       */
    public String getNombreHospital(){
        return this.nombreHospital;
    }
    
    private void setNombreDirector(String p_nombreDirector){
        this.nombreDirector = p_nombreDirector;
    }
    public String getNombreDirector(){
        return this.nombreDirector;
    }
    
    /**
     * Muestra por pantalla la información del hospital y del paciente. 
       */
    public void consultaDatosFiliatorios(Paciente p_paciente){
        System.out.println();
        System.out.println("Hospital: "+this.getNombreHospital()+"\tDirector: "+this.getNombreDirector());
        System.out.println("----------------------------------------------------------------------------");
        p_paciente.mostrarDatosPantalla();
        System.out.println(p_paciente.cadenaDeDatos());
        System.out.println();
        }
}
