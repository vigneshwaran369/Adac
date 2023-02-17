package org.oopsConcepts;

public abstract  class A_AbstractEx {

	public  void car() {
		System.out.println("car name is Benz");
	}

	public  abstract void carEngine() ;

	public  abstract void carModel();

	public static void main(String[] args) {
		// cannot create the object for abstract class.
		// But we can call the method car by change into static
	}

}
