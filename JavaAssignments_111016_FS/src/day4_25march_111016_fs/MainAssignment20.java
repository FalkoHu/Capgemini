package day4_25march_111016_fs;

import java.util.Scanner;

public class MainAssignment20 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useDelimiter(System.lineSeparator());
		
		System.out.println("Hotel Tariff Calculator \n");	
		
			System.out.println("1. Deluxe Room");
			System.out.println("2. Deluxe AC Room");
			System.out.println("3. Suite AC Room \n");
			System.out.println("Select Room Type");
			int roomType = scan.nextInt();
			System.out.println("Hotel Name:");
	 		String hotelName = scan.next();
	 		
	 		System.out.println("Room Square Feet Area:");	
	 		int roomSqFeet = scan.nextInt();
	 		
	 		System.out.println("Room has TV (yes/no):");
	 		boolean hasTv = false;
	 		String tv = scan.next();
	 		if(tv.toLowerCase().equals("yes")) {
	 			hasTv = true;
	 		}
	 		
	 		System.out.println("Room has Wifi (yes/no):");
 			boolean hasWifi = false;
	 		String wifi = scan.next();
	 		if(wifi.toLowerCase().equals("yes")) {
	 			hasWifi = true;
	 		}
			
			switch(roomType) {
				case 1: 
					 DeluxeRoom deluxeRoom = new DeluxeRoom(hotelName, roomSqFeet, hasTv, hasWifi);
					 System.out.println("Room tariff per day is: "+ deluxeRoom.caluclateTariff());
					 break;
				case 2: 
					 DeluxeACRoom deluxeACRoom = new DeluxeACRoom(hotelName, roomSqFeet, hasTv, hasWifi);
					 System.out.println("Room tariff per day is: "+ deluxeACRoom.caluclateTariff());
					break;
				case 3: 
					SuiteACRoom suite = new SuiteACRoom(hotelName, roomSqFeet, hasTv, hasWifi);	
					System.out.println("Room tariff per day is: "+ suite.caluclateTariff());
					break;
			}		
	}
}