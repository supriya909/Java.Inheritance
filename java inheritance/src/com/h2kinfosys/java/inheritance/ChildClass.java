package com.h2kinfosys.java.inheritance;

public class ChildClass extends Parent{
	
	private String firstName = null;
	public ChildClass() {
		super("Sample");
		System.out.println("Child Class Constuctor");
		
	}

	public ChildClass(String firstName) {
		this();
		System.out.println("Child Class Constructor with Arguments");
		
	}
	// Removing visibility from Parent - overriding
	/* 
	 * Rules of Overriding - Java - @Override
	 * 1.
	 * Methods name exactly same
	 * 2. Return type - co- variant(inherited parent child classses)
	 * 3.Access Modifiers- cannot reduce but increase  the visibility of the inherited method from parent
	 * Parameters - should exactly match
	 * 5. Exception - Covariant (but will see later)
	 */
	@Override
	public String importantMethod(int variable) {
		System.out.println("Important for Child :: " + variable);
		return "Child Important ";
	}
				
	 void accessVariables() {
		 System.out.println("protected String");
		 System.out.println("default String");
		 System.out.println("public String");
	 }
}
