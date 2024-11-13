import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Empresa {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicitar datos del empleado
        System.out.print("Ingrese el CUIL del empleado: ");
        long cuil = teclado.nextLong();
        teclado.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese el apellido del empleado: ");
        String apellido = teclado.nextLine();
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = teclado.nextLine();
        System.out.print("Ingrese el sueldo básico del empleado: ");
        double sueldoBasico = teclado.nextDouble();

        // Solicitar la fecha de ingreso
        System.out.println("Ingrese la fecha de ingreso del empleado:");
        System.out.print("Día: ");
        int dia = teclado.nextInt();
        System.out.print("Mes (1-12): ");
        int mes = teclado.nextInt() - 1; // Restamos 1 ya que Calendar empieza en 0 para enero
        System.out.print("Año: ");
        int anio = teclado.nextInt();

        // Crear la fecha de ingreso usando Calendar
        Calendar fechaIngreso = new GregorianCalendar(anio, mes, dia);

        // Crear un objeto Empleado
        Empleado empleado = new Empleado(cuil, apellido, nombre, sueldoBasico, fechaIngreso);

        // Mostrar la información del empleado
        System.out.println("\nDatos del empleado:");
        empleado.mostrar();

        // Verificar si hoy es aniversario del ingreso
        if (empleado.esAniversario()) {
            System.out.println("\n¡Hoy es el aniversario de ingreso del empleado!");
            System.out.println("El empleado puede retirarse 1 hora más temprano.");
        } else {
            System.out.println("\nHoy no es el aniversario de ingreso del empleado.");
        }

        // Cerrar el Scanner
        teclado.close();
    }
}
