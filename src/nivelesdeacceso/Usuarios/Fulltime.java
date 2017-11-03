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
public class Fulltime extends SalariedEmploye {
          
    protected double AnnualPay(){
 
        return this.MonthlyPay()*12;
    }            

    @Override
    protected int HoursperWeek() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double HourlyWage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
