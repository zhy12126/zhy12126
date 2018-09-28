package banking8;

import java.util.Iterator;

import banking8.*;

public class CustomerReport {

	public void generateReport() {
		
		Bank bank = Bank.getBank();
		
		Customer customer = null;
		
		System.out.println("\t\t\tCUSTOMERS REPORT");
		System.out.println("\t\t\t================");

		Iterator<Customer> customers = bank.getCustomers();
		
		while(customers.hasNext()){
			customer = customers.next();
			
			System.out.println();
			System.out.println("Customer: " + customer.getLastName() + ", "
					+ customer.getFirstName());

			Iterator<Account> accounts = customer.getAccounts();
			
			while(accounts.hasNext()){
				Account account = accounts.next();
				
				String account_type = "";

				if (account instanceof SavingAccount) {
					account_type = "Savings Account";
				} else if (account instanceof CheckingAccount) {
					account_type = "Checking Account";
				}

				System.out.println(account_type + ": current balance is гд"
						+ account.getBalance());

			}
		}

	}

}
