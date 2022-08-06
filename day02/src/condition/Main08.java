package condition;

import java.util.Iterator;

public class Main08 {

	public static void main(String[] args) {
		/*
		 * 1. 만약 3000원 이상의 돈을 가지고 있다면 택시를 타고, 
		 * 그렇지 않으면 걸어가라
		 */
		int money = 2000;
		
		if (money >= 3000) {
			System.out.println("택시 탈 돈이 충분합니다.");
		} else {
			System.out.println("택시 탈 돈이 부족합니다. 걸어가세요");
		}
		
		
		System.out.println("----------------");
		/*
		 * 2. 만약 돈이 3000원 이상 있거나, 카드가 있다면 택시를 타고 
		 * 그렇지 않으면 걸어가라
		 */
		boolean card = true;

		if (money >= 3000 || card) {
			System.out.println("택시 탈 돈이 충분합니다.");
		} else {
			System.out.println("택시 탈 돈이 부족합니다. 걸어가세요");			
		}
		
		System.out.println("----------------");
		/*
		 * 3.어떤 특정 정수 a가 짝수이면 "짝수", 홀수이면 "홀수" 라고 출력
		 */
		int num = 1004; 
		
		if (num%2==0) {
			System.out.println("짝수 입니다.");
		} else if (num%2==1) {
			System.out.println("홀수 입니다.");
		} else {
			System.out.println("정수만 입력하세요.");
		}
		
		System.out.println("----------------");
		/*
		 * 4. 서로다른 a,b,c의 최대값을 구하여라
		 */
		
		int a = 10, b = 30, c = 40;
		int max;
		
		if (a > b && a > c) {
			System.out.println("최대값 : " + a);
		} else {
			if (b > c) {
				System.out.println("최대값 : " + b);
			} else {
				System.out.println("최대값 : " + c);
			}
		}
		
//		if (a>b) {
//			System.out.println(a);
//		} else if (b>a) {
//			System.out.println(b);
//		} else if (b>c) {
//			System.out.println(b);
//		} else if (c>a) {
//			System.out.println(c);
//		} else if (c>b) {
//			System.out.println(c);
//		} else {
//			System.out.println("정수만 입력하세요.");
//		}
		
		
		System.out.println("----------------");
		/*
		 * 5. 숫자가 3이면 안녕 "3줄", 2이면 "안녕"이 두줄,
		 * 1이면 "안녕"이 한줄, 그 외는 "잘가"가 출력
		 */
//		int hi = 1;
//		
//		switch(hi) {
//			case 3:
//				System.out.println("안녕");
//			case 2:
//				System.out.println("안녕");
//			case 1:
//				System.out.println("안녕");
//				break;
//			default : 
//				System.out.println("잘가");
//				break;
//		}

		System.out.println("----------------");
		/*
		 * 6. For문 이용해서 숫자가 3이면 안녕 "3줄", 2이면 "안녕"이 두줄,
		 * 1이면 "안녕"이 한줄, 그 외는 "잘가"가 출력
		 */
		
		int hello = 4;

		if (hello >= 3) {
			for (int i = 0; i < hello; i++) {
				if (i <= 3) {
					System.out.println("안녕");
				} 
			}
		} else if (hello==0 && hello>=4) {
			System.out.println("잘가");
		}
		
//		for (int i = 1; i <= hello; i++) {
//			if (i <= 3) {
//				System.out.println("안녕하세요");	
//			} else if (hello==0 && hello>=4) {
//				System.out.println("잘가세요");
//			}
//		}
		
		System.out.println("----------------");
	}

}








