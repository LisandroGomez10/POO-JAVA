/**
 * La clase {Alumno} representa a un estudiante con información básica como LU (Número de Legajo),
 * nombre, apellido y las notas de dos exámenes. Proporciona métodos para establecer notas, calcular el
 * promedio, verificar si aprueba y mostrar la información del alumno.
 * 
 * @author Gomez Hertler Lisandro
 * @version 21/8/2024
 */
public class Alumno extends Persona{
    // Variables de instancia
    private int lu;
    private double nota1;
    private double nota2;
    // no se colocan atributos que tenga la superclase;
    /**
     * Constructor para inicializar un objeto de la clase {@code Alumno} con LU, nombre y apellido.
     * Inicializa las notas a 0.
     *
     * @param p_lu      El número de legajo del alumno.
     * @param p_nombre  El nombre del alumno.
     * @param p_apellido El apellido del alumno.
     */
    public Alumno(int p_dni,int p_lu, String p_nombre, String p_apellido, int p_anio, double p_nota1, double p_nota2) {
        super(p_dni, p_nombre, p_apellido, p_anio);
        this.setLu(p_lu);
        this.setNota1(p_nota1);
        this.setNota2(p_nota2);
    }

    /**
     * Obtiene el número de legajo del alumno.
     *
     * @return El número de legajo del alumno.
     */
    public int getLu() {
        return lu;
    }

    /**
     * Establece el número de legajo del alumno.
     *
     * @param p_lu El nuevo número de legajo del alumno.
     */
    private void setLu(int p_lu) {
        this.lu = p_lu;
    }

    

    /**
     * Obtiene la primera nota del alumno.
     *
     * @return La primera nota del alumno.
     */
    public double getNota1() {
        return nota1;
    }

    /**
     * Establece la primera nota del alumno.
     *
     * @param p_nota1 La primera nota del alumno.
     */
    public void setNota1(double p_nota1) {
        this.nota1 = p_nota1;
    }

    /**
     * Obtiene la segunda nota del alumno.
     *
     * @return La segunda nota del alumno.
     */
    public double getNota2() {
        return nota2;
    }

    /**
     * Establece la segunda nota del alumno.
     *
     * @param p_nota2 La segunda nota del alumno.
     */
    public void setNota2(double p_nota2) {
        this.nota2 = p_nota2;
    }

    /**
     * Calcula el promedio de las dos notas del alumno.
     *
     * @return El promedio de las dos notas.
     */
    public double promedio() {
        return (this.getNota1() + this.getNota2()) / 2.0;
    }

    /**
     * Verifica si el alumno aprueba basándose en el promedio y en las notas individuales.
     * El alumno aprueba si el promedio es mayor que 7 y ambas notas son mayores que 6.
     *
     * @return {@code true} si el alumno aprueba, {@code false} en caso contrario.
     */
    private boolean aprueba() {
        return this.promedio() > 7 && this.getNota1() > 6 && this.getNota2() > 6;
    }

    /**
     * Retorna una cadena que indica el estado de aprobación del alumno.
     *
     * @return "Aprobado" si el alumno aprueba, "Desaprobado" en caso contrario.
     */
    private String leyendaAprueba() {
        return aprueba() ? "Aprobado" : "Desaprobado";
    }

    /**
     * Obtiene el nombre completo del alumno en el formato "Nombre Apellido".
     *
     * @return El nombre completo del alumno.
     */
    public String nomYApe() {
        return this.getNombre() + " " + this.getApellido();
    }

    /**
     * Obtiene el nombre completo del alumno en el formato "Apellido Nombre".
     *
     * @return El nombre completo del alumno en el formato "Apellido Nombre".
     */
    public String apeYNom() {
        return this.getApellido() + " " + this.getNombre();
    }

    /**
     * Muestra la información completa del alumno en la consola.
     * Incluye nombre, LU, notas, promedio y leyenda de aprobación.
     */
    public void mostrar() {
        super.mostrar();
        System.out.println("LU: " + this.getLu() + " " + "Notas: " + this.getNota1() + "-" + this.getNota2());
        System.out.println("Promedio: " + this.promedio() + " - " + this.leyendaAprueba());
    }
}
