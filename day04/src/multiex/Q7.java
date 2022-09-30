package multiex;

public class Q7 implements Operation {

	@Override
	public void oper() {
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
	}
}
