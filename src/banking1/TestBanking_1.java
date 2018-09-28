package banking1;

public class TestBanking_1 {

	  public static void main(String[] args) {
	    Account  account;
        account = new Account(500);
        System.out.println("Creating an account with a 500.00 balance.");
	    
	    System.out.println("Withdraw 150.00");
	    account.withdraw(150);
	    
	    System.out.println("Deposit 22.50");
	    account.deposit(22.50);
	    
	    System.out.println("Withdraw 47.62");
	    account.withdraw(47.62);

	    System.out.println("The account has a balance of " + account.getBalance());
	  }
}

