package com.optum.samar;

import java.util.List;

public class Utils {
	public static double getAvg(int[] array) {
		int sum = 0;
		for (int i : array) {
			sum += i;
		}
		
		return sum/(double)array.length;
	}
	
	public static double getAvg(List<Integer> array) {
		int sum = 0;
		for (int i : array) {
			sum += i;
		}
		
		return sum/(double)array.size();
	}
}
