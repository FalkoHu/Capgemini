package day11_3April_111016_fs;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtility {
	private List<Player> list = new ArrayList<>();
	Player player;
	
	List<Player> readFileData(BufferedReader bufferedReader){
		String line;
		
		try {
			while((line = bufferedReader.readLine()) != null) {
				String[] str = line.split(",");
				player = new Player(Integer.parseInt(str[0]), str[1], str[2], str[3], Integer.parseInt(str[4]));
				list.add(player);
			}
		} catch (IOException e) {
						e.printStackTrace();
		}
		return list;
	}
	
	void writeDataToFile(List<Player> playerList) {
		try {
			FileWriter writer = new FileWriter("C:\\Users\\falhussa\\eclipse-workspace\\JavaAssignments_111016_FS\\src\\day11_3April_111016_fs/output.csv", true);
			for(Player p : playerList) {
				writer.write(p.toString());
			}
			writer.close();
			} catch (IOException e) {
			e.printStackTrace();
			}
	}
}
