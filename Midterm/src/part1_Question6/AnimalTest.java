package part1_Question6;

class Animal {
	String name;
	
	public Animal(String name) { this.name = name; }
	
	public void cry() {;}
}

interface Pet {
	public void friendly();
}

class Dog extends Animal implements Pet {

	public Dog(String name) {
		super(name);
	}
	
	@Override
	public void cry() {
		System.out.println(this.name + " : 멍멍");
	}

	@Override
	public void friendly() {
		System.out.println(this.name + "가 꼬리를 흔듭니다.");
	}
	
}

class Wolf extends Animal {

	public Wolf(String name) {
		super(name);
	}
	
	@Override
	public void cry() {
		System.out.println(this.name + " : 아~우~");
	}
	
}


public class AnimalTest {
	
	public static void main(String[] args) {
		makeShot(new Dog("바둑이"));
		makeShot(new Wolf("백랑"));
		new Dog("시츄").friendly();
	}
	// makeShot() 메소드 정의, 다형성 이용

	static void makeShot(Animal animal) {
		animal.cry();
	}
}
