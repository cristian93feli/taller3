package taller3.ejercicio7;


public class Rectangulo extends FormaFigura {

    double base;
    double altura;

    public Rectangulo(double base, double altura, String nombreFigura, String color) {
        super(nombreFigura, color);
        this.base = base;
        this.altura = altura;
    }

    //Área = a*b
    @Override
    public double calcularArea() {
        return base * altura;
    }

}
