package com.kishore.java;

public class Throws_exception_handling {
	static void divide(int a, int b) throws ArithmeticException {
		//System.out.println("Let me understand");
		System.out.println(a/b);
		
	}
	public static void main(String args[]) {
		try {
			divide(10,0);
			}catch (ArithmeticException e) {
				System.out.println("Handled: in the main" + e.getMessage());
			
		}
	}
}
