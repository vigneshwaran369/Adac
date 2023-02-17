package org.oopsConcepts;

public class A_OverLoading {

	public  void add(int a, int b) {
		int c = a + b;
		System.out.println("added value is " + c);
	}

	public  void add(int a,int b, int c) {
		int d =a+b+c;
		System.out.println("added value is "+d);
	}

	public  void add(String a, int b) {
		System.out.println(a+b);

	}

	public  void add(String a, char b) {

		System.out.println(a+b);
	}

	public static void main(String[] args) {
		
		A_OverLoading a = new A_OverLoading();
		
		

//		a.add(10, 30);
//		a.add(10, 20, 30);
//		a.add("vicky", 369);
//		a.add("vigneshwara", 'N');
	}

}
