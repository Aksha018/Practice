package com.chainsys.calc;

public class Calc extends AbstractCalc{

		public int add(int n1, int n2) 
		{
		    System.out.println( n1+n2);
		    return n1+n2;
		}
		
		public int sub(int n1,int n2) {
			System.out.println(n1-n2);
			return n1-n2;
		}

		public int multiply(int n1,int n2) {
			System.out.println(n1*n2);
			return n1*n2;
		}
		public int divide(int n1,int n2) {
			System.out.println(n1%n2);
			return n1%n2;
		}

	}

