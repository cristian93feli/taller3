/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3.ejercicio9.menu9;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import taller3.ejercicio9.claseConcreta.Guitarra;
import taller3.ejercicio9.claseConcreta.Piano;
import taller3.ejercicio9.claseConcreta.Violin;
import taller3.ejercicio9.interfaz.IInstrumentos;

/**
 *
 * @author crist
 */
public class Menu9 {

    private List<IInstrumentos> instrumentos = new ArrayList<>();
    IInstrumentos guitarra = new Guitarra();
    IInstrumentos piano = new Piano();
    IInstrumentos violin = new Violin();

    public void mostrarInfo() {
        instrumentos.add(guitarra);
        instrumentos.add(piano);
        instrumentos.add(violin);

        boolean bandera = true;

        while (bandera) {

            int opcionesMenu = Integer.parseInt(String.valueOf(JOptionPane.showInputDialog("Por favor ingrese la opcion que desee\n\n"
                    + "1. Tocar Instrumentos\n"
                    + "2. Salir")));

            switch (opcionesMenu) {

                case 1:
                    tocarInstrumento();
                    break;
                case 2:
                    bandera = false;
                    break;
                default:
            }
        }
    }
    
    public void tocarInstrumento(){
    
        for(IInstrumentos instrumento : instrumentos){
        
            instrumento.tocarInstrumento();
        }
    }

}
