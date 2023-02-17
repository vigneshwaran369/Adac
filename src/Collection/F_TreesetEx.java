package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class F_TreesetEx {

//	TreeSet NOTE :
//			1. 	Insertion order will be natural ascending order
//	
//	Methods :
//			methods are same as Hash set and Linked Hash set but some more methods are available in tree set
//	
//	
//	
	
	
	static void treeSet1() {
		
		TreeSet t = new TreeSet();
		
		t.add(40);
		t.add(20);
		t.add(30);
		t.add(70);
		t.add(10);
		t.add(30);
		t.add(80);
		t.add(50);
		t.add(60);
		
		System.out.println("Elements are sorted in ascending order : "+t);
		System.out.println("Size of the set : "+t.size());
		
		
		System.out.println("Get the first element : "+t.first());
		System.out.println("Get the last elemet : "+t.last());
		
		
		System.out.println("Print values lessar than 30 "+t.headSet(30));
	
		System.out.println("Print value 30 and more than 30 : "+t.tailSet(30));
		
		System.out.println("Print in between values(include begin value only) : "+t.subSet(20, 40));
		
		System.out.println("comparator returns null value if the sorting is default natural order : "+t.comparator());
		 
		System.out.println("Print value which is very next higher than 20 : "+t.higher(20));
		
		System.out.println("Print value which is very next lower than 60 : "+t.lower(60));
		
		System.out.println("when we use poll it will remove that value");
		System.out.println("Get the first value by using pollfirst : "+t.pollFirst()); 
		System.out.println("Get the last value by using polllast : "+t.pollLast());
		
		System.out.println("Atfer polling  : "+t);
		
		System.out.println("Descending order the set : "+t.descendingSet());
		
		
		
		Iterator iterator = t.iterator();		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		Iterator descendingIterator = t.descendingIterator();
		System.out.println("iterate reverse order");
		while(descendingIterator.hasNext()) {
		
			System.out.println(descendingIterator.next());
		}
		
	}
	
	public static void main(String[] args) {

		treeSet1();
		
	}

}
