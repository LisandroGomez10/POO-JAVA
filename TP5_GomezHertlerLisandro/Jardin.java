import java.util.ArrayList;

/**
 * Clase Jardin que representa un jardín que contiene figuras geométricas.
 * Permite calcular el área total y la cantidad de latas de pintura necesarias
 * para cubrir la superficie de las figuras.
 * 
 * @author Lisandro Gomez Hertler
 * @version 20/10/2024
 */
public class Jardin {
    
    private String nombre;
    private ArrayList<FiguraGeometrica> figuras;
    
    /**
     * Constructor de la clase Jardin con una lista de figuras geométricas.
     * 
     * @param p_nombre Nombre del jardín.
     * @param p_figura Lista de figuras geométricas en el jardín.
     */
    public Jardin(String p_nombre, ArrayList<FiguraGeometrica> p_figura) {
        this.setNombre(p_nombre);
        this.setFigura(p_figura);
    }

    /**
     * Constructor de la clase Jardin sin figuras geométricas iniciales.
     * 
     * @param p_nombre Nombre del jardín.
     */
    public Jardin(String p_nombre) {
        this.setNombre(p_nombre);
        this.setFigura(new ArrayList<>());
    }
    
    /**
     * Obtiene el nombre del jardín.
     * 
     * @return Nombre del jardín.
     */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
     * Establece el nombre del jardín.
     * 
     * @param p_nombre Nombre del jardín.
     */
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }
    
    /**
     * Obtiene la lista de figuras geométricas en el jardín.
     * 
     * @return Lista de figuras geométricas.
     */
    public ArrayList<FiguraGeometrica> getFigura() {
        return this.figuras;
    }
    
    /**
     * Establece la lista de figuras geométricas en el jardín.
     * 
     * @param p_figura Lista de figuras geométricas.
     */
    private void setFigura(ArrayList<FiguraGeometrica> p_figura) {
        this.figuras = p_figura;
    }
    
    /**
     * Agrega una figura geométrica al jardín.
     * 
     * @param figura Figura geométrica a agregar.
     */
    public void agregarFigura(FiguraGeometrica figura) {
        this.getFigura().add(figura);
    }
    
    /**
     * Quita una figura geométrica del jardín según su índice.
     * 
     * @param indice Índice de la figura a quitar.
     */
    public void quitarFigura(int indice) {
        if (indice >= 0 && indice < figuras.size()) {
            this.getFigura().remove(indice);
        } else {
            System.out.println("Índice fuera de rango. No se pudo quitar la figura.");
        }
    }
    
    /**
     * Calcula la cantidad de litros de pintura necesarios para cubrir el jardín.
     * 
     * @return Litros de pintura necesarios.
     */
    public double cuantosLitros() {
        double litrosPorLata = 4;
        double coberturaPorLata = 20;
        double litrosNecesarios = (this.cuantosMetros() / coberturaPorLata) * litrosPorLata;
        return litrosNecesarios;
    }
    
    /**
     * Calcula la cantidad de latas de pintura necesarias para cubrir el jardín.
     * 
     * @return Cantidad de latas necesarias.
     */
    public int cuantasLatas() {
        double coberturaPorLata = 20;
        double latasNecesarias = this.cuantosMetros() / coberturaPorLata;
        return (int) Math.ceil(latasNecesarias);
    }
    
    /**
     * Calcula la superficie total de todas las figuras geométricas en el jardín.
     * 
     * @return Superficie total de las figuras.
     */
    public double cuantosMetros() {
        double totalMetros = 0.0;
        for (FiguraGeometrica figura : figuras) {
            totalMetros += figura.superficie();
        }
        return totalMetros;  
    }
    
    /**
     * Muestra un detalle de las figuras en el jardín, incluyendo el total a cubrir
     * y la cantidad de latas a comprar.
     */
    public void detalleFiguras() {
        System.out.println("Presupuesto: " + this.getNombre());
        for (FiguraGeometrica figura : figuras) {
            figura.mostrarSuperficie();
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Total a cubrir: " + String.format("%.2f", this.cuantosMetros()));
        System.out.println("Comprar: " + this.cuantasLatas());
    }
}
