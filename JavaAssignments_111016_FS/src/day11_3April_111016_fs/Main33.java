package day11_3April_111016_fs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main33 {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of words");
		int numOfWords = scan.nextInt();
		System.out.println("Enter the strings to be searched");
		String[] str = new String[numOfWords];
		for(int i =0; i<numOfWords; i++) {
			str[i] = scan.next();
		}
		
		scan.close();
		try {
			InputStream inputStream = new FileInputStream(new File("C:\\Users\\falhussa\\eclipse-workspace\\JavaAssignments_111016_FS\\src\\day11_3April_111016_fs/team.txt"));
			InputStreamReader isr = new InputStreamReader(inputStream);
			BufferedReader bf = new BufferedReader(isr);
			String line = bf.readLine();
			
			for(int i = 0; i<str.length; i++) {
				System.out.println("Word : " + str[i] + " Count: "+ (line.split(str[i], -1).length-1));
			}
			
			bf.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
