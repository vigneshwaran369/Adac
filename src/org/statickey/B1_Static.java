package org.statickey;

public class B1_Static {

	
	
	
	public static void data() {
		int a =B_Static.add();
		System.out.println(a); // call methods from B_Static
		A_Static.name();		// call methods from A_Static
		A_Static.value();		// call methods from A_Static
		
	}
	
	public static void main(String[] args){
		
		System.out.println(B_Static.myName); // call variable from B_Static
		System.out.println(A_Static.a);		// call variable from A_Static
		data();
		
	}
	
}
