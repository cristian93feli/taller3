
package taller3.ejercicio4;


public class Bastos implements ICarta {

    private int numero;
    private String naipe;

    public Bastos(int numero, String naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    @Override
    public String mostrarCarta() {
        return naipe + " " + numero;
    }

    @Override
    public int valorNumerico() {
        return numero;
    }
 @Override
    public String obtenerNaipe() {
        return naipe;
    }
}
