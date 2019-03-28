package day4_25march_111016_fs;

public class Match {
	private String date;
	private Team teamOne;
	private Team teamTwo;
	private String venue;

	//FOR ASSIGNMNET 17
	public Match(String date, Team teamone, Team teamtwo, String venue) {
		super();
		this.date = date;
		this.teamOne = teamone;
		this.teamTwo = teamtwo;
		this.venue = venue;
	}

	

	public Match() {
		super();
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Team getTeamone() {
		return teamOne;
	}

	public void setTeamone(Team teamone) {
		this.teamOne = teamone;
	}

	public Team getTeamtwo() {
		return teamTwo;
	}

	public void setTeamtwo(Team teamtwo) {
		this.teamTwo = teamtwo;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	@Override
	public String toString() {
		String s = String.format("%-15s %-15s %-15s %s", date, teamOne, teamTwo, venue);
		return s;
	}
}