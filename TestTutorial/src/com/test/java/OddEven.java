package com.test.java;

import java.util.*;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		//String s = scan.nextLine();
		if (n %2 == 0) {
			if (n >= 2 && n <= 5) {
				System.out.println("Not Weird");				
			} else if (n > 5 && n <=20) {
				System.out.println("Weird");
				
			}
		}
		System.out.println("Weird");
		scan.close();
	}

}
