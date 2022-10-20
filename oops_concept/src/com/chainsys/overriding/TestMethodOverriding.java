package com.chainsys.overriding;

public class TestMethodOverriding {
	 public static void main(String[] args) {
		 
//		 ClassB obj = new ClassB();    //Overriding
		   ClassB obj = new ClassA();  //Upcasting
		   obj.Employee();
	   }
}
