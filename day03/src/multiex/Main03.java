package multiex;

public class Main03 {

	public static void main(String[] args) {
		/*
		 * 7. 이중 반복문 (8*8)을 사용해서 별을 출력
		 * 　　★★★★★★★★
		 * 　　★★★★★★★★
		 * 　　★★★★★★★★
		 * 　　★★★★★★★★
		 * 　　★★★★★★★★
		 * 　　★★★★★★★★
		 * 　　★★★★★★★★
		 * 　　★★★★★★★★
		 */
		for(int i=0;i<8;i++) {			
			for(int j=0;j<8;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		
		System.out.println("---------------------------");
		
		/*
		 * 8. 이중 반복문 (8*8)을 사용해서 별을 출력
		 * 　　★★★★★★★★
		 * 　　★★★★★★★
		 * 　　★★★★★★
		 * 　　★★★★★
		 * 　　★★★★
		 * 　　★★★
		 * 　　★★
		 * 　　★
		 */
		for(int i=0;i<8;i++) {
			for(int j=i;j<8;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println("---------------------------");
		
		/*
		 * 9. 이중 반복문(8*8)을 사용해서 별을 출력
		 * 　　★
		 * 　　★★
		 * 　　★★★
		 * 　　★★★★
		 * 　　★★★★★
		 * 　　★★★★★★
		 * 　　★★★★★★★
		 * 　　★★★★★★★★
		 */
		for(int i=0;i<8;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("---------------------------");
		
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
