/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.restaurante.model;

/**
 *
 * @author elunadanilo
 */
public class OrdenDetalles {
    private int IdDetalle;
    private int IdOrden;
    private int IdProducto;
    private int IdMenu;
    private boolean Extra;
    private float ValorUnitario;
    
     public OrdenDetalles(int IdDetalle, int IdOrden, int IdProducto, int IdMenu, boolean Extra, float ValorUnitario) {
        this.IdDetalle = IdDetalle;
        this.IdOrden = IdOrden;
        this.IdProducto = IdProducto;
        this.IdMenu = IdMenu;
        this.Extra = Extra;
        this.ValorUnitario = ValorUnitario;
    }
    
    public void setIdDetalle(int idDetalle) {
	this.IdDetalle = idDetalle;
    }
    public int getIdDetalle() {
	return IdDetalle;
    }
    public void setIdOrden(int idOrden) {
	this.IdOrden = idOrden;
    }
    public int getIdOrden() {
	return IdOrden;
    }
   public void setIdProducto(int idProducto) {
	this.IdProducto = idProducto;
    }
    public int getIdProducto() {
	return IdProducto;
    }
    public void setIdMenu(int idMenu) {
	this.IdMenu = idMenu;
    }
    public int getIdMenu() {
	return IdMenu;
    }
    public void setExtra(boolean extra) {
	this.Extra = extra;
    }
    public boolean getExtra() {
	return Extra;
    }
    public void setExtra(float valorUnitario) {
	this.ValorUnitario = valorUnitario;
    }
    public float getValorUnitario() {
	return ValorUnitario;
    }
}
