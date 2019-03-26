package day4_25march_111016_fs;

public class Match {
	private String date;
	private Team teamone;
	private Team teamtwo;
	private String venue;

	
	
	public Match(String date, Team teamone, Team teamtwo, String venue) {
		super();
		this.date = date;
		this.teamone = teamone;
		this.teamtwo = teamtwo;
		this.venue = venue;
	}

	

	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public Team getTeamone() {
		return teamone;
	}



	public void setTeamone(Team teamone) {
		this.teamone = teamone;
	}



	public Team getTeamtwo() {
		return teamtwo;
	}



	public void setTeamtwo(Team teamtwo) {
		this.teamtwo = teamtwo;
	}



	public String getVenue() {
		return venue;
	}



	public void setVenue(String venue) {
		this.venue = venue;
	}



	@Override
	public String toString() {
		String s = String.format("%-15s %-15s %-15s %s", date, teamone, teamtwo, venue);
		return s;
	}
	
	
	
	
}
