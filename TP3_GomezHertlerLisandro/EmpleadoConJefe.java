import java.util.*;

/**
 * La clase EmpleadoConJefe representa a un empleado dentro de una empresa que puede tener o no un jefe.
 * Incluye atributos como CUIL, nombre, apellido, sueldo básico, fecha de ingreso y jefe.
 * Proporciona métodos para calcular antigüedad, sueldo neto, y mostrar información del empleado.
 * 
 * @author Gomez Hertler Lisandro
 * @version 21/8/24
 * 
 */
public class EmpleadoConJefe {
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso;
    private EmpleadoConJefe jefe;
    
    /**
     * Constructor para modelar un objeto de tipo empleado sin jefe (Gerente General).
     * @param p_cuil El CUIL del empleado.
     * @param p_apellido El apellido del empleado.
     * @param p_nombre El nombre del empleado.
     * @param p_importe El sueldo básico del empleado.
     * @param p_anio El año de ingreso del empleado.
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre,
                           double p_importe, int p_anio) {
        this(p_cuil, p_apellido, p_nombre, p_importe,new GregorianCalendar(p_anio, Calendar.JANUARY, 1));
    }

    /**
     * Constructor para modelar un objeto de tipo empleado sin jefe (Gerente General).
     * @param p_cuil El CUIL del empleado.
     * @param p_apellido El apellido del empleado.
     * @param p_nombre El nombre del empleado.
     * @param p_importe El sueldo básico del empleado.
     * @param p_fecha La fecha de ingreso del empleado.
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha) {
        this.cuil = p_cuil;
        this.apellido = p_apellido;
        this.nombre = p_nombre;
        this.sueldoBasico = p_importe;
        this.fechaIngreso = p_fecha;
        this.jefe = null;
    }

    /**
     * Constructor para modelar un objeto de tipo empleado con jefe.
     * @param p_cuil El CUIL del empleado.
     * @param p_apellido El apellido del empleado.
     * @param p_nombre El nombre del empleado.
     * @param p_importe El sueldo básico del empleado.
     * @param p_fecha La fecha de ingreso del empleado.
     * @param p_jefe El jefe del empleado.
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha, EmpleadoConJefe p_jefe) {
        this(p_cuil, p_apellido, p_nombre, p_importe, p_fecha);
        this.jefe = p_jefe;
    }

    /**
     * Obtiene el CUIL del empleado.
     * @return El CUIL del empleado.
     */
    public long getCuil() {
        return cuil;
    }

    /**
     * Obtiene el apellido del empleado.
     * @return El apellido del empleado.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Obtiene el nombre del empleado.
     * @return El nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el sueldo básico del empleado.
     * @return El sueldo básico del empleado.
     */
    public double getSueldoBasico() {
        return sueldoBasico;
    }

    /**
     * Obtiene la fecha de ingreso del empleado.
     * @return La fecha de ingreso del empleado.
     */
    public Calendar getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * Obtiene el jefe del empleado.
     * @return El jefe del empleado.
     */
    public EmpleadoConJefe getJefe() {
        return jefe;
    }

    /**
     * Calcula la antigüedad del empleado en años.
     * @return La antigüedad del empleado en años.
     */
    public int antiguedad() {
        Calendar fechaHoy = Calendar.getInstance();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return anioHoy - fechaIngreso.get(Calendar.YEAR);
    }

    /**
     * Calcula el descuento aplicable al sueldo básico del empleado.
     * @return El monto del descuento.
     */
    private double descuento() {
        return (getSueldoBasico() - 12) * 0.12;
    }

    /**
     * Calcula el adicional aplicable al sueldo básico del empleado basado en la antigüedad.
     * @return El monto del adicional.
     */
    private double adicional() {
        int antiguedad = antiguedad();
        if (antiguedad < 2) {
            return getSueldoBasico() * 1.2;
        } else if (antiguedad <= 10) {
            return sueldoBasico * 1.4;
        } else {
            return sueldoBasico * 1.6;
        }
    }

    /**
     * Calcula el sueldo neto del empleado considerando el sueldo básico, descuentos y adicionales.
     * @return El sueldo neto del empleado.
     */
    public double sueldoNeto() {
        return sueldoBasico + adicional() - descuento();
    }

    /**
     * Obtiene el nombre y apellido del empleado en formato "Nombre Apellido".
     * @return El nombre y apellido del empleado.
     */
    public String nomYApe() {
        return nombre + " " + apellido;
    }

    /**
     * Obtiene el apellido y nombre del empleado en formato "Apellido, Nombre".
     * @return El apellido y nombre del empleado.
     */
    public String apeYNom() {
        return apellido + ", " + nombre;
    }

    /**
     * Devuelve una línea con la información del empleado: CUIL, apellido y nombre, y sueldo neto.
     * @return Una línea con la información del empleado.
     */
    public String mostrarLinea() {
        return getCuil() + "\t" + apeYNom() + "..............$" + sueldoNeto();
    }

    /**
     * Muestra la información detallada del empleado, incluyendo nombre, CUIL, antigüedad, sueldo neto y jefe.
     */
    public void mostrar() {
        System.out.println("Nombre y Apellido: " + nomYApe());
        System.out.println("CUIL: " + cuil + "\tAntigüedad: " + antiguedad() + " años de servicio");
        System.out.println("Sueldo Neto: $" + sueldoNeto());
        if (jefe != null) {
            System.out.println("Responde a: " + jefe.apeYNom());
        } else {
            System.out.println("Responde a: GERENTE GENERAL");
        }
    }

    /**
     * Verifica si la fecha actual coincide con la fecha de ingreso del empleado.
     * @return true si hoy es el aniversario de ingreso del empleado, false en caso contrario.
     */
    public boolean esAniversario() {
        Calendar fechaHoy = Calendar.getInstance();
        return fechaHoy.get(Calendar.MONTH) == fechaIngreso.get(Calendar.MONTH) &&
               fechaHoy.get(Calendar.DATE) == fechaIngreso.get(Calendar.DATE);
    }
}
