package com.chainsys.inheritance;

public class StartUp {
	public static void main(String[] args) {
		
		ClassF obj = new ClassF();
		obj.display_classG();
//		obj.display_classF();
		
		ClassS obj1 = new ClassS();
		obj1.display_classF();
		obj1.display_classS();
	}

}
