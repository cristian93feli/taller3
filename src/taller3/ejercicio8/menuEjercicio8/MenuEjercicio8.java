/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3.ejercicio8.menuEjercicio8;

import javax.swing.JOptionPane;
import taller3.ejercicio8.claseConcreta.EmpeladoAsalariado;
import taller3.ejercicio8.claseConcreta.EmpleadoPorHoras;

/**
 *
 * @author crist
 */
public class MenuEjercicio8 {
    
    EmpeladoAsalariado empleadoAsalariado = new EmpeladoAsalariado();
    EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras();
    
    public void mostrarInfo(){
        empleadoAsalariado.crearEmpleados();
        empleadoPorHoras.crearEmpleados();
        
           boolean bandera = true;
        while (bandera) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer?\n\n"
                    + "1. Calcular salario de Empleados Por Hora\n"
                    + "2. Calcular salario de Empleados Asalariados\n"
                    + "3. Salir\n"));

            switch (opcion) {
                case 1:
                    empleadoPorHoras.calcularSalario(empleadoPorHoras.listarEmpleados());
                    break;
                case 2:
                    empleadoAsalariado.calcularSalario(empleadoAsalariado.listarEmpleados());
                    break;
                case 3:
                    bandera = false;
                    break;
                default:

            }
        }
    }
    
}
