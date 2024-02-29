package com.web.service;



import com.web.model.AccountDetails;

public interface accountService {
	
	public AccountDetails saveAccount(AccountDetails details);
	
	public AccountDetails getBalance(int accountNumber);
	
	
	
    public AccountDetails deposit(int accountNumber, String name,String password, double accountBalance);
    
    public AccountDetails withdraw(int accountNumber, String name,String password, double accountBalance);

    
    public AccountDetails transferAccount(int accountNumber,int tacc_no, String name,String password, double accountBalance);
    
    public String closeAccount(int accountNumber, String name, String password);
    
    
    


}
