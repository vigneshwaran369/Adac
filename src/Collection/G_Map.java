package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class G_Map {

	public static void main(String[] args) {

		
		HashMap<Integer,String> a = new HashMap<Integer,String>();
		
		a.put(10, "madurai");
		a.put(20, "trichy");
		a.put(40, "tanjore");
		a.put(35, "vnagar");
		a.put(100, "chennai");	
		a.put(20, "trichy");		// Duplicate values are allowed. 
		
		System.out.println(a);
		
		System.out.println("size of the map : "+a.size());
		
		System.out.println("get the particular value  : "+a.get(40));
		
		System.out.println("remove particular value : "+a.remove(35));
		System.out.println("After the remove the value : "+a);
		
		System.out.println("is particular key is  available or not : "+a.containsKey(20));
		
		System.out.println("is particular value is available or not : "+a.containsValue("madurai"));
		
		System.out.println("is map empty : "+a.isEmpty());
		
		
		Collection<String> values = a.values();   // we can use Object as return type too
		
		System.out.println("get all the values : "+values);
		
		
		System.out.println("iterate the values by using for each loop");
		for(Object i:a.values()) {
			System.out.println(i);
		}
		
		
		Set<Integer> keySet = a.keySet(); // we can use Object as return type too
		
		System.out.println("get all the keys : "+keySet);
		
		
		System.out.println("iterate the keys by using for each loop");
		for(Integer i : keySet) {
			System.out.println(i);
		}
		
		Set<Entry<Integer,String>> entrySet = a.entrySet();
		
		System.out.println("get the key-value pair :"+entrySet);
		
		
		System.out.println("iterate the key-value pair by using for each loop");
		for(Map.Entry<Integer, String> i :entrySet) {
			System.out.println(i);
			
		}
		
		for(Map.Entry<Integer, String> entry :a.entrySet()) {
			
			System.out.println(entry.getKey()+"        "+entry.getValue());
		}
		
		
		
		Set<Entry<Integer,String>> entrySet2 = a.entrySet();
		
		Iterator<Entry<Integer, String>> iterator = entrySet2.iterator();
		
		while(iterator.hasNext()) {		
			Entry<Integer,String> next = iterator.next();
			
			System.out.println(next.getKey()+"     "+next.getValue());
		}
		
		
		
		a.clear();
		System.out.println("After clear : "+a);
		
		
	}

}
