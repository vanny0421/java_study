package school;

import java.util.Scanner;

public class Student implements Management {
	
	String roomNum;
	Academy academy;

	Scanner sc = new Scanner(System.in);
	
	@Override
	public String attendance(Academy academy) {

		System.out.println("어느 강의실에 출석 하시겠습니까? A : A강의실 , B : B강의실 , S : S강의실 ");
		switch(roomNum = sc.next()) {
		case "A":
			academy.aIndex++;
			return "A강의실 출석 완료 되었습니다.\n출석 후 총 학생수 : "  + academy.aIndex;
		case "B":
			academy.bIndex++;
			return "B강의실 출석 완료 되었습니다.\n출석 후 총 학생수 : " + academy.bIndex;
		case "S":
			academy.sIndex++;
			return "S강의실 출석 완료 되었습니다.\n출석 후 총 학생수 : " + academy.sIndex;
		default :
			return "출석 하실 강의실을 선택해주세요.";
		}
	}

	@Override
	public String exit(Academy academy) {
		this.academy = academy; 
		System.out.println("어느 강의실에서 퇴실 하시겠습니까? A : A강의실 , B : B강의실 , S : S강의실 ");
		switch(roomNum = sc.next()) {
		case "A":
			academy.aIndex--;
			return "A강의실 퇴실 완료 되었습니다.\n퇴실 후 총 학생수 : " + academy.aIndex;
		case "B":
			academy.bIndex--;
			return "B강의실 퇴실 완료 되었습니다.\n퇴실 후 총 학생수 : " + academy.bIndex;
		case "S":
			academy.sIndex--;
			return "S강의실 퇴실 완료 되었습니다.\n퇴실 후 총 학생수 : " + academy.sIndex;
		default :
			return "퇴실 하실 반을 선택해주세요.";
		}
	}
}
