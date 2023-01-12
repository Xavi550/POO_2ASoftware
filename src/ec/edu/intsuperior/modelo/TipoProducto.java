/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author xavi
 */
public class TipoProducto {
    private String idTipoProducto;
    private String detalleTipo;
    private String estadoProducto;

    public TipoProducto() {
    }

    public TipoProducto(String idTipoProducto, String detalleTipo, String estadoProducto) {
        this.idTipoProducto = idTipoProducto;
        this.detalleTipo = detalleTipo;
        this.estadoProducto = estadoProducto;
    }

    public String getEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(String estadoProducto) {
        this.estadoProducto = estadoProducto;
    }

    public String getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(String idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    public String getDetalleTipo() {
        return detalleTipo;
    }

    public void setDetalleTipo(String detalleTipo) {
        this.detalleTipo = detalleTipo;
    }
    
}
