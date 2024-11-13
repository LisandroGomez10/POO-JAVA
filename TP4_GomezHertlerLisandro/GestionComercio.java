import java.util.HashMap;

public class GestionComercio {
    public static void main(String[] args) {
        // Crear algunos empleados preexistentes
        Empleado emp = new Empleado(30100623L, "Gonzalez", "Juan", 1500, 1992);
        Empleado emp2 = new Empleado(37045987L, "Martinez", "Mercedes", 2000, 1996);
        Empleado emp3 = new Empleado(32550096L, "Gomez", "Virginia", 3500, 2000);
        
        Comercio comercio = new Comercio("Avanti SRL"); 
        comercio.altaEmpleado(emp);
        comercio.altaEmpleado(emp2);
        comercio.altaEmpleado(emp3);
        
        comercio.nomina();
        System.out.println("------------------------------------------------------");
        
        
        System.out.println("La cantidad de empleados es:" + comercio.cantidadDeEmpleados());
        System.out.println(comercio.esEmpleado(30100623L));
        System.out.println(comercio.buscarEmpleado(32550096L));
       
    
    
        System.out.println("----------------------------------------------------------------");
        
        comercio.bajaEmpleado(32550096L);
        
        comercio.nomina();
        
    }    
        
    }
