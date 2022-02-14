package PracticeProjectAssistedProject;

public class InnerClasses {
//1
		 private String msg1="Welcome to Java"; 
		 
		 class Inner1{  
		  void hello(){System.out.println(msg1+", Let us start learning Inner Classes");}  
		 }
//2
		 private String msg2="Inner Classes Second method";
		  void display1(){  
		 	 class Inner{  
		 		 void message(){
		 			 System.out.println(msg2);
		 		 }  
		   }  
		   Inner l=new Inner();  
		   l.message();  
		  }  
	
public static void main(String[] args) {
			
			InnerClasses obj1= new InnerClasses();
			InnerClasses.Inner1 in= obj1.new Inner1();
			in.hello();  
			
			obj1.display1();
			
			InnerClassesAbstract i= new InnerClassesAbstract() {
				
				@Override
				public void display2() {
					System.out.println("Anonymous Inner Class");
				}
			};
			i.display2();
		   }

		}