package com.kishore.java;
import java.util.Scanner;
// + - * / % -for reaminder
public class addition {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Scanner bucky = new Scanner(System.in);
		double fnum, snum, answer;
		//
		System.out.print("Enter First Number:");
		fnum = bucky.nextDouble() ; 
		//
		System.out.print("Enter Second Number:");
		snum = bucky.nextDouble();
		//
		answer = fnum + snum;
		System.out.println( answer);
		//++n and n++ also --n and n--
		//preaddition
		int tuna  = 5;
		System.out.println(++tuna);
		System.out.println(tuna++);
		System.out.println(tuna);
		// tuna = tana  + 8 is tuna += 8; both are same 
		// also you can use tuna -= 8, also use tuna *= 8;
		// int i = 5    if (i == 5) if(i != 5) is not equal less than greathan  <  > <= >= 
		int test = 9;
		
		if (test == 6) {
			System.out.println("yes");
		}else{
			System.out.println("this is else"); 
		}
		// && is AND operator 
		// || is OR operator
	}
}


