package com.braindata.bankmanagement.serviceImpl;
import com.braindata.bankmanagement.service.Rbi;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.model.CurrentAccount;
import com.braindata.bankmanagement.model.SavingAccount;


public class Sbi implements Rbi {
	Scanner sc = new Scanner (System.in);
	
	Account ac = new Account();
	
	public void createAccount()  {
		while(true) {
		
			
		System.out.println("-Create New Account-");
		while(true) {
			try {
				System.out.println("Enter Account Number: ");
				ac.setAccNo(sc.nextInt());
				sc.nextLine();
				break;
				
			}
			catch(InputMismatchException e) {
				System.out.println("enter valid account number");
				sc.nextLine();
				
			}
		}
		
        
        System.out.println("Enter Name: ");
        ac.setName(sc.nextLine());
        
        System.out.println("Enter Mobile Number: ");
        ac.setMobNo(sc.next());
        
        System.out.println("Enter Aadhar Number: ");
        ac.setAdharNo(sc.next());
        
        System.out.println("Enter Gender: ");
        ac.setGender(sc.nextLine());
        
        sc.nextLine();
        while(true) {
			try {
				System.out.println("Enter Age: ");
		        ac.setAge(sc.nextInt());
		    	break;
				
			}
			catch(InputMismatchException e) {
				System.out.println("enter valid age");
				sc.nextLine();
			
			}
//			System.out.println("Choose Account Type: ");
//	        System.out.println("1. Saving");
//	        System.out.println("2. Current");
//	        int typeChoice = sc.nextInt();
//
//	        if (typeChoice == 1) {
//	            ac.setAccountType(new SavingAccount());
//	        } else if (typeChoice == 2) {
//	            ac.setAccountType(new CurrentAccount());
//	        } else {
//	            System.out.println("Invalid choice, setting default Saving Account");
//	            ac.setAccountType(new SavingAccount());
//	        }
//
//	        System.out.print("Enter Initial Balance: ");
//	        ac.setBalance(sc.nextDouble());
//
//	        System.out.println("\n✅ Account Created Successfully!");
//	    }
//		 

        while(true) {
			try {
				System.out.print("Enter Initial Balance: ");
		        ac.setBalance(sc.nextDouble());
		    	break;
		        
			}
			catch(InputMismatchException e) {
				System.out.println("enter valid input");
				sc.nextLine();
				break;
				
			
			}
		} 
        
        System.out.println(" Account Created Successfully!");
        break;
	}
		}
	}
	public void displayAllDetails() {
	    try {
	        System.out.println("Enter account number: ");
	        int acc = sc.nextInt();  // this may throw InputMismatchException

	        if (ac.getAccNo() == acc) {
	            System.out.println("---- Account Details ----");
	            System.out.println("Account Number : " + ac.getAccNo());
	            System.out.println("Name           : " + ac.getName());
	            System.out.println("Mobile Number  : " + ac.getMobNo());
	            System.out.println("Aadhar Number  : " + ac.getAdharNo());
	            System.out.println("Gender         : " + ac.getGender());
	            System.out.println("Age            : " + ac.getAge());
	            System.out.println("Current Balance: ₹" + ac.getBalance());
	        } else {
	           throw new AccountNotFoundException("account not found");
	        }

	    } catch (AccountNotFoundException e) {
	        System.out.println("Invalid input! Please enter only numbers for account number."+e.getMessage());
	        sc.nextLine(); 
	    }
	}


	public void depositeMoney() {
        System.out.println("-Deposit Money-");
        while(true) {
        System.out.println("Enter Account Number.");
        int userAccNo = sc.nextInt();
        
        if (ac.getAccNo() == userAccNo) {
        	System.out.print("Enter Amount to Deposit: ");
            double amt = sc.nextDouble();
            if (amt > 0) {
                ac.setBalance(ac.getBalance() + amt);
                System.out.println("Money Deposited Successfully!");
                System.out.println("Updated Balance: ₹" + ac.getBalance());
                return;
            } else {
                System.out.println("Invalid Amount!");
            }
        }else {
        	System.out.println("Enter Valid Account Number!");
        }
       }
        
    }
	
		public void withdrawal() {
			System.out.println("-Withdraw Money-");
			while(true) {
			System.out.println("Enter account number ");
			int accountnumber=sc.nextInt();
			
			if(accountnumber ==ac.getAccNo()) {	
        System.out.print("Enter Amount to Withdraw: ");
        double amt = sc.nextDouble();
        if (amt > 0 && amt <= ac.getBalance()) {
            ac.setBalance(ac.getBalance() - amt);
            System.out.println("Withdrawal Successful!");
            System.out.println("Remaining Balance: ₹" + ac.getBalance());
            return;
        } 
			
			else {
            System.out.println("Insufficient Balance or Invalid Amount!");
        }
			
		}
		else {
				System.out.println("Invalid Account number ");
		}	}
}

			

    public void balanceCheck() {
    	System.out.println("Enter account number");
		  int acc = sc.nextInt();
	        if(ac.getAccNo()==acc) {
        System.out.println("-Balance Check-");
        System.out.println("Current Balance: ₹" + ac.getBalance());
    }
    }
}



		
	
	

