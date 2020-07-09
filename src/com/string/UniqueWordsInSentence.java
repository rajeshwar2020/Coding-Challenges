package com.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueWordsInSentence {

	public static void main(String[] args) {

		String sentence = "This sentences contains words in words format";
		eliminateDuplicates(sentence);
	}

	public static void eliminateDuplicates(String str) {

		Set<String> set = new LinkedHashSet<String>();

		String[] splitted = str.split(" ");

		for (int i = 0; i < splitted.length; i++) {
			set.add(splitted[i]);
		}
		
		set.forEach(x -> System.out.println(x));
	}
}
