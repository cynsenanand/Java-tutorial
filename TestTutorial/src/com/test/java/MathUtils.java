package com.test.java;

public class MathUtils {
    public static double average(int a, int b) {
    	double ave = (double)(a+b)/2;
        return ave;
    }

    public static void main(String[] args) {
        System.out.println(average(2,1));
    }
}