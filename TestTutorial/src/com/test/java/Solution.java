package com.test.java;

import java.util.*;

public class Solution {
	  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        s = s.trim().toLowerCase();
        for (int i =0; i <= s.length()/k; i ++){
           if( s.substring(i, k).compareTo(smallest) < 0){
        	   System.out.println(s.substring(i,k));
        	  smallest = s.substring(i,k);
           }
                
            
                //largest = s.substring(i,k);
        }
        return smallest + "\n" + largest;
    
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}