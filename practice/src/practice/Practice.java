package practice;

import java.util.Scanner;

class Questions {
	Scanner sc = new Scanner(System.in);

	public void Q1() {
		System.out.println("현재 가지고 있는 현금액수를 입력하세요 : \n");
		int money = sc.nextInt();

		if (money >= 3000) {
			System.out.println("택시에 타기 돈이 충분 합니다.");
		} else if (money < 3000) {
			System.out.println("돈이 부족 합니다.");
		} else {
			System.out.println("숫자만 입력해주세요.");
		}
	}

	public void Q2() {
		System.out.println("현재 가지고 있는 현금액수를 입력하세요 : \n");
		int change = sc.nextInt();
		System.out.println("카드를 가지고있습니까 ? true / false로 만 입력해주세요.");
		boolean cardOrNoCard = sc.nextBoolean();

		if (change >= 3000 || cardOrNoCard == true) {
			System.out.println("택시를 탄다.");
		} else if (change < 3000 && cardOrNoCard == false) {
			System.out.println("걸어간다.");			
		} else {
			System.out.println("숫자만 입력해주세요.");
		}
	}

	public void Q3() {
		System.out.println("숫자 입력해주세요 : \n");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else if (num % 2 == 1) {
			System.out.println("홀수입니다.");
		} else {
			System.out.println("정수만 입력하세요.");
		}
	}

	public void Q4() {

		System.out.println("숫자 3개를 입력하세요 : \n");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println("최대값 : " + a);
		} else {
			if (b > c) {
				System.out.println("최대값 : " + b);
			} else {
				System.out.println("최대값 : " + c);
			}
		}

	}

	public void Q5() {

		System.out.println("숫자를 입력하세요 : \n");
		int hi = sc.nextInt();

//		switch(hello) {
//		case 3: System.out.println("안녕");
//		case 2: System.out.println("안녕");
//		case 1: System.out.println("안녕");
//		break;
//		default: System.out.println("잘가");
//		}
		
		if (hi<=3) {
			if (hi==0) {
				System.out.println("잘가");
			} else {
				for (int i=1; i<=hi; i++) {
					System.out.println("안녕");
				}
			}
		} else {
			System.out.println("잘가");
		}
		            //0  0
//		for (int i=0; i<=hi; i++) {
//			if (hi<=3) {
//				if(i==0) {
//					System.out.println("잘가");
//				} else {
//					System.out.println("안녕");					
//				}
//			} else {
//				System.out.println("잘가");
//				break;
//			}
//		}
	}
}

public class Practice {

	public static void main(String[] args) {

		Questions q = new Questions();

//	q.Q1();
//	q.Q2();
//	q.Q3();
//	q.Q4();
		q.Q5();
	}
}
