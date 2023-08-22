/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3.ejercicio5.menuEjercicio5;

import javax.swing.JOptionPane;
import taller3.ejercicio5.claseConcreta.ProductoAseo;
import taller3.ejercicio5.claseConcreta.ProductoGranos;
import taller3.ejercicio5.claseConcreta.ProductoTecnologia;

/**
 *
 * @author crist
 */
public class Menuejercicio5 {

    ProductoAseo productoAseo = new ProductoAseo();
    ProductoGranos productogranos = new ProductoGranos();
    ProductoTecnologia productoTecnologia = new ProductoTecnologia();

    public void mostrarInfo() {
        productoAseo.crearProducto();
        productogranos.crearProducto();
        productoTecnologia.crearProducto();
        boolean bandera = true;
        while (bandera) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a la tienda virtual Miscompras\n"
                    + "Ingrese a la categoria que desee?\n\n"
                    + "1. Aseo\n"
                    + "2. Granos\n"
                    + "3. Tecnologia\n"
                    + "4. Salir\n"));

            switch (opcion) {
                case 1:
                    menuAseo(productoAseo.mostrarInfo());
                    break;
                case 2:
                    menuGranos(productogranos.mostrarInfo());
                    break;
                case 3:
                    menuTecnologia(productoTecnologia.mostrarInfo());
                    break;
                case 4:
                    bandera = false;
                    break;
                default:

            }
        }
    }

    public void menuAseo(int idProducto) {
        boolean bandera = true;
        while (bandera) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer?\n\n"
                    + "1. Mostrar informacion del producto\n"
                    + "2. Consultar Precio del Producto\n"
                    + "3. Salir\n"));

            switch (opcion) {
                case 1:
                    productoAseo.mostrarDetalles(idProducto);
                    break;
                case 2:
                    productoAseo.calcularPrecio(idProducto);
                    break;
                case 3:
                    bandera = false;
                    break;
                default:

            }
        }
    }

    public void menuGranos(int idProducto) {
        boolean bandera = true;
        while (bandera) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer?\n\n"
                    + "1. Mostrar informacion del producto\n"
                    + "2. Consultar Precio del Producto\n"
                    + "3. Salir\n"));

            switch (opcion) {
                case 1:
                    productogranos.mostrarDetalles(idProducto);
                    break;
                case 2:
                    productogranos.calcularPrecio(idProducto);
                    break;
                case 3:
                    bandera = false;
                    break;
                default:

            }
        }
    }

    public void menuTecnologia(int idProducto) {
        boolean bandera = true;
        while (bandera) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer?\n\n"
                    + "1. Mostrar informacion del producto\n"
                    + "2. Consultar Precio del Producto\n"
                    + "3. Salir\n"));

            switch (opcion) {
                case 1:
                    productoTecnologia.mostrarDetalles(idProducto);
                    break;
                case 2:
                    productoTecnologia.calcularPrecio(idProducto);
                    break;
                case 3:
                    bandera = false;
                    break;
                default:

            }
        }
    }

}
