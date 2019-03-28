package day4_25march_111016_fs;

public class InningsBO {

	Innings createInnings(String data) {
		String[] s = data.split(",");
		long inningsNumber = Long.parseLong(s[0]);
		
		Innings in = new Innings(inningsNumber, s[1]);
		return in;
	}
}
