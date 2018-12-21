package com.model;
import org.skife.jdbi.v2.DBI;
import java.util.*;
public class Account {
	private int accNumber;
	private String name;
	private float amount;
	
	public Account(int accNumber, String name, float amount){
		this.accNumber = accNumber;
		this.name = name;
		this.amount = amount;
	}
	public Account() {

	}
	public void setAccNumber(int accNumber){
			this.accNumber= accNumber;
	}
	public void setName(String name){
			this.name = name;
	}
	public void setAmount(float amount){
			this.amount = amount;
	}
	public int getAccNumber() {
		return accNumber;
	}
	public String getName() {
	return name;
	}
	public float getAmount() {
		return amount;
	}
//Writer default constructor, setter/getter, equals and hashCode
	
		
}