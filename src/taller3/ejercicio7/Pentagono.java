package taller3.ejercicio7;


public class Pentagono extends FormaFigura {


    double lado;

    public Pentagono(double lado, String nombreFigura, String color) {
        super(nombreFigura, color);
        this.lado = lado;
    }

       //Área pentágono regular = (5/4) * lado * lado * (1/tan(π/5))

       @Override
    public double calcularArea() {
        return (5.0 / 4.0) * lado * lado * (1.0 / Math.tan(Math.PI / 5.0));

    }
  
   

}
