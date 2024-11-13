import java.util.Scanner;

public class RegistroCivil {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Ingreso de datos para la Mujer
        System.out.print("Ingrese el nombre de la mujer: ");
        String nombreMujer = teclado.nextLine();
        System.out.print("Ingrese el apellido de la mujer: ");
        String apellidoMujer = teclado.nextLine();
        System.out.print("Ingrese la edad de la mujer: ");
        int edadMujer = teclado.nextInt();

        // Ingreso de datos para el Hombre
        teclado.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese el nombre del hombre: ");
        String nombreHombre = teclado.nextLine();
        System.out.print("Ingrese el apellido del hombre: ");
        String apellidoHombre = teclado.nextLine();
        System.out.print("Ingrese la edad del hombre: ");
        int edadHombre = teclado.nextInt();

        // Creación de objetos Mujer y Hombre con los datos ingresados
        Mujer mujer = new Mujer(nombreMujer, apellidoMujer, edadMujer);
        Hombre hombre = new Hombre(nombreHombre, apellidoHombre, edadHombre);

        // Mostrar el estado civil inicial
        hombre.mostrarEstadoCivil();
        mujer.mostrarEstadoCivil();

        // Casarse
        hombre.casarseCon(mujer);
        System.out.println();

        // Mostrar el estado civil después de casarse
        hombre.mostrarEstadoCivil();
        mujer.mostrarEstadoCivil();

        // Mostrar con quién están casados
        hombre.casadoCon();
        mujer.casadaCon();
        
        System.out.println();

        // Divorcio
        hombre.divorcio();

        System.out.println();

        // Mostrar el estado civil después del divorcio
        hombre.mostrarEstadoCivil();
        mujer.mostrarEstadoCivil();

        teclado.close(); // Cerrar el Scanner
    }
}
