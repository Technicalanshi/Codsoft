package com.ATMService;

import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance + amount;
            System.out.println(" You have Withdrawal  $" + amount + " successfully...");
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println(" You have Deposit amount  of $" + amount + " successfully.");
        } else {
            System.out.println("Invalid deposit amount! please enter sufficient  amount..");
        }
    }

   
}

class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void showOptions() {
    	System.out.println("Which service do you want please select any  Options:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        
    }

    public void Transaction(int choice, Scanner sc) {
        switch (choice) {
        case 1:
            System.out.print("Enter deposit amount: $");
            double depositAmount = sc.nextDouble();
            account.deposit(depositAmount);
            
            break;
        case 2:
            System.out.print("Enter withdrawal amount: $");
            double withdrawAmount = sc.nextDouble();
            account.withdraw(withdrawAmount);
            break;
        case 3:
                System.out.println(" Your Current Balance is: $" + account.getBalance());
                break;
       
            default:
                System.out.println(" You have choosen Invalid option. Please select a valid option.");
                break;
        }
    }
}

public class ATM_Machine_App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  your initial account balance: $");
        double initialBalance = sc.nextDouble();
        BankAccount bankAcc = new BankAccount(initialBalance);
        ATM atm = new ATM(bankAcc);

        while (true) {
            atm.showOptions();        
            int choice = sc.nextInt();
            atm.Transaction(choice, sc);
            System.out.println("THANKU FOR USING OUR ATM SERVICES HAVE A NICE DAY..");
           
        }
    }
}