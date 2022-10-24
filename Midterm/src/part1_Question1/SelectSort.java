package part1_Question1;

public class SelectSort {
	
	public static void main(String[] args) {
		int[] s = {80,41,35,90,40,20};
		selectionSort(s);
		for(int i=0; i<s.length; i++) {
			System.out.print(s[i]+"\t");
		}
		System.out.println();
	}
	
	static void selectionSort(int[] s) {
		int size = s.length;
		int min, temp;
		
		for(int i=0; i<size-1; i++) {
			min = i;
			for(int j=i+1; j<size; j++) {
				if(s[min] > s[j]) {
					min = j;
				}
			}
			temp = s[min];
			s[min] = s[i];
			s[i] = temp;
		}
	}

}
