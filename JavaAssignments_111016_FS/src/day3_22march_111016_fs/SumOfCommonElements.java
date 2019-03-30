package day3_22march_111016_fs;

import java.util.Scanner;

public class SumOfCommonElements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the length of the first array");
		int[] arr1 = new int[scan.nextInt()];
		
		System.out.println("Please enter the length of the second array");
		int[] arr2 = new int[scan.nextInt()];
		
		System.out.println("Enter the numbers for the first array pressing enter after each number");
		for(int i = 0; i<arr1.length; i++) {
			arr1[i] = scan.nextInt();
		}
		
		System.out.println("Enter the numbers for the second array pressing enter after each number");
		for(int i = 0; i<arr2.length; i++) {
			arr2[i] = scan.nextInt();
		}
		int res = UserMainCode.getSumOfIntersection(arr1, arr2, arr1.length, arr2.length); 
		if(res == 0){
			System.out.println("No common elements");
		} else {
			System.out.println(res);
		}
	}
}
