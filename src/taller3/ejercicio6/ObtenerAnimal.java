package taller3.ejercicio6;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ObtenerAnimal {

    private List<Animal> animales = new ArrayList<>();

    public void obtenerTipoAnimal() {
        animales.add(new Perro());
        animales.add(new Gato());
        animales.add(new Pajaro());

        while (true) {
            String[] opciones = {"1. Perro", "2. Gato", "3. Pajaro", "4. Salir"};
            Object opcionSeleccionada = JOptionPane.showInputDialog(null, "Seleccione un animal:", "Menu", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            if (opcionSeleccionada == null || opcionSeleccionada.equals(opciones[3])) {
                JOptionPane.showMessageDialog(null, "Programa finalizado", "Adiós", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }

            String animalElegido = (String) opcionSeleccionada;
            Animal animal = crearAnimal(animalElegido);

            solicitarInformacion(animal);
            animal.hacerSonido();

            verAnimal(animal);
        }
    }

    public Animal crearAnimal(String animalElegido) {
        switch (animalElegido) {
            case "1. Perro":
                return new Perro();
            case "2. Gato":
                return new Gato();
            case "3. Pajaro":
                return new Pajaro();
            default:
                throw new IllegalArgumentException("Opción no válida");
        }
    }

    public void solicitarInformacion(Animal animal) {
        String nombre = obtenerInfoAnimal("nombre");
        String edad = obtenerInfoAnimal("edad");
        String color = obtenerInfoAnimal("color");
        String genero = obtenerInfoAnimal("género");

        animal.setNombre(nombre);
        animal.setEdad(edad);
        animal.setColor(color);
        animal.setGenero(genero);
    }

    public String obtenerInfoAnimal(String tipoInfo) {
        String input = JOptionPane.showInputDialog("Por favor ingrese " + tipoInfo + " del animal:");
        return input;
    }

    public void verAnimal(Animal animal) {
        String mensaje = "El animal de Nombre : " + animal.getNombre() + "\n"
                + "Con edad: " + animal.getEdad() +" años "+ "\n"
                + "De color: " + animal.getColor() + "\n"
                + "Y Genero: " + animal.getGenero() + "\n"
                + "Tiene un sonido de : " + animal.hacerSonido() ;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
