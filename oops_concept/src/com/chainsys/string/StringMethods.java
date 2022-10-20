package com.chainsys.string;

public class StringMethods {
	public static void main(String[] args) {
	
	/*charAt() Method*/	
		String var = "String Methods";
		System.out.println("Result :"+var.charAt(8));
		
	/*trim() Method*/	
		String var1 = "String Methods           ";
		System.out.println("Result :"+var1.trim());
		
	/*length() Method*/
		String var3 = "String Methods";
		System.out.println("Result :"+var3.length());
		
	/*subString() Method*/
		String var4 = "String Methods";
		System.out.println("Result :"+var4.substring(2,6));
		
	/*equals() Method*/	
		String str = "String Methods";
		String str1 = "String Methods Example";
		System.out.println("Result :"+str.equals(str1));
		
	/*toUpperCase() Method*/
		String str2 = "String Methods";
		System.out.println("Result :"+str2.toUpperCase());
		
   /*toLowerCase() Method*/
		String str3 = "STRING Methods";
		System.out.println("Result :"+str3.toLowerCase());
		
   /*concat() method*/
		String str4 = "String Methods";
		System.out.println("Result :"+str4.concat(str4));
	
  /*toCharArray() Method*/
	String str5 ="String Methods";
	char ch[]= str5.toCharArray();
	System.out.println("Result :");
	for(int i=0;i<str5.length();i++) {
		System.out.println("Character :"+ch[i]);
	}
	}
}
