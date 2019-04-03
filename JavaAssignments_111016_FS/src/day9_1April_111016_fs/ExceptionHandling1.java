package day9_1April_111016_fs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);
		
		try {
			System.out.println("Enter total runs scored");
			int numOfScored = Integer.parseInt(bf.readLine());
			
			System.out.println("Enter the total overs faces");
			int oversFaced = Integer.parseInt(bf.readLine());
			
			
			double result = numOfScored/oversFaced; 
			System.out.println("Current Run Rate : " + result);
		}catch(ArithmeticException | NullPointerException | IOException ex) {
			System.out.println(ex);
		}
	}
}
