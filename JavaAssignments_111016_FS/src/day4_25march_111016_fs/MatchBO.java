package day4_25march_111016_fs;

public class MatchBO {

	public Match createMatch(String data, Team[] teamList) {
		String[] s = data.split(",");
		String date = s[0];
		String teamName = s[1];
		String opponentName = s[2];
		String stadium = s[3];
		Team team1 = null;
		Team team2 = null;
		
		
		for(int i = 0; i<teamList.length; i++) {
			if(teamList[i].getName().equals(teamName)) {
					team1 = teamList[i];
			}
			if(teamList[i].getName().equals(opponentName)) {
				team2 = teamList[i];
			}
		}
		if(team1 != null && team2 != null) {
			Match m = new Match(date, team1, team2, stadium);
			return m;
		}
		return null;
	}
	
	public String findTeam(String matchDate, Match[] matchList) {
		for(int i = 0; i<matchList.length; i++) {
			if(matchList[i].getDate().equals(matchDate)) {
				return matchList[i].getTeamone().getName() + " , " + matchList[i].getTeamtwo().getName();
			}
		}
		return null;
	}
	
	public void findAllMatchesOfTeam(String teamName, Match[] matchList) {
		for(int i = 0; i<matchList.length; i++) {
			if(matchList[i].getTeamone().getName().equals(teamName)) {
				System.out.println(matchList[i].toString());
			}
			if(matchList[i].getTeamtwo().getName().equals(teamName)) {
				System.out.println(matchList[i].toString());
			}
		}
	}
}
