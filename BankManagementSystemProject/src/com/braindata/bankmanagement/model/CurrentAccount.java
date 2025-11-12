package com.braindata.bankmanagement.model;

public class CurrentAccount implements AccountType {

	
	@Override
    public String getTypeName() {
        return "Current";
    }

}
