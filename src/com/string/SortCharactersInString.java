package com.string;

import java.util.Arrays;

public class SortCharactersInString {
	public static void main(String[] args) {

//		Approach-1: without using the sort method.
		String str = "rajesh";
		char[] charArray = str.toCharArray();
		
		char temp;
		for (int i = 0; i < charArray.length; i++) {
			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] > charArray[j]) {
					temp = charArray[i];
					charArray[i] = charArray[j];
					charArray[j] = temp;
					}
			}
		}
		System.out.println(new String(charArray));	//aehjrs
		
//		Approach-2: using the sort method.
		String str2 = "program";
		char[] chArr = str2.toCharArray();
		Arrays.sort(chArr);
		System.out.println(new String(chArr));	//agmoprr
	}
}






