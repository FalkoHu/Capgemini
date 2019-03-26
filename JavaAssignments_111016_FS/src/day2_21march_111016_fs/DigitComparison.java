package day2_21march_111016_fs;

import java.util.Scanner;

public class DigitComparison {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your two numbers : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println(UserMainCode.compareLastDigit(num1, num2));
	}
}

