package day7_28march_111016_fs;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContactBO {
	static private List<Customer> newList;
	
	static Customer createCustomer(String line) {
		String[] input = line.split(",");
		long id = Long.parseLong(input[0]);
		
		String name = input[1];
		String mobileNumber = input[2];
		String[] date1 = input[3].split("-");
		int day = Integer.parseInt(date1[0]);
		int month = Integer.parseInt(date1[1])-1;
		int year = Integer.parseInt(date1[2]) - 1900; 
		double averageSpendAmount = Double.parseDouble(input[4]);
		double totalAmount = Double.parseDouble(input[5]);
		String[] date2 = input[6].split("-");
		int day2 = Integer.parseInt(date2[0]);
		int month2 = Integer.parseInt(date2[1]) -1;
		int year2 = Integer.parseInt(date2[2]) - 1900;
		double rating = Double.parseDouble(input[7]);
		
		Date birthdate = new Date(year,month,day);
		Date dateEnrolled = new Date(year2, month2, day2);
		
		return new Customer(id,name,mobileNumber,birthdate,averageSpendAmount,totalAmount,dateEnrolled, rating);
	}
	
	static List<Customer> findCustomer(List<Customer> customerList, String name){
		newList = new ArrayList<>();
		for(int i = 0; i<customerList.size(); i++) {
			if(customerList.get(i).getName().equals(name))
				newList.add(customerList.get(i));
		}
		if(newList.size() != 0)
			return newList;
		return null;
	}
	
	static List<Customer> findCustomer(List<Customer> customerList, Date birth){
		newList = new ArrayList<>();
		for(int i = 0; i<customerList.size(); i++) {
			if(customerList.get(i).getBirthdate().equals(birth))
				newList.add(customerList.get(i));
		}
		if(newList.size() != 0)
			return newList;
		return null;
	}
	
	static List<Customer> findCustomer(List<Customer> customerList, double rating){
		newList = new ArrayList<>();
		for(int i = 0; i<customerList.size(); i++) {
			if(customerList.get(i).getRating() == rating)
				newList.add(customerList.get(i));
		}
		if(newList.size() != 0)
			return newList;
		return null;
	}
}
