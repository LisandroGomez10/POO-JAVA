import java.util.*;
public class Empresa
{
    public static void main(String[] args) {
    Calendar fechaIngreso = new GregorianCalendar(1998, Calendar.JANUARY, 1);     
    Empleado emple = new Empleado(13549867,27135498678l,"Perez", "Dario",1500,1998,fechaIngreso);  
    Persona persona = new Persona(13549867,"Dario", "Perez",1998);
    emple.mostrar();
    System.out.println("------------------------------------------");
    persona.mostrar();
    }
}
