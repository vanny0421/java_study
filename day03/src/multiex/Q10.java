package multiex;

public class Q10 implements Operation {

	@Override
	public void oper() {
		/*
		 * 10. 10번 찍어 안 넘어 가는 나무 없다 라는 문구를 출력
		 * (단, while문으로 작성할 것)
		 * 결과 : 나무를 1번 찍었습니다.
		 * 　　 　 나무를 2번 찍었습니다.
		 * 　　 　 ...
		 * 　　 　 나무를 10번 찍었습니다.
		 * 　　 　 나무가 넘어갔습니다.
		 */
		
		System.out.println("10번 찍어 안 넘어 가는 나무 없다 \n");
		int tree = 0;
		
		while(tree<10) {
			tree++;
			System.out.println("나무를 "+ tree + "번" + " 찍었습니다. \n");
		}
		System.out.println("나무가 넘어갔습니다.");
	}
}
