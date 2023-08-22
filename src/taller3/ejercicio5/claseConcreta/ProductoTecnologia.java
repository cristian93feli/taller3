/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3.ejercicio5.claseConcreta;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import taller3.ejercicio5.claseAbstracta.CategoriaTecnologia;
import taller3.ejercicio5.interfaz.IProductos;

/**
 *
 * @author crist
 */
public class ProductoTecnologia extends CategoriaTecnologia implements IProductos {

    private int idProducto;
    private String nombreProducto;
    private String precioProducto;
    private List<ProductoTecnologia> listaProductoTecnologia = new ArrayList<>();

    public void crearProducto() {
        ProductoTecnologia productoTecnologia = new ProductoTecnologia();
        productoTecnologia.setIdProducto(1);
        productoTecnologia.setNombreCategoria("tecnologia");
        productoTecnologia.setNombreProducto("computador");
        productoTecnologia.setPrecioProducto("2000000");
        productoTecnologia.setTipoTecnologia(agregarTipoTecnologia(productoTecnologia.getNombreProducto()));
        listaProductoTecnologia.add(productoTecnologia);

        ProductoTecnologia productoTecnologia1 = new ProductoTecnologia();
        productoTecnologia1.setIdProducto(2);
        productoTecnologia1.setNombreCategoria("tecnologia de video");
        productoTecnologia1.setNombreProducto("camara de seguridad");
        productoTecnologia1.setPrecioProducto("80000");
        productoTecnologia1.setTipoTecnologia(agregarTipoTecnologia(productoTecnologia1.getNombreProducto()));
        listaProductoTecnologia.add(productoTecnologia1);

        ProductoTecnologia productoTecnologia2 = new ProductoTecnologia();
        productoTecnologia2.setIdProducto(3);
        productoTecnologia2.setNombreCategoria("tecnologia");
        productoTecnologia2.setNombreProducto("celular");
        productoTecnologia2.setPrecioProducto("450000");
        productoTecnologia2.setTipoTecnologia(agregarTipoTecnologia(productoTecnologia2.getNombreProducto()));
        listaProductoTecnologia.add(productoTecnologia2);

    }

    public int mostrarInfo() {
        StringBuilder mensaje = new StringBuilder();
        for (ProductoTecnologia producto : listaProductoTecnologia) {

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
        for (int i = 0; i < listaProductoTecnologia.size(); i++) {

         
        }   JOptionPane.showMessageDialog(null, "el precio del " + listaProductoTecnologia.get(idProducto - 1)
                    .getNombreProducto() + " es de: " + listaProductoTecnologia.get(idProducto - 1).getPrecioProducto());
    }

    @Override
    public void mostrarDetalles(int idProducto) {
        StringBuilder mensaje = new StringBuilder();
             mensaje.append(listaProductoTecnologia.get(idProducto - 1).getIdProducto())
                    .append("  ")
                    .append(listaProductoTecnologia.get(idProducto - 1).getNombreProducto())
                    .append("  ")
                    .append("Pertenece a la categoria" + listaProductoTecnologia.get(idProducto - 1).getNombreCategoria())
                    .append("  ")
                    .append("y su tipo de tecnologia es: " + listaProductoTecnologia.get(idProducto - 1).getTipoTecnologia())
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

    public List<ProductoTecnologia> getListaProductoTecnologia() {
        return listaProductoTecnologia;
    }

    public void setListaProductoTecnologia(List<ProductoTecnologia> listaProductoTecnologia) {
        this.listaProductoTecnologia = listaProductoTecnologia;
    }

}
