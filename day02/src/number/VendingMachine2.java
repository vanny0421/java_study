package number;

import java.util.Scanner;

public class VendingMachine2 {
	
	public String choose() {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		switch(num) {
			case 1:
				return "새우깡";
			case 2:
				return "감자깡";
			case 3:
				return "초코송이";
			case 4:
				return "하리보";
			default:
				return "1~4 중에 선택하세요.";
		}
	}
	
}
