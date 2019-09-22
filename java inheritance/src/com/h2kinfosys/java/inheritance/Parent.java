package com.h2kinfosys.java.inheritance;

public class Parent {

	
	// base class - super class - parent class
	private String privatestring = "PrivateString";
	public String publicString = "PublicString";
	protected String protectedString = "ProtectedString";
	String defaultString = "DefaultString";
	
	public Parent (String firstName) {
		System.out.println("Parent class constructor :: "+ firstName);
		
	}
	
	public String importantMethod(int variable) {
		System.out.println("Important for Parent :: " + variable);
		return "Parent Important ";
				
		
	}

	public void accessDataPublic() {
		System.out.println("Some Data Access Method from Parent class accessDataPublic");
		
	}
	
	
	
void accessDataDefault() {
	System.out.println("Some Data Access Method from Parent class accessDataDefault");
	
}

protected void accessDataProtected() {
	System.out.println("Some Data Access Method from Parent class accessDataProtected");
	
}


	
	
	
	
	
	
	
	
	
	
	
}

