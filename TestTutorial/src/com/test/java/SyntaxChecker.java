package com.test.java;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SyntaxChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 0; i < n; i++) {
			String pattern = scan.nextLine();
			try {
				Pattern p = Pattern.compile(pattern);
				System.out.println("Valid");
			} catch(Exception e) {
				System.out.println("Invalid");
			}
		}
		scan.close();
	}

}
