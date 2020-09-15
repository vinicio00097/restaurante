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
public class Orden {
    private int IdOrden;
    private Date Fecha;
    private boolean Pagada;
    private boolean Cocinada;
    private int IdCliente;
    
    public Orden(int IdOrden, Date Fecha, boolean Pagada, boolean Cocinada, int IdCliente) {
		this.IdOrden = IdOrden;
		this.Fecha = Fecha;
		this.Pagada = Pagada;
		this.Cocinada = Cocinada;
		this.IdCliente = IdCliente;
	}
    
    public void setIdOrden(int idOrden) {
		this.IdOrden = idOrden;
	}
        public int getIdOrden() {
		return IdOrden;
	}

	public void setFecha(Date fecha) {
		this.Fecha = fecha;
	}
        public Date getFecha() {
		return Fecha;
	}

	public void setPagada(boolean pagada) {
		this.Pagada = pagada;
	}
        
        public boolean getPagada() {
		return Pagada;
	}
        
        public boolean getCocinada() {
		return Cocinada;
	}

	public void setCocinada(boolean cocinada) {
		this.Cocinada = cocinada;
	}
        
        public void setIdCliente(int idCliente) {
		this.IdCliente = idCliente;
	}
        public int getIdCliente() {
		return IdCliente;
	}
}
