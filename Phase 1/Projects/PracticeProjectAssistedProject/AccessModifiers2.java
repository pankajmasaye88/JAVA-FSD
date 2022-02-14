package PracticeProjectAssistedProject;

public class AccessModifiers2 {

	public static void main(String[] args) {
		
		//Default accessible in same package
		AccessModifiers def= new AccessModifiers();
		def.world();
		
//		access private variable to another class - not accessible
//		AccessModifiers obj= new AccessModifiers();
//		obj.test();
//		
		//access protected class in same package
		AccessModifiers obj2=new AccessModifiers();
		obj2.display();	
	}
}