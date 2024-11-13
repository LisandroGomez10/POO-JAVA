import java.util.ArrayList;

public class Comercio {
    public static void main(String[] args) {
        Cocina cocina = new Cocina("Volcan", 600, 15, 4, 2000, "80*60*60cm");
        Heladera heladera = new Heladera("Gafa", 1200, 8, 11, 2, true);
        Lavarropas lavarropas = new Lavarropas("Drean", 500, 6, 3, 200, false);
        
        int cuotas = 6;
        float interes = 2.53f;
        
        cocina.imprimir();
        System.out.println("Cuotas: " + cuotas  + " - Interes: " + interes);
        System.out.println("Valor cuota: " + cocina.cuotaCredito(cuotas, interes));
        System.out.println("Valor Cuota Con Adicionales: " + cocina.creditoConAdicional(cuotas, interes));
        
        heladera.imprimir();
        System.out.println("Cuotas: " + cuotas  + " - Interes: " + interes);
        System.out.println("Valor cuota: " + heladera.cuotaCredito(cuotas, interes));
        System.out.println("Valor Cuota Con Adicionales: " + heladera.creditoConAdicional(cuotas, interes));
        
        lavarropas.imprimir();
        System.out.println("Cuotas: " + cuotas  + " - Interes: " + interes);
        System.out.println("Valor cuota: " + lavarropas.cuotaCredito(cuotas, interes));
        System.out.println("Valor Cuota Con Adicionales: " + lavarropas.creditoConAdicional(cuotas, interes));    
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
        // Crear lista de artefactos
        ArrayList<ArtefactoHogar> artefactos = new ArrayList<>();

        // Crear y añadir una heladera
        Heladera heladera = new Heladera("Gafa", 1200.0f, 8, 11, 2, true); // Marca, Precio, Stock, Pies, Puertas, Compresor
        artefactos.add(heladera);

        // Crear y añadir un lavarropas
        Lavarropas lavarropas = new Lavarropas("Whirlpool", 1500.0f, 5,10,20, false); // Marca, Precio, Stock, Automático
        artefactos.add(lavarropas);

        // Crear y añadir una cocina
        Cocina cocina = new Cocina("Volcan", 600.0f, 15, 4, 2000, "80x60x60 cm"); // Marca, Precio, Stock, Hornallas, Calorías, Dimensiones
        artefactos.add(cocina);
      
        // Mostrar información de cada artefacto
        for (ArtefactoHogar artefacto : artefactos) {
            artefacto.imprimir();
            // Supongamos que el usuario desea pagar en 6 cuotas con un interés del 2.53%
            int cuotas = 6;
            float interes = 2.53f;
            float cuota = artefacto.cuotaCredito(cuotas, interes);
            float cuotaConAdicional = artefacto.creditoConAdicional(cuotas, interes);
            System.out.printf("Valor Cuota: %.2f\n", cuota);
            System.out.printf("Valor Cuota Con Adicionales: %.2f\n", cuotaConAdicional);
            System.out.println();
        }
    }
    */
}
}
