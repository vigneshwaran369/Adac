package com.forLoop;

public class For {

	public static void main(String[] args) {
                             //Explanation
		
		
		
		
		//naama inga print panna vendiyathu i mattum than.so keela irukkura j loop ethukku
		// -- irukkunna, mela irukkura i loop ah ethana thadava seyyanum appadinrathuthan 
		//-- athoda velaye.
		// first uh i=5 nnu irukku,antha 5 keela j la irukkura j<i la i kitta poyidum. 
		//ippo j loop la maximum print times evlo irukkunna total ah 5 times(0,1,2,3,4)
		//--so 55555 nnu print aagum ippo again i loop kku pogum. inga ippo i oda value 
		// --- 4 aagiduchu. so ippo antha i oda maximum value 4 than.
		// --so ippo keela irukkura j<i la i oda value 4 aagidum. now j loop vanthu i ah print 
		// -- pannum. so j total ah 4 times(0,1,2,3) aagum. so 4444 nnu console la print aagum.
		//--ithe mathiri loop false aagura varaikkum nadakkum.
		
		
		
		for(int i=5;i>=1;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(i);
			}System.out.println();
			
			//mela irukkura explanation ithu varaikkum than.
			
		}System.out.println(                     );
		for(int a=1;a<=5;a++) {
			for(int b=0;b<a;b++) {
				System.out.print(a);
			}System.out.println();
		}
		
		
	}

}
