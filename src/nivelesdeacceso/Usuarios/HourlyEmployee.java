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
abstract class HourlyEmployee extends Employe {
    
   
    
    public HourlyEmployee(){
       //Employe emp = new Employe();
        Name = "victor";
        sethireyear(1997);
        Country = "canada";
}
    
    @Override           
    abstract protected int HoursperWeek();           
          
            
    @Override          
     abstract protected double HourlyWage();            
    
}

