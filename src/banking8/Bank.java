package banking8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
	
	//当前 Bank 中有多个 Cutomer
public class Bank {
	private List<Customer> customers; 
	
	private Bank() {
		customers = new ArrayList<Customer>();
	}
	
	private static Bank instance = new Bank();
	
	public static Bank getBank(){
		return instance;
	}

	public void addCustomer(String firstName, String lastName){
		//1.根据传入的参数创建一个新的 Cusotmer 对象
		Customer cust = new Customer(firstName, lastName);
		
		customers.add(cust);
	}

	public int getNumOfCustomers(){
		return customers.size();
	}

	public Customer getCustomer(int index){
		return customers.get(index);
	}
	
	public Iterator<Customer> getCustomers(){
		return customers.iterator();
	}
}
