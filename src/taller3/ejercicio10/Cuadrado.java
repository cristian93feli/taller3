
package taller3.ejercicio10;

import javax.swing.JOptionPane;


public class Cuadrado  extends Figura{

    public Cuadrado(String nombreFigura, String color) {
        super(nombreFigura, color);
    }

    @Override
    public void dibujar() {
         JOptionPane.showMessageDialog(null,"Dibujando un Cuadrado de color: " + getColor());
    }
    
}
