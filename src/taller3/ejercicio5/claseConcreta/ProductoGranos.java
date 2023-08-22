/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3.ejercicio5.claseConcreta;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import taller3.ejercicio5.claseAbstracta.CategoriaGranos;
import taller3.ejercicio5.interfaz.IProductos;

/**
 *
 * @author crist
 */
public class ProductoGranos extends CategoriaGranos implements IProductos {

    private int idProducto;
    private String nombreProducto;
    private String precioProducto;
    private List<ProductoGranos> listaProductoGranos = new ArrayList<>();

    public void crearProducto() {
        ProductoGranos productogranos = new ProductoGranos();
        productogranos.setIdProducto(1);
        productogranos.setNombreCategoria("Granos");
        productogranos.setNombreProducto("Arroz");
        productogranos.setPrecioProducto("2000");
        productogranos.setEsOrganico(false);
        listaProductoGranos.add(productogranos);

        ProductoGranos productogranos2 = new ProductoGranos();
        productogranos2.setIdProducto(2);
        productogranos2.setNombreCategoria("Granos");
        productogranos2.setNombreProducto("Frijol");
        productogranos2.setPrecioProducto("8000");
        productogranos2.setEsOrganico(false);
        listaProductoGranos.add(productogranos2);

        ProductoGranos productogranos3 = new ProductoGranos();
        productogranos3.setIdProducto(3);
        productogranos3.setNombreCategoria("Granos");
        productogranos3.setNombreProducto("alverja");
        productogranos3.setPrecioProducto("4500");
        productogranos3.setEsOrganico(false);
        listaProductoGranos.add(productogranos3);

    }

    public int mostrarInfo() {
        StringBuilder mensaje = new StringBuilder();
        for (ProductoGranos producto : listaProductoGranos) {

            mensaje.append(producto.getIdProducto())
                    .append("  ")
                    .append(producto.getNombreProducto())
                    .append("\n");

        }
        return Integer.parseInt(JOptionPane.showInputDialog("Estos son los productos vinculados a la categoria que seleccionaste, ingresa"
                + "el id del producto que desees Gestionar:\n\n\n" + mensaje.toString()));
    }

    @Override
    public void calcularPrecio(int idProducto) {
        for (int i = 0; i < listaProductoGranos.size(); i++) {

            
        }JOptionPane.showMessageDialog(null, "el precio del " + listaProductoGranos.get(idProducto - 1)
                    .getNombreProducto() + " es de: " + listaProductoGranos.get(idProducto - 1).getPrecioProducto());
    }

    @Override
    public void mostrarDetalles(int idProducto) {
        StringBuilder mensaje = new StringBuilder();


            mensaje.append(listaProductoGranos.get(idProducto - 1).getIdProducto())
                    .append("  ")
                    .append(listaProductoGranos.get(idProducto - 1).getNombreProducto())
                    .append("  ")
                    .append("Pertenece a la categoria" + listaProductoGranos.get(idProducto - 1).getNombreCategoria())
                    .append("  ")
                    .append(informacionAdicional(listaProductoGranos.get(idProducto - 1).isEsOrganico()))
                    .append("\n");

        
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(String precioProducto) {
        this.precioProducto = precioProducto;
    }

    public List<ProductoGranos> getListaProductoGranos() {
        return listaProductoGranos;
    }

    public void setListaProductoGranos(List<ProductoGranos> listaProductoGranos) {
        this.listaProductoGranos = listaProductoGranos;
    }

}
