import java.util.*;
/** 
 * La clase Comercio representa un comercio que gestiona una lista de empleados.
 * Los empleados se almacenan en un HashMap donde la clave es el CUIL de cada empleado.
 * @author Gomez Hertler Lisandro
 * @version 22/09/24
 */
public class Comercio {

    private String nombre;
    private HashMap<Long, Empleado> empleados; 

    /**
     * Constructor que inicializa el comercio con su nombre.
     * @param p_nombre Nombre del comercio.
     */
    public Comercio(String p_nombre) {
        this.setNombre(p_nombre);
        this.setEmpleados(new HashMap<>());
    }

    /**
     * Constructor que inicializa el comercio con su nombre y una lista de empleados.
     * @param p_nombre Nombre del comercio.
     * @param p_empleado HashMap que contiene los empleados del comercio.
     */
    public Comercio (String p_nombre, HashMap<Long, Empleado> p_empleado) {
        this.setNombre(p_nombre);
        this.setEmpleados(p_empleado);
    }

    /**
     * Obtiene el nombre del comercio.
     * @return El nombre del comercio.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Establece el nombre del comercio.
     * @param p_nombre El nombre del comercio.
     */
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    /**
     * Obtiene el HashMap de empleados.
     * @return Un HashMap que contiene los empleados, donde la clave es el CUIL.
     */
    public HashMap<Long, Empleado> getEmpleados() {
        return this.empleados;
    }

    /**
     * Establece el HashMap de empleados.
     * @param p_empleado HashMap que contiene los empleados del comercio.
     */
    private void setEmpleados(HashMap<Long, Empleado> p_empleado) {
        this.empleados = p_empleado;
    }

    /**
     * Da de alta un nuevo empleado en el comercio.
     * @param p_empleado El empleado que será añadido al comercio.
     */
    public void altaEmpleado(Empleado p_empleado) {
        empleados.put(p_empleado.getCuil(), p_empleado);
    }

    /**
     * Da de baja a un empleado del comercio basado en su CUIL.
     * @param p_cuil CUIL del empleado a dar de baja.
     * @return El empleado que fue dado de baja, o null si no se encontraba.
     */
    public Empleado bajaEmpleado(long p_cuil) {
        return empleados.remove(p_cuil);
    }

    /**
     * Obtiene la cantidad total de empleados en el comercio.
     * @return El número total de empleados.
     */
    public int cantidadDeEmpleados() {
        return empleados.size();
    }

    /**
     * Verifica si un empleado con un CUIL específico trabaja en el comercio.
     * @param p_cuil CUIL del empleado a verificar.
     * @return true si el empleado está en el comercio, false de lo contrario.
     */
    public boolean esEmpleado(long p_cuil) {
        return empleados.containsKey(p_cuil);
    }

    /**
     * Busca un empleado en el comercio usando su CUIL.
     * @param p_cuil CUIL del empleado a buscar.
     * @return El empleado encontrado, o null si no existe.
     */
    public Empleado buscarEmpleado(long p_cuil) {
        return empleados.get(p_cuil);
    }

    /**
     * Muestra el sueldo neto de un empleado basado en su CUIL.
     * @param p_cuil CUIL del empleado cuyo sueldo neto se quiere mostrar.
     */
    public void sueldoNeto(long p_cuil) {
        Empleado empleado = empleados.get(p_cuil);
        if (empleado != null) {
            System.out.println("El sueldo neto de " + empleado.getNombre() + " es: " + empleado.sueldoNeto());
        } else {
            System.out.println("Empleado no encontrado");
        }
    }

    /**
     * Muestra la nómina de empleados del comercio, incluyendo CUIL, nombre y sueldo neto.
     */
    public void nomina() {
        System.out.println("*** Nómina de empleados de " + nombre + " ***");
        for (Empleado empleado : empleados.values()) {
            System.out.println(empleado.getCuil() + " " + empleado.apeYNom() + "------------- $" + empleado.sueldoNeto());
        }
    }
}
