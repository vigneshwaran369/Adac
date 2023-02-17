package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayIntoCollection {

	public static void convert() {

		String v[] = { "10", "20", "30", "40", "30", "20" };

		for (String i : v) {
			System.out.println(i);
		}
		ArrayList a = new ArrayList(Arrays.asList(v)); // we can use only String and Object
		System.out.println(a);

	}

	static void iterate2d() {
		String s[][] = { { "vicky" }, { "vignesh" }, { "vigneshwaran" }, { "vic" } };

		for (String ss[] : s) {
			for (String j : ss) {
				System.out.println(j);
			}
		}
	}

	public static void main(String[] args) {

		convert();
		iterate2d();

	}

}
