/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3.ejercicio3.menuEjercicio3;

import javax.swing.JOptionPane;
import taller3.ejercicio3.clases.CuentaAhorros;
import taller3.ejercicio3.clases.CuentaCorriente;

/**
 *
 * @author crist
 */
public class MenuEjercicio3 {

    CuentaAhorros ahorros = new CuentaAhorros();
    CuentaCorriente corriente = new CuentaCorriente();
    

    public void mostrarInfo() {
        ahorros.cuentasBancarias();
        corriente.cuentasBancarias();
        boolean bandera = true;
        while (bandera) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al sistema de notificaciones\n"
                    + "Ingrese el tipo De Cuenta que tiene?\n\n"
                    + "1. Ahorros\n"
                    + "2. Corriente\n"
                    + "3. Salir\n"));

            switch (opcion) {
                case 1:
                    menuAhorros();
                    break;
                case 2:
                    menuCorriente();
                    break;
                case 3:
                    bandera = false;
                    break;
                default:

            }
        }
    }
    
    public void menuAhorros(){
           boolean bandera = true;
        while (bandera) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer?\n\n"
                    + "1. Consultar Saldo\n"
                    + "2. Consignar\n"
                    + "3. Retirar\n"
                    + "4. Salir"));

            switch (opcion) {
                case 1:
                    ahorros.consultarSaldo();
                    break;
                case 2:
                    ahorros.depositarDinero();
                    break;
                case 3:  
                    ahorros.retirarDinero();
                case 4:  
                    bandera = false;
                    break;
                default:

            }
        }
    }
    
        public void menuCorriente(){
           boolean bandera = true;
        while (bandera) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer?\n\n"
                    + "1. Consultar Saldo\n"
                    + "2. Consignar\n"
                    + "3. Retirar\n"
                    + "4. Salir"));

            switch (opcion) {
                case 1:
                    corriente.consultarSaldo();
                    break;
                case 2:
                    corriente.depositarDinero();
                    break;
                case 3:  
                    corriente.retirarDinero();
                case 4:  
                    bandera = false;
                    break;
                default:

            }
        }
    }

}
