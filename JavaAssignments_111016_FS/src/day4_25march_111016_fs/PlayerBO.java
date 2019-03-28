package day4_25march_111016_fs;

public class PlayerBO {

	public void viewDetails(Player[] playerList) {
		for(int i = 0; i<playerList.length; i++) {
			System.out.println(playerList[i].toString());
		}
	}
	
	public void printPlayerDetailsWithSkill(Player[] playerList, String skill) {
		boolean found = false;
		for(int i = 0; i<playerList.length; i++) {
			if(playerList[i].getSkill().getSkillName().equals(skill)) {
				System.out.println(playerList[i].toString());
				found = true;
			}
		}
		if(!found) {
			System.out.println("Skill Not Found");
		}
	}
	
	
	//ASSIGNMENT 17
	public Player createPlayer(String data) {
		String[] s = data.split(",");
		String s1 = s[0];
		String s2 = s[1];
		String s3 = s[2];
		Player player = new Player(s1, s2, new Skill(s3));
		return player;
	}

	
}