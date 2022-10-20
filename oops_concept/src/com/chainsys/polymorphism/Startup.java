package com.chainsys.polymorphism;

public class Startup {
  public static void main(String[] args) {
	  
	  Vehicle obj;
	  
	  obj = new Bike();
	  obj.run();
	  
	  obj = new Car();
	  obj.run();
	  
	  obj = new Cycle();
	  obj.run();
	  
  }
}
