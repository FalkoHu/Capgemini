package day7_28march_111016_fs;

import java.util.Date;
import java.util.List;

public class Booking {

	private long id;
	private String customerName;
	private Table table;
	private int membersPresent;
	private double billAmount;
	private Date bookingTime;
	
	public Booking() {
		super();
	}
	
	public Booking(long id, String customerName, Table table, int membersPresent, double billAmount, Date bookingTime) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.table = table;
		this.membersPresent = membersPresent;
		this.billAmount = billAmount;
		this.bookingTime = bookingTime;
	}
	//ASSIGNMENT 25
	static void createBooking(List<Table> tableList, List<Booking> bookingList, String line) {
		boolean isBooked = false, tableExists = false;
		String[] values = line.split(",");
		Table newTable = null;
		for(Booking b : bookingList) {
				if(b.getTable().getNumber() == Integer.parseInt(values[2])) {
					isBooked = true;
				}
		}
		for(Table t : tableList) {
			if(t.getNumber() == Integer.parseInt(values[2])) {
				tableExists = true;
				newTable = t;
			}
		}
		if(tableExists && isBooked == false){
			String[] date = values[5].split("-");
			bookingList.add(new Booking(Integer.parseInt(values[0]),values[1],newTable, Integer.parseInt(values[3]),
					Double.parseDouble(values[4]),new Date(Integer.parseInt(date[2])-1900, Integer.parseInt(date[1])-1, Integer.parseInt(date[0]))));
			System.out.println("Table sucessfully booked");
			tableList.remove(newTable);
		}		
		else {
				System.out.println("Sorry the table is not available\nThe available tables are:\n");
				System.out.format("%-5s %-10s %s\n","ID","Number","Capacity\n"+tableList.toString().replace("[", "").replace("]", ""));
		}
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
	public Table getTable() {
		return table;
	}
	public void setTable(Table table) {
		this.table = table;
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
