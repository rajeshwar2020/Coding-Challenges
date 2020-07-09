package com.string;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {

		String str = "ja#va i@s a@ Pr*^ogra$mmi!ng L@angu^&*age#$%";
		
		String result = str.replaceAll("[^a-zA-Z0-9\\s]", "");
		System.out.println(result);
	}

}