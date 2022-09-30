package multiex;

public class Main01 {

	public static void main(String[] args) {
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
		
		System.out.println("---------------------------");
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
		
		System.out.println("---------------------------");
		/*
		 * 3. 7의 구구단의 결과값만을 출력
		 * 　　단, do~while문으로 작성할 것
		 * 　(결과 값 : 7 14 21 ...63)
		 */
		int b = 0;
		
		int j = 1;
		do {
			b+=7;
			j++;
			System.out.println(b);
		} while(j<=9);
		
		System.out.println("---------------------------");
		
	
	
	
	
	}
}
