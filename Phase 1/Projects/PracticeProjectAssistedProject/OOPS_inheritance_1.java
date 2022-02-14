package PracticeProjectAssistedProject;

public class OOPS_inheritance_1 {
    public int gear; 
    public int speed; 
    public OOPS_inheritance_1(int gear, int speed) 
    { 
        this.gear = gear; 
        this.speed = speed; 
    } 
    public void applyBrake(int decrement) 
    { 
        speed -= decrement; 
    } 
    public void speedUp(int increment) 
    { 
        speed += increment; 
    }  
    public String toString()  
    { 
        return("No of gears are " + gear + "\n" + "speed of bicycle is " + speed); 
    }  

    public static void main(String args[])  
    { 
    	OOPS_inheritance_2 mb= new OOPS_inheritance_2(3,100,25);
        System.out.println(mb.toString());
    } 
}