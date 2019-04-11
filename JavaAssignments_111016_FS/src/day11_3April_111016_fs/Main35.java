package day11_3April_111016_fs;

import java.io.FileOutputStream;
import java.util.Scanner;

public class Main35 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useDelimiter(System.lineSeparator());
		
		System.out.println("Enter the name of the player");
		String name = scan.next();
		System.out.println("Enter the team name");
		String teamName = scan.next();
		System.out.println("Enter the number of matches played");
		int matchedPlayed = scan.nextInt();
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\falhussa\\eclipse-workspace\\JavaAssignments_111016_FS\\src\\day11_3April_111016_fs/player.csv");
			
			String s = name+","+teamName+","+Integer.toString(matchedPlayed);
			byte b[] = s.getBytes();
			fout.write(b);
			fout.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
