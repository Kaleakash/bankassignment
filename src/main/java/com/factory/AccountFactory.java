package com.factory;
import com.persistence.AccountDao;
import com.model.Account;
import com.persistence.DbConnection;
import java.util.*;
public class AccountFactory {
	
	//Database Connection 
	private static AccountDao dao() {
    	DbConnection db = new DbConnection();
    	return db.getConnect().onDemand(AccountDao.class);
  	}
	
	//Create Account, Account must be created only 
	//if amount it > 500
	public static String createAccount(int accNumber,
	String name, float amount){
		if(amount<500){
			return "Can't create the account";
		}else {
		int res = dao().createAccount(accNumber,name,amount);
		if(res>0){
			return "Account created successfully!";
		}else {
			return "Account not created!";
		}
		}
	}

	//Withdraw the amount, maintain minimum balance 500
	public static String withdrawAmount(int id, float amount){
	Account acc = dao().balanceCheck(id);
					float amount1 = acc.getAmount();
					if((amount1-amount)<=500){
						return "Can't Withdraw the amount";
					}else {
					int res = dao().withdraw(id,amount);
					if(res>0){
						return "Amount withdraw successfully";
					}else {
						return "Can't Withdraw the amount";
					}
					}
	
	}

	//Deposite the amount, write business method to deposite the amount 
	
	public static String depositeAmount(int id, float amount){
	
					int res = dao().deposite(id,amount);
					if(res>0){
						return "Amount deposited successfully";
					}else {
						return "Can't deposite the amount";
					}
	
	}
	
	//display balance amount based upon the account number 
	public static String balanceCheck(int accNumber) {
    	Account acc = dao().balanceCheck(accNumber);
		if(acc!=null){
		return "Your balance amount is "+acc.getAmount();	
		}else {
		return "Wrong account number";
		}
	}
}