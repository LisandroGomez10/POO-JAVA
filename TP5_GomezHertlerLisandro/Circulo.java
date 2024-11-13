/**
 * Clase Circulo que representa un círculo geométrico.
 * Extiende la clase Elipse y proporciona un constructor
 * específico para círculos con un radio igual en ambos ejes.
 * 
 * @author Lisandro Gomez Hertler
 * @version 20/10/2024
 */
public class Circulo extends Elipse {

    /**
     * Constructor de la clase Circulo que inicializa el círculo
     * con un centro y un radio especificados.
     * 
     * @param p_centro Punto que representa el centro del círculo.
     * @param p_radio Radio del círculo.
     */
    public Circulo(Punto p_centro, double p_radio) {
        super(p_centro, p_radio, p_radio);
    }
    
    /**
     * Constructor de la clase Circulo que inicializa el círculo
     * con un centro por defecto y un radio de 0.
     */
    public Circulo() {
        super(new Punto(), 0.0, 0.0);    
    }
    
    /**
     * Devuelve el nombre de la figura geométrica.
     * 
     * @return Nombre de la figura, en este caso "******Circulo******".
     */
    public String nombreFigura() {
        return "******Circulo******";   
    }
}
