package banking2;

public class Account{
	private double balance; //µ±«∞”‡∂Ó
	
	public Account(double init_balance){
		this.balance = init_balance;	
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void deposit(double amt){
		this.balance += amt;
	}

	public void withdraw(double amt){
		this.balance -= amt;
	}

}