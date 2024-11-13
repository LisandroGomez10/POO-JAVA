import java.util.*;

public class Carrera{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Curso curso = new Curso("Fisica");
        Alumno alumno = new Alumno(0, " ", " ", 0.0, 0.0);
        String opcion = " ";
        
        do{
            System.out.println("Nombre del alumno: ");
            String nombre = entrada.next();
            System.out.println("Apellido del alumno: ");
            String apellido = entrada.next();
            System.out.println("LU del alumno: ");
            int lu = entrada.nextInt();
            System.out.println("Nota del 1er exámen: ");
            double nota1 = entrada.nextDouble();
            System.out.println("Nota del 2do exámen: ");
            double nota2 = entrada.nextDouble();
            
            alumno = new Alumno(lu, nombre, apellido, nota1, nota2);
            curso.inscribirAlumno(alumno);
            
            System.out.println("Agregar otro alumno? (S/N): ");
            opcion = entrada.next();
            
        }while(opcion.equals("s"));
        
        curso.mostrarInscriptos();
        
        System.out.println("LU del alumno a quitar: ");
        int libUni = entrada.nextInt();
        Alumno alumnoBaja = curso.quitarAlumno(libUni);
        System.out.println("Esta inscripto el alumno "+alumnoBaja.nomYApe()+" ? ---> " + curso.estaInscripto(libUni));
        
        curso.mostrarInscriptos();
        
        System.out.println("LU del alumno a buscar: ");
        libUni = entrada.nextInt();
        Alumno alumnoBuscado = curso.buscarAlumno(libUni);
        alumnoBuscado.mostrar();
        
        System.out.println("LU del alumno y su promedio: ");
        libUni = entrada.nextInt();
        curso.imprimirPromedioDelAlumno(libUni);
        
        System.out.println("\n\nPrograma finalizado");
    }    
}
