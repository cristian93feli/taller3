package taller3.ejercicio7;


public class Circulo extends FormaFigura {

    double radio;

    public Circulo(double radio, String nombreFigura, String color) {
        super(nombreFigura, color);
        this.radio = radio;
    }

   

    //Área = πr²
    @Override

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

}
