/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen1.impl;

/**
 *
 * @author Felipe_GB720
 */
public interface Monster {
	
	public String getElemento();
	
	public void setElemento(String element);
	
	public int getEdad();
	
	public void setEdad(int age);
	
	public String getColor();
	
	public void setColor(String colorN);
	
	public void agigantarse ();
	
	public void caminarLento();
	
	public void golpear();
}
