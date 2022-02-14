package PracticeProjectAssistedProject;

public class OOPS_abstraction_4_ractangle extends OOPS_abstraction_2_shape {
 
    double length; 
    double width; 
    public OOPS_abstraction_4_ractangle(String color,double length,double width) 
    { 
        super(color); 
        System.out.println("Rectangle constructor called"); 
        this.length = length; 
        this.width = width; 
    } 
    @Override
    double area() 
    { 
        return length*width; 
    } 
    @Override
    public String toString() 
    { 
        return "Rectangle color is " + super.color +  
                           "and area is : " + area(); 
    } 
} 