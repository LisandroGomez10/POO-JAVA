 /**
 * La clase Circulo representa a un círculo con información
 * como: radio y centro.
 * 
 * @author Gomez Hertler Lisandro
 * @version 29/8/2024
 */
public class Circulo{
    // instance variables - replace the example below with your own
    private double radio;
    private Punto centro;
    
    /**
     * Constructor para inicializar un objeto de la clase {@code Producto} 
     * con radio y centro.
     *
     * @param p_radio       El radio del círculo.
     * @param p_centro      El centro del círculo.
       */
    public Circulo(double p_radio, Punto p_centro){
        this.setRadio(p_radio);
        this.setCentro(p_centro);
    }
    /**
     * Constructor para inicializar un objeto de la clase {@code Producto} 
     * con radio inicializado en cero (0.0) y centro inicializado en cero (0.0).
       */
    public Circulo(){
        this.setRadio(0.0);
        this.setCentro(new Punto());
    }
    
    /**
     * Obtiene el radio del círculo.
     * 
     * @return el radio del círculo.
       */
    public double getRadio(){
        return this.radio;
    }
    /**
     * Establece el radio del círculo.
     * 
     * @param p_radio radio del círculo.
       */
    private void setRadio(double p_radio){
        this.radio = p_radio;
    }
    
    /**
     * Obtiene las coordenadas del centro del círculo.
     * 
     * @return las coordenadas del centro del círculo.
       */
    public Punto getCentro(){
        return this.centro;
    }
    /**
     * Establece las coordenadas del centro del círculo.
     * 
     * @param p_centro coordenadas del centro del círculo.
       */
    private void setCentro(Punto p_centro){
        this.centro = p_centro;
    }
    
    /**
     * Cambia la posición del centro del círculo desde (x, y) a (x+dx, y+dy).
     * 
     * @param p_dx desplazamiento en X.
     * @param p_dy desplazamiento en Y.
       */
    public void desplazar(double p_dx, double p_dy){
        this.getCentro().desplazar(p_dx, p_dy);
    }
    
    /**
     * Muestra las características del círculo por pantalla, 
     * como: centro, radio, superficie y perímetro.
       */
    public void caracteristicas(){
        System.out.println("\n*****Círculo*****");
        System.out.println("Centro: "+this.getCentro().coordenadas()+"\tRadio: "+this.getRadio());
        System.out.println("Superfície: "+this.superficie()+"\tPerímetro: "+this.perimetro());
    }
    
    /**
     * Calcula el perímetro del círculo.
     * 
     * @return el perímetro del círculo.
       */
    public double perimetro(){
        return 2 * 3.14159 * this.getRadio();
    }
    
    /**
     * Calcula la superficie del círculo.
     * 
     * @return la superficie del círculo.
       */
    public double superficie(){
        return 3.14159 * Math.pow(this.getRadio(), 2);
    }
    
    /**
     * Calcula la distancia del círculo con otro círculo pasado como parámetro.
     * 
     * @param otroCirculo otro objeto círculo.
     * @return distancia entre centros de dos círculos.
       */
    public double distanciaA(Circulo otroCirculo){
        return Math.sqrt((Math.pow((otroCirculo.getCentro().getX()-this.getCentro().getX()), 2)) + (Math.pow((otroCirculo.getCentro().getY()-this.getCentro().getY()), 2)));
    }
    
    /**
     * Indica entre dos círculos, cual es el mayor, en función del tamaño de su superficie.
     * 
     * @param otro objeto círculo.
     * @return círculo con mayor superficie.
       */
    public Circulo elMayor(Circulo otroCirculo){
        if(otroCirculo.superficie() < this.superficie()){
            return this;
        }else{
            return otroCirculo;
        }
    }
}

















