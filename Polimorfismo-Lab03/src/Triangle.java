
public class Triangle implements Shape {  // CLASE IMPLEMENTA INTERFAZ SHAPE
    
    private double base;
    private double height;
    
    
    public Triangle(double base, double height){
    
    this.base = base;
    this.height = height;
    }


    public double getArea(){
        
        return (this.base * this.height)/2;
    }
    
    public String toString(){
    
    return "Area es "+ this.getArea();
    }
}
