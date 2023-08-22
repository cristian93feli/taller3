
package taller3.ejercicio10;

import javax.swing.JOptionPane;


public class Circulo extends Figura{

    public Circulo(String nombreFigura, String color) {
        super(nombreFigura, color);
    }
    
  
    
    @Override
    public void dibujar() {
      JOptionPane.showMessageDialog(null,"Dibujando un Circulo de color: " + getColor());
       
    }
    
}
