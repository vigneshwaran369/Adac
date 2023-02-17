package com.forLoop;

import java.util.LinkedList;
import java.util.List;

public class UsingForLoop {

	public static void main(String[] args) {

		
	List<Integer> v = new LinkedList<Integer> ();
	
	v.add(10);
	v.add(20);
	v.add(20);
	v.add(40);
	v.add(20);
	v.add(50);
	
	/*
	 * for(int i=0;i<=v.size();i++) { System.out.println(v); }
	 */
		
		for(Integer i:v) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
	}

}
