package com.arrays;

public class ArraySingleDimentional {

	public static void main(String[] args) {

		int a[] = new int[5];        // with limit
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println(a.length);
		
		System.out.println("Get all the values by using normal forloop");
		for(int i =0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("using for each loop");
		int sum =0;
		for(int i : a) {
			System.out.println(i);
			sum =sum+i;
			//System.out.println(sum);
			
		}
		System.out.println("-----------------------");
		System.out.println(sum);
		
		
		int b[]= {10,20,30,40,50,60};          // without limit
		
		System.out.println(b.length);
		
		for(int j: b) {
		 System.out.print(j+" ");
		}

		System.out.println("========================");
		
		
		
		Object o[]= new Object[5];
		o[0]=101;
		o[1]="vicky";
		o[2]='s';
		o[3]=369.11;
		o[4]=7457758735L;
		
		for(Object i:o) {
			System.out.println(i);
		}
		
		
		Object o1[]= {"vicky",1000,'s',10.01};
		for(Object i :o1) {
			System.out.println(i);
		}
		
		
		
		
	}

}
