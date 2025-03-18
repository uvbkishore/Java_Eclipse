package com.kishore.java;

public class Exception_handling_concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1️⃣ try — Code block that may throw an exception
		//2️⃣ catch — Handles the exception if one occurs
		//3️⃣ finally — (Optional) Always runs, whether an exception occurs or not
		//4️⃣ throw — Manually throw an exception
		//5️⃣ throws — Declares potential exceptions in method signatures
	try {
		int result = 10 / 0;
		System.out.println("Result:" + result);
    } catch (ArithmeticException e) {
	   System.out.println("Division by zero is not allowed");	
	}
		System.out.println("Program Continous..");
	}

}
