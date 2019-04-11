package day11_3April_111016_fs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MatchFileStore {
	private List<Match> list = new ArrayList<>();
	Match match;
	
	List<Match> obtainMatchFromFile(InputStreamReader inputStreamReader){
		try {
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			String str = null;
			String line;
			
			while((line = bufferedReader.readLine()) != null) {
				str = line.trim();
				match = new Match(str.substring(0, 4).trim(), str.substring(5,9).trim(), str.substring(10, 29).trim(), str.substring(30,str.length()));
				list.add(match);
			}
			
			bufferedReader.close();
		}catch(IOException e) {
			System.out.println(e);
		}
		return list;
	}
}
