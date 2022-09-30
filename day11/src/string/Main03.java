package string;

import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {
		/*
		 * 주민등록번호에서 생년월일 추출하깅
		 * 	- 주민번호 : 8005011234567 -> 1980년 05월 01일 남자
		 * 	- 태어난 년도의 판별 : 1 or 2 -> 19~
		 * 					: 3 or 4 -> 20~
		 *  - 성별의 판별 : 1 or 3 -> 남자
		 *  			2 or 4 -> 여자
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("주민등록번호 13자리를 입력해주세요 : ");
		
		String idNo = sc.next();
		
//		String idNo = "8005011234567";
		
		String yy = idNo.substring(0, 2);
		String mm = idNo.substring(2, 4);
		String dd = idNo.substring(4, 6);
		
		String gender = idNo.substring(6, 7);
		
		if (gender.equals("1") || gender.equals("2") || gender.equals("5") || gender.equals("6")) {
			yy = "19" + yy;
		} else if (gender.equals("3") || gender.equals("4") || gender.equals("7") || gender.equals("8")){
			yy = "20" + yy;
		} else {
			System.out.println("주민번호를 다시 입력해주세요.");
		}
		
		String sex = "";
		
		if (gender.equals("1") || gender.equals("3") || gender.equals("5") || gender.equals("7")) {
			sex = "남자";
		} else if (gender.equals("2") || gender.equals("4") || gender.equals("6") || gender.equals("8")) {
			sex = "여자";
		}
		
		System.out.println("주민번호 : " + idNo + " → " + yy + "년 " + mm + "월 " + dd + "일 ");
		System.out.println("성별 : " + sex);
		
		System.out.printf("%s년 %s월 %s일 %s" , yy, mm, dd, sex);
		
	}
}
