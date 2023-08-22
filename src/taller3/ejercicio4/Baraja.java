package taller3.ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Baraja {

    private List<ICarta> cartas;
    private Random random;

    public Baraja() {
        cartas = new ArrayList<>();
        random = new Random();

        for (int i = 1; i <= 12; i++) {
            cartas.add(new Copas(i,"Copas"));
            cartas.add(new Oros(i,"Oros"));
            cartas.add(new Espadas(i, "Espadas"));
            cartas.add(new Bastos(i,"Bastos"));
        }
    }

    public void mezclarBaraja() {
        for (int i = cartas.size() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            ICarta temp = cartas.get(i);
            cartas.set(i, cartas.get(j));
            cartas.set(j, temp);
        }
    }
    public ICarta tomarCarta() {
        if (!cartas.isEmpty()) {
            return cartas.remove(0);
        }
        return null;
    }
//    private ICarta[] cartas;
//    private int indiceActual;
//
//    public Baraja() {
//        cartas = new ICarta[40];
//        int indice = 0;
//        for (int i = 1; i <= 12; i++) {
//            if (i != 8 && i != 9) {
//                cartas[indice++] = new Espadas(i);
//                cartas[indice++] = new Copas(i);
//                cartas[indice++] = new Oros(i);
//                cartas[indice++] = new Bastos(i);
//            }
//        }
//    }
//
//    public void repartirCartas(int cantidad, Jugador jugador) {
//        for (int i = 0; i < cantidad; i++) {
//            if (indiceActual < cartas.length) {
//                ICarta carta = cartas[indiceActual++];
//                jugador.agregarCarta(carta);
//            }
//        }
//    }
//
//    public void mostrarBaraja() {
//
//        System.out.println("Ocho Loco");
//        for (int i = 0; i < cartas.length; i++) {
//            System.out.println(cartas[i].mostrarCarta());
//        }
//    }
//
//    public void mezclarBaraja() {
//        for (int i = 0; i < cartas.length; i++) {
//            int j = (int) (Math.random() * cartas.length);
//            ICarta temp = cartas[i];
//            cartas[i] = cartas[j];
//            cartas[j] = temp;
//        }
//    }
}
