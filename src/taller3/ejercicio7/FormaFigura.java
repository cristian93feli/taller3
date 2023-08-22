package taller3.ejercicio7;


abstract public class FormaFigura implements IFiguraGeometrica {

    protected String nombreFigura;
    protected String color;

    public FormaFigura(String nombreFigura, String color) {
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
