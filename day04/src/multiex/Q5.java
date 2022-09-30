package multiex;

public class Q5 implements Operation {

	@Override
	public void oper() {
		/*
		 * 5. 구구단 2단부터 9단까지의 결과값만을 출력하여라(2중 반복문)
		 * 단, 단수가 바뀔때마다 구분자를 넣어줄것
		 * (결과 : 2
		 * 　　　　　4
		 * 　　　　　...
		 * 　　　　　18
		 * 　　　　-----
		 * 　　　　　3
		 * 　　　　　6
		 * 　　　　　9
		 * 　　　　　...
		 * 　　　　-----
		 */

		System.out.println("구 구 단");
		for(int i=2;i<=9;i++) {
			System.out.println("-----------");
            
			for(int j=1;j<=9;j++) {
				System.out.println(i + " x "+ j +" = " + i*j);
			}
		}	
	}
}
