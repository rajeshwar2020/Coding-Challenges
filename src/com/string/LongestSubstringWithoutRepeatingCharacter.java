//Find the Longest substring without repeating character
package com.string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacter {

	public static void main(String[] args) {
		
		String input = "java";
		
		Map<Character, Integer> visited = new HashMap<>();
	    String output = "";
	    for (int start = 0, end = 0; end < input.length(); end++) {
	        char currChar = input.charAt(end);
	        if (visited.containsKey(currChar)) {
	            start = Math.max(visited.get(currChar)+1, start);
	        }
	        if (output.length() < end - start + 1) {
	            output = input.substring(start, end + 1);
	        }
	        visited.put(currChar, end);
	    }
	    
	    System.out.println("Longest Substring without repeating character => "+output);
	    System.out.println("Length => "+output.length());
	}
	
}

//Longest Substring without repeating character => jav
//Length => 3




