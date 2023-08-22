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
public class EmpeladoAsalariado extends Empleado{
private String  tipoContrato = "Asalariado"; 
private double valorDia = 40000;
private List<EmpeladoAsalariado> empleadosAsalariado = new ArrayList<>();
    
    @Override
    public void calcularSalario(StringBuilder mensaje) {
     int id = Integer.parseInt(String.valueOf(JOptionPane.showInputDialog("Ingrese "
             + "el id del empleado al que desea calcular el salario \n\n "
             + mensaje.toString())));
        
     int diasTrabajados = Integer.parseInt(String.valueOf(JOptionPane.showInputDialog("Ingrese "
             + "el numero de dias trabajados")));
     
     empleadosAsalariado.get(id-1).setValorSalario(valorDia * diasTrabajados);
     
     JOptionPane.showMessageDialog(null, "el salario del empleado " + empleadosAsalariado.get(id-1)
             .getNombreEmpleado() + " es de:" + empleadosAsalariado.get(id-1).getValorSalario());
     
     
     
    }
    
    public StringBuilder listarEmpleados(){
    StringBuilder mensaje = new StringBuilder();
    
    for(EmpeladoAsalariado empleado : empleadosAsalariado){
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
        EmpeladoAsalariado empleado = new EmpeladoAsalariado();
        empleado.setId(contador++);
        empleado.setNombreEmpleado("Daniela Arenas");
        empleado.setCedula("111111");
        empleado.setTipoContrato("Indefinido");
        
        EmpeladoAsalariado empleado2 = new EmpeladoAsalariado();
        empleado2.setId(contador++);
        empleado2.setNombreEmpleado("leidy Gaviria");
        empleado2.setCedula("354566");
        empleado2.setTipoContrato("Indefinido");
        
        EmpeladoAsalariado empleado3 = new EmpeladoAsalariado();
        empleado3.setId(contador++);
        empleado3.setNombreEmpleado("Andrea Cafetero");
        empleado3.setCedula("87665");
        empleado3.setTipoContrato("Indefinido");
        
        empleadosAsalariado.add(empleado);
        empleadosAsalariado.add(empleado2);
        empleadosAsalariado.add(empleado3);
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public double getValorDia() {
        return valorDia;
    }

    public void setValorDia(double valorDia) {
        this.valorDia = valorDia;
    }

    public List<EmpeladoAsalariado> getEmpleadosAsalariado() {
        return empleadosAsalariado;
    }

    public void setEmpleadosAsalariado(List<EmpeladoAsalariado> empleadosAsalariado) {
        this.empleadosAsalariado = empleadosAsalariado;
    }


    
    
    
}
