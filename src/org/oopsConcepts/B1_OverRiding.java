package org.oopsConcepts;

public class B1_OverRiding extends B_OverRiding {

	@Override
	public void takeMyHome() {
		System.out.println("dont want your home");
	}

	@Override
	public void takeMyLand() {
		System.out.println("dont want your land");
	}

	@Override
	public void takeMyMoney() {
		System.out.println("dont want your money");
	}

	public static void main(String[] args) {
		B_OverRiding s = new B1_OverRiding();
		s.takeMyHome();
		s.takeMyLand();
		s.takeMyMoney();

	}

}
