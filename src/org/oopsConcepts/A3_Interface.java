package org.oopsConcepts;

public class A3_Interface implements A_Interface, A2_Interface {

	@Override
	public void fbUserName() {

		System.out.println("ksjdfoiu");
	}

	@Override
	public void instaUserName() {
		System.out.println("jdfuiuygcbnw");

	}

	@Override
	public void mobileUserName() {
		System.out.println("dfkhsf76786");
	}

	@Override
	public void gPayUserName() {
		System.out.println("dksjhfjkh76387623874");
	}

	public static void main(String[] args) {
		A3_Interface a = new A3_Interface();
		a.fbUserName();
		a.instaUserName();
		a.gPayUserName();
		a.mobileUserName();
	

	}

}
