package day3_22march_111016_fs;

import java.util.Scanner;

public class ElectricityBill {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ElectricityBill e = new ElectricityBill();
		System.out.println("Enter your previous and current charge followed by unit cost");
		
		String previous = scan.nextLine();
		e.validator(previous);
		
		String current = scan.nextLine();
		e.validator(current);
		
		int cost = scan.nextInt();
		int n1 = Integer.parseInt(previous.substring(5));
		int n2 = Integer.parseInt(current.substring(5));
		
		System.out.println(UserMainCode.calculateElectricityBill(n1, n2, cost));
	}
	
	void validator(String num) {
		for(int i = 5; i<num.length(); i++) {
			char p = num.charAt(i);
			if(!Character.isDigit(p))
				throw new IllegalArgumentException("Last 5 inputs must be digits");
		}
	}
}
