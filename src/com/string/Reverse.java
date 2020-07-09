//How to reverse the given string?

package com.string;

public class Reverse {

	public static void main(String[] args) {
		
		String str = "hello";
		
//		Approach -1: using toCharArray() method
		char[] charArray = str.toCharArray();
		for(int i=charArray.length-1; i>=0; i--) {
			System.out.print(charArray[i]);
		}
		
//		Approach-2: using charAt(int index) method
		for(int i = str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		
//		Approach-3: using reverse() method from StringBuffer
		StringBuffer buff = new StringBuffer(str);
		System.out.println(buff.reverse());
		
//		Approach-4: using reverse() method from StringBuilder
		StringBuilder builder = new StringBuilder(str);
		System.out.println(builder.reverse());

	}
}
