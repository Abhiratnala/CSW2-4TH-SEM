package com.iter.ratnalaabhignya.bankclass;

/*// The abstract Account class has private
attributes (accountNumber, balance) and abstract methods for deposit and
withdrawal*/
abstract class account {
	protected int accountNumber;
	protected int balance;
	abstract double deposit();
	abstract double withdraw();
	
	

}
