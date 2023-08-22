package taller3.ejercicio6;

public class Animal {

    String nombre, edad, color, genero;

    public Animal() {
    }

    public Animal(String nombre, String edad, String color, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
        this.genero = genero;
    }

    public String hacerSonido() {
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

       
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
