package hiding;

public class Member {
	private String name;
	private int age;
	
	// 파라미터가 있는 생성자
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// getter, setter ((alt + shift + s) → (alt + a) → (r))
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;			
		} else {
			this.age = 0;
		}
	}
}
