package day4_25march_111016_fs;

public class DeliveryBO {

	private Delivery[] dArray;
	
	public Delivery createDelivery(String data, Innings[] inningsList) {
		Delivery d;
		String[] s = data.split(",");
		long deliveryNumber = Long.parseLong(s[0]);
		String batsman = s[1];
		String bowler = s[2];
		long runs = Long.parseLong(s[3]);
		long inningsNumber = Long.parseLong(s[4]);
		for(int i = 0;i<inningsList.length; i++) {
			if(inningsList[i].getInningsNumber() == inningsNumber) {
				return d = new Delivery(deliveryNumber, batsman, bowler, runs, inningsNumber, inningsList[i]);
			}
		}
		return null;
	}
	
	public String findInningsNumber(Innings[] inningsList, long deliveryNumber) {
			for(int j = 0; j<dArray.length; j++) {
				if(dArray[j].getDeliveryNumber() == deliveryNumber) {
					return Long.toString(dArray[j].getInnings().getInningsNumber());
				}
			}
		return null;
	}

	public void setdArray(Delivery[] dArray) {
		this.dArray = dArray;
	}
}
