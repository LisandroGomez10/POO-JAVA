
public class EjecutarElipse
{
   public static void main(String[]args) {
       Punto punto = new Punto(5.0,3.0);
       Elipse elipse = new Elipse(punto,20.44,46.86);
       elipse.caracteristicas();
   }
}
