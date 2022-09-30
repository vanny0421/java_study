package study.java.helper;

/*
 * 기본적으로 공통 기능들을 묶어 놓은 클래스
 */
public class Util {
	// -- 싱글톤 객체 생성
	static Util util = new Util();

	private Util() {
		
	}
	
	static public Util getInstance() {
		return util;
	}
	
	public int random(int a, int b) {
		int randomNo = (int)(Math.random() * (a - b + 1)) + b;
		return randomNo;
	}
}

//public class Util {
//	// -- 싱글톤 객체 생성 시작
//	private static Util util;
//
//	// 객체가 할당되지 않은 경우메나 할당하도록 하여 중복 할당을 방지한다.
//	public static Util getInstance() {
//		
//		if( util == null ) {
//			util = new Util();
//		}
//		
//		return util;
//	}
//	
//	// 객체에 null을 대입하면 메모리에서 삭제된다.
//	public static void freeInstance() {
//		util = null;
//	}
//	
//	// 기본 생성자를 private 형태로 정의하면 객체 생성자가 은닉 처리되어
//	// 외부에서 new 연산자를 사용한 객체할당이 금지된다.
//	private Util(){	}
//	// -- 싱글톤 객체 생성 끝
//
//	/*
//	 * 범위를 갖는 랜던값을 생성하여 리턴하는 메서드
//	 * @param 	min : 범위 안에서의 최소값 
//	 * @param 	max : 범위 안에서의 최대값
//	 * @retun 		: min~max 안에서의 랜덤값
//	 */
//	public int random( int min, int max ) {
//		int num = (int)((Math.random() * (max - min + 1)) + min);
//		return num;
//	}
//}

