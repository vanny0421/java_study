package quiz02;

public class Quiz02 {

	public void q1() {
		/* 1. 다음의 for 문을 while 문으로 변경하시오.(10) */

		int i = 0;

		while (i <= 10) {
			int j = 0;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println();
		}
		System.out.println("-----------------------------");
	}

	public void q2() {
		/* 2. 두 개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.(10) */

		for (int k = 0; k < 6; k++) {
			for (int j = 0; j < 6; j++) {
				if ((k + j) == 6) {
					System.out.println(k + "+" + j + "=" + (k + j));
				}
			}
		}

		System.out.println("-----------------------------");
	}

	public void q3() {
		/*
		 * 3. 방정식 2x+4y=10 의 모든 해를 구하시오. 단 x 와 y는 정수이고 각각의 범위는 0<=x<=10, 0<=y<=10이다.(10)
		 * 
		 * [출력 결과] x=1, y=2 x=3, y=1 x=5, y=0
		 */

		for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {
				if (2 * x + 4 * y == 10) {
					System.out.println("x = " + x + ", y = " + y);
				}
			}
		}

		System.out.println("-----------------------------");
	}

	public void q4() {
		/*
		 * 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.(10) [배열] int[] arr = {10, 20, 30, 40, 50};
		 * [출력 결과] sum=150
		 */

		int[] arr = { 10, 20, 30, 40, 50 };

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum = " + sum);

		System.out.println("-----------------------------");
	}

	public void q5() {
		/*
		 * 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.(15)
		 * 
		 * [출력 결과]
		 * 
		 * total=325
		 * 
		 * average=16
		 */

		int[][] arr = {

				{ 5, 5, 5, 5, 5 },

				{ 10, 10, 10, 10, 10 },

				{ 20, 20, 20, 20, 20 },

				{ 30, 30, 30, 30, 30 }

		};

		int total = 0;
		int average = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
			}
		}
		average = total / (arr.length * arr[0].length);
		System.out.println("total = " + total);
		System.out.println("average = " + average);

		System.out.println("-----------------------------");
	}

	public void q6() {
		/*
		 * 다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다. 변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의
		 * 동전이 필요한지 계산해서 출력하라. 단 가능한 한 적은 수의 동전으로 거슬러 주어야한다 (1) 에 알맞은 코드를 넣어서(1줄 이상 일 수
		 * 있다.), 프로그램을 완성하시오. (15)
		 */

		// 큰 금액의 동전을 우선적으로 거슬러 줘야한다

		int[] coinUnit = { 500, 100, 50, 10 };

		int money = 2680;

		System.out.println("money=" + money);

		for (int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "원 : " + money / coinUnit[i]);
			money = money % coinUnit[i];
		}

		/*
		 * [출력 결과]
		 * 
		 * money=2680
		 * 
		 * 500원 : 5
		 * 
		 * 100원 : 1
		 * 
		 * 50원: 1
		 * 
		 * 10원 : 3
		 */

		System.out.println("-----------------------------");
	}

	public void q7() {
		/*
		 * num 배열에 저장된 요소의 최대값을 출력하시오.(15)
		 * 
		 * [배열]
		 * 
		 * int[] num = {94, 85, 95, 88, 90};
		 * 
		 * [출력 결과]
		 * 
		 * 최대값 : 95
		 */

		int[] num = { 94, 85, 95, 88, 90 };

		int max = num[0];

		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}
		}
		System.out.println("최대값 : " + max);

		System.out.println("-----------------------------");

	}

	public void q8() {
		/*
		 * num 배열에 저장된 요소의 홀수와 짝수의 합을 각각 구하시오. (15)
		 * 
		 * [배열]
		 * 
		 * int[] num = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		 * 
		 * [출력 결과]
		 * 
		 * 짝수 : 20
		 * 
		 * 홀수 : 25 }
		 */

		int[] num = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int even = 0;
		int odd = 0;

		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				even += num[i];
			} else {
				odd += num[i];
			}
		}

		System.out.println("짝수 : " + even);
		System.out.println("홀수 : " + odd);
	}

	public static void main(String[] args) {
		Quiz02 quiz = new Quiz02();

		quiz.q1(); // 1번 문제
		quiz.q2(); // 2번 문제
		quiz.q3(); // 3번 문제
		quiz.q4(); // 4번 문제
		quiz.q5(); // 5번 문제
		quiz.q6(); // 6번 문제
		quiz.q7(); // 7번 문제
		quiz.q8(); // 8번 문제
	}
}