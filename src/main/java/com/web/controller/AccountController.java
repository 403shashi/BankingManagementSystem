package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.model.AccountDetails;
import com.web.service.AccountServiceImp;


@Controller
public class AccountController {
	@Autowired
	private AccountServiceImp service;
	
	@RequestMapping("/")
    public String homePage() {
		return "home";
		
	}
	@RequestMapping("/home")
	public String homeinfo() {
		return "homeinfo";
		
	}
	
	
	
	
	@RequestMapping("/newAccount")
    public String formPage() {
		return "newAccount";
		
	}
	@RequestMapping("/register")
    public String accountInfo(AccountDetails details) {
		AccountDetails d =service.saveAccount(details);
		
		return "success";
		
	}
	@RequestMapping("/balance")
    public String balanceForm() {
		
		return "balance";
		
	}
	@RequestMapping("/reg")
	public String balanceForm1(int accountNumber,ModelMap model) {
		model.put("AccountDetails", service.getBalance(accountNumber));
		
		return "getBalance";
		
	}
	
	@RequestMapping("/deposit")
    public String depositForm1() {
		
		return "deposit";
		
	}
	
	
	@RequestMapping("/reg1")
	public String processDeposit(@RequestParam int accountNumber,@RequestParam String name,  @RequestParam String password, @RequestParam double accountBalance, ModelMap model) {
	    model.put("details", service.deposit(accountNumber, name, password, accountBalance));
	    model.put("accountBalance",accountBalance);
	    return "amountUpdate";
	}
		
		




	
	@RequestMapping("/withdraw")
    public String withdrawalForm() {
		
		return "withdraw";
		
	}
	
	@RequestMapping("/reg2")
	public String withdraw(@RequestParam int accountNumber,@RequestParam String name,  @RequestParam String password, @RequestParam double accountBalance, ModelMap model) {
	    AccountDetails details= service.withdraw(accountNumber, name, password, accountBalance);
	    if(details!=null)
	    {
	    	model.put("details", details);
	    	model.put("accountBalance", accountBalance);
	    	return "withdrawalresult";
	    }
	    else {
	    	return"insufficent";
	    	
	    }
	}
	
	
	
	
	
	
	
	
	@RequestMapping("/transfer")
    public String transferForm() {
		
		return "transfer";
		
	}
	
	@RequestMapping("/transferconfirm")
	
    public String transferDetails(@RequestParam int accountNumber,@RequestParam int tacc_no,@RequestParam String name,@RequestParam String password,@RequestParam double accountBalance,ModelMap model)
    {
    	AccountDetails acc=service.transferAccount(accountNumber, tacc_no, name, password, accountBalance);
    	if(acc!=null) 
    	{
    	model.put("AccountDetails", service.getBalance(accountNumber));
    	model.put("accountBalance", accountBalance);
    	model.put("acc1",service.getBalance(tacc_no));
    	return "transferResult";
    	}
    	else
    	{
    		return "invalidform";
    	}
    }
	
	
	
	
	
	@RequestMapping("/closeAccount")
    public String  closeForm() {
		
		return "closeAccount";
		
	}
	
	
	
	 @RequestMapping("/closeacc")
	    public String closeAccount(@RequestParam int accountNumber,@RequestParam String name,@RequestParam String password,ModelMap model)
	    {
	  	  String result=service.closeAccount(accountNumber, name, password);
	  	  model.put("result", result);
	  	  return "closeResult";
	    }
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping("/aboutus")
    public String  aboutInfo() {
		
		return "aboutus";
		
	}
    
}

		


