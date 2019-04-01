package day7_28march_111016_fs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer implements Comparable<Customer>{

	
	private long id;
	private String name;
	private String mobileNumber;
	private Date birthdate;
	private double avergaeSpendAmount;
	private double totalAmount;
	private Date dateEnrolled;
	private double rating;
	
	public Customer() {
		super();
	}
	
	public Customer(long id, String name, String mobileNumber, Date birthdate, double avergaeSpendAmount, double totalAmount,
			Date dateEnrolled, double rating) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.birthdate = birthdate;
		this.avergaeSpendAmount = avergaeSpendAmount;
		this.totalAmount = totalAmount;
		this.dateEnrolled = dateEnrolled;
		this.rating = rating;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public double getAvergaeSpendAmount() {
		return avergaeSpendAmount;
	}
	public void setAvergaeSpendAmount(double avergaeSpendAmount) {
		this.avergaeSpendAmount = avergaeSpendAmount;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Date getDateEnrolled() {
		return dateEnrolled;
	}
	public void setDateEnrolled(Date dateEnrolled) {
		this.dateEnrolled = dateEnrolled;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}

	//toString() method for assignment 21
	public String toString21() {
		return "Id:\"" + id + "\" \nName:\"" + name + "\" \nMobileNumber:\"" + mobileNumber + "\" \nDate of Birth: \"" + birthdate
				+ "\" \nAvergae Spend Amount:\"" + avergaeSpendAmount + "\" \nTotal amount:\"" + totalAmount + "\" \nDate Enrolled\""
				+ dateEnrolled + "\" \nRating:" + rating + "\"";
	}

	@Override
	public boolean equals(Object obj) {
		Customer other = (Customer)obj;
		if(this.name.equals(other.getName()) && this.mobileNumber.equals(other.getMobileNumber()) && this.birthdate.equals(other.getBirthdate())){
			return true;
		}
		return false;
	}
	
	//toString method used for Assignment 22 & 24
	@Override
	public String toString() {
		String output = String.format("%-5s %-15s %-15s %-15s %-20s %-15s %-15s %s\n", this.id, this.name, this.mobileNumber, 
				new SimpleDateFormat("dd-MM-yyyy").format(this.birthdate), this.avergaeSpendAmount,
				this.totalAmount, new SimpleDateFormat("dd-MM-yyyy").format(this.dateEnrolled), this.rating);
		return output;
	}
	
	//ASSIGNMENT 24
	@Override
	public int compareTo(Customer o) {
		return this.name.compareTo(o.getName());
	}
}