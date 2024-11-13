import java.util.*;
/**
 * La clase {@code Cliente} representa a un cliente con información
 * como: dni, apellido, nombre y saldo.
 * 
 * @author Gomez Hertler Lisandro
 * @version 12/9/2024
 */
public class Cliente{
    // instance variables - replace the example below with your own
    private int dni;
    private String apellido;
    private String nombre;
    private double saldo;
    
    /**
     * Constructor para inicializar un objeto de la clase {@code Cliente} con 
     * dni, apellido, nombre y saldo.
     *
     * @param p_dni          El DNI del cliente.
     * @param p_apellido     El apellido del cliente.
     * @param p_nombre       El nombre del cliente.
     * @param p_importe      El importe del saldo del cliente.
       */
    public Cliente(int p_dni, String p_apellido, String p_nombre, double p_importe){
        this.setDni(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setSaldo(p_importe);
    }
    /**
     * Constructor para inicializar un objeto de la clase {@code Cliente} con 
     * dni, apellido, nombre y saldo.
     *
     * @param p_dni          El DNI del cliente.
     * @param p_apellido     El apellido del cliente.
     * @param p_nombre       El nombre del cliente.
     * @param p_importe      El importe del saldo del cliente.
       */
    public Cliente(int p_dni, String p_apellido, String p_nombre){
        this.setDni(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setSaldo(0.0);
    }
    
    /**
     * Obtiene el DNI del cliente.
     * 
     * @return el DNI del cliente.
       */
    public int getDni(){
        // put your code here
        return this.dni;
    }
    /**
     * Establece el DNI del cliente.
     * 
     * @param p_dni El DNI del cliente.
       */
    private void setDni(int p_dni){
        this.dni = p_dni;
    }
    
    public String getNombre()
    {
        // put your code here
        return this.nombre;
    }
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    public String getApellido()
    {
        // put your code here
        return this.apellido;
    }
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    public double getSaldo()
    {
        return this.saldo;
    }
    private void setSaldo(double p_importe){
        this.saldo = p_importe;
    }
    
    /**
     * Concatena el nombre y el apellido del cliente.
     * 
     * @return una linea de texto concatenada.
       */
    public String nomYApe(){
        return this.getNombre()+" "+this.getApellido();
    }
    
    /**
     * Reemplaza el saldo actual por p_importe y devuelve el nuevo saldo.
     * 
     * @param p_importe importe a establecer como saldo.
     * @return el nuevo saldo del cliente.
       */
    public double nuevoSaldo(double p_importe){
        return (this.getSaldo() - this.getSaldo()) + p_importe;
    }
    
    /**
     * Agrega p_importe al saldo actual (lo actualiza) y devuelve el nuevo saldo. 
     * 
     * @param p_importe importe a añadir al saldo.
     * @return el nuevo saldo del cliente.
       */
    public double agregaSaldo(double p_importe){
        this.setSaldo(p_importe);
        return this.getSaldo();
    }
    
    /**
     * Muestra por pantalla la información del cliente. 
       */
    public void mostrar(){
        System.out.println("-Cliente-");
        System.out.println("Nombre y apellido: "+ this.nomYApe());
        System.out.println("Saldo: $"+this.getSaldo());
    }
}


















