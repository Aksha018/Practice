package com.chainsys.practice;

import java.util.Scanner;

/*Write a program that inputs 10 different integers within a while loop and 
 display the largest and smallest*/

public class LargestSmallest {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int i=2;
		int small = 0;
		int large = 0;
		
		System.out.print("Num 1: ");
		int a = sc.nextInt();
		small = a;
		large = a;
		
		while(i<=10) {
			System.out.println("Num "+i+": ");
			int b = sc.nextInt();
			if(b<small) {
				small = b;
			}
			if(b>large) {
				large = b;
			}
			i++;
		}
		System.out.print("Largest Number: "+large+" Smallest Number: "+small);
		sc.close();
	}

}
