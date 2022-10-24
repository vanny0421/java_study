package part2_Question3;

import java.util.Scanner;

class Phone {
	private String name, tel;

	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}	
}

public class PhoneTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름과 전화번호 입력 >> ");
		Phone person1 = new Phone(sc.next(), sc.next());
		
		System.out.print("이름과 전화번호 입력 >> ");
		Phone person2 = new Phone(sc.next(), sc.next());
	
		System.out.println(person1.getName() + "의 번호 " + person1.getTel());
		System.out.println(person2.getName() + "의 번호 " + person2.getTel());
	}
}
