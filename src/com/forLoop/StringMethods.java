package com.forLoop;

public class StringMethods {

	public static void main(String[] args) {
		;
		// intha method by new keyword method
//		String s = new String("vicky--");
//		String v = new String("vicky1");
//		System.out.println(s);
//		System.out.println(v);
//		System.out.println(s.charAt(2));
//		System.out.println(s.length());
//		boolean s1 = s.equals("vicky");
//		System.out.println(s1);
//		 
//		
		
		String s = "Vigneshwaran";
		String o = "Welcome to java";
		
		
		System.out.println(s.compareTo(o));
		
		
	String[] v = s.split(" ");
		for(int i=0;i<v.length;i++) {
			System.out.println(v[i]);
		}
		
		
		System.out.println(s.join("@", "vig","nesh","waran"));
	System.out.println(s.replace("g", "G"));
		
		System.out.println(s.replace("Vignesh", "Vicky"));
		
		
		System.out.println(s.substring(1,4));
		
		System.out.println(s.startsWith("Vig"));
System.out.println(s.concat("vick"));
	
		
		
		
		
		
		
		
		
		
	}

}
