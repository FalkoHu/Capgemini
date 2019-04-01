package day7_28march_111016_fs;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Date;

public class Main26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<BookingAssign26> list = new ArrayList<>(0);
		Map<Date, Double> map;
		
		
		System.out.println("Enter numbers of booking details");
		int numOfBookings = scan.nextInt();
		
		for(int i = 0; i<numOfBookings; i++) {
			list.add(BookingAssign26.createBookingAssign26(scan.next()));
		}
		map = BookingAssign26.calculateDayBilling(list);
		System.out.format("%-20s %s\n","Date","Amount");
		
		for (Map.Entry<Date, Double> entry : map.entrySet()) {
			System.out.format("%-20s %s\n",new SimpleDateFormat("dd-MM-yyyy").format(entry.getKey()),entry.getValue());
		}
	}
}
