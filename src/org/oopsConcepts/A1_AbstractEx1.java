package org.oopsConcepts;

public class A1_AbstractEx1 extends A_AbstractEx {

	
	
	@Override
	public  void carEngine() {
		System.out.println("RNCU-369");
	}

	@Override
	public void carModel() {

		System.out.println("2023");
	}

	public static void main(String[] args) {
		A1_AbstractEx1 a = new A1_AbstractEx1();
		a.car();
		a.carEngine();
		a.carModel();
		
		
	}

	
}
