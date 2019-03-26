package SideStuff;

public class StringClass {

	public static void main(String[] args) {
		System.out.println(concatinate("Hello", "World"));
		System.out.println(palindrome("MALAYBLAM"));
	}
	
	
	static String concatinate(String s1, String s2) {
		if(s1 == null || s2 == null) {
			throw new IllegalArgumentException("No nulls");
		}
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		char[] res = new char[c1.length+c2.length+1];
		
		System.arraycopy(c1, 0, res, 0, c1.length);
		System.arraycopy(c2, 0, res, c1.length+1, c2.length);
		
		return new String(res);
	}
	
	static boolean palindrome(String s1) {
		if(s1 == null)
			throw new IllegalArgumentException("No Null Value Allowed");
		
		int last = s1.length()-1;
		for(int i = 0; i < s1.length() / 2;) {
			if(s1.charAt(i) == s1.charAt(last)) {
				i++;
				last--;
			}
			else 
				return false;
		}
		return true;
	}	
}