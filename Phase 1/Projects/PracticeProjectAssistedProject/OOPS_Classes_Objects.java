package PracticeProjectAssistedProject;

public class OOPS_Classes_Objects {
	
    String name; 
    String breed; 
    int age; 
    String color; 
    
   public OOPS_Classes_Objects(String name, String breed, int age, String color) 
    { 
        this.name = name; 
        this.breed = breed; 
        this.age = age; 
        this.color = color; 
    } 
    public String getName() 
    { 
        return name; 
    } 
    public String getBreed() 
    { 
        return breed; 
    } 
    public int getAge() 
    { 
        return age; 
    } 
    public String getColor() 
    { 
        return color; 
    } 
    @Override
    public String toString() 
    { 
        return("Hi my dog name is "+ this.getName()+ ".\nMy breed,age and color are " + this.getBreed()+", " + this.getAge()+ ", and "+ this.getColor() + "."); 
    } 
    public static void main(String[] args) 
    { 
    	OOPS_Classes_Objects scott=new OOPS_Classes_Objects("Scott","papillon", 5, "black");
        System.out.println(scott.toString()); 
    } 
}