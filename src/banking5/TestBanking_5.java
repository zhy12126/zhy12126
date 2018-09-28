package banking5;
public class TestBanking_5 {

	public static void main(String[] args) {
		Bank bank = new Bank();
		Customer customer;
		Account account;
		
		System.out.println("Creating the customer Jane Smith.");
		bank.addCustomer("Jane", "Simms");
		System.out.println("Creating her Savings Account with a 500.00 balance and 3% interest.");
		bank.getCustomer(0).setAccount(new SavingAccount(500, 0.03));

		System.out.println("Creating the customer Owen Bryant.");
		bank.addCustomer("Owen", "Bryant");
		customer = bank.getCustomer(1);
		System.out.println("Creating his Checking Account with a 500.00 balance and no overdraft protection.");
		customer.setAccount(new CheckingAccount(500));

		System.out.println("Creating the customer Tim Soley.");
		bank.addCustomer("Tim", "Soley");
		customer = bank.getCustomer(2);
		System.out.println("Creating his Checking Account with a 500.00 balance and 500.00 in overdraft protection.");
		customer.setAccount(new CheckingAccount(500, 500));

		System.out.println("Creating the customer Maria Soley.");
		bank.addCustomer("Maria", "Soley");
		customer = bank.getCustomer(3);
		System.out.println("Maria shares her Checking Account with her husband Tim.");
		customer.setAccount(bank.getCustomer(2).getAccount());
		System.out.println();

		System.out.println("Retrieving the customer Jane Smith with her savings account.");
		customer = bank.getCustomer(0);
		account = customer.getAccount();
		System.out.println("Withdraw 150.00: " + account.withdraw(150.00));
		System.out.println("Deposit 22.50: " + account.deposit(22.50));
		System.out.println("Withdraw 47.62: " + account.withdraw(47.62));
		System.out.println("Withdraw 400.00: " + account.withdraw(400.00));
		System.out.println("Customer [" + customer.getLastName() + ", "
				+ customer.getFirstName() + "] has a balance of "
				+ account.getBalance());

		System.out.println();
		System.out.println("Retrieving the customer Owen Bryant with his checking account with no overdraft protection.");
		customer = bank.getCustomer(1);
		account = customer.getAccount();
		System.out.println("Withdraw 150.00: " + account.withdraw(150.00));
		System.out.println("Deposit 22.50: " + account.deposit(22.50));
		System.out.println("Withdraw 47.62: " + account.withdraw(47.62));
		System.out.println("Withdraw 400.00: " + account.withdraw(400.00));
		System.out.println("Customer [" + customer.getLastName() + ", "
				+ customer.getFirstName() + "] has a balance of "
				+ account.getBalance());

		System.out.println();

		System.out.println("Retrieving the customer Tim Soley with his checking account that has overdraft protection.");
		customer = bank.getCustomer(2);
		account = customer.getAccount();
		System.out.println("Withdraw 150.00: " + account.withdraw(150.00));
		System.out.println("Deposit 22.50: " + account.deposit(22.50));
		System.out.println("Withdraw 47.62: " + account.withdraw(47.62));
		System.out.println("Withdraw 400.00: " + account.withdraw(400.00));
		System.out.println("Customer [" + customer.getLastName() + ", "
				+ customer.getFirstName() + "] has a balance of "
				+ account.getBalance());

		System.out.println();

		System.out.println("Retrieving the customer Maria Soley with her joint checking account with husband Tim.");
		customer = bank.getCustomer(3);
		account = customer.getAccount();
		System.out.println("Deposit 150.00: " + account.deposit(150.00));
		System.out.println("Withdraw 750.00: " + account.withdraw(750.00));
		System.out.println("Customer [" + customer.getLastName() + ", "
				+ customer.getFirstName() + "] has a balance of "
				+ account.getBalance());

	}
}