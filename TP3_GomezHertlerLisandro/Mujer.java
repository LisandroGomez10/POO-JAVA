/**
 * La clase Mujer representa a una mujer, con atributos como nombre, apellido, edad, 
 * estado civil y, opcionalmente, un esposo de tipo {@code Hombre}. Proporciona métodos 
 * para gestionar el matrimonio y divorcio, así como mostrar información sobre la persona.
 * 
 * @author Gomez Hertler Lisandro
 * @version 31/8/2024
 */
public class Mujer {
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Hombre esposo;

    /**
     * Constructor para crear una mujer soltera sin esposo.
     * 
     * @param p_nombre   El nombre de la mujer.
     * @param p_apellido El apellido de la mujer.
     * @param p_edad     La edad de la mujer.
     */
    public Mujer(String p_nombre, String p_apellido, int p_edad) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltera");
        this.setEsposo(null);
    }

    /**
     * Constructor para crear una mujer casada con un esposo.
     * 
     * @param p_nombre   El nombre de la mujer.
     * @param p_apellido El apellido de la mujer.
     * @param p_edad     La edad de la mujer.
     * @param p_esposo   El esposo de la mujer.
     */
    public Mujer(String p_nombre, String p_apellido, int p_edad, Hombre p_esposo) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltera");  // Inicialmente soltera
        this.setEsposo(p_esposo);
    }

    /**
     * Obtiene el nombre de la mujer.
     * 
     * @return El nombre de la mujer.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Obtiene el apellido de la mujer.
     * 
     * @return El apellido de la mujer.
     */
    public String getApellido() {
        return this.apellido;
    }

    /**
     * Obtiene la edad de la mujer.
     * 
     * @return La edad de la mujer.
     */
    public int getEdad() {
        return this.edad;
    }

    /**
     * Obtiene el estado civil de la mujer.
     * 
     * @return El estado civil de la mujer.
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * Obtiene el esposo de la mujer.
     * 
     * @return El esposo de la mujer, o {@code null} si no está casada.
     */
    public Hombre getEsposo() {
        return this.esposo;
    }

    // Métodos setters privados

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }

    private void setEdad(int p_edad) {
        this.edad = p_edad;
    }

    private void setEstadoCivil(String p_estadoCivil) {
        this.estadoCivil = p_estadoCivil;
    }

    private void setEsposo(Hombre p_esposo) {
        this.esposo = p_esposo;
    }

    /**
     * Método para casarse con un hombre. Actualiza el estado civil a "Casada" 
     * y establece una relación bidireccional con el esposo.
     * 
     * @param p_hombre El hombre con el que se casará.
     */
    public void casarseCon(Hombre p_hombre) {
        if (this.getEsposo() == null) {            
            this.setEsposo(p_hombre);
            this.setEstadoCivil("Casada");
            p_hombre.casarseCon(this);  // Establece la relación bidireccional
        }
    }

    /**
     * Método para divorciarse del esposo. Actualiza el estado civil a "Divorciada" 
     * y elimina la referencia al esposo.
     */
    public void divorcio() {
        if (this.getEsposo() != null) {
            Hombre consorte = this.getEsposo();
            this.setEsposo(null);
            this.setEstadoCivil("Divorciada");
            consorte.divorcio();  // Rompe la relación bidireccional
        }
    }

    /**
     * Devuelve una cadena con los datos básicos de la mujer.
     * 
     * @return Una cadena con el nombre, apellido y edad de la mujer.
     */
    public String datos() {
        return this.getNombre() + " " + this.getApellido() + " de " + this.getEdad() + " años";
    }

    /**
     * Muestra el estado civil de la mujer.
     */
    public void mostrarEstadoCivil() {
        System.out.println(this.datos() + " - " + this.getEstadoCivil());
    }

    /**
     * Muestra con quién está casada la mujer, si tiene esposo. 
     * Si no está casada, indica que no lo está.
     */
    public void casadaCon() {
        if (this.getEsposo() != null) {
            System.out.println(this.datos() + " está casada con " + this.getEsposo().datos());
        } else {
            System.out.println(this.datos() + " no está casada actualmente.");
        }
    }
}
