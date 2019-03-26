package day2_21march_111016_fs;

import java.util.Scanner;

public class BattingKeeping {
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		BattingKeeping b = new BattingKeeping();	
		
		System.out.println(b.isCoachAvailable(b.question()));
	}
	
	public String question() {
		System.out.println("Is the coach available, Yes or No?");
		return scan.nextLine();
	}
	
	public String isCoachAvailable(String answer) {
		switch(answer.toLowerCase()) {
			case "yes" : 
				return "Keeping";
			case "no" :
				return "Batting";
			default : 
				return "Invalid Input"; 
		}
	}	
}