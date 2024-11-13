/**
 * La clase Lavarropas representa un artefacto del hogar especializado en lavarropas,
 * heredando de la clase base ArtefactoHogar. Esta clase incluye atributos específicos como
 * el número de programas, la capacidad de kilos, y si es automático o no.
 * 
 * <p>
 * Los métodos proporcionan acceso a los atributos, permiten imprimir información detallada
 * del lavarropas y calcular el costo de un crédito con un descuento si el modelo no es automático.
 * </p>
 * 
 * @author Lisandro Gomez Hertler
 * @version 20/10/2024
 */
public class Lavarropas extends ArtefactoHogar {

    // Variables de instancia
    private int programas;
    private float kilos;
    private boolean automatico;

    /**
     * Constructor para crear una instancia de Lavarropas con los atributos especificados.
     * 
     * @param p_marca la marca del lavarropas
     * @param p_precio el precio del lavarropas
     * @param p_stock el stock disponible del lavarropas
     * @param p_programas la cantidad de programas del lavarropas
     * @param p_kilos la capacidad en kilos del lavarropas
     * @param p_automatico indica si el lavarropas es automático (true) o no (false)
     */
    public Lavarropas(String p_marca, float p_precio, int p_stock, int p_programas, float p_kilos, boolean p_automatico) {
        super(p_marca, p_precio, p_stock);
        this.setProgramas(p_programas);
        this.setKilos(p_kilos);
        this.setAutomatico(p_automatico);
    }

    /**
     * Devuelve la cantidad de programas del lavarropas.
     * 
     * @return el número de programas
     */
    public int getProgramas() {
        return this.programas;
    }

    /**
     * Devuelve la capacidad en kilos del lavarropas.
     * 
     * @return la capacidad en kilos
     */
    public float getKilos() {
        return this.kilos;
    }

    /**
     * Indica si el lavarropas es automático o no.
     * 
     * @return true si es automático, false en caso contrario
     */
    public boolean getAutomatico() {
        return this.automatico;
    }

    /**
     * Establece la cantidad de programas del lavarropas.
     * 
     * @param p_programas el número de programas
     */
    private void setProgramas(int p_programas) {
        this.programas = p_programas;
    }

    /**
     * Establece la capacidad en kilos del lavarropas.
     * 
     * @param p_kilos la capacidad en kilos
     */
    private void setKilos(float p_kilos) {
        this.kilos = p_kilos;
    }

    /**
     * Establece si el lavarropas es automático.
     * 
     * @param p_automatico true si es automático, false en caso contrario
     */
    private void setAutomatico(boolean p_automatico) {
        this.automatico = p_automatico;
    }

    /**
     * Imprime la información completa del lavarropas, incluyendo los detalles heredados de ArtefactoHogar.
     */
    public void imprimir() {
        System.out.println("**** Lavarropa ****");
        super.imprimir();
        System.out.println("Programas: " + this.getProgramas());
        System.out.println("Kilos: " + this.getKilos());
        System.out.println("Automatico: " + this.getAutomatico());
    }

    /**
     * Calcula el costo de un crédito con adicional basado en el número de cuotas y el interés proporcionado.
     * Si el lavarropas no es automático, se aplica un descuento del 2% sobre el costo base del crédito.
     * 
     * @param p_cuotas el número de cuotas para el crédito
     * @param p_interes el interés aplicado al crédito
     * @return el valor de la cuota con el interés y el descuento por no ser automático, si aplica
     */
    public float creditoConAdicional(int p_cuotas, float p_interes) {
        float cuotaBase = super.cuotaCredito(p_cuotas, p_interes);
        if (!this.getAutomatico()) {
            cuotaBase *= 0.98;  // Descuento del 2% si no es automático
        }
        return cuotaBase;
    }
}
