package taller3.ejercicio1;


public class Rectangulo implements IFiguraGeometrica {

    private String nombreFigura;
    double base;
    double altura;

    public Rectangulo(String nombreFigura, double base, double altura) {
        this.nombreFigura = nombreFigura;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String getNombreFigura() {
        return nombreFigura;
    }

    //Área = a*b
    @Override
    public double calcularArea() {
        return base * altura;
    }

    //Perimetro = 2(a+b) 
    @Override
    public double calcularPerimetro() {
        return (2 * base) + (2 * altura);

    }
}
