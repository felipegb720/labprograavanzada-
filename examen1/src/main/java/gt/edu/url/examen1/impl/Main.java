package gt.edu.url.examen1.impl;
import java.util.*;
/**
 *
 * @author Felipe_GB720
 */
public class Main {
    
    public static void main(String[] args) {
        
    	System.out.println("Examen Parcial 1");
    			
    	Scanner Entrada = new Scanner(System.in);
    	
    	 int A;
    	 int B;
    	 
    	 for (int i=0; i<6; i++){
    		 
    		 do {
    		 
    		 System.out.print("ingrese los Juegos Ganados de A: ");
   
    		 A = Entrada.nextInt();
  
    		 System.out.print("ingrese los Juegos Ganados de B: ");

    		 B = Entrada.nextInt();
    		 
    		 }while((A+B)<9);
    			 
    	
    	}

    }
    
}
