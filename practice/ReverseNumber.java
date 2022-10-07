package com.chainsys.practice;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String args[])
	   {
	      long number=0;
	      long reverse =0;
	      
	      System.out.println("Enter your Number: ");
	      Scanner sc = new Scanner(System.in);
	      number = sc.nextInt();
	      
	      while( number != 0 )
	      {
	    	  reverse = reverse * 10;
	    	  reverse = reverse + number%10;
	          number = number/10;
	      }

	      System.out.println("Reverse of given number is: "+reverse);
	   }

}