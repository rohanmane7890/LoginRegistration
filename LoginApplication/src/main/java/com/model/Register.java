package com.model;

public class Register {
	private int RegNumber;
	private String firstName;
	private String userName;
	private String password;
	private double accBal;
	public Register(int regNumber, String firstName, String userName, String password, double accBal) {
		super();
		RegNumber = regNumber;
		this.firstName = firstName;
		this.userName = userName;
		this.password = password;
		this.accBal = accBal;
	}
	public int getRegNumber() {
		return RegNumber;
	}
	public void setRegNumber(int regNumber) {
		RegNumber = regNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getAccBal() {
		return accBal;
	}
	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
	
}
