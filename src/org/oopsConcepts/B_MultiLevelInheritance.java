package org.oopsConcepts;

public class B_MultiLevelInheritance {

	public void grandFatherHouse() {
		System.out.println("this is grandFather house");
	}

	public void grandFatherLand() {
		System.out.println("this is grandFather land");
	}

	public void grandFatherMoney() {
		System.out.println("this is grandFather money");
	}

	public static void main(String[] args) {

		B_MultiLevelInheritance prop = new B_MultiLevelInheritance();
		prop.grandFatherHouse();
		prop.grandFatherLand();
		prop.grandFatherMoney();

	}

}
