package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		BusinessAccount bacc = new BusinessAccount();
		Account acc = new Account(1001, "Alex", 0.0);
		
		// UPCASTING
		
		Account acc9 = bacc;
		Account acc22 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc33 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		// nao e possivel chamar acc2.loan() pois ela foi declarada como Account e nao como
		// BusinessAccount, logo seria necessario fazer o casting para BusinessAccount.
	
		// DOWNCASTING
		
		BusinessAccount acc4 =  (BusinessAccount) acc22;
		acc4.loan(100);
		
		// gera erro ClassCastException em tempo de execucao
	    // "Cannot be cast to entities.BusinessAccount"
	  //BusinessAccount acc5 = (BusinessAccount) acc3;
		
		//instanceof verifica se o objeto é daquele tipo.
		if (acc33 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc33;
			acc5.loan(200);
			System.out.println("Loan");
		}
		
		if (acc33 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc33;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.00);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.00);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		
	}
}
