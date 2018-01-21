package com.test.java;

import java.util.Arrays;

public class Anagram {
	static boolean isAnagram(String a, String b) {
		// Complete the function anagram, marganna
		String a1 = a.trim().toLowerCase();
		String b1 = b.trim().toLowerCase();
		if (a1.length() != b1.length()) {

			return false;
		} else {
			char[] a1Array = a1.toCharArray();
			
			for (char c : a1Array) {
				int index = b1.indexOf(c);
				if (index < 0) {

					return false;
				} else {
					b1 = b1.substring(0, index)+ b1.substring(index+1,b1.length());
					//b1.replace(c, '\r').trim();
					System.out.println(b1);
				}
			}
			return true;
				
		}

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (isAnagram("anagramm", "marganaa"))
			System.out.println("Anagrams");
		else {
			System.out.println("Not Anagrams");
		}
	}

}
