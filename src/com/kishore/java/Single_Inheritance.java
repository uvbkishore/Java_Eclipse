package com.kishore.java;


	// Parent Class
	class Vehicle {
	    void start() {
	        System.out.println("Vehicle is starting...");
	    }
	}

	// Child Class inheriting Vehicle
	class Car extends Vehicle {
	    void drive() {
	        System.out.println("Car is driving...");
	    }
	}

	// Main Class
	public class Single_Inheritance {
	    public static void main(String[] args) {
	        Car myCar = new Car();
	        myCar.start(); // Inherited method from Vehicle class
	        myCar.drive(); // Method specific to Car class
	    }
	}


