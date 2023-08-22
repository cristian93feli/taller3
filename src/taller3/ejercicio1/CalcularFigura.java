package taller3.ejercicio1;

import javax.swing.JOptionPane;


public class CalcularFigura {

    private IFiguraGeometrica[] figuras = new IFiguraGeometrica[5];

    public void obtenerFigura() {
        String[] opcionFigura = {"1. Circulo", "2. Cuadrado", "3. Triangulo", "4. Rectangulo", "5. Pentagono", "6. Salir"};
        Object opcionesDeFiguras = JOptionPane.showInputDialog(null, "Seleccione la figura para calcular área y perimetro", "Menu", JOptionPane.QUESTION_MESSAGE, null, opcionFigura, opcionFigura[0]);

        if (opcionesDeFiguras == null || opcionesDeFiguras.equals("6. Salir")) {
            JOptionPane.showMessageDialog(null, "Programa Finalizado", "Adios!", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }

        String figuraElegida = (String) opcionesDeFiguras;
        int indiceFigura = obtenerIndiceFigura(figuraElegida);

        IFiguraGeometrica figura;

        switch (indiceFigura) {
            case 0:
                double radio = obtenerNumero("radio");
                figura = new Circulo("Circulo", radio);
                break;
            case 1:
                double lado = obtenerNumero("lado");
                figura = new Cuadrado("Cuadrado", lado);
                break;
            case 2:
                double baseTriangulo = obtenerNumero("base");
                double alturaTriangulo = obtenerNumero("altura");
                double lado1Triangulo = obtenerNumero("lado 1");
                double lado2Triangulo = obtenerNumero("lado 2");
                double lado3Triangulo = obtenerNumero("lado 3");
                figura = new Triangulo("Triangulo", baseTriangulo, alturaTriangulo, lado1Triangulo, lado2Triangulo, lado3Triangulo);
                break;
            case 3:
                double baseRect = obtenerNumero("base");
                double alturaRect = obtenerNumero("altura");
                figura = new Rectangulo("Rectangulo", baseRect, alturaRect);
                break;
            case 4:
                double ladoPentagono = obtenerNumero("lado");
                figura = new Pentagono("Pentagono", ladoPentagono);
                break;
            default:
                throw new IllegalArgumentException("Opcion no válida");
        }

        double resultadoArea = figura.calcularArea();
        double resultadoPerimetro = figura.calcularPerimetro();

        verResultado(figura.getNombreFigura(), resultadoArea, resultadoPerimetro);
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

    public void verResultado(String nombreFigura, double resultadoArea, double resultadoPerimetro) {
        String mensaje = "Nombre figura: " + nombreFigura + "\n"
                + "Área figura: " + resultadoArea + "\n"
                + "Perímetro figura: " + resultadoPerimetro;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
