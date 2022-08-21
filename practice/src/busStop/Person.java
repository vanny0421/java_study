package busStop;

public class Person {

	String name;
	int age;
	String clothing;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person(String name, int age, String clothing) {
		super();
		this.name = name;
		this.age = age;
		this.clothing = clothing;
	}

	public Person(String name, String clothing) {
		super();
		this.name = name;
		this.clothing = clothing;
	}
}
