package com.braindata.bankmanagement.model;

public class AccoutFactory implements AccountType {

	public static Object getAccountType(String accounttype) {
		
		if(accounttype.equalsIgnoreCase("saving"))
				{
			return new SavingAccount();	
			
		}else if(accounttype.equalsIgnoreCase("current")){
			return new CurrentAccount();
			
		} 
		else {
			System.out.println("invalid account number");
			return null;
		}
		
		
	}

	

	@Override
	public String getTypeName() {
		// TODO Auto-generated method stub
		return null;
	}
	
}



