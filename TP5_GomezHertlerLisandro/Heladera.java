/**
 * La clase Heladera representa un artefacto de refrigeración que extiende la clase base ArtefactoHogar.
 * Esta clase incluye atributos específicos de una heladera, como la cantidad de pies, el número de puertas,
 * y la presencia o ausencia de un compresor.
 * 
 * <p>
 * Los métodos proporcionan acceso a los atributos, permiten imprimir información detallada de la heladera
 * y calcular el costo de un crédito con un adicional en caso de que la heladera cuente con un compresor.
 * </p>
 * 
 * @author Lisandro Gomez Hertler
 * @version 20/10/2024
 */
public class Heladera extends ArtefactoHogar {

    // Variables de instancia
    private int pies;
    private int puertas;
    private boolean compresor;

    /**
     * Constructor para crear una instancia de Heladera con los atributos especificados.
     * 
     * @param p_marca la marca de la heladera
     * @param p_precio el precio de la heladera
     * @param p_stock el stock disponible de la heladera
     * @param p_pies la cantidad de pies cúbicos de la heladera
     * @param p_puertas el número de puertas de la heladera
     * @param p_compresor indica si la heladera tiene compresor (true) o no (false)
     */
    public Heladera(String p_marca, float p_precio, int p_stock, int p_pies, int p_puertas, boolean p_compresor) {
        super(p_marca, p_precio, p_stock);
        this.setPies(p_pies);
        this.setPuertas(p_puertas);
        this.setCompresor(p_compresor);
    }

    /**
     * Devuelve la cantidad de pies cúbicos de la heladera.
     * 
     * @return los pies cúbicos
     */
    public int getPies() {
        return this.pies;
    }

    /**
     * Devuelve el número de puertas de la heladera.
     * 
     * @return el número de puertas
     */
    public int getPuertas() {
        return this.puertas;
    }

    /**
     * Indica si la heladera tiene compresor o no.
     * 
     * @return true si la heladera tiene compresor, false en caso contrario
     */
    public boolean getCompresor() {
        return this.compresor;
    }

    /**
     * Establece la cantidad de pies cúbicos de la heladera.
     * 
     * @param p_pies los pies cúbicos de la heladera
     */
    private void setPies(int p_pies) {
        this.pies = p_pies;
    }

    /**
     * Establece el número de puertas de la heladera.
     * 
     * @param p_puertas el número de puertas
     */
    private void setPuertas(int p_puertas) {
        this.puertas = p_puertas;
    }

    /**
     * Establece si la heladera tiene compresor.
     * 
     * @param p_compresor true si tiene compresor, false en caso contrario
     */
    private void setCompresor(boolean p_compresor) {
        this.compresor = p_compresor;
    }

    /**
     * Imprime la información completa de la heladera, incluyendo los detalles heredados de ArtefactoHogar.
     */
    public void imprimir() {
        System.out.println("**** Heladera ****");
        super.imprimir();
        System.out.println("Pies: " + this.getPies());
        System.out.println("Puertas: " + this.getPuertas());
        System.out.println("Compresor: " + this.getCompresor());
    }

    /**
     * Calcula el costo de un crédito con adicional basado en el número de cuotas y el interés proporcionado.
     * Si la heladera tiene compresor, se agrega un adicional de 50 unidades al costo base del crédito.
     * 
     * @param p_cuotas el número de cuotas para el crédito
     * @param p_interes el interés aplicado al crédito
     * @return el valor de la cuota con el interés y el adicional por compresor, si aplica
     */
    public float creditoConAdicional(int p_cuotas, float p_interes) {
        float cuotaBase = super.cuotaCredito(p_cuotas, p_interes);
        if (this.getCompresor()) {
            cuotaBase += 50;  // Adicional por compresor
        }
        return cuotaBase;
    }
}
