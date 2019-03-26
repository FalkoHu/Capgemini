package Project;

public class Customer {
	
	private String name;
	private int SSN;
	private int balance;
	
	
	public Customer(String name, int SSN) {
		super();
		this.name = name;
		SSN = SSN;
		balance = 0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSSN() {
		return SSN;
	}
	public void setSSN(int sSN) {
		SSN = sSN;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	

}
