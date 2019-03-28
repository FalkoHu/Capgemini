package day4_25march_111016_fs;

public class Delivery {
	
	private long deliveryNumber;
	private String batsman;
	private String bowler;
	private long runs;
	private long inningsNumber;
	private Innings innings;
	
	public Delivery() {
		super();
	}
	
	public Delivery(long deliveryNumber, String batsman, String bowler, long runs, long inningsNumber,
			Innings innings) {
		super();
		this.deliveryNumber = deliveryNumber;
		this.batsman = batsman;
		this.bowler = bowler;
		this.runs = runs;
		this.inningsNumber = inningsNumber;
		this.innings = innings;
	}
	public long getDeliveryNumber() {
		return deliveryNumber;
	}
	public void setDeliveryNumber(long deliveryNumber) {
		this.deliveryNumber = deliveryNumber;
	}
	public String getBatsman() {
		return batsman;
	}
	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}
	public String getBowler() {
		return bowler;
	}
	public void setBowler(String bowler) {
		this.bowler = bowler;
	}
	public long getRuns() {
		return runs;
	}
	public void setRuns(long runs) {
		this.runs = runs;
	}
	public long getInningsNumber() {
		return inningsNumber;
	}
	public void setInningsNumber(long inningsNumber) {
		this.inningsNumber = inningsNumber;
	}
	public Innings getInnings() {
		return innings;
	}
	public void setInnings(Innings innings) {
		this.innings = innings;
	}
}
