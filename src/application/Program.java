package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		List<Account> listAccounts = new ArrayList<>();
		
		Account account1 = new Account(1001, "Alex", 1000.0);
		account1.withdraw(200.0);
		listAccounts.add(account1);
		
		Account account2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		account2.withdraw(200.0);
		listAccounts.add(account2);
		
		Account account3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		account3.withdraw(200.0);
		listAccounts.add(account3);
		
		System.out.println("ACCOUNTS DATAS: ");
		for (Account account : listAccounts) {
			System.out.println(account);
		}
		
		
	}
}
