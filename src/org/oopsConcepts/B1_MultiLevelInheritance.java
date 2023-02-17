package org.oopsConcepts;

public class B1_MultiLevelInheritance extends B_MultiLevelInheritance {

	public void fatherHouse() {
		System.out.println("this is father's house");
	}

	public void fatherLand() {
		System.out.println("this is father's land");
	}

	public void fathersMoney() {
		System.out.println("this is father's money");
	}

	public static void main(String[] args) {

		B1_MultiLevelInheritance property = new B1_MultiLevelInheritance();

		property.grandFatherHouse();
		property.grandFatherLand();
		property.grandFatherMoney();
		property.fatherHouse();
		property.fatherLand();
		property.fathersMoney();

	}

}
