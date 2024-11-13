public class Administracion {
    public static void main(String[] args) {
    Punto punto = new Punto(0.0, 0.0);    
    Rectangulo rectangulo = new Rectangulo(1, 5);
        Cuadrado cuadrado = new Cuadrado(punto,5);
        Elipse elipse = new Elipse(punto,2, 1);
        Circulo circulo = new Circulo(punto,4);
        Triangulo triangulo = new Triangulo(punto,1, 3);
        
        Jardin jardin = new Jardin("Bichito de Luz");
        
        jardin.agregarFigura(rectangulo);
        jardin.agregarFigura(cuadrado);
        jardin.agregarFigura(elipse);
        jardin.agregarFigura(circulo);
        jardin.agregarFigura(triangulo);
        
        jardin.detalleFiguras();    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
        // Crear un punto de origen para las figuras, mi parte 
        Punto punto = new Punto(3.0, 0.0);

        // Crear las figuras geométricas con ejemplos de dimensiones
        FiguraGeometrica cuadrado = new Cuadrado(punto, 5.0);  // Superficie: 25.0 (lado 5.0)
        FiguraGeometrica triangulo = new Triangulo(punto, 1.6, 1.6);  // Superficie: 1.28 (base 1.6, altura 1.6)
        FiguraGeometrica circulo = new Circulo(punto, 2.0);  // Superficie: 12.57 (radio 2.0)
        FiguraGeometrica elipse = new Elipse(punto, 5.0, 3.0);  // Superficie: 47.12 (semieje mayor 5.0, semieje menor 3.0)

        // Crear el jardín con el nombre especificado
        Jardin jardin = new Jardin("Bichito de Luz");

        // Agregar las figuras al jardín utilizando el método agregarFigura
        jardin.agregarFigura(cuadrado);
        jardin.agregarFigura(triangulo);
        jardin.agregarFigura(circulo);
        jardin.agregarFigura(elipse);

        // Imprimir el detalle inicial de las figuras
        jardin.detalleFiguras();
        /*
        // Quitar una figura (por ejemplo, el círculo) utilizando el índice 2
        jardin.quitarFigura(2);
        System.out.println("\nDespués de quitar la figura en el índice 2 (Círculo):");
        jardin.detalleFiguras();
    } 
    */
}
}
