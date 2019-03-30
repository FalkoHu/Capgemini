package day4_25march_111016_fs;

public class Match19 {
	//FOR ASSIGNMENT 19
	
		private String date;
		private String teamOne;
		private String teamTwo;
		private String venue;
		private Outcome outcome;

		public Match19(String date, String teamOne, String teamTwo, String venue, Outcome outcome) {
			super();
			this.date = date;
			this.teamOne = teamOne;
			this.teamTwo = teamTwo;
			this.venue = venue;
			this.outcome = outcome;
		}
		public Match19() {
			super();
		}
		
		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
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

		public void setOutcome(Outcome outcome) {
			this.outcome = outcome;
		}
		public Outcome getOutcome() {
			return outcome;
		}

		public String toString() {
			return String.format("%-15s %-15s %-15s %-15s %-30s",date,teamOne,teamTwo,venue,outcome);
		}
}
