package part2_Question2;

import java.util.Scanner;

public class MultiplesOf3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("정수 입력");
			arr[i] = sc.nextInt();
		}
		
		for(int i : arr) {
			if(i % 3 == 0) System.out.print(i + " ");
		}
	}
}
