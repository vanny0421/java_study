package home;

public class Main {

	public static void main(String[] args) {
		
		Toilet samsung_toilet01 = new Toilet("삼성");
		
		Washstand samsung_washstand01 = new Washstand("삼성");
		
		TV lg_tv01 = new TV("LG");
		
		Microwave samsung_microwave01 = new Microwave("삼성", 300000);
		
		Bed samsung_bed01 = new Bed(new Person[2], "삼성", 2000000);
		
		Person person1 = new Person(25, 170, 80);
		Person person2 = new Person(45, 150, 50);
		Person person3 = new Person(47, 170, 80);
		Person person4 = new Person(40, 160, 70);
		
		samsung_bed01.lieDown(person1);
		samsung_bed01.lieDown(person2);
//		samsung_bed01.lieDown(person3);
//		samsung_bed01.lieDown(person4);
	
		
	}
}
