package math;

import study.java.helper.Util;

public class Main03 {

	public static void main(String[] args) {
		/*
		 * Util class에 정의되어 있는 random() 사용해서
		 * 5자리 인증번호를 생성
		 * 　ex) 11289, 269558, 11135
		 */
		Util util = Util.getInstance();
		
		System.out.println(util.random(99999, 10000));
		
		
//		String authNum = "";
//		
//		for( int i = 0; i<5; i++ ) {
//			authNum += Util.getInstance().random(0, 9);
//		}
//		
//		System.out.println("인증번호 : " + authNum);
	}
}
