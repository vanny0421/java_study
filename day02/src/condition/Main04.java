package condition;

public class Main04 {

	public static void main(String[] args) {
		int point = 70;
		
		if (point > 90 && point <= 100) {
			System.out.println("A학점 입니다.");
		} else if (point > 80 && point <= 90) {
			System.out.println("B학점 입니다.");
		} else if (point > 70 && point <= 80) {
			System.out.println("C학점 입니다.");
		} else {
			System.out.println("F학점 입니다.");
		}
	}
}
