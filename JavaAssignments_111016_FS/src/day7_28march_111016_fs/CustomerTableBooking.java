package day7_28march_111016_fs;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.regex.Pattern;

public class CustomerTableBooking {

	static boolean validateAge(java.util.Date birth) {
	    LocalDate bdate = birth.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	    LocalDate today = LocalDate.of(2018, 01, 01);
	    if(Period.between(bdate, today).getYears() >= 18) 
	    	return true;
		return false;
	}
	
	static boolean validateName(String name) {
		return (Pattern.matches("^[a-zA-Z]+$", name));
	}
	
	static boolean validateLuckyCustomer(String mobile) {
		char[] letter = mobile.toCharArray();
		for(char c : letter) {
			if(!Character.isDigit(c))
				return false;
		}
		
		char[] num = mobile.toCharArray();
		int count = 0;
		for(char c : num) {
			count += Integer.parseInt(String.valueOf(c));
		}
		int lastDigit = count % 10;
		int firstDigit = count / 10;
		int newCount = lastDigit + firstDigit;
		if((newCount/10) == 1)
			return true;
		return false;
	}
}
