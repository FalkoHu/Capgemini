package day4_25march_111016_fs;

public class HotelRoom {

	protected String hotelName;
	protected int numberOfSqFeet;
	protected boolean hasTV;
	protected boolean hasWifi;
	
	public HotelRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super();
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
	}
	
	public int caluclateTariff() {
		return this.numberOfSqFeet * getRatePerSqFeet();
	}
	
	public int getRatePerSqFeet() {
		return 0;
	}
}