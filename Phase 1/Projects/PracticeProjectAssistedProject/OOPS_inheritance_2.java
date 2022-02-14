package PracticeProjectAssistedProject;

public class OOPS_inheritance_2 extends OOPS_inheritance_1 {
	
	    public int seatHeight; 
	    public OOPS_inheritance_2(int gear,int speed,int startHeight) 
	    {  
	        super(gear, speed); 
	        seatHeight = startHeight; 
	    }  
	    public void setHeight(int newValue) 
	    { 
	        seatHeight = newValue; 
	    } 
	    @Override
	    public String toString() 
	    { 
	        return (super.toString()+ 
	                "\nseat height is "+seatHeight); 
	    } 
	}