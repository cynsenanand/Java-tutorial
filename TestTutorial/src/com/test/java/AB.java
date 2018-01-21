package com.test.java;
public class AB {
	static int s;
    public static void main(String [] args) 
    {
        AB p = new AB();
        p.start();
        System.out.println(s);
    }

    void start() 
    {
        int x = 7;
        twice(x);
        System.out.print(x + " ");
    }

    void twice(int x) 
    {
        x = x*2;
        s = x;
    }
}
