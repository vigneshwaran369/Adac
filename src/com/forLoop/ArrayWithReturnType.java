package com.forLoop;

public class ArrayWithReturnType {

	
 String ss[][] = {{"vicky","svicky"},
				 {"vignesh","vicky1"},
				 {"vigneshwaran","vicky2"},
				 {"vic","vicky3"},
};
	
	public  void arrayReturn() {
		for(int i=0;i<ss.length;i++) {
			for(int j=0;j<=i;j++) {
				System.out.println(ss[i][j]);
			}
		}
		}
		
	
	
	
	
	public static void main(String[] args) {
		ArrayWithReturnType arr = new ArrayWithReturnType();
		arr.arrayReturn();
				
	
		
		
	}

}
