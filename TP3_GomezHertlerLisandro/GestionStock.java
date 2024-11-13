import java.util.Scanner;
/**
 * Write a description of class GestionStock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GestionStock{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Laboratorio lab = new Laboratorio("Colgate S.A.", "Calle Falsa 3675", "3795 - 038012");
        Producto pro = new Producto(7894, "Perfumería", "Jabón Dove", 5.25, lab);
        String opcion;
        
        pro.mostrar();
        pro.ajuste(500);
        pro.mostrar();
        pro.ajuste(-200);
        pro.mostrar();
        System.out.print("Desea ver los precios de lista y al contado? (Y/N): ");
        opcion = entrada.next();
        if(opcion.equals("Y") || opcion.equals("y")){
            System.out.println(pro.mostrarLinea());
        }else if(opcion.equals("N") || opcion.equals("n")){
            System.out.println("Sistema finalizado");
        }else{
            System.out.println("Respuesta incorrecta, por lo tanto... Programa finalizado");
        }
    }
}
