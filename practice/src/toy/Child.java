package toy;

public class Child implements Children {

	Toy toy;
	int age;
	int height;
	String name;
	
	public Child(int age) {
		this.toy = new Toy("디즈니", "2020", 7);
		this.age = age;
	}

	public Child(int age, int height) {
		this.toy = new Toy("롯데", "2003", 10);
		this.age = age;
		this.height = height;
	}

	public Child(String name) {
		this.toy = new Toy(70000);
		this.name = name;
	}

	@Override
	public void playWithToy() {
		if (this.age != 0) {
			if (this.toy.ageOfUse <= this.age) {
				System.out.println("권장사용 연령보다 아이의 나이가 많습니다.");
			} else if (this.toy.ageOfUse > this.age) {
				System.out.println("권장사용 연령보다 아이가 어립니다.");
			}
		}
	}
}
