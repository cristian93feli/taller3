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
public abstract class CategoriaGranos {

    private String nombreCategoria;
    private boolean esOrganico;

    public String informacionAdicional(boolean esOrganico) {
        return esOrganico ? "Recuerda que este producto debes gastarlo lo mas pronto por que es organico"
                : "este producto se conseva mas tiempo por que no es un producto organico";
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public boolean isEsOrganico() {
        return esOrganico;
    }

    public void setEsOrganico(boolean esOrganico) {
        this.esOrganico = esOrganico;
    }

}
