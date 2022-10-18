package com.chainsys.practice;

import java.util.Scanner;

/*Kilometers to miles conversion*/

public class MilesConversion {
	
	public static void main(String[] args){

	System.out.println("Enter The Kilometers ");
	Scanner sc = new Scanner(System.in);
	float km = sc.nextFloat();
	float miles = (float) (km/1.609);
	System.out.println("The Kilometers in Miles is : " + miles + " Miles");
	sc.close();
	}
}
