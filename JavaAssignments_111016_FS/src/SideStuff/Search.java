package SideStuff;

public class Search {

	
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 32, 32, 1, 2, 23, 12, 23};
		
		Search s = new Search();
		System.out.println(s.findNextLargest(arr));
	}
	
	
	
	int findNextLargest(int[] arr) {
		int secondMax = 0, max = 0;
		for(int i = 0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		for(int i = 0; i<arr.length; i++) {
			
		}
		return secondMax;
	}
	
	void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	
	
	int occurence (int[] arr, int num) {
		int count = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == num)
				count++;
		}
		return count;
	}
	
	
	 int indexOf(int[] arr, int num) {
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == num) {
				return i;
			}
		}
		return -1;
	}
}
