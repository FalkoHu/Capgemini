package day11_3April_111016_fs;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main31 {

	
	public static void main(String[] args) {
		
		try {
			FileReader inputStream = new FileReader("C:\\Users\\falhussa\\eclipse-workspace\\JavaAssignments_111016_FS\\src\\day11_3April_111016_fs/matches.txt");
			
			MatchFileStore m = new MatchFileStore();
			List<Match> list = m.obtainMatchFromFile(inputStream);
			Match match = new Match();

			System.out.println("The match details are");
			for(int i = 0; i<list.size(); i++) {
				match.displayMatch(list, i);
			}
			
		}catch(IOException e) {
			System.out.println(e);
		}
		
	}
}
