package com.test.java;

public class Palindrome {
	
	public static boolean isPalindrome(String word) {
		int word_length = word.length();
		word = word.toLowerCase();
		for (int i = 0; i < word_length / 2; i ++) {
			if (word.charAt(i) != word.charAt(word_length - 1 - i))
				return false;
			return true;

		}
		throw new UnsupportedOperationException("Waiting to be implemented.");

	}

	public static void main(String[] args) {
		System.out.println(Palindrome.isPalindrome("Deleveled"));
	}
}