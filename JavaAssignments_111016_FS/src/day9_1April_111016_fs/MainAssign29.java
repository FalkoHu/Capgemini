package day9_1April_111016_fs;

import java.util.Scanner;

public class MainAssign29 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
			System.out.println("Enter the total runs scored");
			int totalRunScored = scan.nextInt();
			
			System.out.println("Enter the total overs faced");
			int totalOversFaced = scan.nextInt();
			
			if(totalOversFaced < 0 || totalOversFaced >= 20) {
				try {
					throw new OverRangeException("Over is not in the specified range");
				} catch (OverRangeException e) {
					System.out.println(e);
				}
			}
			double runRate = totalRunScored / totalOversFaced;
			System.out.println(runRate);
		}
	}

