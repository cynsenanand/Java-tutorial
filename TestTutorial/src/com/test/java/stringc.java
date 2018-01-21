package com.test.java;

import java.util.*;

public class stringc {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        if(A.charAt(0)> B.charAt(0))
System.out.println("Yes");  
        else System.out.println("No");
        String C = A.toUpperCase();
        String D = B.toUpperCase();
        System.out.println(C.charAt(0)+ A.substring(1,A.length())+ " " + D.charAt(0) + B.substring(1,B.length()));
    String S = "HelloJava";
    String min = " ";
    sc.close();
    }
}