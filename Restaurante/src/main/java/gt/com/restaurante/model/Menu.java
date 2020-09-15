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
public class Menu {
    private int IdMenu;
    private String Descripcion;
    private float ValorMenu;
    
    public Menu(int IdMenu, String Descripcion, float ValorMenu) {
        this.IdMenu = IdMenu;
        this.Descripcion = Descripcion;
        this.ValorMenu = ValorMenu;
    }
    
    public void setIdMenu(int idMenu) {
        this.IdMenu = idMenu;
    }
    public int getIdMenu() {
	return IdMenu;
    }
    public String getDescripcion() {
	return Descripcion;
    }
    public void setDescripcion(String descripcion) {
	Descripcion = descripcion;
    }
    public void setValorMenu(float valorMenu) {
	this.ValorMenu = valorMenu;
    }
    public float getValorMenu() {
	return ValorMenu;
    }
}
