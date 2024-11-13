import java.util.ArrayList;

public class AplicacionBanco {
    public static void main(String[] args) {
        // Crear localidad
        Localidad localidad = new Localidad("Corrientes", "Corrientes");

        // Crear empleados
        Empleado empleado1 = new Empleado(20-12345678-9,"Gomez", "Marisa", 50000, 2002);
        Empleado empleado2 = new Empleado(20-87654321-9,"Villalba", "Martin", 60000, 1998);

        // Crear titulares de cuentas
        Persona persona1 = new Persona(46461232,"Marisa", "Gomez", 2002);
        Persona persona2 = new Persona(45237822,"Martín", "Villalba",1998);

        // Crear cuentas bancarias
        CuentaBancaria cuenta1 = new CuentaBancaria(123456,persona1,0);
        CuentaBancaria cuenta2 = new CuentaBancaria(654321,persona2,500);

        // Crear el banco y agregar empleados y cuentas
        Banco banco = new Banco("Banco Rio", localidad, 1, empleado1);
        
        banco.agregarCuenta(cuenta1);
        banco.agregarCuenta(cuenta2);
        
        banco.quitarEmpleado(empleado1);
        banco.mostrarResumen();
        banco.mostrar();
        
        banco.agregarEmpleado(empleado2);
        // Mostrar resumen del banco
        banco.mostrarResumen();
        // Mostrar información de sueldos
        banco.mostrar();
    }
}
