package taller3.ejercicio4;

import javax.swing.JOptionPane;


public class Juego {

    private Baraja baraja;
    private Jugador jugador1;
    private Jugador jugador2;

    public Juego() {
        baraja = new Baraja();
        jugador1 = new Jugador("Jugador 1");
        jugador2 = new Jugador("Jugador 2");
    }

    public void iniciarJuego() {
        baraja.mezclarBaraja();

        for (int i = 0; i < 8; i++) {
            jugador1.agregarCarta(baraja.tomarCarta());
            jugador2.agregarCarta(baraja.tomarCarta());
        }

        ICarta base = baraja.tomarCarta();
        JOptionPane.showMessageDialog(null, "Carta base: " + base.mostrarCarta());

        Jugador jugadorActual = jugador1;
        boolean cambioDeNaipe = false;

        while (true) {
            String opcion = JOptionPane.showInputDialog("¿Deseas continuar jugando ocho loco? (s para salir)");
            if ("s".equalsIgnoreCase(opcion)) {
                JOptionPane.showMessageDialog(null, "Juego cancelado por el jugador, " +jugadorActual);
                break; 
            }
            JOptionPane.showMessageDialog(null, "\nTurno de " + jugadorActual.getNombre());
            JOptionPane.showMessageDialog(null, "Carta base: " + base.mostrarCarta());
            mostrarManoDialogo(jugadorActual);

            int indiceCarta = obtenerIndiceCarta(jugadorActual);
            ICarta cartaJugada = jugadorActual.jugarCarta(indiceCarta, base, cambioDeNaipe);

            if (cartaJugada != null) {
                JOptionPane.showMessageDialog(null, jugadorActual.getNombre() + " jugó la carta: " + cartaJugada.mostrarCarta());
                base = cartaJugada;
                cambioDeNaipe = false;
            } else {
                JOptionPane.showMessageDialog(null, jugadorActual.getNombre() + " no puede jugar esa carta.");
            }

            if (jugadorActual.getCartasJugador().isEmpty()) {
                JOptionPane.showMessageDialog(null, jugadorActual.getNombre() + " ha ganado la partida!");
                break;
            }

            if (cartaJugada != null && cartaJugada.valorNumerico() == 8) {
                cambioDeNaipe = true;
                JOptionPane.showMessageDialog(null, jugadorActual.getNombre() + " cambió el naipe.");
            }

            jugadorActual = (jugadorActual == jugador1) ? jugador2 : jugador1;
        }
    }

    private int obtenerIndiceCarta(Jugador jugador) {
        int indice = -1;

        while (true) {
            String indiceString = JOptionPane.showInputDialog("Elige el índice de la carta a jugar entre (1 - " + (jugador.getCartasJugador().size() - 1) + "): ");

            try {
                indice = Integer.parseInt(indiceString);
                if (indice > 0 && indice < jugador.getCartasJugador().size()) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Índice inválido. Inténtalo nuevamente.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingresa un número válido.");
            }
        }

        return indice;
    }

    private void mostrarManoDialogo(Jugador jugador) {
        StringBuilder manoTexto = new StringBuilder("Cartas de " + jugador.getNombre() + ":\n");
        for (int i = 0; i < jugador.getCartasJugador().size(); i++) {
            ICarta carta = jugador.getCartasJugador().get(i);
            manoTexto.append(carta.mostrarCarta()).append("\n");
        }
        JOptionPane.showMessageDialog(null, manoTexto.toString());
    }

}
