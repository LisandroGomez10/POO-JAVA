 import java.util.*;
/**
 * La clase {@code Banco} representa a un banco con información
 * como: empleados, localidad, nombre y número de sucursal.
 * 
 * @author Gomez Hertler Lisandro
 * @version 12/9/2024
 */
public class Banco{
    private ArrayList empleados; // Heterogeneo
    private ArrayList cuentas; // Heterogeneo
    private Localidad localidad;
    private String nombre;
    private int nroSucursal;
    /**
     * Constructor para inicializar un objeto de la clase {@code Banco} con 
     * empleados, localidad, nombre y número de sucursal.
     *
     * @param p_nombre          El nombre del banco.
     * @param p_localidad       La localidad del banco.
     * @param p_nroSucursal     El número de sucursal del banco.
     * @param p_empleado        El empleado del banco.
       */
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, Empleado p_empleado){
        // initialise instance variables
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(new ArrayList());
        this.agregarEmpleado(p_empleado);
        this.setCuentas(new ArrayList());
    }
    /**
     * Constructor para inicializar un objeto de la clase {@code Banco} con 
     * empleados, localidad, nombre y número de sucursal.
     *
     * @param p_nombre          El nombre del banco.
     * @param p_localidad       La localidad del banco.
     * @param p_nroSucursal     El número de sucursal del banco.
     * @param p_empleado        El empleado del banco.
       */
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList p_empleado){
        // initialise instance variables
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        //this.setCuentas(new ArrayList());
        this.setEmpleados(p_empleado);
        this.setCuentas(new ArrayList());
    }
    
    /**
     * Constructor para inicializar un objeto de la clase {@code Banco} con 
     * empleados, localidad, nombre, número de sucursal y cuentas del banco.
     *
     * @param p_nombre          El nombre del banco.
     * @param p_localidad       La localidad del banco.
     * @param p_nroSucursal     El número de sucursal del banco.
     * @param p_empleado        El empleado del banco.
       */
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList p_empleados, ArrayList p_cuentas){
        // initialise instance variables
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
        this.setCuentas(p_cuentas);
    }

    /**
     * Getters que obtienen los datos del banco.
     * 
     * @return el nombre del banco.
     * @return la localidad del banco.
     * @return el número de sucursal del banco.
     * @return los empleados del banco.
     * @return las cuentas del cliente del banco.
       */
    public String getNombre(){
        return this.nombre;
    }
    public Localidad getLocalidad(){
        return this.localidad;
    }
    public int getNroSucursal(){
        return this.nroSucursal;
    }
    public ArrayList getEmpleados(){
        return this.empleados;
    }
    public ArrayList getCuentas(){
        return this.cuentas;
    }
    
    /**
     * Setters que establecen los datos del banco.
     * 
     * @param p_nombre          El nombre del banco.
     * @param p_localidad       La localidad del banco.
     * @param p_nroSucursal     El número de sucursal del banco.
     * @param p_empleado        El empleado del banco.
     * @param p_cuentas         Las cuentas del cliente del banco.
       */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setLocalidad(Localidad p_localidad){
        this.localidad = p_localidad;
    }
    private void setNroSucursal(int p_nroSucursal){
        this.nroSucursal = p_nroSucursal;
    }
    private void setEmpleados(ArrayList p_empleado){
        this.empleados = p_empleado;
    }
    private void setCuentas(ArrayList p_cuentas){
        this.cuentas = p_cuentas;
    }
    
    /**
     * Agrega un nuevo empleado a la lista.
     * 
     * @param p_empleado empleado para contratar.
     * @return valor booleano.
       */
    public boolean agregarEmpleado(Empleado p_empleado){
        return this.getEmpleados().add(p_empleado);
    }
    
    /**
     * Quita un empleado a la lista.
     * 
     * @param p_empleado empleado para despedir.
     * @return valor booleano.
       */
    public boolean quitarEmpleado(Empleado p_empleado){
        if(this.getEmpleados().size() > 1){
            return this.getEmpleados().remove(p_empleado);
        }else{
            System.out.println("No se puede eliminar, debe quedar al menos un empleado");
            return false;
        }
    }
    
    /**
     * Muestra los sueldos de cada uno de sus empleados (CUIL, apellido y nombre, y sueldo neto).
       */
    public void listarSueldos(){
        for(Object obj : this.getEmpleados()){
            Empleado empleado = (Empleado) obj;
            System.out.println(empleado.getCuil()+" "+empleado.apeYNom()+"\t\t\t$"+empleado.sueldoNeto());
        }
    } 
    
    /**
     * Informar el monto total a pagar en concepto de sueldos.
     * 
     * @return el total de los sueldos a pagar.
       */
    public double sueldosAPagar(){
        double total = 0.0;
        for(Object obj : this.getEmpleados()){
            Empleado empleado = (Empleado) obj;
            total += empleado.sueldoNeto();
        }
        return total;
    }
    
    /**
     * Muestra por pantalla los datos del banco, los sueldos a pagar y el monto total de
     * sueldos a pagar.
       */
    public void mostrar(){
        Localidad local = this.getLocalidad();
        
        System.out.print("\nBanco: "+this.getNombre()+"\tSucursal: "+this.getNroSucursal());
        System.out.print("\n"+local.mostrar());
        System.out.print("\n-----------------------------------------------------------\n");
        this.listarSueldos();
        System.out.print("-----------------------------------------------------------\n");
        System.out.print("Total a Pagar\t\t\t\t$"+sueldosAPagar());
        System.out.print("\n\n");
    }
    
    /**
     * Agrega una cuenta a la lista.
     * 
     * @param p_cuentas cuenta para agregar.
     * @return valor booleano.
       */
    public boolean agregarCuenta(CuentaBancaria p_cuentas){
        return this.getCuentas().add(p_cuentas);
    }
    
    /**
     * Quita una cuenta a la lista.
     * 
     * @param p_cuentas cuenta para quitar.
     * @return valor booleano.
       */
    public boolean quitarCuenta(CuentaBancaria p_cuentas){
        return this.getCuentas().remove(p_cuentas);
    }
    
    /**
     * Muestra las cuentas que poseen saldo cero y sus titulares.
       */
    public void listarCuentasConSaldoCero(){
        for(Object obj : this.getCuentas()){
            CuentaBancaria cuenta = (CuentaBancaria) obj;
            if(cuenta.getSaldo() == 0.0){
                Persona titular = cuenta.getTitular();
                
                System.out.println(cuenta.getNroCuenta()+"\t\t\t"+titular.nomYApe());
            }
        }
    }
    
    public HashSet<Persona> listaDeTitulares(){
        HashSet<Persona> lista = new HashSet<Persona>();
        
        for(Object obj : this.getCuentas()){
            CuentaBancaria cuenta = (CuentaBancaria) obj;
            if(cuenta.getSaldo() >= 0.0){
                lista.add(cuenta.getTitular());
            }
        }
        return lista;
    }
    
    private int cuentasSaldoActivo(){
        int total = 0;
        for(Object obj : this.getCuentas()){
            CuentaBancaria cuenta = (CuentaBancaria) obj;
            if(cuenta.getSaldo() > 0.0){
                total++;
            } 
        }
        return total;
    }
    
    private int cuentasSaldoCero(){
        int total = 0;
        for(Object obj : this.getCuentas()){
            CuentaBancaria cuenta = (CuentaBancaria) obj;
            if(cuenta.getSaldo() == 0.0){
                total++;
            } 
        }
        return total;
    }
    
    public void mostrarResumen(){
        Localidad local = this.getLocalidad();
        
        System.out.print("\nBanco: "+this.getNombre()+"\tSucursal: "+this.getNroSucursal());
        System.out.print("\n"+local.mostrar());
        System.out.print("\n***************************************************************\n");
        System.out.print("RESÚMEN DE CUENTAS BANCARIAS\n");
        System.out.print("*****************************************************************\n");
        System.out.print("Número total de Cuentas Bancarias: "+ (cuentasSaldoCero()+cuentasSaldoActivo()));
        System.out.print("\nCuentas Activas: "+cuentasSaldoActivo());
        System.out.print("\nCuentas Saldo Cero: "+cuentasSaldoCero());
        System.out.print("\n-----------------------------------------------------------------");
        System.out.print("\nCuentas sin saldo: ");
        System.out.print("\nCuenta---------------------Apellido y Nombre----------------------\n");
        listarCuentasConSaldoCero();
        System.out.print("\n-----------------------------------------------------------------");
        System.out.print("\nListado de Clientes: ");
        for(Object obj : this.listaDeTitulares()){
            Persona unaPersona = (Persona) obj;
            System.out.print(unaPersona.nomYApe()+"; ");
        }
        System.out.print("\n-----------------------------------------------------------------");
    }
}

















