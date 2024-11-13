import java.util.Scanner;
import java.util.Calendar;

public class Banco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Ingreso de datos personales
        System.out.print("Ingrese el nombre del titular: ");
        String nombre = teclado.nextLine();
        
        System.out.print("Ingrese el apellido del titular: ");
        String apellido = teclado.nextLine();
        
        System.out.print("Ingrese el DNI del titular: ");
        int dni = teclado.nextInt();
        
        // Ingreso de fecha de nacimiento
        System.out.print("Ingrese el Día de nacimiento del titular: ");
        int diaNacimiento = teclado.nextInt();
        
        System.out.print("Ingrese el Mes de nacimiento del titular: ");
        int mesNacimiento = teclado.nextInt();
        
        System.out.print("Ingrese el Año de nacimiento del titular: ");
        int anioNacimiento = teclado.nextInt();
        
        // Crear la fecha de nacimiento usando Calendar
        Calendar fecha = Calendar.getInstance();
        fecha.set(anioNacimiento, (mesNacimiento - 1), diaNacimiento);
        
        // Crear objeto Persona con los datos ingresados
        Persona persona1 = new Persona(dni, nombre, apellido, fecha);
        
        // Crear otra persona con datos predefinidos
        Persona per1 = new Persona(46461232, "Juan", "Perez", 2005);
        
        // Ingreso del saldo inicial para CajaDeAhorro
        System.out.print("Ingrese el saldo inicial para la caja de ahorro: ");
        double saldoInicial = teclado.nextDouble();
        
        // Crear CajaDeAhorro con los datos ingresados
        CajaDeAhorro caja1 = new CajaDeAhorro(1234, persona1, saldoInicial);
        
        // Crear CuentaCorriente con datos predefinidos
        CuentaCorriente cuenta = new CuentaCorriente(1735, per1);
        
        // Operaciones en la cuenta corriente
        cuenta.depositar(1000.0);
        cuenta.extraer(400.0);
        cuenta.mostrar();
        
        System.out.println();
        
        // Operaciones en la caja de ahorro
        caja1.mostrar();
        caja1.extraer(25000);
        caja1.mostrar();
        caja1.depositar(1200);
        caja1.mostrar();
        
        // Comprobación de cumpleaños
        System.out.println("Es cumpleaños del cliente?");
        System.out.println(persona1.esCumpleanios() ? "Sí" : "No");
        
        teclado.close();
    }
}
