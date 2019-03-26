package day3_22march_111016_fs;

import java.util.Scanner;

public class PasswordValidation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a password: ");
		
		int res = UserMainCode.validatePassword(scan.nextLine());
		if(res == -1)
			System.out.println("Invalid Password");
		else
			System.out.println("Valid password");
	}
}