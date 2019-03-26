package day2_21march_111016_fs;

public class MobilePhoneChecker {

	public static void main(String[] args) {
		System.out.println(tenDigits("0123456789"));
		System.out.println(startsWith("756"));
		System.out.println(inputDigits("546456s"));
	}
	
	static boolean tenDigits(String phoneNumber) {
		if(phoneNumber.length() == 10)
			return true;
		return false;
	}
	
	static boolean startsWith(String phoneNumber) {
		if(phoneNumber.startsWith("7"))
			return true;
		if(phoneNumber.startsWith("8"))
			return true;
		if(phoneNumber.startsWith("9"))
			return true;
		return false;
	}
	
	static boolean inputDigits(String phoneNumber) {
		for(int i = 0; i<phoneNumber.length(); i++) {
			char p = phoneNumber.charAt(i);
			if(!Character.isDigit(p))
				return false;
		}
		return true;
	}
}
