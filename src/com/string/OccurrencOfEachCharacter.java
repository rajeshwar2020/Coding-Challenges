//Find occurrence of each character.
package com.string;

import java.util.HashMap;
import java.util.Map;

public class OccurrencOfEachCharacter {
	
	public static void main(String[] args) {
		
		String input = "hello";
		
		Map<Character, Integer> map = new HashMap<>();
		
		for (int i=0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			} else {
				map.put(ch, 1);
			}
			
		}
		
		System.out.println(map);
	}
}

//{e=1, h=1, l=2, o=1}




