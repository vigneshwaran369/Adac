package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class B_ArrayListEx1 {
	
//         NOTE : When should we go for  array list ?
			
//			1. when we have a more retrieving operation then only you go for a array list 
//			2. Array list not suited for insertion and deletion operation.

	static void array1() {
		
		ArrayList a = new ArrayList();
		
		a.add(100);
		a.add("vicky");
		a.add(20.98);
		a.add("vicky");
		a.add(true);
		a.add(8778364846364L);
		
		System.out.println(a);
		
		System.out.println("Size of the arraylist is : "+a.size());
		
		System.out.println("Remove the particular object by using index : "+a.remove(5));
		System.out.println("After remove the particular index value : "+a);
		
		System.out.println("Remove the particular object by using value : "+a.remove("vicky"));
		System.out.println("After remove the particular value : "+a);
		
		
		System.out.println("Add a new value : "+a.add("vigneshwaran"));
		System.out.println("After add the new value : "+a);
		
		a.add(2,369);		
		System.out.println("After add the new value : "+a);
		
		System.out.println("Get the values from arraylist : "+a.get(4));
		
		System.out.println("Get the index of particular value "+a.indexOf(369));
		System.out.println("Get the index of particular value(If the value is not available in the"
				+ " list,then the index value will be) :"+a.indexOf("vignesh"));     //-1
		
		System.out.println("Get the last dublicate value  : " +a.lastIndexOf("vicky"));
		
		a.set(2,'s');
		System.out.println("After Replace the value  : "+a);
		
		System.out.println("To check whether the value is available or not : "+a.contains(369));
		
		System.out.println("To check whether the list is empty or not : "+a.isEmpty());
		
		
		System.out.println("****Get the all values by using normal for loop****");
		for(int i =0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println("**** Get the all value by using for each loop****");
		for(Object a1:a) {
			System.out.println(a1);
		}
		
		System.out.println("****Get the value by using iterator method****");
		Iterator a1 = a.iterator();
		while(a1.hasNext()) {
			System.out.println(a1.next());
		}
		
		System.out.println("CONVERT COLLECTION INTO ARRAY");
		Object[] arr =a.toArray();
		for(Object i : arr) {
			System.out.println(i);
		}
			
		ArrayList aa = new ArrayList();
		
		aa.add("svsv");
		System.out.println(aa);
		
		aa.addAll(a);
		System.out.println("After add all values : "+aa);
		
		aa.removeAll(a);
		System.out.println("After removing a values : "+aa);
		
		ArrayList<Character> b = new ArrayList<Character>();
		b.add('e');
		b.add('a');
		b.add('y');
		b.add('c');
		b.add('b');
		b.add('t');
		
		System.out.println(b);
		Collections.sort(b);
		System.out.println("After sorting the values : "+b);
		
		
		Collections.sort(b,Collections.reverseOrder());
		System.out.println("After reversing : "+b);
		
		Collections.shuffle(b);
		System.out.println("After shuffeling : "+b);
		
		
		
		
	}
	
	static void converArrayIntoArrayList() {
		
		System.out.println("+++ CONVERTING ARRAY INTO ARRAYLIST +++");
		
		String s[] = {"vicky","vignesh","vignehwaran","vic"};
		
		ArrayList c = new ArrayList(Arrays.asList(s));
		System.out.println(c);
		
		
		
		
	}
	
	static void array2() {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(50);
		a.add(40);
		a.add(30);
		
		System.out.println(a);
		
		System.out.println("Size of the array list : "+a.size());
		
		a.add(60);
		System.err.println("After add one value in list : "+a);
		
		System.out.println("Get one value in list : "+a.get(4));
		
		
		a.remove(3);
		System.out.println("After removing one value in list by using index : "+a);
		
		System.out.println("Get the index : "+a.indexOf(60));
		
		System.out.println("Get the last index of duplicate value : "+a.lastIndexOf(30));
		
		
		System.out.println("To check whether the particular value is available or "
				+ "not : " +a.contains(50));
		
		a.set(3, 70);
		System.out.println("After change the 3rd index value : "+a);
		
		System.out.println(" CONVERT COLLECTION INTO ARRAY");
		Object[] array = a.toArray();
		
			for(Object i :array) {
				System.out.println("Get the value by using normal for loop : "+i);
			}
			
			for(int i=0;i<array.length;i++) {
				System.out.println("Get the values by using for each loop  : "+array[i]);
			}
	
	}
	
	

	static void usingAddAllToCheckWhetherItsAllowDuplicateOrNot() {
		
//		In set we cannot add duplicate values \. when we use add all method it wont allow the the values which are already in added list
		ArrayList b = new ArrayList();
		b.add('e');
		b.add('a');
		b.add('y');
		b.add('c');
		b.add('b');
		b.add('t');
		
		System.out.println(b);
		
		ArrayList c = new ArrayList();
		c.add('d');
		c.add('a');
		c.add('c');
		c.add('f');
		c.add('c');
		c.add('g');
		c.add('b');
		
		System.out.println(c);
		
		c.addAll(b);
		System.out.println(c);
		
//		c.retainAll(b);
//		System.out.println(c);
		
	}
		
	
	public static void main(String[] args) {
//		array1();
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		converArrayIntoArrayList();
		System.out.println("******************************");
		array2();
		usingAddAllToCheckWhetherItsAllowDuplicateOrNot();

	}

}
