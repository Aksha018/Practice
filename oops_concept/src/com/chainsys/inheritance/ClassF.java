package com.chainsys.inheritance;

public class ClassF extends ClassG {
	String fatherName = "John";
	String motherName = "Lucy";
	   
	   public void display_classF() {
		   System.out.println("Family Members");
		   System.out.println("FatherName :"+fatherName);
	       System.out.println("MotherName :"+motherName);
	   }

}
