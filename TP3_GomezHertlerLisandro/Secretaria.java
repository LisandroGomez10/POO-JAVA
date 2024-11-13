import java.util.Scanner;

public class Secretaria{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar los datos de la escuela
        System.out.print("Ingrese el nombre de la escuela: ");
        String nombreEscuela = scanner.nextLine();
        
        System.out.print("Ingrese el domicilio de la escuela: ");
        String domicilioEscuela = scanner.nextLine();
        
        System.out.print("Ingrese el nombre del director: ");
        String directorEscuela = scanner.nextLine();
        
        Escuela escuela = new Escuela(nombreEscuela, domicilioEscuela, directorEscuela);
        
        // Solicitar los datos del docente
        System.out.print("Ingrese el nombre del docente: ");
        String nombreDocente = scanner.nextLine();
        
        System.out.print("Ingrese el grado del docente: ");
        String gradoDocente = scanner.nextLine();
        
        System.out.print("Ingrese el sueldo básico del docente: ");
        double sueldoBasico = scanner.nextDouble();
        
        System.out.print("Ingrese la asignación familiar del docente: ");
        double asignacionFamiliar = scanner.nextDouble();
        
        Docente docente = new Docente(nombreDocente, gradoDocente, sueldoBasico, asignacionFamiliar);
        
        // Imprimir el recibo
        escuela.imprimirRecibo(docente);
        
        scanner.close();
    }
}
