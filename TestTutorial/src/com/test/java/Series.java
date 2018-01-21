package com.test.java;
import java.util.*;

public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner  in = new Scanner(System.in);
int t = in.nextInt();

for (int i =0; i<t; i++) {
	int a= in.nextInt();
	int b = in.nextInt();
	int n = in.nextInt();
	int series =0;
    //for (int j = 0; j <= n-1; j++){
        series = series + a + 2 * 0 + b;
        System.out.print(series + " ");
        series = series + a + 2*1 +b;
        System.out.print(series + " ");
        series = series + a + 2*2 +b;
        System.out.print(series + " ");
    //}
}
	
in.close();
	}

}