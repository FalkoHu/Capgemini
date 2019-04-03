package day9_1April_111016_fs;

import java.util.Scanner;

public class CustomException {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useDelimiter(System.lineSeparator());
		
			System.out.println("Enter number of players");
			int numOfPlayers = scan.nextInt();
			
			int[] playerId = new int[numOfPlayers];
			String[] playerName = new String[numOfPlayers];
			
			System.out.println("Enter team name");
			String teamName = scan.next();
			
			for(int i = 0; i<numOfPlayers; i++) {
				System.out.println("Enter player "+(i+1)+" details");
				int temp = scan.nextInt();
				for(int j = 0; j<numOfPlayers; j++) {
					if(playerId[j] == temp){
						try {
							throw new DuplicateIdException("Player id must be unique");
						} catch (DuplicateIdException e) {
							System.out.println(e);
						}
					}
				}
				playerId[i] = temp;
				scan.nextLine();
				playerName[i] = scan.next();
				
			}
			
			System.out.println(teamName);
			for(int i = 0; i<numOfPlayers; i++) {
				System.out.println(playerId[i]);
				System.out.println(playerName[i]);
			}
	}

}
