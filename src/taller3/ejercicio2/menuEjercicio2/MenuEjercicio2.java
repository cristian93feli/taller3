/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3.ejercicio2.menuEjercicio2;

import javax.swing.JOptionPane;
import taller3.ejercicio2.clases.NotificacionMensajeTexto;
import taller3.ejercicio2.clases.NotificacionPush;
import taller3.ejercicio2.clases.notificacionCorreoElectronico;

/**
 *
 * @author crist
 */
public class MenuEjercicio2 {
    
    public void mostrarInfo(){
            notificacionCorreoElectronico correo = new notificacionCorreoElectronico();
            NotificacionMensajeTexto mensaje = new NotificacionMensajeTexto();
            NotificacionPush push = new NotificacionPush();
            
            boolean bandera = true;
            while (bandera){
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al sistema de notificaciones\n"
                    + "Que Notificacion desea enviar?\n\n"
                    + "1. Correo Electronico\n"
                    + "2. Mensaje Texto\n"
                    + "3. Push\n"
                    + "4. Salir"));
            
             switch (opcion) {
                case 1:
                    correo.ingresarInformacionCorreoElectronico();
                    break;
                case 2:
                    mensaje.ingresarInfoMensajeTexto();
                    break;
                case 3:
                    push.ingresarInfoPush();
                    break;
                case 4:
                    bandera = false;
                    break;
                default:

               
            }
            }
    }
    
}
