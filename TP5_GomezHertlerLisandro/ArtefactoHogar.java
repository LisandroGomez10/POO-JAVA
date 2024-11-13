/**
 * La clase abstracta ArtefactoHogar representa un artefacto genérico para el hogar,
 * proporcionando atributos comunes como marca, precio y stock. 
 * 
 * <p>
 * Esta clase sirve como base para otras clases específicas que hereden de ella, 
 * y ofrece métodos para calcular cuotas de crédito y para imprimir los detalles
 * del artefacto.
 * </p>
 * 
 * <p>
 * La clase define un método abstracto {@code creditoConAdicional} que debe ser 
 * implementado por las subclases.
 * </p>
 * 
 * @author Lisandro Gomez Hertler
 * @version 20/10/2024
 */
public abstract class ArtefactoHogar {

    // Variables de instancia
    private String marca;
    private float precio;
    private int stock;

    /**
     * Constructor para crear una instancia de ArtefactoHogar con los atributos especificados.
     * 
     * @param p_marca la marca del artefacto
     * @param p_precio el precio del artefacto
     * @param p_stock la cantidad de stock disponible del artefacto
     */
    public ArtefactoHogar(String p_marca, float p_precio, int p_stock) {
        this.setMarca(p_marca);
        this.setPrecio(p_precio);
        this.setStock(p_stock);
    }

    /**
     * Devuelve la marca del artefacto.
     * 
     * @return la marca del artefacto
     */
    public String getMarca() {
        return this.marca;
    }

    /**
     * Devuelve el precio del artefacto.
     * 
     * @return el precio del artefacto
     */
    public float getPrecio() {
        return this.precio;
    }

    /**
     * Devuelve la cantidad de stock disponible del artefacto.
     * 
     * @return la cantidad de stock
     */
    public int getStock() {
        return this.stock;
    }

    /**
     * Establece la marca del artefacto.
     * 
     * @param p_marca la marca del artefacto
     */
    private void setMarca(String p_marca) {
        this.marca = p_marca;
    }

    /**
     * Establece el precio del artefacto.
     * 
     * @param p_precio el precio del artefacto
     */
    private void setPrecio(float p_precio) {
        this.precio = p_precio;
    }

    /**
     * Establece la cantidad de stock disponible del artefacto.
     * 
     * @param p_stock la cantidad de stock
     */
    private void setStock(int p_stock) {
        this.stock = p_stock;
    }

    /**
     * Imprime los detalles básicos del artefacto, incluyendo marca, precio y stock.
     */
    public void imprimir() {
        System.out.println("Marca: " + this.getMarca() + " - Precio: " + this.getPrecio() + " - Stock: " + this.getStock());
    }

    /**
     * Calcula el valor de una cuota de crédito basado en la cantidad de cuotas y el interés proporcionado.
     * 
     * @param p_cuotas el número de cuotas
     * @param p_interes el interés aplicado al crédito
     * @return el valor de una cuota
     */
    public float cuotaCredito(int p_cuotas, float p_interes) {
        return (this.getPrecio() * p_interes) / p_cuotas;
    }

    /**
     * Método abstracto que debe ser implementado por las subclases, 
     * permitiendo calcular el crédito con un valor adicional según las características del artefacto.
     * 
     * @param p_cuotas el número de cuotas
     * @param p_interes el interés aplicado
     * @return el valor de la cuota con el adicional
     */
    public abstract float creditoConAdicional(int p_cuotas, float p_interes);
}
