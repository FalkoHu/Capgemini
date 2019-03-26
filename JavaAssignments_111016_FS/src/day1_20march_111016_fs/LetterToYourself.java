package day1_20march_111016_fs;

public class LetterToYourself {

	public static void main(String[] args) {
		LetterToYourself l = new LetterToYourself();
		l.output();
	}
	
	void output() {
		topBottom();
		for(int i = 0; i<3; i++) {
			stamp();
		}
		emptyOutline();
		emptyOutline();
		address("Falko Hussain", 12);
		address("123 Street Corner", 8);
		address("Rosemont, IL 60169", 7);
		emptyOutline();
		topBottom();
	}
	
	void topBottom() {
		print(1, "+");
		print(60, "-");
		print(1, "+");
		System.out.println();
	}
	
	void stamp() {
		print(1, "|");
		print(55, " ");
		print(4, "#");
		print(1, " ");
		print(1, "|");
		System.out.println();
	}
	
	void emptyOutline() {
		print(1, "|");
		print(60, " ");
		print(1, "|");
		System.out.println();
	}
	
	void address(String name, int endSpaces) {
		print(1, "|");
		print(35, " ");
		print(1, name);
		print(endSpaces, " ");
		print(1, "|");
		System.out.println();
	}
	
	void print(int num, String s) {
		for(int i = 0; i<num; i++) {
			System.out.print(s);
		}
	}	
}