package Collection;

import java.util.LinkedHashSet;

public class E_LinkedHashSetEx1 {

//	LinkedHashSet NOTE:
//	    	1.The only difference between hash set and linked hash set is insertion order  
//			2.In hash set insertion order is not maintained(Random insertion order).
//			3.In linked hash set insertion order is maintained.
//	
	
	static void linkedlist1() {
		LinkedHashSet l = new LinkedHashSet();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(50);
		l.add(60);
		
		System.out.println(l);
		
//    REMAINING SAME AS HASHSET
		
	}
	
	
	
	public static void main(String[] args) {
		
		linkedlist1();

	}

}
