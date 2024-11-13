/**
 * La clase {@code Producto} representa a un producto de mercado con información
 * como: código, rubro al que pertenece, descripción, costo, stock, porcentaje de
 * punto de reposición, existencia mínima de cada producto y laboratorio proveedor.
 * 
 * @author Gomez Hertler Lisandro
 * @version 29/8/2024
 */
public class Producto{
    // instance variables - replace the example below with your own
    private int codigo;
    private String rubro;
    private String descripcion;
    private double costo;
    private int stock;
    private double porcPtoRepo;
    private int existMinima;
    private Laboratorio laboratorio;

    /**
     * Constructor para inicializar un objeto de la clase {@code Producto} con código, 
     * rubro, descripción, costo, porcentaje de punto de reposición, existencia mínima,
     * laboratorio y el stock que inicializa en cero(0).
     *
     * @param p_codigo          El código del producto.
     * @param p_rubro           El rubro perteneciente del producto.
     * @param p_desc            La descripción del producto.
     * @param p_costo           El costo unitario del producto.       
     * @param p_porcPtoRepo     El porcentaje de punto de reposición del producto.
     * @param p_existMinima     La existencia mínima de cada producto.
     * @param p_lab             El laboratorio proveedor del producto.
       */
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, double p_porcPtoRepo, int p_existMinima, Laboratorio p_lab){
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setCosto(p_costo);
        this.setPorcPtoRepo(p_porcPtoRepo);
        this.setExistMinima(p_existMinima);
        this.setLab(p_lab);
        this.setStock(0);
    }
    
    /**
     * Constructor para inicializar un objeto de la clase {@code Producto} con código, 
     * rubro, descripción, costo, porcentaje de punto de reposición incializado en cero (0.0), 
     * existencia mínima inicializado en cero (0),laboratorio y el stock inicializado 
     * en cero(0).
     *
     * @param p_codigo          El código del producto.
     * @param p_rubro           El rubro perteneciente del producto.
     * @param p_desc            La descripción del producto.
     * @param p_costo           El costo unitario del producto.       
     * @param p_lab             El laboratorio proveedor del producto.
       */
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, Laboratorio p_lab){
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setCosto(p_costo);
        this.setPorcPtoRepo(0.0);
        this.setExistMinima(0);
        this.setLab(p_lab);
        this.setStock(0);
    }
    
    /**
     * Establece el codigo del producto.
     * 
     * @param p_codigo El código del producto.
       */
    private void setCodigo(int p_codigo){
        this.codigo = p_codigo;
    }
    /**
     * Obtiene el código del producto.
     * 
     * @return el código del producto.
       */
    public int getCodigo(){
        return this.codigo;
    }
    
    private void setRubro(String p_rubro){
        this.rubro = p_rubro;
    }
    public String getRubro(){
        return this.rubro;
    }
    
    private void setDescripcion(String p_desc){
        this.descripcion = p_desc;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    
    private void setCosto(double p_costo){
        this.costo = p_costo;
    }
    public double getCosto(){
        return this.costo;
    }
    
    private void setPorcPtoRepo(double p_porcPtoRepo){
        this.porcPtoRepo = p_porcPtoRepo;
    }
    public double getPorcPtoRepo(){
        return this.porcPtoRepo;
    }
    
    private void setExistMinima(int p_existMinima){
        this.existMinima = p_existMinima;
    }
    public int getExistMinima(){
        return this.existMinima;
    }
    
    private void setLab(Laboratorio p_lab){
        this.laboratorio = p_lab;
    }
    public Laboratorio getLab(){
        return this.laboratorio;
    }
    
    private void setStock(int p_stock){
        this.stock = p_stock;
    }
    public int getStock(){
        return this.stock;
    }
    
    /**
     * Permite modificar el stock (agregando o quitando), recibe
     * una cantidad entera de stock como parámetro.
     * 
     * @param p_cantidad Cantidad entera de productos a agregar o quitar.
       */
    public void ajuste(int p_cantidad){
        setStock(this.getStock() + p_cantidad);
    }
    
    /**
     * Calcula el valor que resulta de agregar un 12% al precio de costo.
     * 
     * @return el precio de lista.
       */
    public double precioLista(){
        return this.getCosto() * 1.12;
    }
    
    /**
     * Calcula el valor que representa el precio por pago al contado del 
     * producto, que se calcula restando un 5% al precio de lista.
     * 
     * @return el precio de lista descontado el 5%.
       */
    public double precioContado(){
        return this.precioLista()*0.95;
    }
    
    /**
     * Multiplica el stock por el precio de costo, más una rentabilidad de 12%.
     * 
     * @return el stock valorizado.
       */
    public double stockValorizado(){
        return (this.getStock() * this.getCosto())*1.12;
    }
    
    /**
     * Permite ajustar el porcentaje de punto de reposición.
     * 
     * @param p_porce porcentaje a ajustar del punto de reposición.
       */
    public void ajustarPtoRepo(double p_porce){
        setPorcPtoRepo(p_porce);
    }
    
    /**
     * Permite ajustar la existencia mínima.
     * 
     * @param p_cantidad cantidad entera de productos.
       */
    public void ajustarExistMin(int p_cantidad){
        setExistMinima(p_cantidad);
    }
    
    /**
     * Devuelve un String formado por la concatenación de la descripción del producto, 
     * el precio de lista y el precio de contado.
     * 
     * @return una línea de texto.
       */
    public String mostrarLinea(){
        return this.getDescripcion()+"\t"+this.precioLista()+"    "+this.precioContado();
    }
    
    /**
     * Muestra la información del laboratorio y del producto por pantalla.
     * Información como: rubro, decripción, precio costo, stock y stock valorizado.
       */
    public void mostrar(){
        System.out.println("************************************");
        System.out.println(laboratorio.mostrar());
        System.out.println("\nRubro: "+this.getRubro());
        System.out.println("Descripcion: "+this.getDescripcion());
        System.out.println("Precio Costo: $"+this.getCosto());
        System.out.println("Stock: "+this.getStock()+"  -  Stock Valorizado: $"+stockValorizado());
        System.out.println("************************************");
        System.out.println();
    }
}














