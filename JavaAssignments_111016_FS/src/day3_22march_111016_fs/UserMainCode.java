package day3_22march_111016_fs;

import java.util.Arrays;
import java.util.regex.Pattern;

public class UserMainCode {

	//for assignment 11, SumOfCommonElements, I used Integer.MIN_VALUE instead of -1 as it did not specify if we worked with positive or negative numbers
	static int getSumOfIntersection(int[] arr1, int[] arr2, int arr1Size, int arr2Size) {
		int count = 0;
		for(int i = 0; i<arr1Size; i++) {
			for(int j = 0; j<arr2Size; j++) {
				if(arr1[i] == arr2[j]) {
					count += arr1[i];
				}
			}
		}
		return count;
	}
	
	
	//ASSIGNMENT 12 DifferenceBetween
	static int getBigDiff(int[] arr) {
		if(arr.length == 1)
			return arr[0];
		
		Arrays.sort(arr);
		return (arr[arr.length-1]-arr[0]);
	}
	
	//ASSIGNEMNT 13 NumberValidation
	static int validateNumber(String number) {
		if(Pattern.matches("^[0-9]{3}[-][0-9]{3}[-][0-9]{4}$", number)) 
			return 1;
		return -1;
	}
	
	//ASSIGNMENT 14 PasswordValidation
	static int validatePassword(String password) {
		if(Pattern.matches("^(?=.*[@#$])(?=.*[0-9]).{6,20}$", password)) 
			return 1;
		return -1;
	}
	
	//ASSIGNMENT 15 ElectricityBill
	static int calculateElectricityBill(int n1, int n2, int unitCharge) {
		return (n2 -n1)*unitCharge;
	}
	int x = 014;
	void go(final int i ) {
		System.out.println(i/x);
	}
	
	public static void main(String[] args) {
		UserMainCode s = new UserMainCode();
		s.go(24);
	}
}
