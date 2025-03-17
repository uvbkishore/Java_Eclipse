package com.kishore.java;
import java.util.Scanner;
public class addition {

	public static void main(String[] args) {
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
	}

}
