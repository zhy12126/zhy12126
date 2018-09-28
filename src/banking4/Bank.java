package banking4;

public class Bank {
	private Customer[] customers;  //服务多个客户
	private int numberOfCustomer;  //用户数
	public Bank() {
		customers = new Customer[5];
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
