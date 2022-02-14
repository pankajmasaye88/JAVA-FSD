package PracticeProjectAssistedProject;

abstract class OOPS_abstraction_2_shape {
	
    String color; 
    abstract double area(); 
    public abstract String toString(); 
    public OOPS_abstraction_2_shape(String color) 
    { 
        System.out.println("Shape constructor called"); 
        this.color = color; 
    } 
    public String getColor() 
    { 
        return color; 
    } 
}