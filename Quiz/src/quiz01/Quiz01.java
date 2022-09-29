package quiz01;

public class Quiz01 {

	/*
	 * 1.
	 * 
	 * 1 부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.(코드작성)(35)
	 */

	public void Q1() {

		int tot = 0;

		for (int i = 0; i < 20; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				tot += i;
			}
		}

		System.out.println("총합 : " + tot + "\n");
	}

	/*
	 * 2.
	 * 
	 * 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) 의 결과를 계산하시오
	 */
	public void Q2() {
		int tot = 0;

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				tot += j;
			}
		}
		System.out.println("결과 : " + tot);
	}

	public static void main(String[] args) {

		Quiz01 quiz = new Quiz01();

		quiz.Q1(); // 1번 문제 실행
		quiz.Q2(); // 2번 문제 실행

	}

}