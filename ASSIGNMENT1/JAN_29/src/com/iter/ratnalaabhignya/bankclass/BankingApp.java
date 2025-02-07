package com.iter.ratnalaabhignya.bankclass;

/*Develop a Java banking application using polymorphism with three classes: Account,
SavingsAccount, and CurrentAccount. The abstract Account class has private
attributes (accountNumber, balance) and abstract methods for deposit and
withdrawal. SavingsAccount adds an interestRate attribute, overrides deposit to
calculate interest, and ensures sufficient balance in withdrawal. CurrentAccount
introduces an overdraftLimit and overrides withdrawal to check this limit. In the
BankingApp class, instantiate both account types, perform transactions, and display
account details to demonstrate polymorphism*/
public class BankingApp {
	public static void main(String [] args) {
		savingAccount ob=new savingAccount(2.0,5000,23);
	System.out.println(	ob.deposit(234));
	System.out.println(ob.deposit());
	System.out.println(ob.withdraw(49));
	currentAccount ob1=new currentAccount(344);
	ob1.withdraw(34444);
	}
	

}
