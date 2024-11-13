import java.util.ArrayList;

public class AdministracionGerencia {
    public static void main(String args[]) {
        
        // Crear una instancia de Gerencia (sin necesidad de pasar ArrayList en el constructor)
        Gerencia gerencia = new Gerencia("Gerencia Los Arroyos");

        // Crear los servicios
        Servicio internet = new Servicio("Internet", 5.0);
        Servicio lavanderia = new Servicio("Lavandería", 100.0);
        Servicio alquilerAuto = new Servicio("Alquiler de auto", 100.0);

        // Situación 1: Hotel con una estadía de 1 semana (7 días), servicios de internet y lavandería
        Hotel hotel1 = new Hotel("Single", "Hotel Guaraní", 90.0, 7); // Precio total por los 7 días
        hotel1.agregarServicio(internet);
        hotel1.agregarServicio(lavanderia);

        // Situación 2: Cabaña por 5 días, servicios de lavandería y alquiler de auto
        Cabaña cabaña1 = new Cabaña(3, "Cabaña La Alondra", 210, 5); // Precio total por los 5 días, 3 habitaciones
        cabaña1.agregarServicio(lavanderia);
        cabaña1.agregarServicio(alquilerAuto);

        // Agregar los alojamientos a la gerencia
        gerencia.agregarAlojamiento(hotel1);
        gerencia.agregarAlojamiento(cabaña1);

        // Realizar la liquidación
        gerencia.liquidar();

        // Contar los alojamientos tipo Hotel y Cabaña
        int totalHoteles = gerencia.contarAlojamientos("Hotel");
        int totalCabañas = gerencia.contarAlojamientos("Cabaña");

        System.out.println("Total hoteles alquilados: " + totalHoteles);
        System.out.println("Total cabañas alquiladas: " + totalCabañas);
    }
}
    

