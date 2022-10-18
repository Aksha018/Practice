package com.chainsys.practice;

import java.util.Scanner;

/* Take two numbers from the user and print the result of multiplication and sum of all the numbers
between these two numbers. Eg: if user presses 3 and 8 then 4+5+6+7 is 840 
 */

public class SumAndMultiplication {
   public static void main(String[] args) {
	  
	   Scanner sc = new Scanner(System.in);
	   int a = sc.nextInt();
	   int b = sc.nextInt();
	   int sum = 0;
	   int multiplication = 1;
	   
	   if(a < b) {
		   for(int i = a+1; i<b; i++) {
			   sum = sum + i;
			   multiplication = multiplication * i;
		   }
		  System.out.println("Sum: "+sum);
		  System.out.println("Multiplication: "+multiplication);
	   }
	   sc.close();
    }
}
