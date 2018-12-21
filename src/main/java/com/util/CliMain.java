package com.util;
import com.factory.AccountFactory;
import com.model.Account;
import java.util.*;	

public class CliMain
{
	static Scanner obj = new Scanner(System.in);
	static int accNum;		
	static String name;
	static float amount;
	public static void createAccount(int accNumber,String name,float amount){
	String str = AccountFactory.createAccount(accNumber,name,amount);
	System.out.println(str);
	}

	public static void withDrawAmount(int accNumber,float amount) {
	String str = AccountFactory.withdrawAmount(accNumber,amount);
	System.out.println(str);
	}	
	public static void depositeAmount(int accNumber,float amount) {
		String str = AccountFactory.depositeAmount(accNumber,amount);
		System.out.println(str);
	}
	public static void checkBalance(int accNumber) {
		String str = AccountFactory.balanceCheck(accNumber);
		System.out.println(str);
	}
    	public static void main( String[] args )
    	{
	String con = null;
	do{
		System.out.println("1:Create Account");
		System.out.println("2:Withdraw amount");
		System.out.println("3:Deposite amount");
		System.out.println("4:Check balance");
		int op = obj.nextInt();
		switch(op) {
		case 1:	System.out.println("Enter the accnumber");
				accNum = obj.nextInt();
				System.out.println("Enter the name");
				name = obj.next();
				System.out.println("Enter the amount");
				amount = obj.nextFloat();	
				createAccount(accNum,name,amount);
			break;
		case 2:	System.out.println("Enter the accnumber");
				accNum = obj.nextInt();
				System.out.println("Enter the amount");
				amount = obj.nextFloat();	
				withDrawAmount(accNum,amount);
			break;
		case 3:	System.out.println("Enter the accnumber");
				accNum = obj.nextInt();
				System.out.println("Enter the amount");
				amount = obj.nextFloat();	
				depositeAmount(accNum,amount);
			break;
		case 4:	System.out.println("Enter the accnumber");
				accNum = obj.nextInt();
				checkBalance(accNum);
			break;	
		
		}
		System.out.println("Do you want to continue....");
		con = obj.next();
	}while(con.equals("y"));	
	}
}
