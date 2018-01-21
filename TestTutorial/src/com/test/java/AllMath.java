package com.test.java;
abstract class AllMath implements DoMath {
	public static void main(String [] args) 
    {
        int x=20;
        String sup = (x < 15) ? "small" : (x < 22)? "tiny" : "huge";
        System.out.println(sup);
    }
	}