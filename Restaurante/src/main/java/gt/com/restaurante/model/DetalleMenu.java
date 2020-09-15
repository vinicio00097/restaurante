/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.restaurante.model;

import java.util.Date;

/**
 *
 * @author elunadanilo
 */
public class DetalleMenu {
    private int IdDetalleMenu;
    private int IdMenu;
    private int IdProducto;
    private Date FechaAsignacion;
    private boolean  Extra;
    
    public DetalleMenu(int IdDetalleMenu, int IdMenu, int IdProducto, Date FechaAsignacion, boolean Extra) {
        this.IdDetalleMenu = IdDetalleMenu;
        this.IdMenu = IdMenu;
        this.IdProducto = IdProducto;
        this.FechaAsignacion = FechaAsignacion;
        this.Extra = Extra;
    }
    
    public void setIdDetalleMenu(int idDetalleMenu) {
	this.IdDetalleMenu = idDetalleMenu;
    }
    public int getIdDetalleMenu() {
        return IdDetalleMenu;
    }
    public void setIdMenu(int idMenu) {
        this.IdMenu = idMenu;
    }
    public int getIdMenu() {
	return IdMenu;
    }
    public void setIdProducto(int idProducto) {
        this.IdProducto = idProducto;
    }
    public int getIdProducto() {
	return IdProducto;
    }
    public void setFechaAsignacion(Date fechaAsignacion) {
	this.FechaAsignacion = fechaAsignacion;
    }
    public Date getFechaAsignacion() {
	return FechaAsignacion;
    }
    public void setExtra(boolean extra) {
	this.Extra = extra;
    }        
    public boolean getExtra() {
	return Extra;
    }
}
