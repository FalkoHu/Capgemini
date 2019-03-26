package day1_20march_111016_fs;

public class YourInitials {

	public static void main(String[] args) {
		YourInitials i = new YourInitials();
		i.output();
	}
	
	void output() {
		firstRow();
		commonRows();
		commonRows();
		middleRow();
		for(int i = 0; i<3; i++) {
			commonRows();
		}
	}
	void firstRow() {
		//F
		print(5, "F");
		print(2, " ");	
		//H
		print(1, "H");
		print(3, " ");
		print(1, "H");
		System.out.println();
	}
	
	void commonRows() {
		//F
		print(1, "F");
		print(6, " ");	
		//H
		print(1, "H");
		print(3, " ");
		print(1, "H");
		System.out.println();
	}
	
	void middleRow() {
		//F
		print(3, "F");
		print(4, " ");
		//H
		print(5, "H");
		System.out.println();
	}
	
	void print(int num, String s) {
		for(int i = 0; i<num; i++) {
			System.out.print(s);
		}
	}
	
}