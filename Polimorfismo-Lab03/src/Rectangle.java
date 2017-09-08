
public class Rectangle implements Shape { // CLASE IMPLEMENTA INTERFAZ SHAPE
    
    private double width; // DECLARACION DE VARIABLES 
    private double lenght;
    
    
    public Rectangle(double width, double lenght){
    
    this.width = width;
    this.lenght = lenght;
    }


    public double getArea(){
        
        return (this.width*this.lenght);
    }
    
    public String toString(){
    
    return "Area es "+ this.getArea();
    }

}

