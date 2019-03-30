package day4_25march_111016_fs;

public class TeamBO {

	public Team createTeam(String data, Player[] playerList) {
		String[] s = data.split(",");
		String name = s[0];
		String player = s[1];
		for(int i = 0; i<playerList.length; i++) {
			if(playerList[i].getName().equals(player)) {
				Team t = new Team(name, playerList[i]);
				return t;
			}
		}
		return null;
	}
}
