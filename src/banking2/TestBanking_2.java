package banking2;

public class TestBanking_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer;
		customer = new Customer("Jane","Smith");
		System.out.println("Creating the customer "+customer.getFirstName()+" "+customer.getLastName());
		//Account account;
		//account= new Account(500);
		//customer.setAccount(account);
		customer.setAccount(new Account(500));
		System.out.println("Creating her account with a 500.00 balance. ");
		customer.getAccount().withdraw(150);
		customer.getAccount().deposit(22.5);
		customer.getAccount().withdraw(47.62);
		System.out.println("Withdraw 150.00\nDeposit 22.50\nWithdraw 47.62 ");
		System.out.println("Customer ["+customer.getFirstName()+"," +
				""+customer.getLastName()+"] has a balance of "+customer.getAccount().getBalance());
			
	}

}
