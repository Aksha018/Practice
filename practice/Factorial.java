package com.chainsys.practice;

public class Factorial{    
    public static void main(String args[]) {    
        int i;
        int fact=1;    
  
        int num = 10;  
        for(i=1;i<=num;i++) {      
        	fact = fact*i;      
        }  
        System.out.println("Factorial of "+num+" is: "+fact);         
    }    
}  