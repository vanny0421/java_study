package multiex;

public class Q4 implements Operation {

	@Override
	public void oper() {
		/*
		 * 4. 1~100까지 중에 홀수와, 짝수의 합을 각각 구하여라
		 */
		int odd = 0;
		int even = 0;

		
		for(int j=0;j<100;j++) {
			if ((j+1)%2==1) {
				odd = odd+=j+1; 
			}
		}
		System.out.println("홀수합 : " + odd + "\n");
		
		for(int i=1;i<=100;i++) {
			if((i+1)%2==0) {
				even = even+=i+1;
			}
		}
		System.out.println("짝수합 : " + even);
	}
}
