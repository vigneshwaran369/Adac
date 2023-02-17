package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class A_Informations {

	public static void main(String[] args) {
		

//	
//	  LIST:
//		  It allows duplicate values.
//		  It prints an insertion order. 
//		  It is index  based.
//	  
//	  SET:
//		  	It dosn't allow duplicate values.
//			It is value based.
//		  	Insertion order.
//				for hash set ---> Random insertion order
//				for Linked hash set ---> insertion order will be maintain
//				for Tree set ---> insertion order will be ascending order
//		  
//	  
//	  MAP: 
//		  	It is a key-value based. 
//		  	Duplicate keys are not allowed but duplicate values are allowed. 
//		  
//			Insertion order.
//	 			for hash set ---> Random insertion order
//				for Linked hash set ---> insertion order will be maintain
//				for Tree set ---> insertion order will be ascending order
	}
	
	
	public static void multipleTypesUseAll() {
		
		// ================================LIST=================================
		
		Iterable<Object> a = new ArrayList<Object>();
		Iterable<Object> b = new LinkedList<Object>();
		
		Iterable<String> c = new ArrayList<String>();
		Iterable<String> d = new LinkedList<String>();
		
		Iterable<Integer> e = new ArrayList<Integer>();
		Iterable<Integer> f = new ArrayList<Integer>();
		
		ArrayList a3 = new ArrayList();
		List a4 = new ArrayList();
		Iterable o = new LinkedList<Object>();
		Iterable o1 = new LinkedList();
		

		
		
		List<Object> g = new ArrayList<Object>();
		List<Object> h = new LinkedList<Object>();
		
		List<String> i = new ArrayList<String>();
		List<String> j = new LinkedList<String>();
		
		List<Integer> k = new LinkedList<Integer>();
		List<Integer> l = new LinkedList<Integer>();
		
		ArrayList<Object> m = new ArrayList<Object>();
		ArrayList<String> n = new ArrayList<String>();
		
		//same as linked list
		
		//===============================SET============================
		
		Iterable<Object> a1 = new HashSet<Object>();
		Iterable<Integer> b1 = new LinkedHashSet<Integer>();
		Iterable<String> c1 = new TreeSet<String>();
		//same as for all wrapper classes
		
		HashSet<Object> a2 = new HashSet<Object>();
		LinkedHashSet<Integer> b2 = new LinkedHashSet<Integer>();
		TreeSet<String> c2 = new TreeSet<String>();


	
		
	}
   
	
}
	

