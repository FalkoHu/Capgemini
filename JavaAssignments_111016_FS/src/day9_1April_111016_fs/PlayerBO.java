package day9_1April_111016_fs;

import java.util.List;

public class PlayerBO {
		
		public void displayPlayerDetails(Player cap, List<Player> list) {
			try {
				System.out.println(cap.toString());
			}catch(Exception e) {
				System.out.println(e);
				System.out.println("Captains details are not available");
			}finally {
				for(Player p : list) {
					System.out.println(p.toString());
				}
			}
		}
}