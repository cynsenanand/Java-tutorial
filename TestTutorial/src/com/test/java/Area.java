package com.test.java;

import java.util.*;

public class Area {
	static {
		Scanner scan = new Scanner(System.in);
		int b = scan.nextInt();
		int h = scan.nextInt();

		int a = 0;

		if (b > 0 && h > 0) {
			a = b * h;
			System.out.println(a);
		} else {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
		scan.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int rightNow = Calendar.get(Calendar.DAY_OF_WEEK);
		//String day = String.valueOf(rightNow);
		// System.out.println(day);

	}

}
