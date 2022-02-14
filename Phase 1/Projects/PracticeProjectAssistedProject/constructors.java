package PracticeProjectAssistedProject;

public class constructors {

	//class level variables
	int id;
	String name;
	
	//default constructor
	public void EmpInfo(){
		id=23;
		name="Pankaj";
		display();
	}

	//parameterized constructor
	public void Std(int i,String n){
		id=i;
		name=n;		
		display();
	}

	private void display() {
		System.out.println("Id : "+id+" Name : "+name);
	}

	public static void main(String[] args) {
		
	constructors obj= new constructors();
	System.out.println("User 1 : ");
	obj.EmpInfo();
	
	System.out.println("User 2 :" );
	obj.Std(5,"Masaye");
	
	
	
	
	}
	}