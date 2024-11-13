import java.util.Scanner;
import java.util.Calendar;

public class IberaServicios{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        long cuil1, cuil2;
        String apellido1, apellido2, nombre1, nombre2;
        double importe1, importe2;
        int dia, mes, anio, diaGG, mesGG, anioGG;
        
        System.out.print("Ingrese el CUIL del Gerente General: ");
        cuil1 = entrada.nextLong();
        System.out.print("Ingrese el nombre del Gerente General: ");
        nombre1 = entrada.next();
        System.out.print("Ingrese el apellido del Gerente General: ");
        apellido1 = entrada.next();
        System.out.print("Ingrese el importe importe del Gerente General: $");
        importe1 = entrada.nextDouble();
        System.out.print("Ingrese el dia de ingreso del Gerente General: ");
        diaGG = entrada.nextInt();
        System.out.print("Ahora el mes: ");
        mesGG = entrada.nextInt();
        System.out.print("Ahora el año: ");
        anioGG = entrada.nextInt();
        Calendar fecha1 = Calendar.getInstance();
        fecha1.set(anioGG, (mesGG-1), diaGG);
        
        System.out.println();
        
        System.out.print("Ingrese el CUIL del empleado: ");
        cuil2 = entrada.nextLong();
        System.out.print("Ingrese el nombre del empleado: ");
        nombre2 = entrada.next();
        System.out.print("Ingrese el apellido del empleado: ");
        apellido2 = entrada.next();
        System.out.print("Ingrese el importe importe del empleado: $");
        importe2 = entrada.nextDouble();
        System.out.print("Ingrese el dia de ingreso del empleado: ");
        dia = entrada.nextInt();
        System.out.print("Ahora el mes: ");
        mes = entrada.nextInt();
        System.out.print("Ahora el año: ");
        anio = entrada.nextInt();
        Calendar fecha2 = Calendar.getInstance();
        fecha2.set(anio, (mes-1), dia);
        
        EmpleadoConJefe jefe = new EmpleadoConJefe(cuil1, apellido1, nombre1, importe1, fecha1);
        EmpleadoConJefe empleado = new EmpleadoConJefe(cuil2, apellido2, nombre2, importe2, fecha2, jefe);
        
        System.out.println();
        
        empleado.mostrar();
        System.out.print("Puede retirarse 1 hora mas temprano?  ");
        System.out.print(empleado.esAniversario()  ? "Si" : "No");
        
        System.out.println();
        System.out.println();
        
        jefe.mostrar();
        System.out.print("Puede retirarse 1 hora mas temprano?  ");
        System.out.print(jefe.esAniversario()  ? "Si" : "No");
    }
}
