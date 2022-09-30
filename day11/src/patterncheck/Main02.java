package patterncheck;

public class Main02 {

	public static void main(String[] args) {
		String name = "자바학생";
		String age = "19";
		String email = "student@java.net";
		String phone = "01012345678";
		
		RegexHelper rh = RegexHelper.getInstance();
		
		// RegexHelper 만든 메서드 사용해서 데이터 검증
		if (!rh.checkKor(name)) {
			System.out.println("이름은 한글로 입력해주세요.");
			return;
		}
		
		if (!rh.checkNum(age)) {
			System.out.println("나이는 숫자로만 입력해 주세요.");
			return;
		}
		
		if (!rh.checkEmail(email)) {
			System.out.println("이메일 형식이 아닙니다.");
		}
		System.out.println("회원가입 절차를 진행합니다.");
	}
}
