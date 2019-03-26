package Project;

import java.util.List;
import java.util.ArrayList;

public class Calculations {
	
	List<Customer> customer = new ArrayList<>();
	
	public void addCust(String name, int SSN) {
		customer.add(new Customer(name, SSN));
	}
	
	public void addMoney(Customer cust, int amount) {
		for(int i = 0; i<customer.size(); i++) {
			if(customer.get(i).getSSN() == cust.getSSN()) {
				customer.get(i).setBalance(amount);
				break;
			}
		}
	}
}