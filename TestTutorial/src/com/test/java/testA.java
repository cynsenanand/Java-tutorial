package com.test.java;
public class testA {
	public static void main(String args[]) 
    { 
        int i = 1, j = 0; 
        switch(i) 
        { 
            case 2: j += 6; 
            case 4: j += 1; 
            default: j += 2; 
            case 0: j += 4; 
        } 
        System.out.println("j = " + j); 
        int x = 0;  
        assert (x > 0) : "assertion failed" ; 
        System.out.println("finished");  
    } 
}