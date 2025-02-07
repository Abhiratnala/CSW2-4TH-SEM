package com.iter.ratnalaabhignya.bankclass;

public class currentAccount extends account {
	double overdraftLimit;

	public currentAccount(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	public double withdraw(double amt) {
		if((balance-amt)<overdraftLimit)
			return -1.0;
		else
			return balance-amt;

	}
	
	

}
