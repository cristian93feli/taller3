package taller3.ejercicio7;

import javax.swing.JOptionPane;


public class CalcularFiguras {
    
    private FormaFigura[] figuras = new FormaFigura[5];

    public void obtenerFigura() {
        String[] opcionFigura = {"1. Circulo", "2. Cuadrado", "3. Triangulo", "4. Rectangulo", "5. Pentagono", "6. Salir"};
        Object opcionesDeFiguras = JOptionPane.showInputDialog(null, "Seleccione la figura para calcular área y perimetro", "Menu", JOptionPane.QUESTION_MESSAGE, null, opcionFigura, opcionFigura[0]);

        if (opcionesDeFiguras == null || opcionesDeFiguras.equals("6. Salir")) {
            JOptionPane.showMessageDialog(null, "Programa Finalizado", "Adios!", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }

        String figuraElegida = (String) opcionesDeFiguras;
        int indiceFigura = obtenerIndiceFigura(figuraElegida);

        String colorFigura = obtenerColor(figuraElegida);
        FormaFigura figura;

        
        switch (indiceFigura) {
            case 0:
                double radio = obtenerNumero("radio");
                figura = new Circulo(radio,"Circulo", colorFigura);
                break;
            case 1:
                double lado = obtenerNumero("lado");
                figura = new Cuadrado(lado,"Cuadrado", colorFigura);
                break;
            case 2:
                double baseTriangulo = obtenerNumero("base");
                double alturaTriangulo = obtenerNumero("altura");
                figura = new Triangulo( baseTriangulo, alturaTriangulo, "Triangulo", colorFigura);
                break;
            case 3:
                double baseRect = obtenerNumero("base");
                double alturaRect = obtenerNumero("altura");
                figura = new Rectangulo( baseRect, alturaRect, "Rectangulo",colorFigura);
                break;
            case 4:
                double ladoPentagono = obtenerNumero("lado");      
                figura = new Pentagono( ladoPentagono,"Pentagono",colorFigura);
                break;
            default:
                throw new IllegalArgumentException("Opcion no válida");
        }

        double resultadoArea = figura.calcularArea();;

        verResultado(figura.getNombreFigura(), figura.getColor(), resultadoArea);
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
            case "5. Pentagono":
                return 4;
            default:
                throw new IllegalArgumentException("Opcion no válida");
        }
    }

    public double obtenerNumero(String figuraElegida) {
        String input = JOptionPane.showInputDialog("Por favor ingrese un número");
        return Double.parseDouble(input);   
    }
    
      public String obtenerColor(String figuraElegida) {
        String color =  JOptionPane.showInputDialog("Por favor ingrese el color de la figura");
        return color;   
    }


   public void verResultado(String nombreFigura, String colorFigura, double resultadoArea) {
        String mensaje = "Nombre figura: " + nombreFigura + "\n"
                + "Color figura: " + colorFigura + "\n"
                + "Área figura: " + resultadoArea;

        JOptionPane.showMessageDialog(null, mensaje);
    }
    }



