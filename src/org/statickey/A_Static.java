package org.statickey;

public class A_Static {

	static int a =369;
	static int b =100;
	static String s ="vicky";
	
	public static void value() {
		int c =a+b;
		System.out.println(c);	
	}
	
	public static void name() {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		value();
		name();
		
	}

}
