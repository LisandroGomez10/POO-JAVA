import java.util.*;
public class EjecutableZoologico
{
    public static void main(String[] args) {
    Calendar fecha = new GregorianCalendar(2024,Calendar.SEPTEMBER, 22);
    Persona persona = new Persona(46461232, "Lisandro", "Gomez",2005);
    Persona persona2 = new Persona(46461233, "Julian", "Lopez",2004);
    Persona persona3 = new Persona(46461234, "Pedro", "Ruiz",2003);
    //a) 
    Zoologico zoo = new Zoologico("El caribu");
    //b)
    Individuo indi1 = new Individuo("Lisandro",fecha,persona);
    Individuo indi2 = new Individuo("Julian",fecha,persona2);
    Individuo indi3 = new Individuo("Pedro",fecha,persona3);
    //c)
    Delegacion delegacionPAMI = new Delegacion("PAMI",fecha,indi2);
    delegacionPAMI.inscribirIndividuo(indi3);
    
    zoo.nuevoVisitante(indi1);
    zoo.nuevoVisitante(delegacionPAMI);
    
    //d)
    System.out.println("Visitantes en el zoologico el 22/09/2024: ");
    zoo.listarVisitantePorFecha(fecha);
    
    //e)
    System.out.println("\nRecaudacion del utlimo mes: ");
    Calendar fechaInicio = Calendar.getInstance();
    fechaInicio.set(2024,Calendar.AUGUST,22);
    Calendar fechaFin = Calendar.getInstance();
    fechaFin.set(2024, Calendar.SEPTEMBER,22);
    
    double recaudacion = zoo.calcularRecaudacion(fechaInicio,fechaFin);
    System.out.println("Recaudacion total: " + recaudacion);
    
    //f)
    System.out.println("\nDelegaciones el 22/09/2024");
    zoo.listarPorVisitante(fecha,"Delegacion");
    
    }
}
