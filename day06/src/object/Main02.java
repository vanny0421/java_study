package object;

class Character {
	// 일반적으로 멤버변수는 선언만 한다.
	String name;
	int age;
}


public class Main02 {

	public static void main(String[] args) {
		Character d = new Character();
		d.name = "둘리";
		d.age = 19;
		
		Character h = new Character();
		h.name = "희동";
		h.age = 3;
		
		System.out.println("이름 : " + d.name + ", 나이 : " + d.age);
		System.out.println("이름 : " + h.name + ", 나이 : " + h.age);

	
	}
}
