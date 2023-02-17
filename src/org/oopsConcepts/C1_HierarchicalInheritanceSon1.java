package org.oopsConcepts;

public class C1_HierarchicalInheritanceSon1 extends C_HierarchicalInheritanceFather {

	
	public static void main(String[] args) {

		// we can use like this
	//C1_HierarchicalInheritanceSon1 property = new C1_HierarchicalInheritanceSon1();
	
	C_HierarchicalInheritanceFather property = new C1_HierarchicalInheritanceSon1();
		property.fatherHouse();
		property.fatherLand();
		property.fathersMoney();
		
	}

}
