import java.util.Scanner;

public class EjecutarCuentaBancaria{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int dni, anio, opcion, nroCuenta;
        String nombre, apellido;
        double saldo;
        
        System.out.print("++++++++++Bienvenido al Banco de Corrientes+++++++++\n\n");
        System.out.print("Ingrese su nombre: ");
        nombre = entrada.next();
        System.out.print("Ingrese su apellido: ");
        apellido = entrada.next();
        System.out.print("Ingrese su DNI: ");
        dni = entrada.nextInt();
        System.out.print("Ingrese su año de nacimiento: ");
        anio = entrada.nextInt();
        System.out.print("Ingrese su número de cuenta: ");
        nroCuenta = entrada.nextInt();
        
        Persona persona = new Persona(dni, nombre, apellido, anio);
        CuentaBancaria cuenta1 = new CuentaBancaria(nroCuenta, persona);
        
        do{
            System.out.print("\n++++++++Menú del Banco de Corrientes+++++++");
            System.out.print("\n1) Depositar");
            System.out.print("\n2) Extraer");
            System.out.print("\n3) Mostrar resultados");
            System.out.print("\n4) Salir");
            System.out.print("\nRespuesta: ");
            opcion = entrada.nextInt();
            System.out.println();
            
            switch(opcion){
                case 1: System.out.print("\nIngrese el monto a depositar: $");
                        saldo = entrada.nextDouble();
                        cuenta1.depositar(saldo);
                        System.out.println("Depositado exitosamente!");
                        break;
                case 2: System.out.println("Saldo disponible: $"+cuenta1.getSaldo());
                        System.out.print("\nIngrese el monto a retirar: $");
                        saldo = entrada.nextDouble();
                        if(saldo < cuenta1.getSaldo() && saldo > 0.0){
                            cuenta1.extraer(saldo);
                            System.out.println("Retire su dinero de la caja");
                        }else{
                            System.out.println("El monto ingresado no está disponible");
                            System.out.println("Ingrese otro monto por favor");
                        }
                        break;
                case 3: cuenta1.mostrar();
                        System.out.println();
                        break;
                case 4: opcion = 4;
                        break;
                default: System.out.print("\nOpción incorrecta. Ingrese otra opción por favor\n\n");
            }
        } while(opcion != 4); 
        System.out.println("\nMuchas gracias por confiarnos su dinero");
        System.out.println("Le deseamos un buen día");
    }
}
