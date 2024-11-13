import java.util.Random;

public class CreaFigura{
    public static void main(String[] args){
        Random unNumero = new Random();
        
        /*Puntos*/
        double x1 = Double.parseDouble(args[0]);
        double x2 = Double.parseDouble(args[1]);
        double y1 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);
        
        Punto punto1 = new Punto(x1, y1);
        Punto punto2 = new Punto(x2, y2);
        
        punto1.mostrar();
        punto2.mostrar();
        
        System.out.println("La distancia entre el punto 1 y el punto 2 es de: "+punto2.distanciaA(punto1));
        
        /*Círculos*/        
        punto1 = new Punto(0.0, 0.0);
        double radio1 = unNumero.nextDouble() * 100.0;
        Circulo circulo1 = new Circulo(radio1, punto1);
                
        circulo1.desplazar(-240, -230);
        
        circulo1.caracteristicas();
        
        punto2 = new Punto(5.2, 0.5);
        double radio2 = unNumero.nextDouble() * 100.0;
        Circulo circulo2 = new Circulo(radio2, punto2);
        
        circulo2.caracteristicas();
        
        Circulo mayorC = new Circulo();
        mayorC = circulo2.elMayor(circulo1);
        System.out.println("El circulo con mayor superficie es: ");
        mayorC.caracteristicas();
        
        System.out.println("\n\nLa distancia entre circulos es de: "+circulo2.distanciaA(circulo1));
             
        /*Rectángulos*/
        punto1 = new Punto(0.0, 0.0); 
        double alto1 = unNumero.nextDouble() * 100.0;
        double ancho1 = unNumero.nextDouble() * 100.0;  
        Rectangulo rec1 = new Rectangulo(punto1, ancho1, alto1);
        
        rec1.desplazar(40.0, -20.0);
        
        rec1.caracteristicas();
        
        punto2 = new Punto(7.4, 4.5); 
        System.out.println("Ingrese la altura del rectángulo: ");
        double alto2 = unNumero.nextDouble() * 100.0;
        double ancho2 = unNumero.nextDouble() * 100.0;    
        Rectangulo rec2 = new Rectangulo(punto2, ancho2, alto2);
        
        rec2.caracteristicas();
        
        Rectangulo mayorR = new Rectangulo(0.0, 0.0);
        mayorR = rec2.elMayor(rec1);
        System.out.println("El rectángulo con mayor superficie es: ");
        mayorR.caracteristicas();
        
        System.out.println("\n\nLa distancia entre rectángulos es de: "+rec2.distanciaA(rec1));   
        
    }
}
