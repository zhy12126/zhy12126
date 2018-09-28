package banking7;

public class Account{
	protected double balance; //��ǰ���
	
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

	public void withdraw(double amt){   //�޸�ΪVOID �׳��쳣
		if(amt > balance){
			throw new OverdraftException("�ʽ���", amt - balance);
		}
		
		this.balance -= amt;
	}
}