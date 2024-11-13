/**
 * La clase Rectangulo representa a un rectángulo con información
 * como: origen, ancho y alto.
 * 
 * @author Gomez Hertler Lisandro 
 * @version 30/8/2024
 */
public class Rectangulo extends FiguraGeometrica {
    
    private Punto origen;
    private double ancho;
    private double alto;

    /**
     * Constructor para inicializar un objeto de la clase {@code Rectangulo} 
     * con origen, alto y ancho.
     *
     * @param p_origen      Las coordenadas del punto de origen del rectángulo.
     * @param p_ancho       El ancho del rectángulo.
     * @param p_alto        El alto del rectángulo.
       */
    public Rectangulo(Punto p_origen, double p_ancho, double p_alto){
        this.setOrigen(p_origen);
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }
    /**
     * Constructor para inicializar un objeto de la clase {@code Rectangulo} 
     * con origen inicializado en cero (0.0, 0.0), alto y ancho.
     *
     * @param p_ancho       El ancho del rectángulo.
     * @param p_alto        El alto del rectángulo.
       */
    public Rectangulo(double p_ancho, double p_alto){
        this.setOrigen(new Punto());
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }
    
    /**
     * Establece las coordenadas del punto origen.
     * 
     * @param p_origen coordenadas del punto origen.
       */
    private void setOrigen(Punto p_origen){
        this.origen = p_origen;
    }
    /**
     * Obtiene las coordenadas del punto origen.
     * 
     * @return las coordenadas del punto origen.
       */
    public Punto getOrigen(){
        return this.origen;
    }
    
    /**
     * Establece el ancho del rectángulo.
     * 
     * @param el ancho del rectángulo.
       */
    private void setAncho(double p_ancho){
        this.ancho = p_ancho;
    }
    /**
     * Obtiene el ancho del rectángulo.
     * 
     * @return el ancho del rectángulo.
       */
    public double getAncho(){
        return this.ancho;
    }
    
    private void setAlto(double p_alto){
        this.alto = p_alto;
    }
    public double getAlto(){
        return this.alto;
    }
    
    public String nombreFigura() {
        return "******Rectangulo******";
    }
    
    
    /**
     * Cambia la posición del punto origen del rectángulo 
     * desde (x, y) a (x+dx, y+dy).
     * 
     * @param p_dx desplazamiento en X.
     * @param p_dy desplazamiento en Y.
       */
    public void desplazar(double p_dx, double p_dy){
        this.getOrigen().desplazar(p_dx, p_dy);
    }
    
    /**
     * Muestra las características del rectángulo por pantalla, 
     * como: orígen, alto, ancho, superfície y perímetro.
       */
    public void caracteristicas(){
        System.out.println("\n*****Rectángulo*****");
        System.out.println("Orígen: "+this.getOrigen().coordenadas()+"\tAlto: "+this.getAlto()+"\tAncho: "+this.getAncho());
        System.out.println("Superfície: "+this.superficie()+"\tPerímetro: "+this.perimetro());
    }
    
    /**
     * Calcula el perímetro del rectángulo.
     * 
     * @return el perímetro del rectángulo.
       */
    public double perimetro(){
        return 2 * (getAncho() + getAlto());
    }
    
    /**
     * Calcula la superfície del rectángulo.
     * 
     * @return la superfície del rectángulo.
       */
    public double superficie(){
        return this.getAncho() * this.getAlto();
    }
    
    /**
     * Calcula la distancia del rectángulo con otro rectángulo pasado como parámetro.
     * 
     * @param otroRectangulo otro objeto rectángulo.
     * @return distancia entre orígenes de dos rectángulos.
       */
    public double distanciaA(Rectangulo otroRectangulo){
        return Math.sqrt((Math.pow((otroRectangulo.getOrigen().getX()-this.getOrigen().getX()), 2)) + (Math.pow((otroRectangulo.getOrigen().getY()-this.getOrigen().getY()), 2)));
    }
    
    /**
     * Indica entre dos rectángulos, cual es el mayor, en función del tamaño de su superfície.
     * 
     * @param otro objeto rectángulo.
     * @return rectángulo con mayor superfície.
       */
    public Rectangulo elMayor(Rectangulo otroRectangulo){
        if(otroRectangulo.superficie() < this.superficie()){
            return this;
        }else{
            return otroRectangulo;
        }
    }
}













