package string;

public class Main02 {

	public static void main(String[] args) {
		// 1. 이메일 주소에서 아이디와 도메인을 구별하기
		// 단, split 사용 금지
		
		String email = "student@java.com";
		
		// 결과 : 아이디 -> student
		// 결과 : 도메인 -> java.com
		
		// @의 위치 값 구하기
		int index = email.indexOf("@");
		
		String sub_id = email.substring(0, index); // 문자열 시작부터 @까지 자르기
		String domain_id = email.substring(index + 1); // @부터 문자열 끝까지 자르기
		
		System.out.println("아이디 : " + sub_id);
		System.out.println("도메인 : " + domain_id);
		
		
	}
}
