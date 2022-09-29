package questions;

class Memo {
	String name;
	String time;
	String content;
	
	public Memo(String name, String time, String content) {
		this.name = name;
		this.time = time;
		this.content = content;
	}
	
	boolean isSameName(Memo memo) {
		
		boolean check = this.name.equals(memo.name) ? true : false;
		
		return check;
		
//		if (this.name.equals(memo.name)) {
//			return true;
//		} else {
//			return false;
//		}
	}
	
	void show() {
		System.out.println(this.name + " " + this.time + " " + this.content);
	}
	
	int length() {
		return this.content.length();
	}
	
	
}

public class Question_4 {

	public static void main(String[] args) {
		
		Memo a = new Memo("황수연", "10:10", "자바 과제 있음");
		Memo b = new Memo("마이클", "10:15", "저녁 알바 취소됨");
		Memo c = new Memo("조민화", "11:30", "사랑하는 사람이 생겼어요");
		
		a.show();
		if(a.isSameName(b)) {
			System.out.println("동일한 사람입니다."); 
		} else {
			System.out.println("다른 사람입니다."); 
		}
		System.out.println("a의 메모 텍스트의 길이는 " + a.length());
	}
}
