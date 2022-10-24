package part1_Question3;

public class MaxAndMinTest {
	
	static int[] arr = {52, 23, 45, 89, 77};
	
	static int min = 89;
	static int max = 0;
	public static int minValue(int[] arr) {
		for(int i : arr) min = Math.min(i, min);
		return min;
	}
	
	public static int maxValue(int[] arr) {
		for(int i : arr) max = Math.max(i, max);
		return max;
	}
	
	public static void main(String[] args) {
		
		System.out.println("최소값 : " + minValue(arr));
		System.out.println("최대값 : " + maxValue(arr));
	}
}
