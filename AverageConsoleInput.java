package com.optum.samar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AverageConsoleInput {

	public static void main(String[] args) {
//		System.out.println("Enter 5 numbers to calculate average. Separate each number with a space.");
//		
//		int[] input = readInput();
//		
//		System.out.print("You entered: ");
//		for (int i = 0; i < input.length; i++) {
//			System.out.print(input[i] + " ");
//		}
//		
//		System.out.println();
//		
//		double avg = Utils.getAvg(input);
//		
//		System.out.println("Your average is " + avg);
		
		System.out.println("Enter numbers to calculate average. Separate each number with a space.");
		
		List<Integer> input = readInputList();
		
		System.out.print("You entered: ");
		for (Integer i : input) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		double avg = Utils.getAvg(input);
		
		System.out.println("Your average is " + avg);
	}
	
	private static int[] readInput() {
		String input = "";
		String[] list;
		int[] returnList = new int[5];
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			input = br.readLine();
			list = input.split(" ");
			
			for (int i = 0; i < 5; i++) {
				returnList[i] = Integer.parseInt(list[i]);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return returnList;
	}
	
	private static List<Integer> readInputList() {
		String input = "";
		String[] list;
		
		List<Integer> returnList = new ArrayList<>();
		
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			input = br.readLine();
			list = input.split(" ");
			
			for (String s : list) {
				returnList.add(Integer.parseInt(s));
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return returnList;
	}
}
