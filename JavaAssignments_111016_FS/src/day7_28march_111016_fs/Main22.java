package day7_28march_111016_fs;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main22 {
//FOR ASSIGNMENT 22
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Customer> custList = new ArrayList<>();
		
		System.out.println("Enter the number of customers");
		int numberOfCustomers = scan.nextInt();
		
		for(int i = 0; i<numberOfCustomers; i++) {
			System.out.println("Enter customer "+(i+1)+" details");
			custList.add(ContactBO.createCustomer(scan.next()));
		}

			System.out.println("1. By name\n2.By birth date\nBy rating");
			
			switch(scan.nextInt()) {

				case 1: 
					System.out.println("Enter name of customer to be searched");
					String name = scan.next();
					List<Customer> customerN = ContactBO.findCustomer(custList, name);
					if(customerN == null) {
						System.out.println("No customer by that name");
					}
					else {
						outputHeader();
						printList(customerN);
					}
					break;
				case 2: 
					System.out.println("Enter the birthday of customer to be searched");
					String[] d = scan.next().split("-");
					Date date = new Date(Integer.parseInt(d[2]) - 1900, Integer.parseInt(d[0]) -1, Integer.parseInt(d[1]));
					List<Customer> customerD = ContactBO.findCustomer(custList, date);
					if(customerD ==  null) {
						System.out.println("No customer with that birthday");
					}else {
						outputHeader();
						printList(customerD);
					}
					break;
				case 3:
					System.out.println("Enter the rating of the customer to be searched");
					double rating = scan.nextDouble();
					List<Customer> customerR = ContactBO.findCustomer(custList, rating);
					if(customerR == null) {
						System.out.println("No customer with that rating");
					}else {
						outputHeader();
						printList(customerR);
					}
			}
	}
	
	static void outputHeader() {
		System.out.format("%-5s %-15s %-15s %-15s %-20s %-15s %-15s %s\n", "Id","Name","Mobile Number","Date of Birth","Average spent amount","Total amount","Date Enrolled","Rating");
	}
	
	static void printList(List<Customer> list) {
		for(Customer c : list) {
			System.out.println(c);
		}
	}

}
