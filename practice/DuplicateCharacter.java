package com.chainsys.practice;

public class DuplicateCharacter {
	public static void main(String[] args) {

		String string1 = "Duplicate Characters Of a String";
		int count;

		char string[] = string1.toCharArray();
		System.out.println("Duplicate characters is : ");

		for (int i = 0; i < string.length; i++) {
			count = 1;
			for (int j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ') {
					count++;
					string[j] = '0';
				}
			}
			if (count > 1 && string[i] != '0')
				System.out.println(string[i]);
		}
	}
}