package day11_3April_111016_fs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main34 {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter start and end charachter number you want to display");
		int start = scan.nextInt();
		int end = scan.nextInt();
		try {
			InputStream inputStream = new FileInputStream(new File("C:\\Users\\falhussa\\eclipse-workspace\\JavaAssignments_111016_FS\\src\\day11_3April_111016_fs/assign34.txt"));
			InputStreamReader isr = new InputStreamReader(inputStream);
			BufferedReader bf = new BufferedReader(isr);
			bf.skip(start);
			String output = bf.readLine();
			while(output != null) {
				System.out.println(output.substring(0, end-start));
				break;
			}
			
			bf.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}
