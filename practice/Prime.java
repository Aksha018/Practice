package com.chainsys.practice;

import java.util.Scanner;

/* Take an integer input from the user,print YES if it is prime number and 
 * NO if it is not a prime number    */
public class Prime {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		boolean isPrime = true;
		for(int i=2; i < a/2; i++) {
			if(a % i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("YES, It is Prime Number");		
		}else {
			System.out.println("NO, Its not a Prime Number");
		}
		sc.close();
	}

}
