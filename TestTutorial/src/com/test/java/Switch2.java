package com.test.java;
public class Switch2 
{
	final static short x = 2;
    public static int y = 0;
    public static void main(String [] args) 
    {
       /* for (int z=0; z < 4; z++) 
        {
            switch (z) 
            {
                case 2: System.out.print("0 ");
                default: System.out.print("def ");
                case 1: System.out.print("1 ");  
                            break;
                case 0: System.out.print("2 ");
            }*/
            String x = "xyz";
            x.toUpperCase(); /* Line 2 */
            String y = x.replace('Y', 'y');
            y = y + "abc";
            System.out.println(y);
       // }
    }
}