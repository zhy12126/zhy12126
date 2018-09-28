package banking3;

import banking3.Account;
import banking3.Customer;

public class TestBanking3 {
	public static void main(String[] args) {
		Customer customer;
		customer = new Customer("Jane","Smith");
		System.out.println("Creating the customer "+customer.getFirstName()+" "+customer.getLastName());
		//Account account;
		//account= new Account(500);
		//customer.setAccount(account);
		customer.setAccount(new Account(500));
		System.out.println("Creating her account with a 500.00 balance. ");
		System.out.println("Withdraw 150.00: "+customer.getAccount().withdraw(150));
		System.out.println("Deposit 22.50:"+customer.getAccount().deposit(22.5));
		System.out.println("Withdraw 47.62:"+customer.getAccount().withdraw(47.62));
		System.out.println("Withdraw 400.00:"+customer.getAccount().withdraw(400));
		System.out.println("Customer ["+customer.getFirstName()+","+customer.getLastName()
				+"] has a balance of "+customer.getAccount().getBalance());
			
	}

}
