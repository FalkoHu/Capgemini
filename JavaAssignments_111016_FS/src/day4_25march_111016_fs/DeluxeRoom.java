package day4_25march_111016_fs;

public class DeluxeRoom extends HotelRoom{
	
	protected int ratePerSqFeet;

	public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 10;
	}

	@Override
	public int getRatePerSqFeet() {
		if(this.hasWifi) 
			return ratePerSqFeet+2;
		return ratePerSqFeet;
	}
}

class DeluxeACRoom extends DeluxeRoom{

	public DeluxeACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 12;
	}
}

class SuiteACRoom extends HotelRoom{
	private int ratePerSqFeet;

	public SuiteACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 15;
	}

	@Override
	public int getRatePerSqFeet() {
		if(this.hasWifi) 
			return ratePerSqFeet + 2;
		
		return ratePerSqFeet;
	}
	
	
}