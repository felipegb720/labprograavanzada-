public class Main {

    public static void main(String[] args) {
	    
	    System.out.println("Hello World!");
	    
	    Shape A1, B1, C1; // DECLAACION DE OBJETOS TIPO SHAPE
	    
	    A1 = new Rectangle(10,10); // DECLARACION DE OBJETOS TIPO SHAPE
	    
	    B1 = new Triangle(10,4);
	    
	    C1 = new Rectangle(5,5);
    
        System.out.println(A1.toString()); // IMPRESION DE AREAS
        System.out.println(B1.toString());
        System.out.println(C1.toString());
        
        Rectangle Re1;
        Re1 = (Rectangle)C1; // CASTING PARA FORZAR LA CONVERSION DEL OBJETO
        System.out.println(Re1.toString());
    }
    
}
