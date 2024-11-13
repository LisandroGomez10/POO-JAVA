import java.util.*;
/**
 * La clase {@code Producto} representa a un pedido con información
 * como: fecha, cliente y lista de productos.
 * 
 * @author Gomez Hertler Lisandro
 * @version 12/9/2024
 */
public class Pedido{
    private ArrayList<Producto> producto; 
    private Calendar fecha;
    private Cliente cliente;
    
    /**
     * Constructor para inicializar un objeto de la clase {@code Pedido} con 
     * fecha, cliente y producto.
     *
     * @param p_fecha          La fecha del pedido.
     * @param p_cliente        El cliente del pedido.
     * @param p_producto       El producto pedido.
       */
    public Pedido(Calendar p_fecha, Cliente p_cliente, ArrayList<Producto> p_producto){
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(p_producto);
    }
    /**
     * Constructor para inicializar un objeto de la clase {@code Pedido} con 
     * fecha, cliente y producto.
     *
     * @param p_fecha          La fecha del pedido.
     * @param p_cliente        El cliente del pedido.
     * @param p_producto       El producto pedido.
       */
    public Pedido(Calendar p_fecha, Cliente p_cliente, Producto p_producto){
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(new ArrayList<Producto>());
        this.agregarProducto(p_producto);
    }

    /**
     * Setters que establecen atributos del pedido.
     * 
     * @param p_fecha          La fecha del pedido.
     * @param p_cliente        El cliente del pedido.
     * @param p_producto       El producto pedido.
       */
    private void setFecha(Calendar p_fecha){
        // put your code here
        this.fecha = p_fecha;
    }
    private void setCliente(Cliente p_cliente){
        this.cliente = p_cliente;
    }
    private void setProductos(ArrayList<Producto> p_producto){
        this.producto = p_producto;
    }
    
    /**
     * Agrega un nuevo producto a la lista.
     * 
     * @param p_producto producto para agregar.
     * @return valor booleano.
       */
    public boolean agregarProducto(Producto p_producto){
        return this.getProductos().add(p_producto);
    }
    /**
     * Quita un nuevo producto a la lista.
     * 
     * @param p_producto producto para quitar.
     * @return valor booleano.
       */
    public boolean quitarProducto(Producto p_producto){
        if(this.getProductos().size() > 1){
            return this.getProductos().remove(p_producto);
        }else{
            System.out.println("No se puede eliminar, debe quedar al menos un empleado");
            return false;
        }
    }
    
    /**
     * Getters que obtienen datos del pedido.
     * 
     * @return fecha del pedido
     * @return cliente del pedido
     * @return producto pedido
       */
    public Calendar getFecha(){
        return this.fecha;
    }
    public Cliente getCliente(){
        return this.cliente;
    }
    public ArrayList<Producto> getProductos(){
        return this.producto;
    }
    
    /**
     * Calcula la suma del precio de contado de cada elemento de la lista. 
     * 
     * @return el total de precios al contado.
       */
    public double totalAlContado(){
       double total = 0.0;
       for(Producto unProducto : this.getProductos()){
            total += unProducto.precioContado();
       }
       return total;
    }
    
    /**
     * Calcula la suma del precio de lista de cada elemento de la colección de productos solicitados.
     * 
     * @return el total de precios lista.
       */
    public double totalFinanciado(){
        double total = 0.0;
       for(Producto unProducto : this.getProductos()){
            total += unProducto.precioLista();
       }
       return total;
    }
    
    /**
     * Muestra por pantalla el precio de lista y de contado, y al final, un total para cada precio.
       */
    public void mostrarPedido(){
        String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        System.out.println();
        System.out.println("*******Detalle del Pedido********** Fecha: "+this.getFecha().get(Calendar.DATE)+" de "+ meses[this.getFecha().get(Calendar.MONTH)]+" de "+this.getFecha().get(Calendar.YEAR));
        System.out.println("Producto\tPrecio Lista\t\t\tPrecio Contado");
        System.out.println("----------------------------------------------------------");
        for(Producto unProducto : this.getProductos()){
            if(unProducto.getCosto() != 0.0){
                System.out.println(unProducto.getDescripcion()+"\t\t"+unProducto.precioLista()+"\t\t"+unProducto.precioContado());
            }
        }
        System.out.println("----------------------------------------------------------");
        System.out.println("Total:\t\t$"+totalFinanciado()+"\t\t$"+totalAlContado());
    }
}













