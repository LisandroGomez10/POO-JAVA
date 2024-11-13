import java.util.ArrayList;

public class EjecutableEtiqueta {
    public static void main(String[] args) {
        // Crear etiquetas (una común y una premium)
        Etiqueta etiquetaPremium1 = new Premium(10, 200.0); // 10 colores, costo $200
        Etiqueta etiquetaComun = new Comun(100.0, 100.0); // Costo $100 y diseño $100
        Etiqueta etiquetaPremium2 = new Premium(7, 200.0); // 7 colores, costo $200

        // Crear renglones con las etiquetas
        Renglon renglon1 = new Renglon(7, 1820.0, etiquetaPremium1); // 7 etiquetas premium
        Renglon renglon2 = new Renglon(57, 5510.0, etiquetaComun);    // 57 etiquetas comunes
        Renglon renglon3 = new Renglon(94, 22748.0, etiquetaPremium2); // 94 etiquetas premium

        // Crear el pedido con un único renglón usando el segundo constructor
        Pedido pedido = new Pedido(renglon1);
        pedido.quitarRenglon(renglon1);
        // Agregar más renglones al pedido usando agregarRenglon()
        pedido.agregarRenglon(renglon2);
        pedido.agregarRenglon(renglon3);

        // Mostrar el pedido por pantalla
        pedido.mostrar();
    }
}
