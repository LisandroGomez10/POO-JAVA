import java.util.*;

public class TomaPedido {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Calendar fecha = Calendar.getInstance();
        Laboratorio lab = new Laboratorio("Farmar S.A.", "Junín 1268", "3795038011");
        Producto producto = new Producto(0000, " ", " ", 0.0, lab);

        int opcion = 0;

        System.out.print("Supermercado ChangoMás*\n\n");
        System.out.print("Ingrese la fecha de hoy\n");
        System.out.print("Dia: ");
        int dia = entrada.nextInt();
        System.out.print("Mes: ");
        int mes = entrada.nextInt();
        System.out.print("Año: ");
        int anio = entrada.nextInt();
        fecha.set(anio, (mes - 1), dia);
        Pedido miPedido = new Pedido(fecha, null, producto);

        System.out.print("\nIngrese los datos del cliente");
        System.out.print("\nNombre: ");
        String nombre = entrada.next();
        System.out.print("Apellido: ");
        String apellido = entrada.next();
        System.out.print("DNI: ");
        int dni = entrada.nextInt();

        Cliente cliente = new Cliente(dni, apellido, nombre);

        do {
            System.out.print("\n\n**Menú");
            System.out.print("\n1) Agregar producto al pedido");
            System.out.print("\n2) Quitar producto del pedido");
            System.out.print("\n3) Mostrar el pedido");
            System.out.print("\n0) Salir");
            System.out.print("\nRespuesta: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("\n\nIngrese los datos del producto a pedir");
                    System.out.print("\nCódigo: ");
                    int codigo = entrada.nextInt();
                    System.out.print("Rubro: ");
                    String rubro = entrada.next();
                    System.out.print("Descripción: ");
                    String descripcion = entrada.next();
                    System.out.print("Precio: $");
                    double precio = entrada.nextDouble();

                    producto = new Producto(codigo, rubro, descripcion, precio, lab);
                    miPedido.agregarProducto(producto);
                    System.out.print("\nProducto agregado al pedido con éxito!\n");
                    break;

                case 2:
                System.out.print("\n\nIngrese la descripción del producto a quitar: ");
                String descrip = entrada.next();
                boolean encontrado = false;                
                if(miPedido.getProductos().size() >= 2) {
                 System.out.println("No se puede quitar, debe haber al menos 1");
                } else {
                    for(Object obj : miPedido.getProductos()) {
                        Producto unProducto = (Producto) obj;
                       if(descrip.equals(unProducto.getDescripcion())) {
                          miPedido.quitarProducto(unProducto);
                          System.out.println("Quitado con exito");
                       }
                    }
                }
            break;

                case 3:
                    miPedido.mostrarPedido();
                    break;

                case 0:
                    opcion = 0;
                    break;

                default:
                    System.out.print("\n\nOpción incorrecta");
            }
        } while (opcion != 0);
        
        System.out.print("\n\nGracias por su pedido!");
    }
}