package com.kishore.java;

public class Multiple_catch_blocks {
	public static void  main(String args[]) {
		try {
			int[] numbers = { 10, 20, 30};
			System.out.println(numbers[5]);
			int result = 5/0;
			System.out.println(result);
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Error: Array index is out of Bounds");
		}catch (ArithmeticException e) {
			System.out.println("Arithemetic Error occured");
	    }finally {
	    	System.out.println("Finally executes inspite of above catch");
	    }
	
}
	

}
