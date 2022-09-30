package multiex;

public class Q6 implements Operation {

	@Override
	public void oper() {
		/*
		 * 6. 구구단 2단을 출력하자
		 * (　2 * 1 = 2
		 * 　 2 * 2 = 4
		 * 　 ..
		 * 　 2 * 9 = 18)
		 */
		
		for(int i=2;i<=2;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
	}
}
