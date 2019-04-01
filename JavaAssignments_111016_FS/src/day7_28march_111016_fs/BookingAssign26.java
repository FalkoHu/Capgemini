package day7_28march_111016_fs;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BookingAssign26 {

	private long id;
	private String customerName;
	private int tableNumber;
	private int membersPresent;
	private double billAmount;
	private Date bookingTime;

	public BookingAssign26() {
		super();
	}
	
	public BookingAssign26(long id, String customerName, int tableNumber, int membersPresent, double billAmount,
			Date bookingTime) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.tableNumber = tableNumber;
		this.membersPresent = membersPresent;
		this.billAmount = billAmount;
		this.bookingTime = bookingTime;
	}
	
	//ASSIGNMENT 26
		static Map<Date, Double> calculateDayBilling(List<BookingAssign26> bookings){
			Map<Date, Double> map = new TreeMap<>();
			for(BookingAssign26 b : bookings) {
				map.put(b.getBookingTime(), b.getBillAmount());
			}
			return map;
		}
		//ASSIGNMENT 26
		static BookingAssign26 createBookingAssign26(String data){
			String[] values = data.split(",");
			String[] date = values[5].split("-");
			return new BookingAssign26(Integer.parseInt(values[0]),values[1],Integer.parseInt(values[2]), Integer.parseInt(values[3]),
					Double.parseDouble(values[4]),new Date(Integer.parseInt(date[2])-1900, Integer.parseInt(date[1])-1, Integer.parseInt(date[0])));
		}

		@Override
		public String toString() {
			return String.format("%-200s %s", new SimpleDateFormat("dd-MM-yyyy").format(this.bookingTime), this.billAmount+"\n");
		}

		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public int getTableNumber() {
			return tableNumber;
		}
		public void setTableNumber(int tableNumber) {
			this.tableNumber = tableNumber;
		}
		public int getMembersPresent() {
			return membersPresent;
		}
		public void setMembersPresent(int membersPresent) {
			this.membersPresent = membersPresent;
		}
		public double getBillAmount() {
			return billAmount;
		}
		public void setBillAmount(double billAmount) {
			this.billAmount = billAmount;
		}
		public Date getBookingTime() {
			return bookingTime;
		}
		public void setBookingTime(Date bookingTime) {
			this.bookingTime = bookingTime;
		}
}

