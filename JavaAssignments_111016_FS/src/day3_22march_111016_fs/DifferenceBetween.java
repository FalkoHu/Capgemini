package day3_22march_111016_fs;

import java.util.Scanner;

public class DifferenceBetween{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the array length followed by the numbers with pressing enter between each number");
		int[] arr = new int[scan.nextInt()];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(UserMainCode.getBigDiff(arr));
		
	}
}
