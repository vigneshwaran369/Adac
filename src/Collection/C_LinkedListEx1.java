package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class C_LinkedListEx1 {
	
//	 NOTE : When should we go for a Linked list ?
//			1. If we have more number of insertion deletion operation then only go for Linked List	    	
//			2.Its not good for retrieving operation
	
	
	
//	METHODS :
//	        Same methods are used in linked list and we have some more methods too.
//					
	
	
	
	
	
	static void linkedList1() {
		
		LinkedList l = new LinkedList();
		
		l.add(100);
		l.add("vicky");
		l.add(20.98);
		l.add("vicky");
		l.add(100);
		l.add(true);
		l.add(8778364846364L);
		
		System.out.println(l);
		
		System.out.println("          using for loop  : ");
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		
		System.out.println("          Get all values by using iterator ");
		
		Iterator i = l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		
		
		
// Methods which are not available in array list but available in linked list :		

//		1.addFirst();
//		2.addLast();
//		3.getFirst();
//		4.getLast();
//		5.removeFirst();
//		6.removeLast();
//		7.removeFirstOccurance();
//		8.removeLastOccurance();
//			
		
		l.addFirst(222);
		l.addLast("vicvicvicky");
		
		System.out.println("After addfirst and addlast : "+l);
		
		l.removeFirst();
		l.removeLast();
	System.out.println("After removefirst and remove last : "+l);
	
	
		System.out.println("Get the first element   : "+l.getFirst());
	
		System.out.println("Get the last element  : "+l.getLast());
		
		l.removeFirstOccurrence(100);
		System.out.println("After use removefirstoccurance : "+l);
		
		l.removeLastOccurrence("vicky");
		System.out.println("After use removelastoccurance : "+l);
		
	
		
	}
	
	
	public static void main(String[] args) {

		linkedList1();
		
	}

}
