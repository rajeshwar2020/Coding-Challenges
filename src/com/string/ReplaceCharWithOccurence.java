package com.string;

public class ReplaceCharWithOccurence {

	public static void main(String[] args) {
	
		String str = "opentext";
		char replaceChar = 't';
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == replaceChar) {
				str = str.replaceFirst(String.valueOf(replaceChar), String.valueOf(count));
				count++;
			}
		}
		System.out.println(str);
		
	}
}
