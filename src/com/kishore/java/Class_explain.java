package com.kishore.java;

class Calculator{
	int add(int a , int b){
		return  a + b;
	}
	
	void showmessage() {
		System.out.println("Welcome to Java Methods");
	}
}

public class Class_explain {
		public static void main(String[] args) {
			Calculator calc = new Calculator();
			int result = calc.add(5, 3);
			System.out.println("Result:" + result);
			calc.showmessage();
	   }
}