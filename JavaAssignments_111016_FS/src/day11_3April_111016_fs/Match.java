package day11_3April_111016_fs;

import java.util.List;

public class Match {

	private String teamOne;
	private String teamTwo;
	private String venue;
	private String matchDate;
	
	
	public Match() {
		super();	
	}
	public Match(String teamOne, String teamTwo, String venue, String matchDate) {
		super();
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
		this.venue = venue;
		this.matchDate = matchDate;
	}
	
	void displayMatch(List<Match> list, int matchNum){
		System.out.println("Match "+(matchNum+1));
		System.out.println("TeamOne: "+list.get(matchNum).getTeamOne());
		System.out.println("TeamOne: "+list.get(matchNum).getTeamTwo());
		System.out.println("TeamOne: "+list.get(matchNum).getVenue());
		System.out.println("TeamOne: "+list.get(matchNum).getMatchDate());
	}
	
	
	
	
	public String getTeamOne() {
		return teamOne;
	}
	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}
	public String getTeamTwo() {
		return teamTwo;
	}
	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getMatchDate() {
		return matchDate;
	}
	public void setMatchDate(String matchDate) {
		this.matchDate = matchDate;
	}
}
