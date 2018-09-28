package banking5;

public class Account{
	protected double balance; //µ±«∞”‡∂Ó
	
	public Account(double init_balance){
		this.balance = init_balance;	
	}
	
	public double getBalance(){
		return balance;
	}
	
	public boolean deposit(double amt){
		this.balance += amt;
		return true;
	}

	public boolean withdraw(double amt){
		if(amt<=balance){
		this.balance -= amt;
		return true;
	}
		else
			return false;}
}