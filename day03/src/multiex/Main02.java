package multiex;

public class Main02 {
	
	public static void main(String[] args) {
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
		
		System.out.println("---------------------------");
		
	
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
		
		System.out.println("---------------------------");
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
