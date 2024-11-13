/**
 * La clase {@code Alumno} representa a un alumno, contiene información como: 
 * número de LU, nombre, apellido, nota del 1° exámen y nota del 2° exámen. 
 * 
 * @author Gomez Hertler Lisandro
 * @version 22/09/2024
 */
public class Alumno{
    // instance variables - replace the example below with your own
    private int lu;
    private String nombre;
    private String apellido;
    private double nota1;
    private double nota2;
    
    /**
     * Constructor para inicializar un objeto de la clase {@code Alumno} con 
     * nombre, apellido y número LU.
     *
     * @param p_lu                  El valor de la LU.
     * @param p_nombre              El nombre del alumno.
     * @param p_apellido            El apellido del alumno.
     */
    public Alumno(int p_lu, String p_nombre, String p_apellido, double p_nota1, double p_nota2){
        this.setLu(p_lu);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setNota1(p_nota1);
        this.setNota2(p_nota2);
    }

    public int getLu(){
        return this.lu;
    }
    private void setLu(int p_lu){
        lu = p_lu;
    }
    
    /**
     * Obtiene el nombre del alumno.
     * 
     * @return el nombre del alumno.
       */
    public String getNombre(){
        return this.nombre;
    }
    /**
     * Establece el nombre del alumno.
     * 
     * @param p_nombre el nombre del alumno.
       */
    private void setNombre(String p_nombre){
        nombre = p_nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    private void setApellido(String p_apellido){
        apellido = p_apellido;
    }
    
    public void setNota1(double p_nota){
        nota1 = p_nota;
    }
    public double getNota1(){
        return this.nota1;
    }
    
    public void setNota2(double p_nota){
        nota2 = p_nota;
    }
    public double getNota2(){
        return this.nota2;
    }
    
    /**
     * Calcula el promedio de las dos notas de los exámenes.
     * 
     * @return el promedio de las notas.
       */
    public double promedio(){
        return (this.getNota1()+this.getNota2()) / 2.0;
    }
    
    /**
     * Concatena el nombre y apellido del alumno.
     * 
     * @return una línea de texto concatenada.
       */
    public String nomYApe(){
        return this.getNombre()+" "+this.getApellido();
    }
    /**
     * Concatena el apellido y nombre del alumno.
     * 
     * @return una línea de texto concatenada.
       */
    public String apeYNom(){
        return this.getApellido()+" "+this.getNombre();
    }
    
    /**
     * Evalua si el promedio es mayor a 6.0 para retornar 
     * si el alumno aprobó o desaprobó.
     * 
     * @return true o false.
       */
    private boolean aprueba(){
        if(this.promedio() > 6.0){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * Evalua si el alumno aprobó para retornar 
     * la leyenda aprobado o desaprobado en caso
     * contrario.
     * 
     * @return una línea de texto.
       */
    private String leyendaAprueba(){
        if(this.aprueba()){
            return "APROBADO";
        }else{
            return "DESAPROBADO";
        }
    }
    
    /**
     * Muestra por pantalla los datos del alumno y si aprobó o no
       */
    public void mostrar(){
        System.out.println("Nombre y Apellido: "+this.nomYApe());
        System.out.println("LU: "+getLu()+"\tNotas: "+this.getNota1()+" - "+this.getNota2());
        System.out.println("Promedio: "+this.promedio()+" - "+this.leyendaAprueba());
    }
}










