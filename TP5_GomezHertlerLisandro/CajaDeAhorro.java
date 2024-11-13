/**
 * La clase CajaDeAhorro representa una cuenta de ahorro con un límite de extracciones.
 * 
 * @author Gomez Hertler Lisandro
 * @version 30/8/2024
 */
public class CajaDeAhorro extends CuentaBancaria {
    private int limiteExtracciones;

    /**
     * Constructor para inicializar un objeto de la clase {@code CajaDeAhorro}.
     * 
     * @param p_nroCuenta       El número de cuenta del titular.
     * @param p_titular         El titular de la cuenta bancaria.
     * @param p_saldo           El saldo del titular en la cuenta bancaria.
     * @param p_limiteExtracciones El límite de extracciones permitidas por mes.
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo, int p_limiteExtracciones) {
        super(p_nroCuenta, p_titular, p_saldo);
        this.limiteExtracciones = p_limiteExtracciones;
    }

    public int getLimiteExtraccion() {
        return this.limiteExtracciones;
    }
    
    private void setLimiteExtracciones(int p_limiteExtraccion) {
        this.limiteExtracciones = p_limiteExtraccion;
    }

    /**
     * Decrementa el saldo actual de la cuenta bancaria, respetando el límite de extracciones.
     * 
     * @param p_importe cantidad (double) monetaria a quitar.
     * @return el saldo actualizado por el importe retirado.
     * @throws IllegalArgumentException si se supera el límite de extracciones.
     */
    @Override
    public double extraer(double p_importe) {
        if (super.getSaldo() < p_importe || p_importe > this.getLimiteExtraccion()) {
            System.out.println("Error: El importe excede el saldo o el límite de descubierto.");
            return this.getSaldo(); 
        }
        return super.extraer(p_importe);
    }

    /**
     * Restablece el contador de extracciones al inicio de un nuevo ciclo (por ejemplo, mensual).
     */
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Límite de Extracciones: " + this.limiteExtracciones);
    }
}
