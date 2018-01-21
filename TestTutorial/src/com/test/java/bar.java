package com.test.java;

	class Bar { } 
	class Test 
	{  
	    Bar doBar() 
	    {
	        Bar b = new Bar(); /* Line 6 */
	        return b; /* Line 7 */
	    } 
	    public static void main (String args[]) 
	    { 
	        Test t = new Test();  /* Line 11 */
	        Bar newBar = t.doBar();  /* Line 12 */
	        System.out.println("newBar"); 
	        newBar = new Bar(); /* Line 14 */
	       System.out.println("finishing"); /* Line 15 */
	    } 
	}

