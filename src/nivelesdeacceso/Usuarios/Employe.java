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
public abstract class Employe {
    public String Name;
    private int Hireyear;
    public String Country ;
    
    
    public void sethireyear(int Hireyear){
        this.Hireyear  = Hireyear;
    }   
    
    public int gethireyear(){
        return this.Hireyear;
    }
    
    protected abstract double MonthlyPay();
    
    protected abstract double AnnualPay();
    
    protected abstract int HoursperWeek();
    
    protected abstract double HourlyWage();
}
