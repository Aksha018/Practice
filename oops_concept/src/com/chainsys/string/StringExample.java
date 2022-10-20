package com.chainsys.string;

public class StringExample {
	public static void main(String[] args) {
		
		String var = "Hello Guys";
		String var1 = "Hello Guys";
		System.out.println("Result of String :"+var);
		System.out.println("Result of String :"+var1);
		
		String var2 = new String("Good Day");
		System.out.println("Result of String :"+var2);
		
		char ch[] = {'h','e','l','l','o'};
		 String var3 = new String(ch);
		 System.out.println("Result of String :"+var3);
		
	/* String are immutable*/	
		 
		 String str = "String Example";
		 str.toUpperCase();
		 System.out.println("Output :"+str);
		 
		 String str1 = "String in Java";
		 str1.toLowerCase();
		 System.out.println("Output :"+str1);
		 
		 String str2 = "Strings";
		 str2.concat("Example");
//		 str2=str2.concat(" is immutable so assign it explicitly");  
		 System.out.println("Output :"+str2);
		 
	}

}
