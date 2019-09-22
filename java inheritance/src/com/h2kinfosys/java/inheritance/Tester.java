package com.h2kinfosys.java.inheritance;

/* 
 * 1. creating parent child relation
 * 2. constructor calling - super
 * 3. protected variables
 */

public class Tester {

	public static void main(String[] args) {
		//Parent parent = new Parent();
		
		
		
		ChildClass child = new ChildClass("This is another constructor");
		child.accessDataPublic();
		child.accessDataProtected();
		child.accessDataDefault();
		child.accessVariables();
		child.importantMethod(100); // you will call child class method
		
		
		// you can create - child class instance with parent class Reference
		// ReferenceType objectName = new Instance()
		Parent testChild = new ChildClass();
		// visibility is dependent on Reference type
		testChild.importantMethod(100);
		//Functionality will be called from InstanceType

}
	
}

