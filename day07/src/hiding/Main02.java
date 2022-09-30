package hiding;

class Student {
	// 은닉된 멤버변수 → 현재 블록 안에서만 접근 가능함
	private String name;
	private int age;
	
	// name getter
	public String getName() {
		return name;
	}
	// name setter
	public void setName(String name) {
		this.name = name;
	}
	// age getter
	public int getAge() {
		return age;
	}
	// age setter
	public void setAge(int age) {
		this.age = age;
	}
}


public class Main02 {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.setName("자바학생");
		s.setAge(20);

		String name = s.getName();
		System.out.println("이름 : " + name);
		int age = s.getAge();
		System.out.println("나이 : " + age);
	}
}
