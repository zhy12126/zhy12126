package banking6;
public class TestBanking_6 {

	public static void main(String[] args) {
		Bank bank = Bank.getBank();

		Customer customer;
		CustomerReport report = new CustomerReport();

		bank.addCustomer("Jane", "Simms");
		customer = bank.getCustomer(0);
		customer.addAccount(new SavingAccount(500.00, 0.05));
		customer.addAccount(new CheckingAccount(200.00, 400.00));

		bank.addCustomer("Owen", "Bryant");
		customer = bank.getCustomer(1);
		customer.addAccount(new CheckingAccount(200.00));

		bank.addCustomer("Tim", "Soley");
		customer = bank.getCustomer(2);
		customer.addAccount(new SavingAccount(1500.00, 0.05));
		customer.addAccount(new CheckingAccount(200.00));

		bank.addCustomer("Maria", "Soley");
		customer = bank.getCustomer(3);

		customer.addAccount(bank.getCustomer(2).getAccount(1));
		customer.addAccount(new SavingAccount(150.00, 0.05));

		report.generateReport();
	}
}

