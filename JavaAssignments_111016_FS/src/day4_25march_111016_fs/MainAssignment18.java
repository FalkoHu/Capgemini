package day4_25march_111016_fs;

import java.util.Scanner;

public class MainAssignment18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useDelimiter(System.lineSeparator());
		System.out.println("Enter the number of innings:");
		int numOfInnings = scan.nextInt();
		Innings[] innings = new Innings[numOfInnings];
		
		InningsBO ib = new InningsBO();
		for(int i = 0; i<numOfInnings; i++) {
			System.out.println("Enter innings " +(i+1) +" details");
			innings[i] = ib.createInnings(scan.next());
		}
		
		System.out.println("Enter the number of deliveries");
		int numOfDeliveries = scan.nextInt();
		Delivery[] delivery = new Delivery[numOfDeliveries];
		
		DeliveryBO db = new DeliveryBO();
		for(int i = 0; i<numOfDeliveries; i++) {
			System.out.println("Enter innings " +(i+1)+ " details");
			delivery[i] = db.createDelivery(scan.next(), innings);
		}
		db.setdArray(delivery);
		
		System.out.println("Enter the delivery number for which you need to find the innings number");
		System.out.println(db.findInningsNumber(innings, scan.nextLong()));
	}

}
