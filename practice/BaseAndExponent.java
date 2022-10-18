package com.chainsys.practice;

import java.util.Scanner;

/* Write a program that asks the base and exponent(power)from the user and print the result
using do While loop Eg: If base 2 and Exponent is 3,so 2*2*2 is 8 
*/
public class BaseAndExponent {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Base: ");
		int b = sc.nextInt();
		System.out.print("Exponent: ");
		int e = sc.nextInt();
		int result = 1;
	    int i = 1;			
		do {
			result = result * b;
			i++;
		}while(i <= e);
		System.out.println(result);
		sc.close();
	}
}
