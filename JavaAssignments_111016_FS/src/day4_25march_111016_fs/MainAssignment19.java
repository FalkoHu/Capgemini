package day4_25march_111016_fs;

import java.util.Scanner;

public class MainAssignment19 {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useDelimiter(System.lineSeparator());

		System.out.println("Enter number of matches");
		int numOfMatches = scan.nextInt();
		Match19[] match = new Match19[numOfMatches];
		MatchBO mb;
		
		for(int i = 0; i<numOfMatches; i++) {
			System.out.println("Enter match " + (i+1) + " details:");
			System.out.println("Enter match date");
			
			String date = scan.next();
			
			System.out.println("Enter team one");
			String team1 = scan.next();
			
			System.out.println("Enter team two");
			String team2 = scan.next();
			
			System.out.println("Enter venue");
			String venue = scan.next();
			
			System.out.println("Enter status");
			String status = scan.next();
			
			System.out.println("Enter winner Team");
			String winnerTeam = scan.next();
			match[i] = new Match19(date, team1, team2, venue, new Outcome(status, winnerTeam));
		}
		
		boolean menu = true;
		mb = new MatchBO();
		while(menu) {
			System.out.println("Menu");
			System.out.println("1.View match details");
			System.out.println("2.Filter match details with outcome status");
			System.out.println("3.Filter match details with outcome winner team");
			System.out.println("4.Exit");
			System.out.println("Enter your choice");
			
			switch(scan.nextInt()) {
				case 1: mb.printAllMatchDetails(match);
						break;
						
				case 2: System.out.println("Enter outcome status"); 
						mb.printMatchDetailsWithOutcomeStatus(match, scan.next());
						break;
						
				case 3: System.out.println("Enter outcome winner team");
				        mb.printMatchDetailsWithOutcomeWinnerTeam(match, scan.next());
				       break;
				       
				case 4: System.exit(0);        
			}
		}
		
	}
}
