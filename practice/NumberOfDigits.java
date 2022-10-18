package com.chainsys.practice;

import java.util.Scanner;

/* Print the number of digits this number contains */
public class NumberOfDigits {
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int a = sc.nextInt();
	   int result= 1;
	   int n = a/10;
	   while(n != 0) {
		   n = n/10;
		   result++;
	   }
	   System.out.println(result);
	   sc.close();
	}

}
