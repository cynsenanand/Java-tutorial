package com.test.java;
class A10{
	static int i =100;
     static {
    	 i = i-- - --i;
    	 System.out.println("First" + i);
     }
     {
    	 i = i++ + ++i;
    	 System.out.println("Second" +i);
     }
}
class B10 extends A10 {
	static {
		i = --i-i--;
		System.out.println("Third" + i);
		
	}
	{
		i = ++i + i ++;
		System.out.println("Fourth" + i);
	}
}
public class MainClass {
	public static void main(String[] args) {
		B10 b = new B10();
		System.out.println(b.i);
	}
	}

