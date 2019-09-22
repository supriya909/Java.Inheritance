 package com.h2kinfosysfullstackbasics2;

import com.h2kinfosys.java.inheritance.Parent;

public class OutOfPackageChild extends Parent{
	
	public OutOfPackageChild() {
		super("Sample");
		System.out.println("OutOfPackageChild");
	}
	
	void accessVariables() {
		 System.out.println("protected String");
		 System.out.println("default String");
		 System.out.println("public String");
	 }

}
