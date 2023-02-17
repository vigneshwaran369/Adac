package org.oopsConcepts;

public class A1_AbstractEx2 extends A_AbstractEx2 {

	@Override
	public void fbUserName() {
		System.out.println("password is 8732847987");
	}

	@Override
	public void instaUserName() {
		System.out.println("password is 8093248092409");
	}

	public static void main(String[] args) {
		A_AbstractEx2 a = new A1_AbstractEx2();
		a.fbUserName();
		a.instaUserName();
		
	}
}
