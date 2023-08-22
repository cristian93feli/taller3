package taller3.ejercicio10;

import javax.swing.JOptionPane;


public class Triangulo extends Figura {

    public Triangulo(String nombreFigura, String color) {
        super(nombreFigura, color);
    }

    @Override
    public void dibujar() {
        JOptionPane.showMessageDialog(null,"Dibujando un Triangulo de color: " + getColor());
    }

}
