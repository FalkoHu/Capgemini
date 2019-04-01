package day7_28march_111016_fs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Main class for assignment 24
public class Main24 {
	
	
	public static void main(String[] args) {
		List<Customer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in).useDelimiter(System.lineSeparator());
		
		
		System.out.println("Enter the number of customers");
		
		int numOfCsutomer = scan.nextInt();
		for(int i = 0; i<numOfCsutomer; i++) {
			String data = scan.next();
			if(CustomerBO.validate(data)) {
				Customer cust = ContactBO.createCustomer(data);
				list.add(cust);
			}else {
				System.out.println("Invalid data");
			}
		}
		
		System.out.println("Enter type to sort"+
							"\n1.Name"+
							"\n2.Amount Spent"+
							"\n3.Rating");
		switch(scan.nextInt()) {
		case 1: 
			Main22.outputHeader();
			Collections.sort(list);
			for(Customer c : list)
				System.out.println(c);
			break;
		case 2:
			Main22.outputHeader();
			Collections.sort(list, new AmountComparator());
			for(Customer c : list)
				System.out.println(c);
			break;
		case 3:
			Main22.outputHeader();
			Collections.sort(list, new RatingComparator());
			for(Customer c : list)
				System.out.println(c);
			break;
		default : 
			System.out.println("Invalid Choice");
			break;
		}
	}
}
