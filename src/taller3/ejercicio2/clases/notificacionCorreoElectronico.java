/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3.ejercicio2.clases;

import javax.swing.JOptionPane;
import taller3.ejercicio2.clasesAbstractas.CorreoElectronico;
import taller3.ejercicio2.interfaces.Notificacion;

/**
 *
 * @author crist
 */
public class notificacionCorreoElectronico extends CorreoElectronico implements  Notificacion {
 private String mensaje;
    @Override
    public void ingresarInformacionCorreoElectronico() {
        mensaje = JOptionPane.showInputDialog("Ingrese el mensaje que desea mostrar como notificacion");
        enviarMensaje();
    }

    @Override
    public void enviarMensaje() {
                int respuesta = JOptionPane.showConfirmDialog(
            null,
            "Notificacion De Correo Electronico Enviada Con Exito\nDeseas Verla?",
            "¿Notificacion Correo Electronico",
            JOptionPane.YES_NO_OPTION
        );

        if (respuesta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null," la notificacion enviada fue :" +  mensaje);
        } else if (respuesta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Hasta Luego");;
        }
    }
    
}
