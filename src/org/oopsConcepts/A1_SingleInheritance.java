package org.oopsConcepts;

public class A1_SingleInheritance extends A_SingleInheritance{

	
	public void studentName() {
		System.out.println("vigneshwaran");
	}
	
	
	
	public static void main(String[] args) {

		
//		 A1_SingleInheritance info = new A1_SingleInheritance(); //if we have an implementation in child class (for call studentName) info.studentName();
//		 info.schoolName();
//		 info.place();
//		 info.year();
//		 
		A_SingleInheritance info = new A1_SingleInheritance();
		info.schoolName();
		info.place();
		info.year();
		
		
		
		
	}

}
