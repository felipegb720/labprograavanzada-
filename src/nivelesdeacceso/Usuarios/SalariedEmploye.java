/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nivelesdeacceso.Usuarios;
import nivelesdeacceso.Usuarios.Employe;

/**
 *
 * @author t203
 */
public abstract class SalariedEmploye extends Employe {
    
    public SalariedEmploye(){
       //Employe emp = new Employe();
        Name = "victor";
        sethireyear(1997);
        Country = "canada";
}
    
    @Override           
    public double MonthlyPay(){
        return 1000;
    }         
            
    @Override          
     abstract protected double AnnualPay();            
    
}
    

