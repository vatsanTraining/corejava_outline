package com.training.services;

import com.training.model.BankAccount;

public class BankAccountService {

	
	public double calculateInterest(BankAccount account) {
		
		double simpleInterest = 0.05;
		
		if(account.getAccountNumber()<=5000) {
			
			simpleInterest=0.06;
		}
		            
		return account.getBalance()*1*simpleInterest;
	}
	
	
}
