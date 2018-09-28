package banking6;

public class Bank {
	private Customer[] customers;  //服务多个客户
	private int numberOfCustomer;  //用户数
	private Bank() {    //修改为私有，单个实例应是静态属性
		customers = new Customer[5];
	}
	private static Bank instance = new Bank();
	
	public static Bank getBank(){
		return instance;
	}
	public void addCustomer(String f, String l){
		Customer cust = new Customer(f, l);
		customers[numberOfCustomer] = cust;
		numberOfCustomer++;
	}
	public int getNumOfCustomers(){
		return numberOfCustomer;
	}
	public Customer getCustomer(int index){
		return customers[index];
	}
}
