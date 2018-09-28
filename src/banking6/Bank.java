package banking6;

public class Bank {
	private Customer[] customers;  //�������ͻ�
	private int numberOfCustomer;  //�û���
	private Bank() {    //�޸�Ϊ˽�У�����ʵ��Ӧ�Ǿ�̬����
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
