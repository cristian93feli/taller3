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
public class CuentaAhorros extends InfoCuenta{
    private int idCuenta;
    private String tipoCuenta;
    private List<CuentaAhorros> datosCuenta = new ArrayList<>();
    

    @Override
    public void cuentasBancarias() {
     CuentaAhorros ahorros = new CuentaAhorros();
     ahorros.setIdCuenta(1);
     ahorros.setNumeroCuenta("12345");
     ahorros.setTipoCuenta("Ahorros");
     ahorros.setSaldoCuenta(1000);
     ahorros.setContrasenia("abcde");
     
     datosCuenta.add(ahorros);
     
     CuentaAhorros ahorros2 = new CuentaAhorros();
     ahorros2.setIdCuenta(2);
     ahorros2.setNumeroCuenta("56789");
     ahorros2.setTipoCuenta("Ahorros");
     ahorros2.setSaldoCuenta(1500);
     ahorros2.setContrasenia("fghi");
     
     datosCuenta.add(ahorros2);
     
     CuentaAhorros ahorros3 = new CuentaAhorros();
     ahorros3.setIdCuenta(3);
     ahorros3.setNumeroCuenta("09876");
     ahorros3.setTipoCuenta("Ahorros");
     ahorros3.setSaldoCuenta(2000);
     ahorros3.setContrasenia("jklm");
     
     datosCuenta.add(ahorros3);
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
