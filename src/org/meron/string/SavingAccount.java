package org.meron.string;

import java.math.BigDecimal;

interface Account{
	BigDecimal balance = new BigDecimal(0.00);
}
public class SavingAccount implements Account {
	
	
	public SavingAccount(BigDecimal initialValue) {
		//balance = initialValue;
	}
	
	public String toString(){
		return balance.toString();
	}
	public static void main(String args[]){
		SavingAccount instance = new SavingAccount(new BigDecimal(50.0));
		System.out.println(instance);
	}
}
