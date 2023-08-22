package taller3.ejercicio7;


public class Cuadrado extends FormaFigura {

    double lado;

    public Cuadrado(double lado, String nombreFigura, String color) {
        super(nombreFigura, color);
        this.lado = lado;
    }


    //Área = l²
    //lado * lado;
    
    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }

}
