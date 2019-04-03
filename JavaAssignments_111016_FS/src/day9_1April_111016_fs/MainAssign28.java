package day9_1April_111016_fs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainAssign28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useDelimiter(System.lineSeparator());
		Player player;
		Player captain = null;
		List<Player> pList = new ArrayList<>();
		PlayerBO pBo = new PlayerBO();
		
		System.out.println("Enter the number of players");
		int numOfPlayers = scan.nextInt();
		
		System.out.println("Do you know the details of the captain? Type Yes / No" );
		String cap = scan.next();
		
		switch(cap.toLowerCase()) {
			case "yes" : 
					captain = new Player();
					System.out.println("Enter name of the captain");
					captain.setName(scan.next());
					
					System.out.println("Enter country of the captain");
					captain.setCountry(scan.next());
					
					System.out.println("Enter skillset of the captain");
					captain.setSkill(scan.next());
					break;
					
			case "no" :
					break;
					
			default : System.out.println("Not valid input");
		}
	
		for(int i =0; i<numOfPlayers; i++) {
			player = new Player();
			System.out.println("Enter name of the player");
			player.setName(scan.next());
			
			System.out.println("Enter country of the player");
			player.setCountry(scan.next());
			
			System.out.println("Enter skillset of the player");
			player.setSkill(scan.next());
			pList.add(player);
		}
		pBo.displayPlayerDetails(captain, pList);
	}
	
}
