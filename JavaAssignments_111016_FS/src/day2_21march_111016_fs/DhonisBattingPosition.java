package day2_21march_111016_fs;

import java.util.Scanner;

public class DhonisBattingPosition {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of overs");
		int currentOvers = scan.nextInt();
		System.out.println("Enter the number of balls played");
		int numOfBalls = scan.nextInt();
		System.out.println("Enter total numbers of overs");
		
		System.out.println(result(totalOverBalls(currentOvers, numOfBalls),scan.nextInt()));
	}
	
	static int totalOverBalls(int currentOvers, int numOfBalls) {
		return (currentOvers*6) + numOfBalls;
	}
	
	static String result(int totalOver, int oversPlayed) {
		if((oversPlayed*6) > (0.75)*totalOver)
			return "Yes";	
		return "No";
	}
	
}
