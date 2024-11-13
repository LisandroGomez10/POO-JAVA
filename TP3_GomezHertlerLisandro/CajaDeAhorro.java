/**
 * La clase CajaDeAhorro representa a una caja bancaria de ahorro con su
 * información como: número de cuenta, saldo, extracciones posibles y el titular.
 * Además, proporciona los métodos para depositar, extraer, verificar si se puede 
 * extraer dinero y mostrar por pantalla datos del titular y de la operación.
 * 
 * @author Gomez Hertler Lisandro
 * @version 29/8/2024
   */
public class CajaDeAhorro{
    // instance variables - replace the example below with your own
    private int nroCuenta;
    private double saldo;
    private int extraccionesPosibles;
    private Persona titular;
    
    /**
     * Constructor para inicializar un objeto de la clase {@code CajaDeAhorro} con número de cuenta, 
     * titular, saldo que incializa en cero (0.0) y extracciones posibles que inicializa en diez (10).
     *
     * @param p_nroCuenta       El número de cuenta del titular.
     * @param p_titular         El titular de la caja.
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular){
        // initialise instance variables
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0.0);
        this.setExtraP(10);
    }
    /**
     * Constructor para inicializar un objeto de la clase {@code CajaDeAhorro} con número de cuenta, 
     * titular, saldo y extracciones posibles que inicializa en diez (10).
     *
     * @param p_nroCuenta       El número de cuenta del titular.
     * @param p_titular         El titular de la caja.
     * @param setSaldo          El saldo del titular.
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo){
        // initialise instance variables
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
        this.setExtraP(10);
    }
    
    /**
     * Establece el número de cuenta del titular.
     *
     * @param p_nroCuenta El nuevo número de cuenta del titular.
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
    
    /**
     * Establece a la persona como titular.
     * 
     * @param p_titular el nuevo titular.
       */
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    /**
     * Obtiene al titular.
     * 
     * @return el titular y sus datos.
       */
    public Persona getTitular(){
        return this.titular;
    }
    
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    public double getSaldo(){
        return this.saldo;
    }
    
    private void setExtraP(int p_extraccionesPosibles){
        this.extraccionesPosibles = p_extraccionesPosibles;
    }
    public int getExtraP(){
        return this.extraccionesPosibles;
    }
    
    /**
     * Devuelve true si el importe a retirar no supera el saldo
     * disponible y si aún no usó todas las extracciones posibles.
     * 
     * @param p_importe valor monetario pasado como parámetro.
     * @return un valor booleano.
       */
    private boolean puedeExtraer(double p_importe){
        if(p_importe <= this.getSaldo() && this.getExtraP() != 0){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * Realiza la extracción restando al saldo actual el parametro p_importe,
     * y descuenta 1 al número de extracciones posibles.
     * 
     * @param p_importe valor monetario pasado como parámetro. 
       */
    private void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
        this.setExtraP(this.getExtraP() - 1);
    }
    
    /**
     * Coordina la operación, de acuerdo a si se cumplen las condiciones de extracción, 
     * si no pudiera informará el motivo por el cual no se pudo extraer.
     * 
     * @param p_importe valor monetario pasado como parámetro.
       */
    public void extraer(double p_importe){
        if(this.puedeExtraer(p_importe)){    
            this.extraccion(p_importe);
        }else if(this.getExtraP() == 0){
            System.out.println("No tiene habilitadas mas extracciones!");
        }else{
            System.out.println("No puede extraer mas que el saldo!");
        }
    }
    
    /**
     * Agrega el importe al saldo actual.
     * 
     * @param p_importe valor monetario pasado como parámetro.
       */
    public void depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
    }
    
    /**
     * Muestra la información de la caja de ahorro por pantalla.
     * Incluye número de cuenta, saldo, nombre y apellido del titular
     * y las extracciones posibles.
       */
    public void mostrar(){
        System.out.println("***********************************************");
        System.out.println("- Caja de Ahorro -");
        System.out.println("Nro. Cuenta: "+this.getNroCuenta()+"  -  Saldo: $"+this.getSaldo());
        System.out.println("Titular: "+this.titular.nomYApe());
        System.out.println("Extracciones Posibles: "+this.getExtraP());
        System.out.println("***********************************************");
    }
}















