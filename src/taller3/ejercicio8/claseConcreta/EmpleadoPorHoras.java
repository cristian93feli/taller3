/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3.ejercicio8.claseConcreta;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import taller3.ejercicio8.ClasesAbstractas.Empleado;

/**
 *
 * @author crist
 */
public class EmpleadoPorHoras extends Empleado{
private String  tipoContrato = "por horas"; 
private double valorHora = 4000;
private List<EmpleadoPorHoras> empleadosPorHoras = new ArrayList<>();
    
    @Override
    public void calcularSalario(StringBuilder mensaje) {
     int id = Integer.parseInt(String.valueOf(JOptionPane.showInputDialog("Ingrese "
             + "el id del empleado al que desea calcular el salario \n\n "
             + mensaje.toString())));
        
     int horasTrabajadas = Integer.parseInt(String.valueOf(JOptionPane.showInputDialog("Ingrese "
             + "el numero de horas trabajadas")));
     
     empleadosPorHoras.get(id-1).setValorSalario(valorHora * horasTrabajadas);
     
     JOptionPane.showMessageDialog(null, "el salario del empleado " + empleadosPorHoras.get(id-1)
             .getNombreEmpleado() + " es de:" + empleadosPorHoras.get(id-1).getValorSalario());
     
     
     
    }
    
    public StringBuilder listarEmpleados(){
    StringBuilder mensaje = new StringBuilder();
    
    for(EmpleadoPorHoras empleado : empleadosPorHoras){
                    mensaje.append(empleado.getId())
                    .append("  ")
                    .append(empleado.getNombreEmpleado())
                    .append("  ")
                    .append(empleado.getCedula())
                    .append("  ")
                    .append(empleado.getTipoContrato())
                    .append("  ")
                    .append("\n");
    }
    return mensaje;
    }
    
    public void crearEmpleados(){
        int contador = 1;
        EmpleadoPorHoras empleado = new EmpleadoPorHoras();
        empleado.setId(contador++);
        empleado.setNombreEmpleado("Cristian Arenas");
        empleado.setCedula("1057786114");
        empleado.setTipoContrato("por horas");
        
        EmpleadoPorHoras empleado2 = new EmpleadoPorHoras();
        empleado2.setId(contador++);
        empleado2.setNombreEmpleado("felipe Galvis");
        empleado2.setCedula("10588522");
        empleado2.setTipoContrato("por horas");
        
        EmpleadoPorHoras empleado3 = new EmpleadoPorHoras();
        empleado3.setId(contador++);
        empleado3.setNombreEmpleado("andres castro");
        empleado3.setCedula("456321");
        empleado3.setTipoContrato("por horas");
        
        empleadosPorHoras.add(empleado);
        empleadosPorHoras.add(empleado2);
        empleadosPorHoras.add(empleado3);
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public List<EmpleadoPorHoras> getEmpleadosPorHoras() {
        return empleadosPorHoras;
    }

    public void setEmpleadosPorHoras(List<EmpleadoPorHoras> empleadosPorHoras) {
        this.empleadosPorHoras = empleadosPorHoras;
    }
    
    
    
}
