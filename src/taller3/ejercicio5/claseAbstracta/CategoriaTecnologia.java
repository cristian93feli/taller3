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
public abstract class CategoriaTecnologia {
    private String nombreCategoria;
    private String tipoTecnologia;
    
    public  String agregarTipoTecnologia(String nombreProducto){
        return nombreProducto.toUpperCase().equals("COMPUTADOR") ? "Electrónica de Consumo"
                :nombreProducto.toUpperCase().equals("CAMARA DE SEGURIDAD") ? "Dispositivos Inteligentes"
                :"otros";
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getTipoTecnologia() {
        return tipoTecnologia;
    }

    public void setTipoTecnologia(String tipoTecnologia) {
        this.tipoTecnologia = tipoTecnologia;
    }




    
    
    
}
