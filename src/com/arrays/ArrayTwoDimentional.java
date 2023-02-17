package com.arrays;

public class ArrayTwoDimentional {

	public static void main(String[] args) {

		int s[][] = new int [3][2];  //with limit
		
		s[0][0]=10;
		s[0][1]=20;
		
		s[1][0]=30;
		s[1][1]=40;
		
		s[2][0]=50;
		s[2][1]=60;
		
		System.out.println("USING CLASICAL FOR LOOP");
		for(int i =0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.println(s[i][j]);
				
			}
		}
		
		
		System.out.println("--------------------------------");
		
		
		
		
int s1[][] = new int [3][2];
		
		s1[0][0]=10;
		s1[0][1]=20;
		
		s1[1][0]=30;
		s1[1][1]=40;
		
		s1[2][0]=50;
		s1[2][1]=60;
		
		
		for(int i =0;i<=2;i++) {
			for(int j=0;j<=1;j++) {
				System.out.print(s1[i][j]+" ");
				
			}System.out.println();
		}
		
		
		System.out.println("USING FOR EACH LOOP");
		
		
		for(int i[]:s1) {
			for(int j:i) {
				System.out.print(j+" ");
			}System.out.println();
		}
		
		System.out.println("++++++++++++++++++++++++++++++");
		
		System.out.println("USING NORMAL FOR LOOP");
		
		int e[][] = { {10,20,30},{40,50,60},{70,80,90},{100,110,120},{130,140,150} }; // 5 rows, 3 column
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(e[i][j]+"  ");
			}System.out.println();
		}
		
		System.out.println("USING FOR EACH LOOP");
		
		
		
		for(int i[]:e) {
			for(int j:i) {
			 System.out.print(j+" ");
			}System.out.println();
		}
		
		
	}

}
