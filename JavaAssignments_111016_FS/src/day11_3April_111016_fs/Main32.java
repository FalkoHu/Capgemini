package day11_3April_111016_fs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collections;
import java.util.List;

public class Main32 {

	
	public static void main(String[] args) {
		try {
			FileReader inputStream = new FileReader("C:\\Users\\falhussa\\eclipse-workspace\\JavaAssignments_111016_FS\\src\\day11_3April_111016_fs/input.txt");
			BufferedReader bufferedReader = new BufferedReader(inputStream);
			
			FileUtility fileUtility = new FileUtility();
			List<Player> list = fileUtility.readFileData(bufferedReader);
			
			Collections.sort(list);
			
			fileUtility.writeDataToFile(list);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
