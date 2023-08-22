/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3.ejercicio9.claseConcreta;

import taller3.ejercicio9.interfaz.IInstrumentos;

/**
 *
 * @author crist
 */
public class Piano implements IInstrumentos{

    @Override
    public void tocarInstrumento() {
        System.out.println("Tocando el piano");
    }
    
}
