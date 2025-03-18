package com.kishore.java;


class Calculator_over{
	
	int add(int a , int b) {
		return a+b;
		
	}
	
	double add(double a, double b, double c) {
		return a+b+c;
	}
}

public class Over {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator_over cal = new Calculator_over();
		int result = cal.add(2, 3); 
		System.out.println("Result" +cal.add(2, 3));
		System.out.println("Result" + result);
		double result2 = cal.add(2.5, 3.5, 7.0);
		System.out.println("Result" + result2);
		
	}

}
