package multiex;

public class Q1 implements Operation {

	@Override
	public void oper() {
		/*
		 * 1. 7의 구구단의 결과값만을 출력
		 * 　　단, for문으로 작성할 것
		 * 　(결과 값 : 7 14 21 ...63)
		 */
		int num = 0;
		
		for(int i=1;i<=9;i++) {
			num+=7;
			System.out.println(num);
		}
	}
}
