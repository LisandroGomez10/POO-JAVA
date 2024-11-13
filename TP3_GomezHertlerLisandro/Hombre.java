/**
 * La clase Hombre representa a un hombre, con atributos como nombre, apellido, edad, 
 * estado civil y, opcionalmente, una esposa de tipo {@code Mujer}. Proporciona métodos para gestionar
 * el matrimonio y el divorcio, así como para mostrar información sobre la persona.
 * 
 * @author Gomez Hertler Lisandro
 * @version 31/8/24
 */
public class Hombre {
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Mujer esposa;

    /**
     * Constructor para crear un hombre soltero sin esposa.
     * 
     * @param p_nombre   El nombre del hombre.
     * @param p_apellido El apellido del hombre.
     * @param p_edad     La edad del hombre.
     */
    public Hombre(String p_nombre, String p_apellido, int p_edad) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltero");
        this.setEsposa(null);
    }

    /**
     * Constructor para crear un hombre casado con una esposa.
     * 
     * @param p_nombre   El nombre del hombre.
     * @param p_apellido El apellido del hombre.
     * @param p_edad     La edad del hombre.
     * @param p_esposa   La esposa del hombre.
     */
    public Hombre(String p_nombre, String p_apellido, int p_edad, Mujer p_esposa) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltero");
        this.setEsposa(p_esposa); // Se establece la relación bidireccional
    }

    /**
     * Obtiene el nombre del hombre.
     * 
     * @return El nombre del hombre.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Establece el nombre del hombre.
     * 
     * @param p_nombre El nuevo nombre del hombre.
     */
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    /**
     * Obtiene el apellido del hombre.
     * 
     * @return El apellido del hombre.
     */
    public String getApellido() {
        return this.apellido;
    }

    /**
     * Establece el apellido del hombre.
     * 
     * @param p_apellido El nuevo apellido del hombre.
     */
    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }

    /**
     * Obtiene la edad del hombre.
     * 
     * @return La edad del hombre.
     */
    public int getEdad() {
        return this.edad;
    }

    /**
     * Establece la edad del hombre.
     * 
     * @param p_edad La nueva edad del hombre.
     */
    private void setEdad(int p_edad) {
        this.edad = p_edad;
    }

    /**
     * Obtiene el estado civil del hombre.
     * 
     * @return El estado civil del hombre.
     */
    public String getEstadoCivil() {
        return this.estadoCivil;
    }

    /**
     * Establece el estado civil del hombre.
     * 
     * @param p_estadoCivil El nuevo estado civil del hombre.
     */
    private void setEstadoCivil(String p_estadoCivil) {
        this.estadoCivil = p_estadoCivil;
    }

    /**
     * Obtiene la esposa del hombre, si está casado.
     * 
     * @return La esposa del hombre, o {@code null} si no está casado.
     */
    public Mujer getEsposa() {
        return this.esposa;
    }

    /**
     * Establece la esposa del hombre.
     * 
     * @param p_esposa La nueva esposa del hombre.
     */
    private void setEsposa(Mujer p_esposa) {
        this.esposa = p_esposa;
    }

    /**
     * Método para casarse con una mujer. Actualiza el estado civil a "Casado" 
     * y establece una relación bidireccional con la esposa.
     * 
     * @param p_mujer La mujer con la que se casará.
     */
    public void casarseCon(Mujer p_mujer) {        
        if(this.getEsposa() == null) {
            this.setEsposa(p_mujer);            
            this.setEstadoCivil("Casado");
            p_mujer.casarseCon(this);  // Establece la relación bidireccional
        }
    }

    /**
     * Método para divorciarse de la esposa. Actualiza el estado civil a "Divorciado"
     * y elimina la referencia a la esposa.
     */
    public void divorcio() {
        if(this.getEsposa() != null) {
            Mujer consorte = this.getEsposa();
            this.setEsposa(null);
            this.setEstadoCivil("Divorciado");
            consorte.divorcio();  // Rompe la relación bidireccional
        }
    }

    /**
     * Devuelve una cadena con los datos básicos del hombre.
     * 
     * @return Una cadena con el nombre, apellido y edad del hombre.
     */
    public String datos() {
        return this.getNombre() + " " + this.getApellido() + " de " + this.getEdad() + " años";
    }

    /**
     * Muestra el estado civil del hombre.
     */
    public void mostrarEstadoCivil() {
        System.out.println(this.datos() + " - " + this.getEstadoCivil());
    }

    /**
     * Muestra con quién está casado el hombre, si tiene esposa. 
     * Si no está casado, indica que no lo está.
     */
    public void casadoCon() {
        if (this.getEsposa() != null) {
            System.out.println(this.datos() + " está casado con " + this.getEsposa().datos());
        } else {
            System.out.println(this.datos() + " no está casado actualmente.");
        }
    }
}
