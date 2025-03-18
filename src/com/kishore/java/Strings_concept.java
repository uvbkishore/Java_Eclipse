package com.kishore.java;

public class Strings_concept {
	public static void main(String args[]) {
		String text ="Hello World";
		System.out.println("Length:" + text.length());
//To Uppercase and lowercase
		System.out.println("to CAPS:"+ text.toUpperCase());
		System.out.println("to lower:" + text.toLowerCase());
//Concatenate
		String fname ="Kishore";
		String lname = "Utla";
		String Fullname = fname.concat(" ").concat(lname);
		System.out.println("Fullname:" + Fullname);
// Remove, leading or trailing spaces
		String text2 = "   Sai Ram  ";
		System.out.println("Before Trim [" + text2 + "]");
		System.out.println("After Trim [" + text2.trim() + "]");
// Retrives Chart at specific index from string
		System.out.println("Character at Index 2 is " + text.charAt(2));
//substring
		String text3 = "Welcome to Java";
		System.out.println(text3.substring(11));
		System.out.println(text3.substring(0,7));
// Replace .replace()		
		System.out.println(text3.replace("Welcome" , "Welcome people"));
		
		
    }
}