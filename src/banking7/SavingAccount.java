package banking7;

public class SavingAccount extends Account{
	private double interestRate;//利率
	public SavingAccount(double init_balance,double interestRate){
		super(init_balance);//给父类构造器
		this.interestRate = interestRate;
	}
}
