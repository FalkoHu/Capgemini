package day7_28march_111016_fs;

import java.util.regex.Pattern;

public class CustomerBO {
	
	public static boolean validate(String data) {
		String[] input = data.split(",");
		if(validateNumber(input[0]) && validateString(input[1]) && validatePhone(input[2]) && validateDate(input[3]) && 
				validateDouble(input[4]) && validateDouble(input[5]) && validateDate(input[6]) && 
				validateDouble(input[7])){
			return true;
		}
		return false;
	}

	private static boolean validateNumber(String input) {
		return (Pattern.matches("^[0-9]+$", input));
	}
	private static boolean validateDouble(String input) {
		return (Pattern.matches("^[0-9]+[.]*[0-9]*$", input));		
	}

	private static boolean validateDate(String input) {
		return (Pattern.matches("^[0-9]{2}[-]{1}[0-9]{2}[-]{1}[0-9]{4}$", input));
	}

	private static boolean validatePhone(String input) {
		return (Pattern.matches("^[0-9]{10}$", input));
	}
	private static boolean validateString(String name) {
		return (Pattern.matches("^[a-zA-Z]+$", name));
	}
}
