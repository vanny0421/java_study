package exception;

public class Main05 {

	public static void main(String[] args) {
		int[] arr = new int[3];
		
		try {
			for(int i=0;i<5;i++) {
				arr[i] = i; // i가 3일때 에러가 발생
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		System.out.println("프로그램 종료");
	}
}
