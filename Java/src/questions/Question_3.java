package questions;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		
		int[][] src = new int[4][4];
		
		Scanner sc = new Scanner(System.in);
		
		int[][] binary = new int[4][4];
		
		System.out.println("한 줄에 4개씩 총 16개의 양수를 입력하세요");
		
		for(int i=0; i<src.length; i++) {
			for(int j=0; j<src[i].length; j++) {
				int srcInput = sc.nextInt();
				src[i][j] = srcInput;
				
//				binary[i][j] = srcInput < 5 ? 0 : 1;
			}
		}
		
		for(int i=0; i<src.length; i++) {
			for(int j=0; j<src[i].length; j++) {
				binary[i][j] = src[i][j];
				
				binary[i][j] = binary[i][j] < 5 ? 0 : 1;
				
//				if (binary[i][j] < 5) {
//					binary[i][j] = 0;
//				} else {
//					binary[i][j] = 1;
//				}
			}	
		}
		
		
		System.out.println("변형한 binary 배열을 출력합니다.");
		
		for(int i=0; i<binary.length; i++) {
			for(int j=0; j<binary[i].length; j++) {
				System.out.print(binary[i][j] + " ");
			}
			System.out.println();
		}
	}
}
