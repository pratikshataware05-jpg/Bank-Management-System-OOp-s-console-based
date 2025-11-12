package com.braindata.bankmanagement.client;
import com.braindata.bankmanagement.service.*;
import com.braindata.bankmanagement.serviceImpl.*;
import java.util.*;
public class Test {
	
	    public static void main(String[] args) {
	        Rbi bank = new Sbi();
	        Scanner sc = new Scanner(System.in);
	        int choice;

	        System.out.println("Welcome to SBI Bank Management System");

	        do {
	            System.out.println("\n*MENU*");
	            System.out.println("1. Create Account");
	            System.out.println("2. Display All Details");
	            System.out.println("3. Deposit Money");
	            System.out.println("4. Withdraw Money");
	            System.out.println("5. Balance Check");
	            System.out.println("6. Exit");
	            System.out.println("*********************");
	            
	            System.out.print("Enter Your Choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    bank.createAccount();
	                   
	                    break;
	                case 2:
	                    bank.displayAllDetails();
	                    break;
	                case 3:
	                    bank.depositeMoney();
	                    break;
	                case 4:
	                    bank.withdrawal();
	                    break;
	                	
	                case 5:
	                    bank.balanceCheck();
	                    break;
	                case 6:
	                    System.out.println("Thank you for using SBI Bank System!");
	                    break;
	                default:
	                    System.out.println("Invalid Choice! Please Try Again.");
	            }

	        } while (choice != 6);
	    }

}
