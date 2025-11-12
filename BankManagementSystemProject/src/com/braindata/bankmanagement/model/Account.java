package com.braindata.bankmanagement.model;
 

public class Account {

	AccountType a;
	private int accNo;
	private String name;
	private String  mobNo;
	private String adharNo;
	private String gender;
	private int age;
	private double balance;
	private AccountType accountType;
	
	
	public AccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	public int getAccNo() {
		return accNo;
	}
	public AccountType getA() {
		return a;
	}
	public void setA(AccountType a) {
		this.a = a;
	}
	
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String  mobNo) {
		this.mobNo = mobNo;
	}
	public String  getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	

	
}
