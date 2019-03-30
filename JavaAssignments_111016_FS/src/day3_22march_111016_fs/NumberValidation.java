package day3_22march_111016_fs;

import java.util.Scanner;

public class NumberValidation {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your 10 digit number XXX-XXX-XXXX");
		int res = UserMainCode.validateNumber(scan.nextLine());
		if(res == 1) 
			System.out.println("Valid number format");
		else
			System.out.println("Invalid number format");
	}
}
