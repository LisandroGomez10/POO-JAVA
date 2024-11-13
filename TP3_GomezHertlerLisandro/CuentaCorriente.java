/**
 * La clase CuentaCorriente representa a una cuenta corriente con su
 * información como: número de cuenta, saldo, límite descubierto y el titular.
 * Además, proporciona los métodos para depositar, extraer, verificar si se puede 
 * extraer dinero y mostrar por pantalla datos del titular y de la operación.
 * 
 * @author Gomez Hertler Lisandro
 * @version 30/8/2024
   */
public class CuentaCorriente{
    // instance variables - replace the example below with your own
    private int nroCuenta;
    private double saldo;
    private double limiteDescubierto;
    private Persona titular;
    
    /**
     * Constructor para inicializar un objeto de la clase {@code CuentaCorriente} con número de cuenta, 
     * titular, saldo que incializa en cero (0.0) y límite decubierto que inicializa en quinientos (500.0).
     *
     * @param p_nroCuenta       El número de cuenta del titular.
     * @param p_titular         El titular de la caja.
     */
    public CuentaCorriente(int p_nroCuenta,Persona p_titular){
        // initialise instance variables
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0.0);
        this.setLimiteDescubierto(500.0);
    }
    /**
     * Constructor para inicializar un objeto de la clase {@code CuentaCorriente} con número de cuenta, 
     * titular, saldo y límite decubierto que inicializa en quinientos (500.0).
     *
     * @param p_nroCuenta       El número de cuenta del titular.
     * @param p_titular         El titular de la caja.
     * @param p_saldo           El saldo de la cuenta corriente.
     */
    public CuentaCorriente(int p_nroCuenta,Persona p_titular,double p_saldo){
        // initialise instance variables
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
        this.setLimiteDescubierto(500.0);
    }
    
    public int getNroCuenta() {
        return nroCuenta;
    }
    
    private void setNroCuenta(int p_nroCuenta) {
        this.nroCuenta = p_nroCuenta;
    }
    
    /**
     * Obtiene el saldo de la cuenta corriente.
     * 
     * @return el saldo de la cuenta corriente.
       */
    public double getSaldo() {
        return saldo;
    }
    /**
     * Establece el saldo de la cuenta corriente.
     * 
     * @param p_saldo saldo de la cuenta corriente.
       */
    private void setSaldo(double p_saldo) {
        this.saldo = p_saldo;
    }
    
    public double getLimiteDescubierto() {
        return limiteDescubierto;
    }
    
    private void setLimiteDescubierto(double p_limiteDescubierto) {
        this.limiteDescubierto = p_limiteDescubierto;
    }
    
    public Persona getTitular() {
        return titular;
    }
    
    private void setTitular(Persona p_titular) {
        this.titular = p_titular;
    }
    
    /**
     *  devuelve true si el importe a retirar no supera el
     *  saldo más el límite de descubierto autorizado.
     * 
     * @param p_importe valor monetario pasado como parámetro.
     * @return un valor booleano.
       */
    public boolean puedeExtraer(double p_importe) {
      return p_importe <= (this.getSaldo() + this.getLimiteDescubierto());
    }
    
    /**
     * Realiza la extracción restando al saldo actual el importe.
     * 
     * @param p_importe valor monetario pasado como parámetro. 
       */
    public void extraccion(double p_importe) {
        this.setSaldo(this.getSaldo() - p_importe);
    }
    
    /**
     * Coordina la operación, de acuerdo a si se cumplen las condiciones de extracción, 
     * caso contrario informará el motivo por el cual no se pudo extraer.
     * 
     * @param p_importe valor monetario pasado como parámetro.
       */
    public void extraer(double p_extraer) {
        if(this.puedeExtraer(p_extraer) == true) {
            this.extraccion(p_extraer);
        } else {
         System.out.println("El importe de extraccion sobrepasa el limite de descubierto!!");
        }
    }
    
    /**
     * Agrega el importe al saldo actual.
     * 
     * @param p_importe valor monetario pasado como parámetro.
       */
    public void depositar(double p_importe) {
        this.setSaldo(this.getSaldo() + p_importe);
    }
    
    /**
     * Muestra la información de la cuenta corriente por pantalla.
     * Incluye número de cuenta, saldo, nombre y apellido del titular
     * y el límite descuebierto.
       */
    public void mostrar() {
        System.out.println("-  Cuenta Corriente-");
        System.out.println("Nro Cuenta: " + this.getNroCuenta() + "  " + "Saldo: " + this.getSaldo());
        System.out.println("Titular: " + titular.nomYApe());
        System.out.println("Descubierto: " + this.getLimiteDescubierto());
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
