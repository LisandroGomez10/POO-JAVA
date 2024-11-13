//Estatico 
import java.util.Scanner;
public class ArraysDePuntos
{
    public static void Main(String[] args) {
    Punto[] puntos = new Punto[6];
    Scanner scanner = new Scanner(System.in);
    
    for (int i = 0; i < puntos.length; i++) {
        System.out.println("Ingrese la coordenada x del punto: " + (i + 1) + " : ");
    double x = scanner.nextDouble();
        System.out.println("Ingrese la coordenada y del punto: " + (i + 1) + " : ");
    double y = scanner.nextDouble();
        puntos[i] = new Punto(x,y);
    }
    //Recorrido por ser estatico
    System.out.println("\nCoordenadas de los puntos");
    for(Punto punto : puntos) {
        punto.mostrar();
    }
    
    System.out.println("\nDistancia entre dos puntos");
    for(int i = 0; i < puntos.length - 1; i++) {
        double distancia = puntos[i].calcularDistancia(puntos[i + 1]);
        System.out.println("Distancia entre punto " + (i + 1) + "y punto " + (i + 2) + " : " + distancia);
    }
    
 }
    
}

