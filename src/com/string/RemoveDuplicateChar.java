package com.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		String str = "programming";

//		Approach-1: using Java 8
		StringBuilder sb1 = new StringBuilder();
		str.chars().distinct().forEach(c -> sb1.append((char)c));
		System.out.println(sb1);	//progamin
		
		
		
//		Approach-2: using indexOf(..)
		StringBuilder sb2 = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int index = str.indexOf(ch, i+1);
			if (index == -1) {
				sb2.append(ch);
			}
		}
		System.out.print(sb2);	//poraming
		
		
		
//		Approach-3: using character array.
		StringBuilder sb3 = new StringBuilder();
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			boolean repeated = false;
			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[j] == charArray[i]) {
					repeated = true;
				}
			}
			if(!repeated) {
				sb3.append(charArray[i]);
			}
		}
		System.out.println(sb3);	//poraming
		
		
//		Approach-4: using set interface method
		StringBuilder sb4 = new StringBuilder();
		Set<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		for (Character c : set) {
			sb4.append(c);
		}
		System.out.println(sb4);	//progamin
	}
}
