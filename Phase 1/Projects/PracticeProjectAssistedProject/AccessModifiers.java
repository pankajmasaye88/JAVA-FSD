package PracticeProjectAssistedProject;

public class AccessModifiers {


	//within same class
	// using protected access specifiers
	protected void display() {
		System.out.println("You are accessing protected method of this class");
	}
	//using private access specifiers	
	private void test()
	{
		System.out.println("My private method");
	}
	// using public access specifiers
	public void hello()
	{
		System.out.println("Public method");
	}
	// Class is having Default access modifier 
	void world()
	{
		System.out.println("Default method");
	}

	public static void main(String[] args) {
		
	AccessModifiers obj= new AccessModifiers();
	
	obj.display();//able
	obj.test();//able
	obj.hello();//able
	obj.world();//able
	}
}