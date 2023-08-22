package taller3.ejercicio1;


public class Triangulo implements IFiguraGeometrica {

    private String nombreFigura;
    double base;
    double altura;
    double lado1;
    double lado2;
    double lado3;

    public Triangulo(String nombreFigura, double base, double altura, double lado1, double lado2, double lado3) {
        this.nombreFigura = nombreFigura;
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public String getNombreFigura() {
        return nombreFigura;
    }

   //Area = b*h/2
    @Override
    public double calcularArea() {
        return (base * altura) / 2;

    }

    //Perimetro triangulo Escaleno = a+b+c.
    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;

    }

    

}
