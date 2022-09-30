package math;

/*
 * Math 클래스
 *  - 모든 메서드들이 static 형태이기 때문에,
 *  객체를 생성할 필요가 없다.
 */
public class Main01 {

	public static void main(String[] args) {
		// 주어진 두 수에 대한 최대값 구하기
		int max = Math.max(100, 9999);
		System.out.println("최대값 : " + max);
		
		// 주어진 두 수에 대한 최소값 구하기
		int min = Math.min(100, 9999);
		System.out.println("최소값 : " + min);
		
		// 주어진 수에 대한 절대값 구하기
		int abs = Math.abs(-234);
		System.out.println("절대값 = " + abs);
		
		// 소수점 반올리
		long num = Math.round(3.123456);
		System.out.println("소수점 반올림 = " + num);
		
		// 원주율 3.141592...
		System.out.println( "원주율 = " + Math.PI );
		
	}

}










