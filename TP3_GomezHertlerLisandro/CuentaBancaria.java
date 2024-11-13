/**
 * La clase CuentaBancaria representa a una cuenta bancaria con información
 * como: número de cuenta, saldo y el objeto titular.
 * 
 * @author Gomez Hertler Lisandro
 * @version 30/8/2024
 */
public class CuentaBancaria{
    // instance variables - replace the example below with your own
    private int nroCuenta;
    private double saldo;
    private Persona titular;
    
    /**
     * Constructor para inicializar un objeto de la clase {@code CuentaBancaria} con número
     * de cuenta, titular y saldo inicializado en cero (0.0).
     * 
     * @param p_nroCuenta       El número de cuenta del titular.
     * @param p_titular         El titular de la cuenta bancaria.
       */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular){
        // initialise instance variables
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0.0);
    }
    /**
     * Constructor para inicializar un objeto de la clase {@code CuentaBancaria} con número
     * de cuenta, titular y saldo.
     * 
     * @param p_nroCuenta       El número de cuenta del titular.
     * @param p_titular         El titular de la cuenta bancaria.
     * @param p_saldo           El saldo del titular en la cuenta bancaria.
       */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo){
        // initialise instance variables
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
    }
    
    /**
     * Establece el número de cuenta del titular.
     * 
     * @param p_nroCuenta el número de cuenta del titular.
       */
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    /**
     * Obtiene el número de cuenta del titular.
     * 
     * @return el número de cuenta del titular.
       */
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    public Persona getTitular(){
        return this.titular;
    }
    
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    public double getSaldo(){
        return this.saldo;
    }
    
    /**
     * Incrementa el saldo actual de la cuenta bancaria.
     * 
     * @param p_importe cantidad (double) monetaria a añadir.
     * @return el saldo actualizado por el importe.
       */
    public double depositar(double p_importe){
        this.setSaldo(this.getSaldo()+p_importe);
        return this.getSaldo();
    }
    
    /**
     * Decrementa el saldo actual de la cuenta bancaria.
     * 
     * @param p_importe cantidad (double) monetaria a quitar.
     * @return el saldo actualizado por el importe retirado.
       */
    public double extraer(double p_importe){
        this.setSaldo(this.getSaldo()-p_importe);
        return this.getSaldo();
    }
    
    /**
     * Devuelve un String formado por la concatenación tabulada del número de cuenta, 
     * el titular de la cuenta bancaria y el saldo.
     * 
     * @return una línea de texto con información.
       */
    public String toString(){
        return this.getNroCuenta()+"\t"+titular.nomYApe()+"\t$"+this.getSaldo();
    }
    
    /**
     * Muestra la información de la cuenta bancaria por pantalla.
     * Información como: nombre y apellido del titular, años del titular, 
     * saldo y la línea de texto creada en el método toString().
       */
    public void mostrar(){
        System.out.println("****************************");
        System.out.println("-Cuenta Bancaria-");
        System.out.println("Titular: "+titular.nomYApe()+" ("+titular.edad()+" años)");
        System.out.println("Saldo: $"+this.getSaldo());
        System.out.println("****************************");
        System.out.println("\n"+ this.toString());
        System.out.println();
    }
}















