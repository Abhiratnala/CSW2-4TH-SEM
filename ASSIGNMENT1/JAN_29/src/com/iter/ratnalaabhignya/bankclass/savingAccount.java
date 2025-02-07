package com.iter.ratnalaabhignya.bankclass;

public class savingAccount extends account {
    double interestRate;
    
    public savingAccount(double interestRate,int b,int a) {
		this.interestRate = interestRate;
		balance=b;
		accountNumber=a;
	}
    public double deposit(double amt) {
    	return balance+amt;
    	
    }

	@Override
    public double deposit() {
		return (balance+(balance*interestRate*1)*100);
		}
	public double withdraw(int amt) {
		return balance-amt;
	}

	
	

}
