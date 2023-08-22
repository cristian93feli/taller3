package taller3.ejercicio10;


abstract public class Figura implements Dibujable {

    private String nombreFigura;
    private String color;

    public Figura(String nombreFigura, String color) {
        this.nombreFigura = nombreFigura;
        this.color = color;
    }

    public String getNombreFigura() {
        return nombreFigura;
    }

    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
