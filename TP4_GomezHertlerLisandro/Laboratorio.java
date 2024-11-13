import java.util.*;

/**
 * La clase {@code Laboratorio} representa un laboratorio. Proporciona métodos para modificar sus atributos
 * y mostrarlos, ajustar la compra mínima, ajustar el día de entrega y mostrar.
 *
 * @author Gomez Hertler Lisandro
 * @version 21/8/24
 * 
 */
public class Laboratorio{
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;
    
    /**
     * Constructor que inicializa un laboratorio con nombre, domicilio, teléfono, compra mínima y día de entrega.
     *
     * @param p_nombre          El nombre del laboratorio.
     * @param p_domicilio       El domicilio del laboratorio.
     * @param p_telefono        El telefono del laboratorio.
     * @param p_compraMinima    La compra mínima de productos.
     * @param p_diaEntrega      El dia de entrega.
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMinima, int p_diaEntrega){
        // initialise instance variables
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(p_compraMinima);
        this.setDiaEntrega(p_diaEntrega);
    }
    /**
     * Constructor que inicializa un laboratorio con nombre, domicilio y teléfono.
     *
     * @param p_nombre          El nombre del laboratorio.
     * @param p_domicilio       El domicilio del laboratorio.
     * @param p_telefono        El telefono del laboratorio.
     * @param p_compraMinima    La compra mínima de productos.
     * @param p_diaEntrega      El dia de entrega.
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono)
    {
        // initialise instance variables
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(0);
        this.setDiaEntrega(0);
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    public String getNombre(){
        return nombre;
    }
    
    /**
     * Establece el domicilio del laboratorio.
     *
     * @param p_domicilio domicilio del laboratorio.
     */
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    /**
     * Obtiene el domicilio del laboratorio.
     *
     * @return El domicilio del laboratorio.
     */
    public String getDomicilio(){
        return domicilio;
    }
    
    private void setTelefono(String p_telefono){
        this.telefono = p_telefono;
    }
    public String getTelefono(){
        return telefono;
    }
    
    private void setCompraMinima(int p_compraMinima){
        this.compraMinima = p_compraMinima;
    }
    public int getCompraMinima(){
        return compraMinima;
    }
    
    private void setDiaEntrega(int p_diaEntrega){
        this.diaEntrega = p_diaEntrega;
    }
    public int getDiaEntrega(){
        return diaEntrega;
    }
    
    /**
     * Permite modificar compraMinima, asignándole un nuevo valor.
     *
     * @param p_compraMinima La compra minima del laboratorio.
     */
    public void nuevaCompraMinima(int p_compraMinima){
        System.out.println("Compra minima: $"+ p_compraMinima * 1.5);
    }
    
    /**
     * Permite modificar diaEntrega, asignándole un nuevo valor.
     *
     * @param p_diaEntrega El dia de entrega del laboratorio.
     */
    public void nuevoDiaEntrega(int p_diaEnt){
        System.out.println("Dia de entrega: "+ (p_diaEnt + 2));        
    }
    
    /**
     * Devuelve una linea de texto concatenada.
     *
     * @return una linea de texto concatenada.
     */
    public String mostrar(){
        return "Laboratorio: "+this.getNombre()+"\nDomicilio: "+this.getDomicilio()+" - Telefono: "+this.getTelefono();
    }
}
