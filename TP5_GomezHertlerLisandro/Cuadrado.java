
public class Cuadrado extends Rectangulo
{
    
    public Cuadrado(Punto p_origen, double p_lado)
    {
    super(p_origen,p_lado,p_lado);
    }
    
    public Cuadrado() {
    super(new Punto(),0.0,0.0);
    }
    
    public String nombreFigura() {
        return "******Cuadrado******";
    }
    
    public void caracteristicas() {
        System.out.println(nombreFigura());
        System.out.println("Orígen: "+ super.getOrigen().coordenadas()+"\tLado: " + this.getAncho());
        System.out.println("Superfície: "+ String.format("%.2f", this.superficie()) +"\tPerímetro: "+ String.format("%.2f",this.perimetro()));
    }
    
    
    
    
    
}

