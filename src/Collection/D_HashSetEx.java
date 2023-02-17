package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class D_HashSetEx {

// HashSET NOTE :
// 		1.Its not a index based.
//		2.Random insertion order.
//		3.we can add the elements  by using only values. 
//		4.we cannot add the values by using index.
//		5.Default capacity -16
// 		6. Fill ratio or Load Factor - 0.75	
// 		7. Insertion or update the elements are not possible in set
//		8. Here we cannot sort or cannot use reverse 
//		9. In Hash set we can mention the capacity and load factor.
	
	
	
	
	
	
// what are the possible types we can use the Hash set?
	

//	HashSet h = new HashSet();
//	
//	HashSet<Integer> h1 = new HashSet<Integer>();
//	
//	HashSet h2 = new HashSet(100);    mentioning the capacity.
//	
//	HashSet h3 = new HashSet(100,(float)0.85); mentioning the capacity and load factor.
//	
//	HashSet<Object> h4 = new HashSet<Object>(100);
//	
//	HashSet<Object> h5 = new HashSet<Object>(150,(float)0.95);
	
	
	
	
//	Methods :
	
//		1.Same as list but here we cannot do some methods 
//	

	
	
	
	
	
	
	
	static void hashSet1() {
		
		
		HashSet c = new HashSet();
		c.add('d');
		c.add("vicky");
		c.add('c');
		c.add(369);
		c.add('c');
		c.add(true);
		c.add('b');
		
		System.out.println(c); // Output is [a, b, c, d, f, g] --- won't allow the duplicate value
		
		
		System.out.println("Size of the set : "+c.size());
		
			
		System.out.println("Remove a particular value : "+c.remove(369));
		System.out.println("After removing a particular value : "+c);
		
		System.out.println("To check whether the value is there or not : "+c.contains(true));
		
		System.out.println("To check whether the set is empty or not : "+c.isEmpty());
		
		System.out.println("   GET THE ALL VALUES BY USING FOR EACH LOOP");
		
		for(Object i :c) {
			System.out.println(i);
		}
		
		System.out.println("   GET THE ALL VALUES BY USING ITERATOR");
		Iterator iterator = c.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		HashSet c1 = new HashSet();
		
		c1.add('a');
		c1.add("vicky");
		c1.add('b');
		c1.add(100);
		c1.add('c');
		
		System.out.println("values in c1 : "+c1);
		System.out.println("values in c : "+c);
		
		c1.retainAll(c);
		System.out.println("common elements between c and c1 : "+c1);
		
		System.out.println("The elements in c1 which are all contains in c or not : "+c1.containsAll(c));
		
		c1.addAll(c);
		System.out.println("After using addall : "+c1);
		
		
		
		c1.removeAll(c);
		System.out.println("After use removeall(After removed common values in c1) : "+c1); // the common values of c and c1 will be removed in c1
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		hashSet1();
		
		
	}

}
