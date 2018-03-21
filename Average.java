package com.optum.samar;

public class Average {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		int c = 5;
		int d = 9;
		int e = 13;
		double avg;
		
//		avg = (a + b + c + d + e) / 5;
//		avg = (a + b + c + d + e) / 5.0;
		avg = getAvg(a, b, c, d, e);
		
		System.out.println("Average = " + avg);

	}
	
	public static double getAvg(int x, int y, int z, int w, int v) {
		return (v+w+x+y+z) / 5.0;
	}
}
