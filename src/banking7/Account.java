package banking7;

public class Account{
	protected double balance; //当前余额
	
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

	public void withdraw(double amt){   //修改为VOID 抛出异常
		if(amt > balance){
			throw new OverdraftException("资金不足", amt - balance);
		}
		
		this.balance -= amt;
	}
}