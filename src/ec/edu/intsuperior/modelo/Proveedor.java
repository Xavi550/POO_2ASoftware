/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author xavi
 */
public class Proveedor {
    private String idProveedor;
    private TipoProveedor tproveedor;

    public Proveedor() {
    }
    
    public Proveedor(String idProveedor, TipoProveedor tproveedor) {
        this.idProveedor = idProveedor;
        this.tproveedor = tproveedor;
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public TipoProveedor getTproveedor() {
        return tproveedor;
    }

    public void setTproveedor(TipoProveedor tproveedor) {
        this.tproveedor = tproveedor;
    }    
}
