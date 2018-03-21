package com.optum.samar;

import java.io.PrintStream;

public class Variables {

	private int a;
	private int b;
	public PrintStream out;
	
	public static void main(String[] args) {
		Variables v = new Variables();
		v.setA(2);
		v.setB(3);
		
		int sum = v.sum();

		System.out.println("Sum is " + sum);
		
		Variables v2 = new Variables();
		v2.setA(5);
		v2.setB(10);
		sum = v2.sum();

		System.out.println("Sum is " + sum);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		if (a < 0) {
			this.a = 0;
		}
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		if (b < 0) {
			this.b = 0;
		}
		this.b = b;
	}

	public int sum() {
		return getA() + getB();
	}
}
