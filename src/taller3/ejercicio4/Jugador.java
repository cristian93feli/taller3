package taller3.ejercicio4;

import java.util.ArrayList;
import java.util.List;


public class Jugador {

    private String nombre;
    private List<ICarta> cartasJugador;

    public Jugador(String nombre) {
        this.nombre = nombre;
        cartasJugador = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<ICarta> getCartasJugador() {
        return cartasJugador;
    }

    public void agregarCarta(ICarta carta) {
        cartasJugador.add(carta);
    }
    

  public ICarta jugarCarta(int indice, ICarta base, boolean cambioDeNaipe) {
        ICarta carta = cartasJugador.get(indice);
        if (carta.valorNumerico() == 8 || carta.valorNumerico() == base.valorNumerico()
                || carta.obtenerNaipe().equals(base.obtenerNaipe()) || cambioDeNaipe) {
            cartasJugador.remove(indice);
            return carta;
        }
        return null;
    
    }

    public void mostrarCartasJugador() {
    System.out.println("Cartas de " + nombre + ":");
    for (int i = 0; i < cartasJugador.size(); i++) {
        ICarta carta = cartasJugador.get(i);
        System.out.println(carta.mostrarCarta());
    }
}

//    private List<ICarta> mano;
//
//    public Jugador() {
//        mano = new ArrayList<>();
//    }
//
//    public void agregarCarta(ICarta carta) {
//        mano.add(carta);
//    }
//
//     public ICarta jugarCarta(int indice) {
//        if (indice >= 0 && indice < mano.size()) {
//            return mano.remove(indice);
//        } else {
//            return null; // Índice inválido
//        }
//    }
//    public void mostrarMano() {
//        System.out.println("Mano del jugador: ");
//        for (int i = 0; i < mano.size(); i++) {
//            ICarta carta = mano.get(i);
//            System.out.println(carta.mostrarCarta());
//        }
//    }
}
