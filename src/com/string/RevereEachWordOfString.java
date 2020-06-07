//Reverse each word of a string.
//input: java code
//output: avaj edoc

package com.string;

public class RevereEachWordOfString {

	public static void main(String[] args) {

		String input = "java code";
		
		String[] words = input.split(" ");
		
		for (String str : words) {
			char[] charArray = str.toCharArray();
			for (int i = charArray.length - 1 ; i >= 0 ; i--) {
				System.out.print(charArray[i]);
			}
			System.out.print(" ");
		}
	}

}

//avaj edoc 


