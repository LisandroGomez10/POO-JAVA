import java.util.*; 
/**
 * La clase Empleado representa a un empleado con información básica como CUIL,
 * apellido, nombre, sueldo básico y fecha de ingreso. Proporciona métodos para calcular
 * antigüedad, descuentos, adicionales, sueldo neto y verificar si es aniversario.
 * 
 * @author Gomez Hertler Lisandro
 * @version 21/8/2024
 */
public class Empleado extends Persona {
    private long cuil;
    private double sueldoBasico;
    private Calendar fechaIngreso;

    /**
     * Constructor para inicializar un objeto de la clase {@code Empleado} con CUIL, apellido,
     * nombre, sueldo básico y año de ingreso.
     *
     * @param p_cuil        El CUIL del empleado.
     * @param p_apellido    El apellido del empleado.
     * @param p_nombre      El nombre del empleado.
     * @param p_importe     El sueldo básico del empleado.
     * @param p_anio        El año de ingreso del empleado en la empresa.
     */
    
    public Empleado(int p_dni,long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio,Calendar p_anioIngreso) {
        super(p_dni, p_nombre, p_apellido, p_anio);
        this.setCuil(p_cuil);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_anioIngreso);
    }

    /**
     * Constructor para inicializar un objeto de la clase {@code Empleado} con CUIL, apellido,
     * nombre, sueldo básico y fecha completa de ingreso.
     *
     * @param p_cuil        El CUIL del empleado.
     * @param p_apellido    El apellido del empleado.
     * @param p_nombre      El nombre del empleado.
     * @param p_importe     El sueldo básico del empleado.
     * @param p_fecha       La fecha completa de ingreso del empleado en la empresa.
     */
    public Empleado(int p_dni, int p_anio, long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha) {
        super(p_dni, p_nombre, p_apellido, p_anio);
        this.setCuil(p_cuil);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
    }

    /**
     * Obtiene el CUIL del empleado.
     *
     * @return El CUIL del empleado.
     */
    public long getCuil() {
        return cuil;
    }

    /**
     * Establece el CUIL del empleado.
     *
     * @param p_cuil El nuevo CUIL del empleado.
     */
    private void setCuil(long p_cuil) {
        this.cuil = p_cuil;
    }

    /**
     * Obtiene el sueldo básico del empleado.
     *
     * @return El sueldo básico del empleado.
     */
    public double getSueldoBasico() {
        return sueldoBasico;
    }

    /**
     * Establece el sueldo básico del empleado.
     *
     * @param p_sueldoBasico El nuevo sueldo básico del empleado.
     */
    private void setSueldoBasico(double p_sueldoBasico) {
        this.sueldoBasico = p_sueldoBasico;
    }

    /**
     * Obtiene la fecha de ingreso del empleado a la empresa.
     *
     * @return La fecha de ingreso del empleado.
     */
    public Calendar getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * Establece la fecha de ingreso del empleado a la empresa.
     *
     * @param p_fechaIngreso La nueva fecha de ingreso del empleado.
     */
    private void setFechaIngreso(Calendar p_fechaIngreso) {
        this.fechaIngreso = p_fechaIngreso;
    }

    /**
     * Calcula la antigüedad del empleado en años.
     *
     * @return La antigüedad del empleado en años.
     */
    public int antiguedad() {
        Calendar fechaHoy = Calendar.getInstance();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        int anioIngreso = this.getFechaIngreso().get(Calendar.YEAR);
        return anioHoy - anioIngreso;
    }

    /**
     * Calcula el descuento aplicado al sueldo del empleado. 
     *
     * @return El monto total de descuentos aplicados al sueldo.
     */
    private double descuento() {
        return (this.getSueldoBasico() * 0.02) + 1500;
    }

    /**
     * Calcula el adicional que se suma al sueldo básico en base a la antigüedad del empleado.
     *
     * @return El monto del adicional a sumar al sueldo básico.
     */
    private double adicional() {
        int antiguedad = this.antiguedad();
        if (antiguedad < 2) {
            return this.getSueldoBasico() * 0.02;
        } else if (antiguedad >= 2 && antiguedad < 10) {
            return this.getSueldoBasico() * 0.04;
        } else {
            return this.getSueldoBasico() * 0.06;
        }
    }

    /**
     * Calcula el sueldo neto del empleado.
     *
     * @return El sueldo neto del empleado.
     */
    public double sueldoNeto() {
        return this.getSueldoBasico() + this.adicional() - this.descuento();
    }

    /**
     * Obtiene el nombre completo del empleado en el formato "Nombre Apellido".
     *
     * @return El nombre completo del empleado.
     */
    public String nomYApe() {
        return this.getNombre() + " " + this.getApellido();
    }

    /**
     * Obtiene el nombre completo del empleado en el formato "Apellido, Nombre".
     *
     * @return El nombre completo del empleado en el formato "Apellido, Nombre".
     */
    public String apeYNom() {
        return this.getApellido() + ", " + this.getNombre();
    }

    /**
     * Muestra la información completa del empleado en la consola.
     */
    public void mostrar() {
        super.mostrar();
        System.out.println("CUIL: " + this.getCuil() + "   Antigüedad: " + this.antiguedad() + " años de servicio");
        System.out.println("Sueldo Neto: $ " + this.sueldoNeto());
    }

    /**
     * Retorna una cadena con la información del empleado en un formato compacto.
     *
     * @return Una cadena con la información del empleado en formato compacto.
     */
    public String mostrarLinea() {
        return this.getCuil() + "   " + this.apeYNom() + "  ......$" + this.sueldoNeto();
    }

    /**
     * Comprueba si hoy es el aniversario de ingreso del empleado.
     *
     * @return {@code true} si hoy es el aniversario de ingreso; {@code false} en caso contrario.
     */
    public boolean esAniversario() {
        Calendar hoy = Calendar.getInstance();
        return (hoy.get(Calendar.DAY_OF_MONTH) == this.fechaIngreso.get(Calendar.DAY_OF_MONTH) &&
                hoy.get(Calendar.MONTH) == this.fechaIngreso.get(Calendar.MONTH));
    }
}


