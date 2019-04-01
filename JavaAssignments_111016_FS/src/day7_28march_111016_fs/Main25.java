package day7_28march_111016_fs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//MAIN METHOD FOR ASSIGNMENT 25
public class Main25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Table> tableList = new ArrayList<>();
		List<Booking> bookingList = new ArrayList<>();
		
		System.out.println("Enter the number of tables");
		int numberOfTables = scan.nextInt();
		for(int i = 0; i<numberOfTables; i++) {
			tableList.add(Table.createTable(scan.next()));
		}
		boolean continueBooking = true;
		while(continueBooking) {
			System.out.println("Enter the booking details");
			Booking.createBooking(tableList, bookingList, scan.next());
			System.out.println("Do you want to continue (yes/no)");
			
			switch(scan.next()){
				case "yes" : break;
				case "no" : continueBooking = false; 
							break;
				default: System.out.println("Invalid Input");
							break;
			}
		}
	}
}
