package com.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="accountform")
public class AccountDetails {
 @Id
    private int accountNumber;
    private String name;
    private String password;
    private double accountBalance;
    private String address;
    private long mobileNo;
	public AccountDetails() {
		super();
	}
	public AccountDetails(int accountNumber, String name, String password, double accountBalance, String address,
			long mobileNo) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.password = password;
		this.accountBalance = accountBalance;
		this.address = address;
		this.mobileNo = mobileNo;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public String getAddress() {
		return address;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "AccountDetails [accountNumber=" + accountNumber + ", name=" + name + ", password=" + password
				+ ", accountBalance=" + accountBalance + ", address=" + address + ", mobileNo=" + mobileNo + "]";
	}
    
}