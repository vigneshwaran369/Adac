package com.forLoop;

public class StringMemory {

	public static void main(String[] args) {
System.out.println("---------------IMMUTABLE-----------------");
		String s = "vicky";
		String s1 = "vicky";
		String e=s+s1;
		System.out.println(System.identityHashCode(e));
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		String v=s.concat(s1);
		System.out.println(System.identityHashCode(v));

		System.out.println("------------------MUTABLE----------------");
		
		
		StringBuffer r = new StringBuffer("vickyvic");
		StringBuffer r1 = new StringBuffer("vickyvic");

		System.out.println(System.identityHashCode(r));
		System.out.println(System.identityHashCode(r1));
	
		System.out.println(r.append(r1));
		//vickyvicvickyvic already append aagiduchu, ippo r la antha append aanatha store pannirukkom.
		//ippo antha r print panrom. output= vickyvicvickyvicvickyvic nnu print aagum.already append aanathu print 
		//-- print aagiduchu and again last ah kudutha r sernthu print aagirukku.
	 r = r.append(r1);
	 System.out.println(r);
	
		
	
		
		
		
		
		
		

		
		
		
		
		
	}

}
