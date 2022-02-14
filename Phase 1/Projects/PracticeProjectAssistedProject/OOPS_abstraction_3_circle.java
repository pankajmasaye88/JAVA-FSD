package PracticeProjectAssistedProject;

public class OOPS_abstraction_3_circle extends OOPS_abstraction_2_shape{
	
    double radius; 
    public OOPS_abstraction_3_circle(String color,double radius) 
    { 
        super(color); 
        System.out.println("Circle constructor called"); 
        this.radius = radius; 
    }
    @Override
    double area() 
    { 
        return Math.PI * Math.pow(radius, 2); 
    } 
    @Override
    public String toString() 
    { 
        return "Circle color is " + super.color + "and area is : " + area(); 
    } 
} 