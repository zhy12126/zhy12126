package banking4;

public class TestBanking_4 {
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.addCustomer("Jane", "Smms");
		bank.addCustomer("Owen", "Bryant");
		bank.addCustomer("Tim", "Soley");
		bank.addCustomer("Maria", "Soley");

		for (int i = 0; i < bank.getNumOfCustomers(); i++) {
			Customer customer = bank.getCustomer(i);
			System.out.println("Customer [" + (i + 1) + "] is "
					+ customer.getLastName() + ", " + customer.getFirstName());
		}
	}
}
