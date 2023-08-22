package taller3.ejercicio1;


public class Circulo implements IFiguraGeometrica {

    private String nombreFigura;
    double radio;

    public Circulo(String nombreFigura, double radio) {
        this.nombreFigura = nombreFigura;
        this.radio = radio;
    }

    @Override
    public String getNombreFigura() {
        return nombreFigura;
    }

    //Área = πr²
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    //Perimetro =  2πr
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

}
