import java.util.ArrayList;

/**
 * Clase Pedido que representa un pedido de renglones, donde cada renglon
 * contiene información sobre un item específico.
 * 
 * @author Lisandro Gomez Hertler
 * @version 20/10/2024
 */
public class Pedido {
    
    private ArrayList<Renglon> renglones;

    /**
     * Constructor que inicializa el pedido con una lista de renglones.
     * 
     * @param p_renglones Lista de renglones que forman el pedido.
     */
    public Pedido(ArrayList<Renglon> p_renglones) {
        this.setRenglones(p_renglones);
    }

    /**
     * Constructor que inicializa el pedido con un único renglon.
     * 
     * @param p_renglon Renglon que se agrega al pedido.
     */
    public Pedido(Renglon p_renglon) {
        this.setRenglones(new ArrayList<>());
        this.agregarRenglon(p_renglon);
    }

    /**
     * Devuelve la lista de renglones del pedido.
     * 
     * @return ArrayList de renglones.
     */
    public ArrayList<Renglon> getRenglones() {
        return this.renglones;
    }

    private void setRenglones(ArrayList<Renglon> p_renglones) {
        this.renglones = p_renglones;
    }

    /**
     * Agrega un renglon al pedido.
     * 
     * @param p_renglon Renglon que se desea agregar.
     * @return true si el renglon se agrega correctamente, false en caso contrario.
     */
    public boolean agregarRenglon(Renglon p_renglon) {
        return this.getRenglones().add(p_renglon);
    }

    /**
     * Quita un renglon del pedido.
     * 
     * @param p_renglon Renglon que se desea quitar.
     * @return true si el renglon se elimina correctamente, false en caso contrario.
     */
    public boolean quitarRenglon(Renglon p_renglon) {
    if (this.getRenglones().size() > 1) {
        return this.getRenglones().remove(p_renglon);
    } else {
        System.out.println("No se puede quitar el renglón, debe haber al menos un renglón en el pedido.");
        return false;
    }
}


    /**
     * Muestra los detalles del pedido en la consola, incluyendo la cantidad de 
     * items y el importe total.
     */
    public void mostrar() {
        System.out.println("Pedido:");
        System.out.println("Cantidad de items: " + this.getRenglones().size());
        
        int totalUnidades = 0;
        double totalImporte = 0.0;
        
        int i = 1;
        for (Renglon renglon : this.getRenglones()) {
            System.out.println("Item " + i + ": " + renglon.getCantidad() + " " + renglon.getEtiqueta().toString());
            System.out.println("Precio: $ " + renglon.getImporte());
            totalUnidades += renglon.getCantidad();
            totalImporte += renglon.getImporte();
            i++;
        }
        
        System.out.println("--- Total pedido: " + totalUnidades + " Etiquetas por un importe total de: $" + totalImporte);
    }
}
