package day4_25march_111016_fs;

import java.util.Scanner;

public class MainAssignment16 {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number of Players");
		
		int numOfPlayers = scan.nextInt();
		Player[] player = new Player[numOfPlayers];
		
		for(int i = 0; i<numOfPlayers; i++) {
			System.out.println("Enter player " + (i+1)+" details");
			
			System.out.println("Enter player name");
			String name = scan.next();
			
			System.out.println("Enter country name");
			String country = scan.next();
			
			System.out.println("Enter skill");
			String skill = scan.next();
			Player p = new Player(name, country, new Skill(skill));
			player[i] = p;
		}
		
		boolean show = true;
		PlayerBO p = new PlayerBO();
		while(show) {
			System.out.println("Menu");
			System.out.println("1.View details");
			System.out.println("2.Filter players with skill");
			System.out.println("3.Exit");
			switch(scan.nextInt()) {
				case 1:
					System.out.println("Player \t \t Country \t  Skill");
					p.viewDetails(player);
					break;
				case 2: 
					System.out.println("Enter the skill");
					p.printPlayerDetailsWithSkill(player, scan.next());
					break;
				case 3: 
					System.exit(0);
			}
		}
	}
}
