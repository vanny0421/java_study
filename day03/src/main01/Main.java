package main01;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

class One {
	int stArr[];
	int stNum;

	public One() {
		;
	}

	void getStNum() {
		System.out.println("처리할 학생의 수를 입력하세요(최대100점):");
		this.stNum = new Scanner(System.in).nextInt();
		this.stArr = new int[stNum];
	}

	void inputStScore() {
		int cnt = 0;
		while (true) {
			if (this.stNum == cnt)
				break;
			System.out.println((cnt + 1) + "번 학생 성적:");
			this.stArr[cnt++] = new Scanner(System.in).nextInt();
		}
		System.out.println(Arrays.toString(this.stArr));
	}
}

class Two {
	One one;

	public Two(One one) {
		this.one = one;
	}

	void getAllStList() {
		
		// 채우시오
		// 모든 학생의 명단을 출력하는 코드
		for (int i = 0; i < this.one.stArr.length; i++) {
			System.out.println(this.one.stArr[i]);
		}

	}
}

class Three {
	One one;

	public Three(One one) {
		this.one = one;
	}

	void getStUseStNum() {
		System.out.println("학생의 번호 입력: ");
		int stNum = new Scanner(System.in).nextInt();
		System.out.println(this.one.stArr[stNum - 1]);
	}
}

class Four {
	One one;

	public Four(One one) {
		this.one = one;
	}

	void getMaxScoreAndMinScore() {
		// 채우시오 (최고점수를 가진 학생 점수 를 구하여 출력하는 코드 )
		
	}
}

class Five {
	One one;

	public Five(One one) {
		this.one = one;
	}

	void getAvgAndMidScore() {
		// 학생들의 점수의 평균을 구하여 출력하는 코드를 적으세요
	}

}

class Six {
	One one;

	public Six(One one) {
		this.one = one;
	}

	void getSortedArr() {
		int len = one.stArr.length;
		Arrays.sort(this.one.stArr);
		for (int i = 0; i < len; i++) {
			System.out.println(this.one.stArr[i]);
		}

	}
}

public class Main {

	public static void main(String[] args) {
		One one = new One();
		Two two = new Two(one);
		Three three = new Three(one);
		Four four = new Four(one);
		Five five = new Five(one);
		Six six = new Six(one);
		System.out.println("학생 성적 처리 프로그램");
		while (true) {
			System.out
					.println("1) 학생 성적 입력\n" + "2) 학생 전체 성적 리스트 보기\n" + "3) 학생의 번호로 성적 보기\n" + "4) 성적 최고 점수, 최저 점수 보기\n"
							+ "5) 성적 평균 점수, 중위값 점수 보기\n" + "6) 성적 정렬해서 보기\n" + "0)메인 메뉴로 돌아감(종료)\n");
			switch (new Scanner(System.in).nextInt()) {
			case 1: {
				one.getStNum();
				one.inputStScore();
				break;
			}
			case 2: {
				two.getAllStList();
				break;
			}
			case 3: {
				three.getStUseStNum();
				break;
			}
			case 4: {
				four.getMaxScoreAndMinScore();
				break;
			}
			case 5: {
				five.getAvgAndMidScore();
				break;
			}
			case 6: {
				six.getSortedArr();
				break;
			}
			case 0:
				System.exit(0);
			}
		}
	}

}
