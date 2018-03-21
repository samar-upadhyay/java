package com.optum.samar;

import java.util.Arrays;
import java.util.List;

public class AverageArray {

	public static void main(String[] args) {
		int[] array = {2, 3, 5, 9, 13};
		
		double avg = getAvg(array);

		System.out.println("Average = " + avg);

		Integer[] newArray = new Integer[] {2, 3, 5, 9, 13};
		List<Integer> myList = Arrays.asList(newArray);
		
		avg = getAvg(myList);
		System.out.println("Average = " + avg);
	}

	public static double getAvg(int[] array) {
		int sum = 0;
		
		for (int i : array) {
			sum += i;
		}
		
		return (double) sum/array.length;
	}
	
	public static double getAvg(List<Integer> list) {
		int sum = 0;
		for (int i : list) {
			sum += i;
		}
		
		return (double) sum/list.size();
	}
}
