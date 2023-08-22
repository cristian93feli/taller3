/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3.ejercicio3.clases;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import taller3.ejercicio3.clasesAbstractas.InfoCuenta;

/**
 *
 * @author crist
 */
public class CuentaCorriente extends InfoCuenta{
    
       private int idCuenta;
    private String tipoCuenta;
    private List<CuentaAhorros> datosCuenta = new ArrayList<>();
    

    @Override
    public void cuentasBancarias() {
     CuentaAhorros corriente = new CuentaAhorros();
     corriente.setIdCuenta(1);
     corriente.setNumeroCuenta("11111");
     corriente.setTipoCuenta("Corriente");
     corriente.setSaldoCuenta(4000);
     corriente.setContrasenia("ddddd");
     
     datosCuenta.add(corriente);
     
     CuentaAhorros corriente2 = new CuentaAhorros();
     corriente2.setIdCuenta(2);
     corriente2.setNumeroCuenta("22222");
     corriente2.setTipoCuenta("Corriente");
     corriente2.setSaldoCuenta(4500);
     corriente2.setContrasenia("ccccc");
     
     datosCuenta.add(corriente2);
     
     
     CuentaAhorros corriente3 = new CuentaAhorros();
     corriente3.setIdCuenta(3);
     corriente3.setNumeroCuenta("33333");
     corriente3.setTipoCuenta("Corriente");
     corriente3.setSaldoCuenta(5000);
     corriente3.setContrasenia("xyza");
     
     datosCuenta.add(corriente3);
    }

    @Override
    public void depositarDinero() {
        boolean depositoExitoso = false;
       long valorDeposito =Long.parseLong(JOptionPane.showInputDialog("Ingrese el valor a depositar"));
       String cuentaDeposito = JOptionPane.showInputDialog("Ingrese la cuenta a depositar");
       
       for(int i = 0; i < datosCuenta.size(); i++){
       if(datosCuenta.get(i).getNumeroCuenta().equals(cuentaDeposito) && valorDeposito > 0){
       datosCuenta.get(i).setSaldoCuenta(valorDeposito + datosCuenta.get(i).getSaldoCuenta());
       depositoExitoso = true;
       JOptionPane.showMessageDialog(null, "Deposito realizado con exitoso su nuevo saldo es" + 
               datosCuenta.get(i).getSaldoCuenta());
       break;
       }
       } if(!depositoExitoso){ 
       JOptionPane.showMessageDialog(null, "No se pudo realizar el deposito en la cuenta de Ahorros, verifique"
               + " la informacion");
       }
       
       
    }

    @Override
    public void retirarDinero() {
        
       long valoretirar =Long.parseLong(JOptionPane.showInputDialog("Ingrese el valor a Reitrar"));
     
     
             StringBuilder mensaje = new StringBuilder();

        for (int i = 0; i < datosCuenta.size(); i++) {
    
            mensaje.append(datosCuenta.get(i).getIdCuenta())
                    .append("  ")
                    .append(datosCuenta.get(i).getNumeroCuenta())
                    .append("\n");
        }
          int idCuentaDeposito =Integer.parseInt(JOptionPane.showInputDialog("seleccione el id de"
                  + " la cuenta la cual desea retirar "
                  + mensaje.toString()));
          
           String contraseñaIngresada = JOptionPane.showInputDialog("Ingrese su Contraseña");
           
          if(validarRetiro(datosCuenta.get(idCuentaDeposito - 1).getContrasenia(), contraseñaIngresada,
                  datosCuenta.get(idCuentaDeposito - 1).getSaldoCuenta(), valoretirar)){
          datosCuenta.get(idCuentaDeposito - 1).setSaldoCuenta(datosCuenta.get(idCuentaDeposito - 1)
                  .getSaldoCuenta() - valoretirar);
                 JOptionPane.showMessageDialog(null, "Retiro Exitoso........\n\n\n\n"
                         + "Su nuevo saldo es de: " + datosCuenta.get(idCuentaDeposito - 1)
                  .getSaldoCuenta());
          }else{
          JOptionPane.showMessageDialog(null, "No se pudo realizar el retiro de dinero, verifique los datos"
                  + "ingresados");
          }
        
    }
    
    public void consultarSaldo(){
                StringBuilder mensaje = new StringBuilder();

        for (int i = 0; i < datosCuenta.size(); i++) {
    
            mensaje.append(datosCuenta.get(i).getIdCuenta())
                    .append("  ")
                    .append(datosCuenta.get(i).getNumeroCuenta())
                    .append("\n");
        }
                  int idCuenta =Integer.parseInt(JOptionPane.showInputDialog("seleccione el id de"
                  + " la cuenta la cual desea Consultar Saldo "
                  + mensaje.toString()));
                  
            informacionSaldo(datosCuenta.get(idCuenta - 1).getSaldoCuenta());
    }
    


    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public List<CuentaAhorros> getDatosCuenta() {
        return datosCuenta;
    }

    public void setDatosCuenta(List<CuentaAhorros> datosCuenta) {
        this.datosCuenta = datosCuenta;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    
}
