package com.chainsys.practice;

import java.util.Scanner;

/*To check a number is integer or not */

public class IntegerOrNot {
	public static void main(String[] args){
	
		System.out.println("Enter your number");
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.hasNextInt());
		
	}
}
