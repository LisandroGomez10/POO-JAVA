import java.util.Scanner;

public class GestionHospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ingreso de datos de la localidad de nacimiento
        System.out.print("Ingrese la localidad de nacimiento del paciente: ");
        String localidadNaceNombre = scanner.nextLine();
        System.out.print("Ingrese la provincia de nacimiento del paciente: ");
        String provinciaNace = scanner.nextLine();
        Localidad localidadNace = new Localidad(localidadNaceNombre, provinciaNace);
        
        // Ingreso de datos de la localidad de residencia
        System.out.print("Ingrese la localidad donde vive el paciente: ");
        String localidadViveNombre = scanner.nextLine();
        System.out.print("Ingrese la provincia donde vive el paciente: ");
        String provinciaVive = scanner.nextLine();
        Localidad localidadVive = new Localidad(localidadViveNombre, provinciaVive);
        
        // Ingreso de datos del paciente
        System.out.print("Ingrese el nombre del paciente: ");
        String nombrePaciente = scanner.nextLine();
        System.out.print("Ingrese la historia clínica del paciente: ");
        int historiaClinica = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese el domicilio del paciente: ");
        String domicilioPaciente = scanner.nextLine();
        
        Paciente paciente = new Paciente(historiaClinica, nombrePaciente, domicilioPaciente, localidadNace, localidadVive);
        
        // Ingreso de datos del hospital
        System.out.print("Ingrese el nombre del hospital: ");
        String nombreHospital = scanner.nextLine();
        System.out.print("Ingrese el nombre del director: ");
        String nombreDirector = scanner.nextLine();
        
        Hospital hospital = new Hospital(nombreHospital, nombreDirector);
        
        // Mostrar los datos filiatorios del paciente
        hospital.consultaDatosFiliatorios(paciente);
        
        scanner.close();
    }
}
