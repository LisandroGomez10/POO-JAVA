import java.util.*;

/**
 * La clase Laboratorio representa un laboratorio que tiene un nombre, domicilio, 
 * teléfono, un monto mínimo de compra y un día de entrega. Proporciona métodos para ajustar 
 * la compra mínima, ajustar el día de entrega y mostrar la información del laboratorio.
 * 
 * @author Gomez Hertler Lisandro
 * @version 29/8/24
 */
public class Laboratorio {
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;

    /**
     * Constructor que inicializa un objeto {@code Laboratorio} con nombre, domicilio, 
     * teléfono, compra mínima y día de entrega.
     * 
     * @param p_nombre      El nombre del laboratorio.
     * @param p_domicilio   El domicilio del laboratorio.
     * @param p_telefono    El teléfono del laboratorio.
     * @param p_compraMinima La compra mínima requerida.
     * @param p_diaEntrega  El día de entrega.
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMinima, int p_diaEntrega) {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(p_compraMinima);
        this.setDiaEntrega(p_diaEntrega);
    }

    /**
     * Constructor que inicializa un objeto {@code Laboratorio} con nombre, domicilio y teléfono.
     * Los valores de compra mínima y día de entrega se inicializan con 0.
     * 
     * @param p_nombre      El nombre del laboratorio.
     * @param p_domicilio   El domicilio del laboratorio.
     * @param p_telefono    El teléfono del laboratorio.
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono) {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(0);
        this.setDiaEntrega(0);
    }

    /**
     * Establece el nombre del laboratorio.
     * 
     * @param p_nombre El nuevo nombre del laboratorio.
     */
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    /**
     * Retorna el nombre del laboratorio.
     * 
     * @return El nombre del laboratorio.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el domicilio del laboratorio.
     * 
     * @param p_domicilio El nuevo domicilio del laboratorio.
     */
    private void setDomicilio(String p_domicilio) {
        this.domicilio = p_domicilio;
    }

    /**
     * Retorna el domicilio del laboratorio.
     * 
     * @return El domicilio del laboratorio.
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * Establece el teléfono del laboratorio.
     * 
     * @param p_telefono El nuevo teléfono del laboratorio.
     */
    private void setTelefono(String p_telefono) {
        this.telefono = p_telefono;
    }

    /**
     * Retorna el teléfono del laboratorio.
     * 
     * @return El teléfono del laboratorio.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece la compra mínima requerida por el laboratorio.
     * 
     * @param p_compraMinima La nueva compra mínima requerida.
     */
    private void setCompraMinima(int p_compraMinima) {
        this.compraMinima = p_compraMinima;
    }

    /**
     * Retorna la compra mínima requerida por el laboratorio.
     * 
     * @return La compra mínima requerida.
     */
    public int getCompraMinima() {
        return compraMinima;
    }

    /**
     * Establece el día de entrega del laboratorio.
     * 
     * @param p_diaEntrega El nuevo día de entrega.
     */
    private void setDiaEntrega(int p_diaEntrega) {
        this.diaEntrega = p_diaEntrega;
    }

    /**
     * Retorna el día de entrega del laboratorio.
     * 
     * @return El día de entrega.
     */
    public int getDiaEntrega() {
        return diaEntrega;
    }

    /**
     * Ajusta la compra mínima y muestra el nuevo valor en pantalla.
     * 
     * @param p_compraMinima La nueva compra mínima para ajustar.
     */
    public void ajusteCompraMinima(int p_compraMinima) {
        System.out.println("Compra mínima: $" + p_compraMinima * 1.5);
    }

    /**
     * Ajusta el día de entrega y muestra el nuevo valor en pantalla.
     * 
     * @param p_diaEnt El nuevo día de entrega para ajustar.
     */
    public void ajusteDiaEntrega(int p_diaEnt) {
        System.out.println("Día de entrega: " + (p_diaEnt + 2));
    }

    /**
     * Retorna una cadena con la información del laboratorio.
     * 
     * @return Una cadena que contiene el nombre, domicilio y teléfono del laboratorio.
     */
    public String mostrar() {
        return "Laboratorio: " + this.getNombre() + "\nDomicilio: " + this.getDomicilio() + " - Teléfono: " + this.getTelefono();
    }
}
