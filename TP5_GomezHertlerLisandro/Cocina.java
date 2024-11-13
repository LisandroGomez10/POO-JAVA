/**
 * La clase Cocina representa un artefacto de cocina que extiende la clase base ArtefactoHogar.
 * Esta clase incluye atributos específicos de una cocina, como el número de hornallas, la cantidad de calorías
 * y las dimensiones del artefacto.
 * 
 * <p>
 * Los métodos incluyen acceso a los atributos, así como una impresión detallada de la información de la cocina
 * y el cálculo de créditos con adicionales.
 * </p>
 * 
 * @author Gomez Hertler Lisandro
 * @version 20/10/2024
 */
public class Cocina extends ArtefactoHogar {

    // Variables de instancia
    private int hornallas;
    private int calorias;
    private String dimensiones;

    /**
     * Constructor para crear una instancia de Cocina con los atributos especificados.
     * 
     * @param p_marca la marca de la cocina
     * @param p_precio el precio de la cocina
     * @param p_stock el stock disponible de la cocina
     * @param p_hornallas el número de hornallas de la cocina
     * @param p_calorias las calorías que la cocina puede generar
     * @param p_dimensiones las dimensiones físicas de la cocina
     */
    public Cocina(String p_marca, float p_precio, int p_stock, int p_hornallas, int p_calorias, String p_dimensiones) {
        super(p_marca, p_precio, p_stock);
        this.setHornallas(p_hornallas);
        this.setCalorias(p_calorias);
        this.setDimensiones(p_dimensiones);
    }

    /**
     * Devuelve el número de hornallas de la cocina.
     * 
     * @return el número de hornallas
     */
    public int getHornallas() {
        return this.hornallas;
    }

    /**
     * Devuelve la cantidad de calorías que la cocina puede generar.
     * 
     * @return las calorías
     */
    public int getCalorias() {
        return this.calorias;
    }

    /**
     * Devuelve las dimensiones físicas de la cocina.
     * 
     * @return las dimensiones de la cocina en formato String
     */
    public String getDimensiones() {
        return this.dimensiones;
    }

    /**
     * Establece el número de hornallas de la cocina.
     * 
     * @param p_hornallas el número de hornallas
     */
    private void setHornallas(int p_hornallas) {
        this.hornallas = p_hornallas;
    }

    /**
     * Establece la cantidad de calorías que la cocina puede generar.
     * 
     * @param p_calorias las calorías
     */
    private void setCalorias(int p_calorias) {
        this.calorias = p_calorias;
    }

    /**
     * Establece las dimensiones físicas de la cocina.
     * 
     * @param p_dimensiones las dimensiones de la cocina
     */
    private void setDimensiones(String p_dimensiones) {
        this.dimensiones = p_dimensiones;
    }

    /**
     * Imprime la información completa de la cocina, incluyendo los detalles heredados de ArtefactoHogar.
     */
    public void imprimir() {
        System.out.println("**** Cocina ****");
        super.imprimir();
        System.out.println("Hornallas: " + this.getHornallas());
        System.out.println("Calorias: " + this.getCalorias());
        System.out.println("Dimensiones: " + this.getDimensiones());
    }

    /**
     * Calcula el costo de un crédito con adicional basado en el número de cuotas y el interés proporcionado.
     * Este método utiliza la cuota base calculada por la clase padre y aplica cualquier lógica adicional requerida.
     * 
     * @param p_cuotas el número de cuotas para el crédito
     * @param p_intereses el interés aplicado al crédito
     * @return el valor de la cuota con el interés aplicado
     */
    public float creditoConAdicional(int p_cuotas, float p_intereses) {
        float cuotaBase = super.cuotaCredito(p_cuotas, p_intereses);
        return cuotaBase;
    }
}
