package day2_21march_111016_fs;

public class UserMainCode {

	static int sumOfSquaresOfEvenDigit(int num) {
		int reminder = 0, result = 0;
		while(num > 1) {
			reminder = num % 10;
			num = num / 10;
			
			if(reminder %2 == 0) {
				result += (reminder*reminder);
			}
		}
		return result;
	}
	
	//for countDigit class
	static int countSeven(int num) {
		int reminder = 0, result = 0;
		
		if(num < 0)
			return -1;
		
		while(num > 1) {
			reminder = num % 10;
			num = num / 10;
			
			if(reminder == 7) {
				result++;
			}
		}
		return result;
	}
	
	//for digitComparison class
	static boolean compareLastDigit(int num1, int num2) {
		if((num1 % 10) == (num2 % 10))
			return true;
		
		return false;
	}
}