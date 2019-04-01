package day7_28march_111016_fs;

//MAIN FOR ASSIGNMENT 21
//USE - ON THE FIRST INPUT OF DATE
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the details of Customer 1:");
		String customer1 = scan.next();
		System.out.println("Enter the details of Customer 2:");
		String customer2 = scan.next();
	
		Customer cust1 = ContactBO.createCustomer(customer1);
		Customer cust2 = ContactBO.createCustomer(customer2);
		
		System.out.println("\nDetails of customer 1:\n"+cust1.toString21());
		System.out.println("\nDetails of customer 2:\n"+cust2.toString21());
		if(cust1.equals(cust2)) {
			System.out.println("Customer 1 is the same as Customer 2");
		}else {
			System.out.println("Customer 1 and Customer 2 are different");
		}
	}
	
}