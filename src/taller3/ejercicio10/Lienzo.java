package taller3.ejercicio10;

import javax.swing.JOptionPane;


public class Lienzo {

    private Dibujable[] figuras = new Dibujable[4];

    public void obtenerFigura() {
        String[] opcionFigura = {"1. Circulo", "2. Cuadrado", "3. Triangulo", "4. Rectangulo", "5. Salir"};
        Object opcionesDeFiguras = JOptionPane.showInputDialog(null, "Seleccione la figura que desea dibujar", "Menu", JOptionPane.QUESTION_MESSAGE, null, opcionFigura, opcionFigura[0]);

        if (opcionesDeFiguras == null || opcionesDeFiguras.equals("5. Salir")) {
            JOptionPane.showMessageDialog(null, "Programa Finalizado", "Adios!", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }

        String figuraElegida = (String) opcionesDeFiguras;
        int indiceFigura = obtenerIndiceFigura(figuraElegida);

        String colorFigura = obtenerColor(figuraElegida);

        Figura figura = null;

        switch (indiceFigura) {
            case 0:
                figura = new Circulo("Círculo", colorFigura);
                break;

            case 1:
                figura = new Cuadrado("Cuadrado", colorFigura);
                break;
            case 2:
                figura = new Triangulo("Triangulo", colorFigura);
                break;
            case 3:
                figura = new Rectangulo("Rectangulo", colorFigura);
                break;
            default:
                throw new IllegalArgumentException("Opcion no válida");
        }

        figura.dibujar();
    }

    public int obtenerIndiceFigura(String figuraElegida) {
        switch (figuraElegida) {
            case "1. Circulo":
                return 0;
            case "2. Cuadrado":
                return 1;
            case "3. Triangulo":
                return 2;
            case "4. Rectangulo":
                return 3;
            default:
                throw new IllegalArgumentException("Opcion no válida");
        }
    }

    public String obtenerColor(String figuraElegida) {
        String color = JOptionPane.showInputDialog("Por favor ingrese el color con el que desea pintar la figura");
        return color;
    }

//    public void verResultado(String nombreFigura, String colorFigura, String dibujar) {
//        String mensaje = "Nombre figura: " + nombreFigura + "\n"
//                + "Color figura: " + colorFigura + "\n"
//                + ": " + dibujar;
//
//        JOptionPane.showMessageDialog(null, mensaje);
//    }
}
