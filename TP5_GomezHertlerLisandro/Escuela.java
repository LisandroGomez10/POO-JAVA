
public class Escuela
{
    public static void main(String[] args) {
    Alumno alum = new Alumno(28325402,2345,"Luis", "Gomez", 2005, 5.0,9.0);
    Persona persona = new Persona(28325402,"Luis", "Gomez", 2005);
    alum.mostrar(); 
    System.out.println("--------------------------------------------------");
    persona.mostrar();
    }
}


