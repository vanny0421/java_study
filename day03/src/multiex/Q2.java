package multiex;

public class Q2 implements Operation {

	@Override
	public void oper() {
		/*
		 * 2. 7의 구구단의 결과값만을 출력
		 * 　　단, while문으로 작성할 것
		 * 　(결과 값 : 7 14 21 ...63)
		 */
		int a = 0;
		
		int i = 1;
		
		while(i<=9) {
			a+=7;
			i++;
			System.out.println(a);
		}
	}
}
