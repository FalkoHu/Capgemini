package day4_25march_111016_fs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainAssignment17 {

	static Scanner scan = new Scanner(System.in).useDelimiter(System.lineSeparator());
	static boolean show = true;
	
	public static void main(String[] args) {
		
		System.out.println("Enter number of Players");
		
		int numOfPlayers = scan.nextInt();
		Player[] player = new Player[numOfPlayers];
		
		for(int i = 0; i<numOfPlayers; i++) {
			System.out.println("Enter player " + (i+1)+" details");
			PlayerBO playerBo = new PlayerBO();
			player[i] = playerBo.createPlayer(scan.next());
		}
		
		System.out.println("Enter the team count");
		int numOfTeams = scan.nextInt();
		
		Team[] team = new Team[numOfTeams];
		for(int i = 0; i<numOfTeams; i++) {
			System.out.println("Enter team " + (i+1)+" details");			
			TeamBO t = new TeamBO();
			team[i] = t.createTeam(scan.next(), player);
		}
		
		System.out.println("Enter match count");
		int numOfMatches = scan.nextInt();
		Match[] match = new Match[numOfMatches];
		for(int i = 0; i<match.length; i++) {
			System.out.println("Enter match "+(i+1)+"details");
			MatchBO matchBo = new MatchBO();
			match[i] = matchBo.createMatch(scan.next(), team);
		}

		MatchBO mb;
		while(show) {
			System.out.println("Menu");
			System.out.println("1. Find Team");
			System.out.println("2. Find All Matches in A Specific Team");
			
			switch(scan.nextInt()) {
				case 1 : mb = new MatchBO();
						System.out.println("Enter match date");
						mb.findTeam(scan.next(), match);
						cont();
						break;
						
				case 2 : mb = new MatchBO();
				System.out.println("Enter team name");
						mb.findAllMatchesOfTeam(scan.next(), match);
						cont();
						break;
				
				default : System.out.println("invalid entry");
			
			}
		}
			
	}
	static void cont() {
		System.out.println("Do you want to continue? Type Yes or No");
		if(scan.next().toLowerCase().equals("no"))
			show = false;
	}
	
}
