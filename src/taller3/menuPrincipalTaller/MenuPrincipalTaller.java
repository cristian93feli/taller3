/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3.menuPrincipalTaller;

import javax.swing.JOptionPane;
import taller3.ejercicio1.CalcularFigura;
import taller3.ejercicio10.Lienzo;
import taller3.ejercicio2.menuEjercicio2.MenuEjercicio2;
import taller3.ejercicio3.menuEjercicio3.MenuEjercicio3;
import taller3.ejercicio4.Juego;
import taller3.ejercicio5.menuEjercicio5.Menuejercicio5;
import taller3.ejercicio6.ObtenerAnimal;
import taller3.ejercicio7.CalcularFiguras;
import taller3.ejercicio8.menuEjercicio8.MenuEjercicio8;
import taller3.ejercicio9.menu9.Menu9;

/**
 *
 * @author crist
 */
public class MenuPrincipalTaller {
    Juego juego = new Juego();
    CalcularFigura calcularFigura = new CalcularFigura();
    ObtenerAnimal obtenerAnimal = new ObtenerAnimal();
    CalcularFiguras calcularFigura2 = new CalcularFiguras();
    MenuEjercicio2 menu2 = new MenuEjercicio2();
    MenuEjercicio3 menu3 = new MenuEjercicio3();
    Menuejercicio5 menu5 = new Menuejercicio5();
    MenuEjercicio8 menu8 = new MenuEjercicio8();
    Menu9 menu9 = new Menu9();
    Lienzo lienzo = new Lienzo();
        

    public void mostrarInfo() {

        boolean bandera = true;
        while (bandera) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer?\n\n"
                    + "1. Ejercicio 1\n"
                    + "2. Ejercicio 2\n"
                    + "3. Ejercicio 3\n"
                    + "4. Ejercicio 4\n"
                    + "5. Ejercicio 5\n"
                    + "6. Ejercicio 6\n"
                    + "7. Ejercicio 7\n"
                    + "8. Ejercicio 8\n"
                    + "9. Ejercicio 9\n"
                    + "10. Ejercicio 10\n"
                    + "11. Salir\n"));

            switch (opcion) {
                case 1:
                            calcularFigura.obtenerFigura();
                    break;
                case 2:
                    menu2.mostrarInfo();
                    break;
                case 3:
                    menu3.mostrarInfo();
                    break;
                case 4:
                    juego.iniciarJuego();
                    break;
                case 5:
                    menu5.mostrarInfo();
                    break;
                case 6:
                    obtenerAnimal.obtenerTipoAnimal();
                    break;
                case 7:
                   calcularFigura2.obtenerFigura();
                    break;
                case 8:
                    menu8.mostrarInfo();
                    break;
                case 9:
                    menu9.mostrarInfo();
                    break;
                case 10:
                    lienzo.obtenerFigura();
                    break;
                case 11:
                    bandera = false;
                    break;
                default:

            }
        }
    }
}
