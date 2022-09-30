package multiex;

public class Q9 implements Operation {

	@Override
	public void oper() {
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
	}
}
