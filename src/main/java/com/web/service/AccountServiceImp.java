package com.web.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.sym.Name;
import com.web.model.AccountDetails;
import com.web.repo.AccountRepo;
@Service
public class AccountServiceImp implements accountService {
	@Autowired
	private AccountRepo repo;
/*------------INSERTING DETAILS IN DATABASE--------------*/
	@Override
	public AccountDetails saveAccount(AccountDetails details) {
		AccountDetails details1 =repo.save(details);
		return details1;
	
	}
/*------------FINDING BALANCE------------------------------------------------------------*/
@Override
public AccountDetails getBalance(int accountNumber) {
	AccountDetails get =repo.findById(accountNumber).get();
	return get;
}
         
/*------------DEPOSIT-----------------------------------------------------------------------------------------------------*/
@Override
public AccountDetails deposit(int accountNumber, String name, String password, double accountBalance) {
	AccountDetails details = repo.findById(accountNumber).get();
	int AccNumber=details.getAccountNumber();
	String Name1=details.getName();
	String password1=details.getPassword();
	double Amount=details.getAccountBalance();
	if(accountNumber==AccNumber &&  name.equals(Name1)&& password.equals(password1)){
		Amount =details.getAccountBalance()+accountBalance;
	}
	details.setAccountBalance(Amount);
	repo.save(details);
	return details;
	
}
/*------------WITHDRAWAL--------------------------------------------------------------------------------------*/

@Override
public AccountDetails withdraw(int accountNumber, String name, String password, double accountBalance) {
	AccountDetails details = repo.findById(accountNumber).get();
	int AccNumber=details.getAccountNumber();
	String Name1=details.getName();
	String password1=details.getPassword();
	double Amt=details.getAccountBalance();
	if(accountNumber==AccNumber &&  name.equals(Name1)&& password.equals(password1)){
	if(Amt<accountBalance)
	{
		return null;
	}

   else
   {
	  Amt=Amt-accountBalance;
   }
   
	}
details.setAccountBalance(Amt);
repo.save(details);

	return details;
}



/*------------TRANSFER---------------------------------------*/




@Override
public AccountDetails transferAccount(int accountNumber, int tacc_no, String name, String password,
		double accountBalance) {
	AccountDetails acc=repo.findById(accountNumber).orElse(null);
	AccountDetails acc1=repo.findById(tacc_no).orElse(null);
	
	if(acc!=null && acc1!=null)
	{
		if(acc.getPassword().equals(password) && acc.getName().equals(name))
		{
			double sourceAccountBalance=acc.getAccountBalance();
			if(sourceAccountBalance>=accountBalance)
			{
				double targetAccountBalance=acc1.getAccountBalance()+accountBalance;
				acc.setAccountBalance((sourceAccountBalance-accountBalance));
				acc1.setAccountBalance(targetAccountBalance);
				repo.save(acc);
				repo.save(acc1);
				return acc1;
			}
			else
			{
				return null;
			}
		}
	}
	return null;
}





/*CLOSE ACCOUNT */

@Override
public String closeAccount(int accountNumber, String name, String password) {
	AccountDetails acc=repo.findById(accountNumber).get();
	if(acc!=null)
	{
	    if(acc.getAccountNumber()==accountNumber&&acc.getName().equals(name)&&acc.getPassword().equals(password))
	    {
	    	 acc.setAccountBalance(0);
	    	 repo.save(acc);
             return "Account closed successfully!";
        }
    }

        return "Failed to close account. Please check your credentials.";
}

}





















/*------------CLOSE ACCOUNT---------------------------------------*/



	

			
	






	





	    




	
	