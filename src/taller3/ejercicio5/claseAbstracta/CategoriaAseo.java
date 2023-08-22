/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3.ejercicio5.claseAbstracta;

/**
 *
 * @author crist
 */
public abstract class CategoriaAseo {
    
    private String nombreCategoria;
    private boolean esDesinfectante;
    
    public String informacionAdicional(boolean esDesinfectante) {
        return esDesinfectante ? "el producto es Desinfectante"
                : "el producto no es desinfectante";
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public boolean isEsDesinfectante() {
        return esDesinfectante;
    }

    public void setEsDesinfectante(boolean esDesinfectante) {
        this.esDesinfectante = esDesinfectante;
    }
    
    
    
}
