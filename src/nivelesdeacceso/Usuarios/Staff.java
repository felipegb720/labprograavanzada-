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
abstract class Staff extends SalariedEmploye {
          
    protected double AnnualPay(){
 
        return this.MonthlyPay()*12;
    }            

}
