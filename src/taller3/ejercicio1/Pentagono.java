package taller3.ejercicio1;


public class Pentagono implements IFiguraGeometrica {

    private String nombreFigura;

    double lado;

    public Pentagono(String nombreFigura, double lado) {
        this.nombreFigura = nombreFigura;
        this.lado = lado;
    }

    @Override
    public String getNombreFigura() {
        return nombreFigura;
    }

    //Área pentágono regular = (5/4) * lado * lado * (1/tan(π/5))
    @Override
    public double calcularArea() {
        return (5.0 / 4.0) * lado * lado * (1.0 / Math.tan(Math.PI / 5.0));

    }

    //Perimetro =  5*l
    @Override
    public double calcularPerimetro() {
        return lado * 5;

    }

}
