package day4_25march_111016_fs;

public class Outcome {

	private String status;
	private String winnerTeam;
	
	public Outcome(){
		super();
	}
	
	public Outcome(String status, String winnerTeam) {
		super();
		this.status = status;
		this.winnerTeam = winnerTeam;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getWinnerTeam() {
		return winnerTeam;
	}
	public void setWinnerTeam(String winnerTeam) {
		this.winnerTeam = winnerTeam;
	}

	@Override
	public String toString() {
		return String.format("%-15s %-15s", status, winnerTeam);
	}
	
	
}
