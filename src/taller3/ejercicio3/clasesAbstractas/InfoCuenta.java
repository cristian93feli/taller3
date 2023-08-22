/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3.ejercicio3.clasesAbstractas;

import javax.swing.JOptionPane;
import taller3.ejercicio3.Interfaz.ISistemaBancario;

/**
 *
 * @author crist
 */
public abstract class InfoCuenta implements ISistemaBancario {

    private String numeroCuenta;
    private String contrasenia;
    private long saldoCuenta;

    public void informacionSaldo(Long saldoCuenta) {
        JOptionPane.showMessageDialog(null, "Su Saldo Actual es " + saldoCuenta);
    }

    public boolean validarRetiro(String contraseniaCuenta, String contraseniaIngresada, long saldoCuenta
    ,long saldoIngresado) {

        return contraseniaCuenta.equals(contraseniaIngresada) && saldoCuenta >= saldoIngresado;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public long getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(long saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

}
