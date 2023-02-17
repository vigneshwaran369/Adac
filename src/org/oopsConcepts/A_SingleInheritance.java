package org.oopsConcepts;

public class A_SingleInheritance {

	public void schoolName() {
		System.out.println("SKV Hr.Sec. School");
	}

	public void place() {
		System.out.println("Madurai");
	}

	public void year() {
		System.out.println("2013-2015");
	}

	public static void main(String[] args) {
		A_SingleInheritance info = new A_SingleInheritance();
		info.schoolName();
		info.place();
		info.year();

	}

}
