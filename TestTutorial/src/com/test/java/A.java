package com.test.java;
public class A
{ 
    A() /* Line 3 */
    {
    	this(0);
    	System.out.println("Class A"); 
    	
    } 
    A(int x){
    	this(0,0);
    	System.out.println("one integer");
    }
    A(int x , int y){
    	System.out.println("two integers");
    }
    public static void main(String[] args) 
    { 
        A obj = new A(); 
        String s= "ONE"+1+2+"TWO"+"THREE" + 3+4+"FOUR"+"FIVE"+5;
        int i = 10 + + 11 - - 12 + + 13 - - 14 + + 15;
        System.out.println(i);
    } 
     
     
    
}
