package day7_28march_111016_fs;

import java.util.Date;
import java.util.Scanner;
//Main class for assignment 23
public class Main23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useDelimiter(System.lineSeparator());
		System.out.println("1.Validate Age\n2.Validate Name\n3.Lucky Customer");
		System.out.println("Enter your choice");
		switch(scan.nextInt()) {
			case 1:
				System.out.println("Enter birthdate");
				String[] s = scan.next().split("-");
				if(CustomerTableBooking.validateAge(new Date(Integer.parseInt(s[2])-1900, Integer.parseInt(s[1])-1, Integer.parseInt(s[0]))))
					System.out.println("Age is valid");
				else
					System.out.println("Age is invalid");
				break;
			case 2: 
				System.out.println("Enter name");
				if(CustomerTableBooking.validateName(scan.next()))
					System.out.println("Name is valid");
				else
					System.out.println("Name is invalid");
				break;
			case 3:
				System.out.println("Enter mobile number");
				if(CustomerTableBooking.validateLuckyCustomer(scan.next()))
					System.out.println("Lucky Customer");
				else
					System.out.println("Unlucky Customer");
				break;
		}
	}
}
