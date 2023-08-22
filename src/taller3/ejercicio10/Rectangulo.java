package taller3.ejercicio10;

import javax.swing.JOptionPane;


public class Rectangulo extends Figura {

    public Rectangulo(String nombreFigura, String color) {
        super(nombreFigura, color);
    }

    @Override
    public void dibujar() {
        JOptionPane.showMessageDialog(null,"Dibujando un Rectangulo de color: " + getColor());
    }

}
