package com.keyWords;

public class ReturnKeyWord {

	static int i = 5;
	static int j = 10;

	static int add2Values() {

		int total = i + j;
		return total;
	}

	public static void bringTheCoffee(int a) {

		System.out.println("Get some amout of coffee : " + a);
	}

	public static int addAgain(int a, int b) {

		int j = a + b;

		System.out.println("After add the value : " + j);
		return j;

	}

	public static void addAll(int a, int b) {

		System.out.println("All total(returnedTotal and addedValue) is : " + (a + b));

	}

	public static void main(String[] args) {
		int returnedTotal = add2Values();
		System.out.println("Total value is : " + returnedTotal);

		bringTheCoffee(returnedTotal);

		int addedValue = addAgain(returnedTotal, 20);
		System.out.println("added value is : " + addedValue);

		addAll(returnedTotal, addedValue);
	}

}
