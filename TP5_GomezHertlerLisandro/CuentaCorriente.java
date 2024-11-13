/**
 * La clase CuentaCorriente representa una cuenta corriente que permite
 * un descubierto hasta un límite específico.
 * 
 * @author Gomez Hertler Lisandro
 * @version 30/8/2024
 */
public class CuentaCorriente extends CuentaBancaria {
    private double limiteDescubierto;

    /**
     * Constructor para inicializar un objeto de la clase {@code CuentaCorriente}.
     * 
     * @param p_nroCuenta       El número de cuenta del titular.
     * @param p_titular         El titular de la cuenta bancaria.
     * @param p_saldo           El saldo del titular en la cuenta bancaria.
     * @param p_limiteDescubierto El límite de descubierto permitido.
     */
    
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo, double p_limiteDescubierto) {
        super(p_nroCuenta, p_titular, p_saldo);
        this.limiteDescubierto = p_limiteDescubierto;
    }

    public double getLimite() {
        return this.limiteDescubierto;
    }
    
    private void setLimite(double p_limite) {
        this.limiteDescubierto = p_limite;
    }
    
    /**
     * Decrementa el saldo actual de la cuenta bancaria, permitiendo descubiertos.
     * 
     * @param p_importe cantidad (double) monetaria a quitar.
     * @return el saldo actualizado por el importe retirado.
     * @throws IllegalArgumentException si el importe excede el saldo más el límite de descubierto.
     */
    public double extraer(double p_importe) {
        if (this.getSaldo() + this.getLimite() < p_importe) {
            System.out.println("El importe excede el saldo y el límite de descubierto.");
        }
        return super.extraer(p_importe);
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Límite de Descubierto: $" + this.getLimite());
    }
}
