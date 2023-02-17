package org.statickey;

public class B_Static {

	
	static String myName ="vigneshwaran";
	static int i = 100;
	static int j = 200;
	
	public static int add() {
		int k =i+j;
		return k;
	}
	
	public static void main(String[] args) {

		System.out.println(add());
	}

}
