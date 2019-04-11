package day11_3April_111016_fs;

public class Player implements Comparable<Player>{

	private int capNumber;
	private String playerName;
	private String skill;
	private String country;
	private int matchesPlayed;
	
	public Player() {
		super();
	}
	public Player(int capNumber, String playerName, String skill, String country, int matchesPlayed) {
		super();
		this.capNumber = capNumber;
		this.playerName = playerName;
		this.skill = skill;
		this.country = country;
		this.matchesPlayed = matchesPlayed;
	}
	public int getCapNumber() {
		return capNumber;
	}
	public void setCapNumber(int capNumber) {
		this.capNumber = capNumber;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getMatchesPlayed() {
		return matchesPlayed;
	}
	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	@Override
	public int compareTo(Player o) {
		if(this.capNumber > o.getCapNumber())
			return 1;
		else if(this.capNumber == o.getCapNumber())
			return 0;
		return -1;
	}
	@Override
	public String toString() {
		return capNumber + "," + playerName + "," + skill + ","
				+ country + "," + matchesPlayed+"\n";
	}

	
	
	
}
