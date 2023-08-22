package taller3.ejercicio1;


public class Cuadrado implements IFiguraGeometrica {

    private String nombreFigura;
    double lado;

    public Cuadrado(String nombreFigura, double lado) {
        this.nombreFigura = nombreFigura;
        this.lado = lado;
    }

    @Override
    public String getNombreFigura() {
        return nombreFigura;
    }

    //Área = l²
    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
        //lado * lado;
    }

    //Perimetro =  4*l
    @Override
    public double calcularPerimetro() {
        return lado * 4;

    }
}
