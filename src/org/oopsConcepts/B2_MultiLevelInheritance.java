package org.oopsConcepts;

public class B2_MultiLevelInheritance extends B1_MultiLevelInheritance {

	public void myHouse() {
		System.out.println("this is my house");
	}

	public void myLand() {
		System.out.println("this is my land");
	}

	public void myMoney() {
		System.out.println("this is my money");
	}

	public static void main(String[] args) {
		B2_MultiLevelInheritance p = new B2_MultiLevelInheritance();
		p.grandFatherHouse();
		p.grandFatherLand();
		p.grandFatherMoney();
		p.fatherHouse();
		p.fatherLand();
		p.fathersMoney();
		p.myHouse();
		p.myLand();
		p.myLand();
		p.myMoney();

	}

}
