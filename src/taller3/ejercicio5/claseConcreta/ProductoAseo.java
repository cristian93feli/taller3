/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3.ejercicio5.claseConcreta;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import taller3.ejercicio5.claseAbstracta.CategoriaAseo;
import taller3.ejercicio5.interfaz.IProductos;

/**
 *
 * @author crist
 */
public class ProductoAseo extends CategoriaAseo implements IProductos {

    private int idProducto;
    private String nombreProducto;
    private String precioProducto;
    private List<ProductoAseo> listaProductoAseo = new ArrayList<>();

    public void crearProducto() {
        ProductoAseo productoAseo = new ProductoAseo();
        productoAseo.setIdProducto(1);
        productoAseo.setNombreCategoria("Aseo");
        productoAseo.setNombreProducto("Javon De Loza");
        productoAseo.setPrecioProducto("3000");
        productoAseo.setEsDesinfectante(false);
        listaProductoAseo.add(productoAseo);

        ProductoAseo productoAseo1 = new ProductoAseo();
        productoAseo1.setIdProducto(2);
        productoAseo1.setNombreCategoria("Aseo");
        productoAseo1.setNombreProducto("Javon Liquido");
        productoAseo1.setPrecioProducto("8000");
        productoAseo1.setEsDesinfectante(true);
        listaProductoAseo.add(productoAseo1);

        ProductoAseo productoAseo2 = new ProductoAseo();
        productoAseo2.setIdProducto(3);
        productoAseo2.setNombreCategoria("Aseo");
        productoAseo2.setNombreProducto("Limpido");
        productoAseo2.setPrecioProducto("6000");
        productoAseo2.setEsDesinfectante(true);
        listaProductoAseo.add(productoAseo2);

    }

    public int mostrarInfo() {
        StringBuilder mensaje = new StringBuilder();
        for (ProductoAseo producto : listaProductoAseo) {

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
        for (int i = 0; i < listaProductoAseo.size(); i++) {

  
        }          JOptionPane.showMessageDialog(null, "el precio del " + listaProductoAseo.get(idProducto - 1)
                    .getNombreProducto() + " es de: " + listaProductoAseo.get(idProducto - 1).getPrecioProducto());

    }

    @Override
    public void mostrarDetalles(int idProducto) {
        StringBuilder mensaje = new StringBuilder();
 

            mensaje.append(listaProductoAseo.get(idProducto-1).getIdProducto())
                    .append("  ")
                    .append(listaProductoAseo.get(idProducto-1).getNombreProducto())
                    .append("  ")
                    .append("Pertenece a la categoria" + listaProductoAseo.get(idProducto-1).getNombreCategoria())
                    .append("  ")
                    .append(informacionAdicional(listaProductoAseo.get(idProducto-1).isEsDesinfectante()))
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

    public List<ProductoAseo> getListaProductoAseo() {
        return listaProductoAseo;
    }

    public void setListaProductoAseo(List<ProductoAseo> listaProductoAseo) {
        this.listaProductoAseo = listaProductoAseo;
    }

}
