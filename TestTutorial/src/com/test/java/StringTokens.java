package com.test.java;

import java.util.Arrays;
import java.util.Scanner;

public class StringTokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		// Write your code here.
		int l = s.trim().length();
		if (l > 0) {
			String s1[] = s.trim().split("[^A-Za-z]+");
			System.out.println(s1.length);
			for (int i = 0; i < s1.length; i++) {
				System.out.println(s1[i]);
			}
		}else {
			System.out.println(l);
		}

		scan.close();
	}

}
