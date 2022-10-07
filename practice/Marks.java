package com.chainsys.practice;

/*Calculate Total,CGPA ,Average,Percentage mark of 5 subject*/

public class Marks {
	public static void main(String[] args) {
	
		int sub1 = 80;
		int sub2 = 74;
		int sub3 = 69;
		int sub4 = 96;
		int sub5 = 47;
		
		int total = sub1+sub2+sub3+sub4+sub5;
		System.out.println("Total is :" + total);
		
		float average = (float) (total / 5.0);
		System.out.println("Average marks is : "+average);
		
		float cgpa = (sub1+sub2+sub3+sub4+sub5)/50;
		System.out.println("CGPA is :"+ cgpa);
	
		float percentage = (float) ((total / 500.0) * 100);
        System.out.println("Percentage is : "+percentage);

	
	}
	
	
}
