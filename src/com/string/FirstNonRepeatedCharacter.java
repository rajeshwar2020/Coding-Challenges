//Find the first non repeated character.
package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		
		String input = "AABCDBEFC";
		
		//Approach-1: without using collections
		for (int i=0; i<input.length(); i++) {
			boolean unique = true;
			
			for (int j=0; j<input.length(); j++) {
				
				if(i!=j && input.charAt(i) == input.charAt(j)) {
					unique = false;
					break;
				}
			}
			
			if (unique) {
				System.out.println("First Non-repeated character is: "+input.charAt(i));
				break;
			}
		}
		
		//Approach-2: Using collections.
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		//loop for adding characters to map
		for (int i=0; i < input.length(); i++) {
			
			char ch = input.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			} else {
				map.put(input.charAt(i), 1);
			}
		}
		
		//loop for getting the first character from the map, with the value = 1.
		for(Entry<Character,Integer> entrySet : map.entrySet()) {
			if (entrySet.getValue() == 1) {
				System.out.println("First Non-repeated Character = "+entrySet.getKey());
				break;
			}
		}
	}
}

//First Non-repeated character is: D




















