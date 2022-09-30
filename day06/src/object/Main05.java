package object;

class Calc2 {
	// 데이터 타입은 전체 int
	// 덧셈 결과 return, 파라미터 2개 메서드 생성
	int plus(int i, int j) {
		System.out.println(i+j);
		return 0;
	}
	// 뺄셈 결과 return, 파라미터 2개 메서드 생성
	int minus(int k, int l) {
		System.out.println(k-l);
		return 0;
	}
	// 곱셈 결과 return, 파라미터 2개 메서드 생성
	int times(int m, int n) {
		System.out.println(m*n);
		return 0;
	}
	// 나눗셈 몫에 대한 결과 return, 파라미터 2개 메서드 생성
	int divide(int o, int p) {
		int sum = 0;
		if (p != 0 ) {
			sum = o / p;
		}
		System.out.println(sum);
		return 0;
	}
}

public class Main05 {

	public static void main(String[] args) {
		// Calc2 클래스로 객체 생성후
		Calc2 c = new Calc2();
		// 덧셈
		c.plus(10, 20);
		// 뺄셈
		c.minus(20, 10);
		// 곱셈
		c.times(20, 10);
		// 나눗셈
		c.divide(20, 10);
		// 결과를 각각 출력
	}
}
