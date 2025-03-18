package com.kishore.java;

//Encapsulation Example: Bank Account
//package com.kishore.java;

class BankAccount {
 // Private data members (Encapsulation)
 private String accountHolder;
 private double balance;

 // Constructor to initialize values
 public BankAccount(String accountHolder, double initialBalance) {
     this.accountHolder = accountHolder;
     this.balance = initialBalance;
 }

 // Getter method to access account holder's name
 public String getAccountHolder() {
     return accountHolder;
 }

 // Getter method to access balance
 public double getBalance() {
     return balance;
 }

 // Setter method to deposit money (with condition)
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited $" + amount);
     } else {
         System.out.println("Invalid deposit amount.");
     }
 }

 // Setter method to withdraw money (with condition)
 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn $" + amount);
     } else {
         System.out.println("Insufficient funds or invalid amount.");
     }
 }
}

//Main Program
public class BankApp {
 public static void main(String[] args) {
     // Creating an account
     BankAccount account = new BankAccount("Kishore", 500.0);

     // Accessing data using getters
     System.out.println("Account Holder: " + account.getAccountHolder());
     System.out.println("Initial Balance: $" + account.getBalance());

     // Depositing money
     account.deposit(200);
     System.out.println("Updated Balance: $" + account.getBalance());

     // Trying to withdraw more than available balance
     account.withdraw(800);  // Error condition
     System.out.println("Final Balance: $" + account.getBalance());
 }
}
